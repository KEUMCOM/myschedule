package com.sist.myschedule.controller;

import com.sist.myschedule.dto.TestRequestBodyDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping
    public String testController(@RequestParam(required = false) int id) {
        return "Hello World!" + id;
    }

    @GetMapping("/testRequestBody/{id}")
    public TestRequestBodyDTO testControllerRequestBody(@PathVariable(required = false) int id) {
        TestRequestBodyDTO testRequestBodyDTO =  new TestRequestBodyDTO();
        testRequestBodyDTO.setId(id);
        testRequestBodyDTO.setMessage("환영합니다!");

        return testRequestBodyDTO;
    }
}
