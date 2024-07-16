package org.example.helpers.mensajes;

import org.example.helpers.generals.RegexValidators;

public enum MensajesMercancia {
    ID_MERCANCIA_ERRONEO("Revisa, no aceptamos id negativos"),
    VOLUMEN_OCUPADO_ERRONEO("el valor ocupado maximo es 100"),
    VALOR_NEGATIVO("solo num positivos"),
    SOLO_LETRAS_Y_ESPACIOS("SOLO LETRAS Y ESPACIOS"),
    PESO_ERRONEO(" peso max 1000"),
    DESCRIPCION_ERRONEA("maximo 100 caracteres"),
    DIRECCION_ERRONEA("maximo 200");

    private String mensajeError;


    MensajesMercancia(String mensajeError) {
        this.mensajeError = mensajeError;
    }


    public String getMensajeError() {
        return mensajeError;
    }
}

