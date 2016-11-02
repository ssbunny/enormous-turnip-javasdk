package reed.brick.spreadsheet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import reed.brick.spreadsheet.usermodel.BrickSheet;

import java.util.HashMap;

/**
 * 一组 sheet， 以 sheet 名为 key，BSheet 实例为 value .
 *
 * @deprecated
 * @author zhq 16/10/10
 */
public class BSheets extends HashMap<String, BrickSheet> {

    public static final String Key1 = "key1";
    public static final String Key2 = "key2";

    public void add(BrickSheet sheet) {
        String key = sheet.getName();
        put(key, sheet);
    }


    public void remove(BrickSheet sheet) {
        String key = sheet.getName();
        if (containsKey(key)) {
            remove(key);
        }
    }


    public static void main(String[] args) {
        BSheets sheets = new BSheets();
        sheets.add(new BrickSheet("test1"));
        sheets.add(new BrickSheet("test2"));

        String jsonString = JSON.toJSONString(sheets,
                SerializerFeature.PrettyFormat,
                SerializerFeature.DisableCircularReferenceDetect
        );
        System.out.println(jsonString);
        BSheets o = JSON.parseObject(jsonString, BSheets.class);
        System.out.println(o);
    }

}
