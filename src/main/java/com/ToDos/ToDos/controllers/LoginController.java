package com.ToDos.ToDos.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @GetMapping
    public String goToLogInPage() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(
                "<html>\n" +
                "    <head>\n" +
                "    Login Page\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <h1 style=text-align:\"center\">\n" +
                "            Welcome to the Login Page\n" +
                "        </h1>\n" +
                "    </body>\n" +
                "</html>"
                );
        return stringBuilder.toString();
    }
}
