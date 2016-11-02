package reed.brick.spreadsheet.usermodel;

import reed.brick.spreadsheet.usermodel.CellMeta;
import reed.brick.spreadsheet.usermodel.MergedRegion;
import reed.brick.spreadsheet.usermodel.Selection;
import reed.brick.spreadsheet.usermodel.Border;

/**
 * Sheet
 *
 * @author zhq 16/10/10
 */
public class BrickSheet {

    private String name;

    private Selection selection;
    private MergedRegion[] mergeCells;
    private Border[] borders;

    private Integer[] colWidths;
    private Integer[] rowHeights;

    private CellMeta[] cells;

    private Object[][] data;


    public BrickSheet() {
    }

    public BrickSheet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public CellMeta[] getCells() {
        return cells;
    }

    public void setCells(CellMeta[] cells) {
        this.cells = cells;
    }

    public Selection getSelection() {
        return selection;
    }

    public void setSelection(Selection selection) {
        this.selection = selection;
    }

    public MergedRegion[] getMergeCells() {
        return mergeCells;
    }

    public void setMergeCells(MergedRegion[] mergeCells) {
        this.mergeCells = mergeCells;
    }

    public Border[] getBorders() {
        return borders;
    }

    public void setBorders(Border[] borders) {
        this.borders = borders;
    }

    public Integer[] getColWidths() {
        return colWidths;
    }

    public void setColWidths(Integer[] colWidths) {
        this.colWidths = colWidths;
    }

    public Integer[] getRowHeights() {
        return rowHeights;
    }

    public void setRowHeights(Integer[] rowHeights) {
        this.rowHeights = rowHeights;
    }

    public Object[][] getData() {
        return data;
    }

    public void setData(Object[][] data) {
        this.data = data;
    }

}
