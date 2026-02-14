package com.example.RestFulWebServices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/hello")
    public String sayGoodMorning() {

        Locale locale = LocaleContextHolder.getLocale();

        return messageSource.getMessage(
                "hi",
                null,
                locale
        );
    }
    @GetMapping("/hi")
    public String sayHi(@RequestParam(defaultValue = "User") String username) {

        Locale locale = LocaleContextHolder.getLocale();

        return messageSource.getMessage(
                "good.morning",
                new Object[]{username},
                locale
        );
    }
//     Multiple parameters
//    welcome.message=Hello {0}, your age is {1}
//    Controller: new Object[]{"Himanshu", 22}
//
//    Output:
//    Hello Himanshu, your age is 22
}

