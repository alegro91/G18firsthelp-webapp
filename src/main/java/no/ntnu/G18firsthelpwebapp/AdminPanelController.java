package no.ntnu.G18firsthelpwebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminPanelController
{
    @GetMapping(value = "/admin")

    public String greeting()
    {
        return "Hello, world";
    }
}

