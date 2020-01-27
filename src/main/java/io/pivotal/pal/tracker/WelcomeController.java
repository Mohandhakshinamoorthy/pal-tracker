package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class WelcomeController {
    @GetMapping("/")
    public String sayHello() {
        return message;
    }

    private String message;

    public WelcomeController( @Value("${welcome.message:Hello from test}") String message) {
        this.message = message;
    }
}
