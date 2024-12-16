package com.salesianostriana.dam.joserafaelsegura_dtoultimahora.alumno;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AlumnoModel {

    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String gmail;
    private Direccion direccion;
    private CursoModel curso;
}