package com.koreait.short_url_project_02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShortUrlController {
    private List<Surl> surls;
    private long surlLastId;

    @GetMapping("/add")
    @ResponseBody
    public String add(String url) {
        Surl srul = Surl.builder().id(++surlLastID)
        return "Hello World";
    }
}
