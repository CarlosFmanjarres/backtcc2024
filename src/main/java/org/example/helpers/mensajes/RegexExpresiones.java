package org.example.helpers.mensajes;

public enum RegexExpresiones {

    VALIDAR_SOLO_LETRAS_Y_ESPACIOS("^[a-zA-Z\\s]*$"),

    //ID_VEHICULO_NO_EXISTE("Revisa el id no existe"),
    SOLO_POSITIVOS_MAX100( "^([0-9]{1,4}(\\.[0-9]+)?|99999(\\.0+)?)$"),
    MAX100_CARACTERES("^[a-zA-Z\\s]{1,100}$"),
    SOLO_LETRAS_SIN_ESPACIOS("^[a-zA-Z]+$"),
    NUMEROS_POSITIVOS_MAX_72("^(?!0)\\d{1,72}$"),
    NUMEROS_POSITIVOS_MAX_1000("^(?:1000(?:\\.0+)?|[0-9]{1,3}(?:\\.[0-9]+)?)$"
    ),
    SOLO_POSITIVOS("^[1-9]\\d*$"),
    FORMATO_FECHA_MM_YY("^(0[1-9]|1[0-2])/\\d{4}$");


    private String expresionRegular;

    RegexExpresiones(String expresionRegular) {
        this.expresionRegular = expresionRegular;
    }

    public String getExpresionRegular() {
        return expresionRegular;
    }

    public void setExpresionRegular(String expresionRegular) {
        this.expresionRegular = expresionRegular;
    }
}
