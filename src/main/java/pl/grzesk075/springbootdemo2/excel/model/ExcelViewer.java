package pl.grzesk075.springbootdemo2.excel.model;


import pl.grzesk075.springbootdemo2.excel.dao.Sheet;

public class ExcelViewer {
    private Sheet sheet;

    public ExcelViewer(Sheet sheet) {
        this.sheet = sheet;
    }

    public Sheet getSheet() {
        return sheet;
    }

    public void setSheet(Sheet sheet) {
        this.sheet = sheet;
    }
}
