package com.salesianostriana.dam.joserafaelsegura_dtoultimahora.alumno;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Direccion {

    private String poblacion;
    private Long id;
    private String tipoVia;
    private String linea1;
    private String linea2;
    private String cp;
    private String provincia;
}