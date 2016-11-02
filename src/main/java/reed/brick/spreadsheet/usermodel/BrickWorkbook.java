package reed.brick.spreadsheet.usermodel;

/**
 * Workbook
 *
 * @author zhq 16/10/10
 */
public class BrickWorkbook {

    private String activeSheet;   // 当前激活的 sheet 名
    private Integer width;
    private Integer height;
    private BrickSheet[] sheets;


    public String getActiveSheet() {
        return activeSheet;
    }

    public void setActiveSheet(String activeSheet) {
        this.activeSheet = activeSheet;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public BrickSheet[] getSheets() {
        return sheets;
    }

    public void setSheets(BrickSheet[] sheets) {
        this.sheets = sheets;
    }
}
