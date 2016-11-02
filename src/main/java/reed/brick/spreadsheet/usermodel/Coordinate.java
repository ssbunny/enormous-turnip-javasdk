package reed.brick.spreadsheet.usermodel;

/**
 * 表格坐标值： col 与 row 的组合。
 *
 * @author zhq 16/10/11
 */
public class Coordinate {

    private Integer row;
    private Integer col;

    public Coordinate() {
    }

    public Coordinate(Integer row, Integer col) {
        this.row = row;
        this.col = col;
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

}
