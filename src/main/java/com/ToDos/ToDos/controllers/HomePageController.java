package com.ToDos.ToDos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.ModelMap;

@RestController
@RequestMapping("/api/webpage")
public class HomePageController {

    @GetMapping
    public String welcome(){
        StringBuffer stringBuffer= new StringBuffer();
        stringBuffer.append(
                "<html>\n" +
                        "    <head>\n" +
                        "    </head>\n" +
                        "    <body>\n" +
                        "        <h1>\n" +
                        "            Welcome to my To-Do List!\n" +
                        "        </h1>\n" +
                        "    </body>\n" +
                        "</html>"
        );
        return stringBuffer.toString();
    }


    @GetMapping("/withName")
    public String welcomeHTML(@RequestParam(required = false) String name, ModelMap modelmap) {
        modelmap.put("name", name);
        StringBuffer stringBuffer= new StringBuffer();
        stringBuffer.append(
                "<html>\n" +
                "    <head>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <h1 style=\"text-align:center\">\n" +
                "            Welcome to my To-Do List,\n" + name + "!" +
                "        </h1>\n" +
                "    </body>\n" +
                "</html>");
        return stringBuffer.toString();
    }
}
