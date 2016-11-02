package reed.brick.spreadsheet.usermodel.styles;

/**
 * @author zhq 16/10/13
 */
public class Font {

    public static final String STYLE_NORMAL = "normal";
    public static final String STYLE_ITALIC = "italic";
    public static final String STYLE_OBLIQUE = "oblique";


    public static final int WEIGHT_NORMAL = 400;
    public static final int WEIGHT_BOLD = 700;


    private String family;
    private String style;
    private Integer weight;
    private String color;


    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
