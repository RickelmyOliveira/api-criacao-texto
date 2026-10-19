package com.application.api_texto.dto;

public record TextoDto(
        String titulo,
        String texto
) {

    @Override
    public String toString() {
        return "titulo: " + titulo +
                ", texto: " + texto;
    }
}
