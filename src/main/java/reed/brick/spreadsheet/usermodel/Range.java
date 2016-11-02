package reed.brick.spreadsheet.usermodel;

/**
 * 区域。
 *
 * @author zhq 16/10/11
 */
public class Range {

    private Coordinate from;
    private Coordinate to;

    public Range() {
    }

    public Range(Coordinate from) {
        this.from = from;
        this.to = new Coordinate(from.getRow(), from.getCol());
    }

    public Range(Integer row, Integer col) {
        this.from = new Coordinate(row, col);
        this.to = new Coordinate(row, col);
    }

    public Range(Coordinate from, Coordinate to) {
        this.from = from;
        this.to = to;
    }

    public Range(Integer fromRow, Integer fromCol, Integer toRow, Integer toCol) {
        this.from = new Coordinate(fromRow, fromCol);
        this.to = new Coordinate(toRow, toCol);
    }

    public Coordinate getFrom() {
        return from;
    }

    public void setFrom(Coordinate from) {
        this.from = from;
    }

    public Coordinate getTo() {
        return to;
    }

    public void setTo(Coordinate to) {
        this.to = to;
    }

}
