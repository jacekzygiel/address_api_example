package com.zygiel.demoproject;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value="/jlabs", produces = MediaType.APPLICATION_JSON_VALUE)
    public String jlabs() {
        return "\"name\": \"j-labs sp.z o.o.\"," +
                "\"building\": \"Zabłocie Business Park\"," +
                "\"street\": \"ul. Zabłocie 43a\"," +
                "\"postcode\": \"30-701\"," +
                "\"city\": \"Kraków\"";
    }

}
