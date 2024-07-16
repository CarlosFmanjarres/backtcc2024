package org.example.helpers.mensajes;

import org.example.helpers.generals.RegexValidators;

public enum MensajesVehiculo {
    ID_VEHICULO_ERRONEO("Revisa, no aceptamos id negativos"),
    MARCA_VEHICULO_ERRONEO("Caracteres incorrectos"),
    CARACTERES_INVALIDO("numero de carcteres invalido"),
    //ID_VEHICULO_NO_EXISTE("Revisa el id no existe"),
    KILOMETRAJE_VEHICULO_ERRONEO("Ingrese números entre 0 y 99.999"),
    COLOR_VEHICULO_ERRONEO("solo letras y espacios y maximo 20 caracteres"),
    DESCRIPCION_VEHICULO_ERRONEA("maximo 100 caracteres"),
    SOLO_LETRAS_Y_ESPACIOS("solo letras SIN ESPACIOS\n"),
    AUTONOMIA_VEHICULO_ERRONEA("solo numeros positivos maximo 72"),
    CAPACIDAD_CARGA_VEHICULO_ERRONEA("solo numeros positivos y maximo 2000"),
    AVALUO_VEHICULO_ERRONEO("solo numeros positivos"),
    FECHA_VEHICULO_INCORRECTA("El formato de la fecha debe de ser mes y año MM/yyyy");

    private String mensajeError;



    MensajesVehiculo(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public String getMensajeError() {
        return mensajeError;
    }







}

