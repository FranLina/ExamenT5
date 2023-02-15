package com.oretania.portal.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@PreAuthorize("hasAnyAuthority('DIRECTOR','ING')")
@RequestMapping("/asignaturas")
public class InglesController {

    @GetMapping(value = { "/ingles" })
    public String list() {
        return "asignaturas/ingles";
    }
}
