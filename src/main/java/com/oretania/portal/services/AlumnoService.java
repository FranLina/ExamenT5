package com.oretania.portal.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.configurers.userdetails.UserDetailsServiceConfigurer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

import com.oretania.portal.models.Alumno;
import com.oretania.portal.models.Asignatura;
import com.oretania.portal.repositories.AlumnoRepository;

@Service
public class AlumnoService {

    @Autowired
    AlumnoRepository repository;

    public List<Alumno> findAll() {
        return null;
    }

    public UserDetailsService findLoadUserDetails(Alumno alumno) {
        UserDetails user;

        List<GrantedAuthority> asignaturas = new ArrayList<GrantedAuthority>();

        for (Asignatura a : alumno.getAsignaturas()) {
            asignaturas.add(new SimpleGrantedAuthority(a.getCodigo()));
        }

        user = User.builder()
                .username(alumno.getUserName())
                .password(alumno.getPassword())
                .authorities(asignaturas)
                .build();

        return new InMemoryUserDetailsManager(user);
    }

}
