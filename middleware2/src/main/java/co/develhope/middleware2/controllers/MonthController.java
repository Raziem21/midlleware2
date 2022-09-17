package co.develhope.middleware2.controllers;

import co.develhope.middleware2.entities.Month;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/months")
public class MonthController {

    Month month = new Month();

    @GetMapping
    public Month getMonth() {
        return month;
    }
}
