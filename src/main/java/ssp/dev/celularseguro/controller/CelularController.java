package ssp.dev.celularseguro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ssp.dev.celularseguro.model.Celular;
import ssp.dev.celularseguro.repository.CelularRepository;

@RestController
public class CelularController {
    
    @Autowired
    private CelularRepository celularRepository;

    @GetMapping(value = "listatodos")
    @ResponseBody 
    public ResponseEntity<List<Celular>> listaCelular(){

        List<Celular> celulares = celularRepository.findAll();

        return new ResponseEntity<List<Celular>>(celulares, HttpStatus.OK);
    }

}
