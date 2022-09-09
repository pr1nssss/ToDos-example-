package com.ToDos.ToDos.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doThis")

public class Do {
    @GetMapping
    public String doThis() {
        return "done1";
    }

    @GetMapping("/this")
    public String doThisTwo() {
        return "done2";
    }

    @GetMapping("/{thisTwo}")
    public String doThisThree(@PathVariable String thisTwo) {
        return "thisTwo";
    }

    @GetMapping("/thisThree")
    public String doThisFour(@RequestParam String x, @RequestParam(required = false) String y) {
        return x + " "+ y;
    }
}
