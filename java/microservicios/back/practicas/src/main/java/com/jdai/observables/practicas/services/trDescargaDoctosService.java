package com.jdai.observables.practicas.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jdai.observables.practicas.models.trDescargaDoctos;
import com.jdai.observables.practicas.repositorys.trDescargaDoctosRepository;

@Component // Permite a Spring detectar y registrar la clase como un bean en el contexto de la aplicación.
public class trDescargaDoctosService {
    @Autowired // inyeccion de dependencia de forma automatica
    trDescargaDoctosRepository docsRepository;

    /**
     * Guarda ID y RUTA del documento
     * @param documento
     * @return
     */
    public trDescargaDoctos guardarDocumento(trDescargaDoctos documento){
        System.out.println(documento.toString());
        return docsRepository.save(documento);
    }

    /**
     * Busca el documento por ID
     * @param idMedioImpugnacion
     * @return
     */
    public trDescargaDoctos buscarDoctos(Long idMedioImpugnacion){
        Optional<trDescargaDoctos> documento = docsRepository.findById(idMedioImpugnacion);
        if (documento.isPresent()) {
            System.out.println(documento.toString());
            return documento.get();
        }
        return documento.get();
    }
}