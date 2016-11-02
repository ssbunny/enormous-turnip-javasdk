package reed.brick.spreadsheet.usermodel;

import reed.brick.spreadsheet.usermodel.styles.CellStyle;

/**
 * @author zhq 16/10/13
 */
public class CellMeta {

    private Integer row;
    private Integer col;

    private CellStyle styles;
    private String sourceValue;
    private String value;
    private DataType dataType;
    private Boolean isFormula = Boolean.FALSE;


    public CellMeta() {
    }

    public CellMeta(Integer row, Integer col) {
        this.row = row;
        this.col = col;
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

    public String getSourceValue() {
        return sourceValue;
    }

    public void setSourceValue(String sourceValue) {
        this.sourceValue = sourceValue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getIsFormula() {
        return isFormula;
    }

    public void setIsFormula(Boolean isFormula) {
        this.isFormula = isFormula;
    }


    public CellStyle getStyles() {
        return styles;
    }

    public void setStyles(CellStyle styles) {
        this.styles = styles;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }
}
