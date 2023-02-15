package com.oretania.portal.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/asignaturas")
@PreAuthorize("hasAnyAuthority('DIRECTOR','LEN')")
public class LenguaController {

    @GetMapping(value = { "/lengua" })
    public String list() {
        return "asignaturas/lengua";
    }
}
