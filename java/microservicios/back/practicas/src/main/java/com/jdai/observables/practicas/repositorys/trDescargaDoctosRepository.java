package com.jdai.observables.practicas.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdai.observables.practicas.models.trDescargaDoctos;

@Repository // se usa principalmente para clases que implementan la lógica de acceso a datos CRUD
public interface trDescargaDoctosRepository extends JpaRepository<trDescargaDoctos,Long> {
    
}
