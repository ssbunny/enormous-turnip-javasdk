package reed.brick.spreadsheet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import reed.brick.spreadsheet.usermodel.*;
import reed.brick.spreadsheet.usermodel.styles.BorderStyle;
import reed.brick.spreadsheet.usermodel.styles.CellStyle;
import reed.brick.spreadsheet.usermodel.styles.Font;

import java.util.Random;

/**
 * @author zhq 16/10/10
 */
class App {

    public static void main(String[] args) {

        String jsonString = JSON.toJSONString(makeSpreadSheet(),
                SerializerFeature.PrettyFormat,
                SerializerFeature.DisableCircularReferenceDetect
        );
        System.out.println(jsonString);
        System.out.println("==================");

        BrickSpreadSheet o = JSON.parseObject(jsonString, BrickSpreadSheet.class);
        BrickSheet[] sheets = o.getWorkbook().getSheets();

        for (BrickSheet sheet : sheets) {
            System.out.println(sheet.getName());
        }

    }


    static BrickSpreadSheet makeSpreadSheet() {
        BrickSpreadSheet ss = new BrickSpreadSheet();
        ss.setWorkbook(makeWorkbook());

        return ss;
    }


    static BrickWorkbook makeWorkbook() {
        BrickWorkbook wb = new BrickWorkbook();

        wb.setActiveSheet("test2");
        wb.setSheets(new BrickSheet[]{
                makeSheet1(),
                makeSheet2("test2"),
                makeSheet2("test3")
        });

        return wb;
    }


    static BrickSheet makeSheet1() {
        BrickSheet s = new BrickSheet();
        s.setName("test1");

        Selection selection = new Selection(2, 3, 6, 5);
        s.setSelection(selection);

        s.setRowHeights(new Integer[]{
                20, null, 30, null, 60, 30
        });


        Border border1 = new Border();
        border1.setRange(new Range(2, 2, 3, 4));

        BorderStyle borderStyle = new BorderStyle();
        borderStyle.setColor("red");
        borderStyle.setWidth(2);

        border1.setTop(borderStyle);

        Border border2 = new Border();
        border2.setRange(new Range(1, 1));
        border2.setLeft(borderStyle);

        s.setBorders(new Border[]{
                border1,
                border2
        });

        return s;
    }


    static BrickSheet makeSheet2(String name) {
        BrickSheet s = new BrickSheet();
        s.setName(name);

        MergedRegion range = new MergedRegion(1, 1, 2, 2);
        s.setMergeCells(new MergedRegion[]{
                range
        });
        s.setColWidths(new Integer[]{
                60, null, 90, null, 50, 100
        });
        s.setCells(new CellMeta[]{
                makeCellMeta1(),
                makeCellMeta2(),
        });

        s.setData(makeData(20, 15));

        return s;
    }

    static CellMeta makeCellMeta1() {
        CellMeta cellMeta = new CellMeta(1, 1);

        cellMeta.setDataType(new DataType(DataType.TYPE_TEXT));
        cellMeta.setSourceValue("=A1");
        cellMeta.setValue("10");
        cellMeta.setIsFormula(true);

        CellStyle style = new CellStyle();
        style.setAlignments(new String[]{
                CellStyle.ALIGNMENT_CENTER,
                CellStyle.ALIGNMENT_MIDDLE
        });
        cellMeta.setStyles(style);

        return cellMeta;
    }

    static CellMeta makeCellMeta2() {
        CellMeta cellMeta = new CellMeta(2, 2);
        cellMeta.setSourceValue("3");
        cellMeta.setValue("3");

        DataType dataType = new DataType(DataType.TYPE_NUMERIC);
        dataType.setFormat("0,0");
        cellMeta.setDataType(dataType);

        CellStyle style = new CellStyle();
        style.setFillColor("#EEE");
        Font font = new Font();
        font.setColor("red");
        font.setWeight(Font.WEIGHT_BOLD);
        style.setFont(font);
        cellMeta.setStyles(style);

        return cellMeta;
    }


    static Object[][] makeData(int row, int col) {
        Random random = new Random();
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Object[][] result = new Object[row][col];

        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                int r = random.nextInt(4);
                switch (r) {
                    case 0:
                        result[i][j] = random.nextDouble();
                        break;
                    case 1:
                        result[i][j] = random.nextBoolean();
                        break;
                    case 2:
                        result[i][j] = random.nextInt(400);
                        break;
                    case 3:
                        StringBuilder sb = new StringBuilder();
                        for (int k = 0; k <= random.nextInt(10); ++k) {
                            char c = base.charAt(random.nextInt(36));
                            sb.append(c);
                        }
                        result[i][j] = sb.toString();
                        break;
                    /*case 4:
                        result[i][j] = new Date();*/
                }
            }
        }
        return result;
    }


}
