package reed.brick.spreadsheet.usermodel;

import reed.brick.spreadsheet.usermodel.styles.BorderStyle;

/**
 * 边框
 *
 * @author zhq 16/10/11
 */
public class Border {

    private Range range;
    private BorderStyle top;
    private BorderStyle left;
    private BorderStyle bottom;
    private BorderStyle right;

    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }

    public BorderStyle getTop() {
        return top;
    }

    public void setTop(BorderStyle top) {
        this.top = top;
    }

    public BorderStyle getLeft() {
        return left;
    }

    public void setLeft(BorderStyle left) {
        this.left = left;
    }

    public BorderStyle getBottom() {
        return bottom;
    }

    public void setBottom(BorderStyle bottom) {
        this.bottom = bottom;
    }

    public BorderStyle getRight() {
        return right;
    }

    public void setRight(BorderStyle right) {
        this.right = right;
    }

}
