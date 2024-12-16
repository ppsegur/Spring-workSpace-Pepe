package com.salesianostriana.dam.joserafaelsegura_dtoultimahora;

import com.salesianostriana.dam.joserafaelsegura_dtoultimahora.alumno.AlumnoDto;
import com.salesianostriana.dam.joserafaelsegura_dtoultimahora.alumno.AlumnoModel;
import com.salesianostriana.dam.joserafaelsegura_dtoultimahora.alumno.CursoModel;
import com.salesianostriana.dam.joserafaelsegura_dtoultimahora.alumno.Direccion;
import com.salesianostriana.dam.joserafaelsegura_dtoultimahora.product.CategoryModel;
import com.salesianostriana.dam.joserafaelsegura_dtoultimahora.product.ProductDto;
import com.salesianostriana.dam.joserafaelsegura_dtoultimahora.product.ProductModel;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Run {

    @PostConstruct
    public static void main(String[] args) {

CategoryModel categoria = new CategoryModel(1L, "Jardin y terraza");
ProductModel producto = ProductModel.builder()
        .id(1L)
        .name("Corta cesped 3000")
        .pvp(299.99)
        .image(Arrays.asList("robot1.png", "robot2.png"))
        .category(categoria)
        .build();

ProductDto productoDTO = ProductDto.ofProducto(producto);

Direccion direccion = Direccion.builder()
        .id(1L)
        .tipoVia("Avenida")
        .linea1("Kansas city")
        .linea2("Piso 4, Puerta C")
        .cp("41007")
        .poblacion("Sevilla")
        .provincia("Sevilla")
        .build();

CursoModel curso = CursoModel.builder()
        .id(1L)
        .nombre("Lenguaje ")
        .tipo("Humanidades")
        .tutor("Prof. Montalvo")
        .aula("Aula 105")
        .build();

AlumnoModel alumno = AlumnoModel.builder()
        .id(1L)
        .nombre("Rafa")
        .apellido1("Hernández")
        .apellido2("Sanchez")
        .gmail("rafahersan@example.com")
        .curso(curso)
        .direccion(direccion)
        .build();

AlumnoDto alumnoDTO = AlumnoDto.ofAlumno(alumno);

        System.out.println(productoDTO);
        System.out.println(alumnoDTO);
    }

}