package com.snd.abuse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @Autowired
    private SampleRepository sampleRepository;

    public List<sampleEntity> sampleDataList(){
        for (sampleEntity e : sampleRepository.findAll()) {
            System.out.println(e.getName());
        }
        System.out.println(sampleRepository.findAll());
        return sampleRepository.findAll();
    }
    @GetMapping("/hello")
    public String hello(){
        sampleDataList();
        return "hello";
    }
    
}
