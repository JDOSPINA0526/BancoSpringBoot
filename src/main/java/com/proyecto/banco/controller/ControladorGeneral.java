package com.proyecto.banco.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class ControladorGeneral {

    @Controller

    public class controladorGeneral {

        @RequestMapping
        @ResponseBody

        public ResponseEntity<String> Saludar() {
            return new ResponseEntity<>("Mama estoy triunfando, hice mi primera pagina web con Spring Boot", HttpStatus.OK);
        }
    }
}


