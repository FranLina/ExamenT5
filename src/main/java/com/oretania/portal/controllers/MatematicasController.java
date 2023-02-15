package com.oretania.portal.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@PreAuthorize("hasAnyAuthority('DIRECTOR','MAT')")
@RequestMapping("/asignaturas")
public class MatematicasController {

    @GetMapping(value = { "/matematicas" })
    public String list() {
        return "asignaturas/matematicas";
    }
}
