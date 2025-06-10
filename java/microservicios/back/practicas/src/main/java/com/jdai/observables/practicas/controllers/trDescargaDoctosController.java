package com.jdai.observables.practicas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdai.observables.practicas.models.trDescargaDoctos;
import com.jdai.observables.practicas.services.trDescargaDoctosService;

@RestController // indica que los métodos de la clase producirán respuestas directamente en el cuerpo de la respuesta HTTP, en lugar de renderizar vistas
@RequestMapping("api/service/documentos")
public class trDescargaDoctosController {
    
    @Autowired
    private trDescargaDoctosService doctosService ;

    @PostMapping(path = "/guardar")
    public ResponseEntity<trDescargaDoctos> creaRegistroDoctos(@RequestBody trDescargaDoctos doc){
        trDescargaDoctos docto = doctosService.guardarDocumento(doc);
        return ResponseEntity.ok(docto);        
    }

    @GetMapping("{idMedioImpunacion}")
    public ResponseEntity<trDescargaDoctos> buscarDoctosId(@PathVariable("idMedioImpunacion") Long idMedioImpugnacion){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(doctosService.buscarDoctos(idMedioImpugnacion));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(null);
        }
    }
}