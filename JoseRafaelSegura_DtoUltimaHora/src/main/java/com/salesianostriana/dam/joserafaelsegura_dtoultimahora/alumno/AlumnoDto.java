package com.salesianostriana.dam.joserafaelsegura_dtoultimahora.alumno;
public record AlumnoDto(
        String nombre,
        String apellidos,
        String email,
        String curso,
        String direccion
) {

    public static AlumnoDto ofAlumno (AlumnoModel alumno) {
        return new AlumnoDto(
                alumno.getNombre(),
                alumno.getApellido1() + " " + alumno.getApellido2(),
                alumno.getGmail(),
                alumno.getCurso().getNombre(),
                alumno.getDireccion().getLinea1()
        );
    }
}