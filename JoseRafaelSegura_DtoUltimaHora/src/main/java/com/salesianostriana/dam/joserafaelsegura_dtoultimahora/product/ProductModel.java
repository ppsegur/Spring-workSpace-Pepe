package com.salesianostriana.dam.joserafaelsegura_dtoultimahora.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductModel {

    private Long id;
    private String name;
    private String description;
    private Double pvp;
    private List<String> image;
    //Composición
    private CategoryModel category;
}
