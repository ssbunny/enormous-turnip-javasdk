package reed.brick.spreadsheet.usermodel;

/**
 * Handsontable 支持的数据类型:
 * <p/>
 * - Text
 * - Numeric
 * - Checkbox
 * - Date
 * - Select
 * - Dropdown
 * - Autocomplete
 * - Password
 * - Handsontable
 *
 * @author zhq 16/10/13
 */
public class DataType {

    public static final String TYPE_TEXT = "text";
    public static final String TYPE_NUMERIC = "numeric";

    private String typeName;


    /* ****************************************** *\
     *
     *  Numeric only
     *
     * ****************************************** */

    private String format;


    /* ****************************************** *\
     *
     *  Date only
     *
     * ****************************************** */

    public DataType() {
    }

    public DataType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

}
