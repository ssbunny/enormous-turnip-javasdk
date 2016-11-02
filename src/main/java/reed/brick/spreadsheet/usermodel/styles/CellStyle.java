package reed.brick.spreadsheet.usermodel.styles;

/**
 * 单元格样式
 * @author zhq 16/10/13
 */
public class CellStyle {


    public static final String ALIGNMENT_LEFT = "Left";
    public static final String ALIGNMENT_CENTER = "Center";
    public static final String ALIGNMENT_RIGHT = "Right";
    public static final String ALIGNMENT_JUSTIFY = "Justify";
    public static final String ALIGNMENT_TOP = "Top";
    public static final String ALIGNMENT_MIDDLE = "Middle";
    public static final String ALIGNMENT_BOTTOM = "Bottom";

    private String[] alignments;   // 对齐方式
    private String fillColor;   // 填充色
    private Font font;

    public String[] getAlignments() {
        return alignments;
    }

    public void setAlignments(String[] alignments) {
        this.alignments = alignments;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }
}
