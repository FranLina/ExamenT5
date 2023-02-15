package com.oretania.portal.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@PreAuthorize("hasAnyAuthority('DIRECTOR','REL')")
@RequestMapping("/asignaturas")
public class ReligonController {
    @GetMapping(value = { "/religion" })
    public String list() {
        return "asignaturas/religion";
    }
}
