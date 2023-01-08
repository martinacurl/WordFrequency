package com.example.wordfrequency;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping( "/count")

public class TextController {

    WordCounter counter = new WordCounter();

    @PostMapping
    public Map<String, Long> countWords(@RequestBody String str){
        return counter.getFrequency(str);
    }

}
