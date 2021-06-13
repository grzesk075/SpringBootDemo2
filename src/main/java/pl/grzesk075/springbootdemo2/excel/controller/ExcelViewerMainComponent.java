package pl.grzesk075.springbootdemo2.excel.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import pl.grzesk075.springbootdemo2.excel.dto.Sheet;
import pl.grzesk075.springbootdemo2.excel.model.ExcelViewer;

@Component
public class ExcelViewerMainComponent {

    @Bean
    public Sheet mainSheet() {
        return new Sheet("Main Sheet Title");
    }

    @Bean
    public ExcelViewer excelViewerModel(Sheet mainSheet) {
        return new ExcelViewer(mainSheet);
    }
}
