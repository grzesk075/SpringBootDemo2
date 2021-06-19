package pl.grzesk075.springbootdemo2.excel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.grzesk075.springbootdemo2.excel.dto.Sheet;

@RestController
public class ExcelViewerRestController {

    @Autowired
    private Sheet mainSheet;

    @GetMapping("/rest/mainSheet")
    public Sheet mainSheet() {
        return mainSheet;
    }
}
