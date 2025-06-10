package com.jdai.observables.practicas.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity //anotacion para especificar que esta clase sera un mapeo de una tabla
@Table(name = "TR_DESCARGA_DOCTOS") // anotacion para definir el nombre de la tabla
@Data // Agrupa las anotaciones @Getter, @Setter, @ToString
public class trDescargaDoctos {
    @Id
    private Long idMedioImpugnacion; // ID_MEDIO_IMPUGNACION
    private String archivo; // ARCHIVO

}
