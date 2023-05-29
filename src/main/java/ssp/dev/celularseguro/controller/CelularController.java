package ssp.dev.celularseguro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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

    @PostMapping(value = "salvar")
    @ResponseBody
    public ResponseEntity<Celular> salvar(@RequestBody Celular celular){

        Celular celul = celularRepository.save(celular);
        return new ResponseEntity<Celular>(celul, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "delete")
    @ResponseBody
    public ResponseEntity<String> delete(@RequestParam Long idcelul){

        celularRepository.deleteById(idcelul);
        return new ResponseEntity<String>("Aparelho deletado com sucesso", HttpStatus.OK);
    }

    @GetMapping(value = "buscarcelulid")
    @ResponseBody
    public ResponseEntity<Celular> buscarcelulid(@RequestParam(name = "idcelul") Long idcelul){

        Celular celular = celularRepository.findById(idcelul).get();
        return new ResponseEntity<Celular>(celular, HttpStatus.OK);
    }

    @PutMapping(value = "atualizar")
    @ResponseBody
    public ResponseEntity<?> atualizar(@RequestBody Celular celular){


        if(celular.getId() == null){
            return new ResponseEntity<String>("Id não foi informado.", HttpStatus.OK);
        }

        Celular celul = celularRepository.saveAndFlush(celular);
        return new ResponseEntity<Celular>(celul, HttpStatus.OK);
    }


    @GetMapping(value = "buscarPorModelo")
    @ResponseBody
    public ResponseEntity<List<Celular>> buscarPorModelo(@RequestParam(name = "modelo") String modelo){

        List<Celular> celular = celularRepository.buscarPorModelo(modelo.trim().toUpperCase());

        return new ResponseEntity<List<Celular>>(celular, HttpStatus.OK);
    }


}
