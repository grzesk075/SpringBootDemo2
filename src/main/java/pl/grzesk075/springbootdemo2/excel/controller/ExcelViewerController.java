package pl.grzesk075.springbootdemo2.excel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.grzesk075.springbootdemo2.excel.model.ExcelViewer;
import pl.grzesk075.springbootdemo2.excel.model.FormData;

import java.util.Locale;

@Controller
public class ExcelViewerController {

    @Autowired
    private ExcelViewer excelViewerModel;

    @GetMapping("/viewer")
    public String excelDisplay(Model model) {
        model.addAttribute("title", excelViewerModel.getSheet().getTitle());
        model.addAttribute("formdata", new FormData());
        return "/viewer";
    }

    @PostMapping("/viewer")
    public String excelSubmit(@ModelAttribute FormData formData, Model model) {
        model.addAttribute("title", excelViewerModel.getSheet().getTitle());
        formData.setNewTitle(formData.getNewTitle().toUpperCase());
        model.addAttribute("formdata", formData);
        return "/viewer";
    }
}
