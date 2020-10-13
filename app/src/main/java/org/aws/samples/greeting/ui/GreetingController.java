package org.aws.samples.greeting.ui;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletRequest;

/**
 * @author Arun Gupta
 */
@RestController
public class GreetingController {

    @RequestMapping("/hello")
    public String sayHello(@RequestParam(required = false) String name) {
        if (name == null) {
            return "Hello Somebody!";
        } else {
            return new StringBuilder().append("Hello ").append(name).append("!").toString();
        }
    }
}
