package com.wawcode.smogue.application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {


    @RequestMapping(value = "/ready", method = RequestMethod.GET)
    public @ResponseBody
    String getBookDetails() {
        return "ready";
    }
}
