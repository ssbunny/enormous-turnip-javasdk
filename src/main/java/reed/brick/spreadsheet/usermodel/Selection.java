package reed.brick.spreadsheet.usermodel;

/**
 * sheet 中的选区。
 *
 * @author zhq 16/10/10
 */
public class Selection {

    private Integer col;    // 起始列
    private Integer row;
    private Integer endCol; // 终止列（可为空）
    private Integer endRow;

    public Selection() {
    }

    public Selection(Integer col, Integer row) {
        this.col = col;
        this.row = row;
    }

    public Selection(Integer col, Integer row, Integer endCol, Integer endRow) {
        this.col = col;
        this.row = row;
        this.endCol = endCol;
        this.endRow = endRow;
    }

    public Integer getCol() {
        return col;
    }

    public void setCol(Integer col) {
        this.col = col;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getEndCol() {
        return endCol;
    }

    public void setEndCol(Integer endCol) {
        this.endCol = endCol;
    }

    public Integer getEndRow() {
        return endRow;
    }

    public void setEndRow(Integer endRow) {
        this.endRow = endRow;
    }

}
