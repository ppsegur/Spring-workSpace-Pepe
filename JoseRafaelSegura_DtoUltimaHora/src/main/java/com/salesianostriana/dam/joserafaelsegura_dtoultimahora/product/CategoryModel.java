package com.salesianostriana.dam.joserafaelsegura_dtoultimahora.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryModel {
    private Long id;
    private String name;
}
