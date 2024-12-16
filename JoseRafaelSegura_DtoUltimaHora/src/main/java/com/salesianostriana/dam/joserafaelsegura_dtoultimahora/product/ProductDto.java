package com.salesianostriana.dam.joserafaelsegura_dtoultimahora.product;

public record ProductDto(
        String name,
        double price,
        String image,
        String  categoria
) {
    public static ProductDto ofProducto(ProductModel producto) {
        return new ProductDto(
                producto.getName(),
                producto.getPvp(),
                producto.getImage().get(0),
                producto.getCategory().getName()
        );
    }


}
