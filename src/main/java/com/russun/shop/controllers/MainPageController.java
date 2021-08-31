package com.russun.shop.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("homepage")
public class MainPageController {

    private List<Map<String, String>> messages = new ArrayList<>() {
        {
            add(new HashMap<>() {{
                put("id", "1");
                put("text", "First message");
            }});
            add(new HashMap<>() {{
                put("id", "2");
                put("text", "Second message");
            }});
            add(new HashMap<>() {{
                put("id", "3");
                put("text", "Third message");
            }});
        }
    };

    @GetMapping
    public List<Map<String, String>> list() { return  messages; }

    @GetMapping("{id}")
    public Map<String,String> getOne(@PathVariable String id){
        return null;
    }
}
