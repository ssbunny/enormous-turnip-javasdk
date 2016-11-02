package reed.brick.spreadsheet.usermodel;

/**
 * 合并单元格的区域。
 *
 * @author zhq 16/10/11
 */
public class MergedRegion {

    private Integer row;       // 起始行
    private Integer col;
    private Integer rowspan;   // 合并的行数
    private Integer colspan;


    public MergedRegion() {
    }

    public MergedRegion(Integer row, Integer col, Integer rowspan, Integer colspan) {
        this.row = row;
        this.col = col;
        this.rowspan = rowspan;
        this.colspan = colspan;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getCol() {
        return col;
    }

    public void setCol(Integer col) {
        this.col = col;
    }

    public Integer getRowspan() {
        return rowspan;
    }

    public void setRowspan(Integer rowspan) {
        this.rowspan = rowspan;
    }

    public Integer getColspan() {
        return colspan;
    }

    public void setColspan(Integer colspan) {
        this.colspan = colspan;
    }

}
