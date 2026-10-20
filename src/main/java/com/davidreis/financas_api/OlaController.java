package com.davidreis.financas_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OlaController {
    @GetMapping("/ola")
    public String ola() {
        return "API de financas funcionando";


    }
}