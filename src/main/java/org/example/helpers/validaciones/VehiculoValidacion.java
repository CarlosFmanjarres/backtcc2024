package org.example.helpers.validaciones;
import org.example.helpers.generals.RegexValidators;
import org.example.helpers.mensajes.MensajesMercancia;
import org.example.helpers.mensajes.MensajesVehiculo;
import org.example.helpers.mensajes.RegexExpresiones;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VehiculoValidacion {
    private RegexValidators regexValidator = new RegexValidators();

    public boolean validarId(Integer id) throws Exception {

        if (id < 0) {
            throw new Exception(MensajesVehiculo.ID_VEHICULO_ERRONEO.getMensajeError());
        }

        return true;
    }

    public boolean validarMarca(String marca)throws Exception{
        if(!regexValidator.validarRegex(marca, RegexExpresiones.VALIDAR_SOLO_LETRAS_Y_ESPACIOS.getExpresionRegular())){
           throw new Exception(MensajesVehiculo.MARCA_VEHICULO_ERRONEO.getMensajeError());
        }
        if(marca.length()>50){
            throw new Exception(MensajesVehiculo.CARACTERES_INVALIDO.getMensajeError());
        }
        return true;

    }
    public boolean validarKilometraje(String kilometraje)throws Exception{
        if(!regexValidator.validarRegex(kilometraje, RegexExpresiones.SOLO_POSITIVOS_MAX100.getExpresionRegular())){
            throw new Exception(MensajesVehiculo.KILOMETRAJE_VEHICULO_ERRONEO.getMensajeError());
        }
        else{
            return true;

        }


    }

    public boolean validarColor(String color)throws Exception{
        if(!regexValidator.validarRegex(color, RegexExpresiones.VALIDAR_SOLO_LETRAS_Y_ESPACIOS.getExpresionRegular())){
            throw new Exception(MensajesVehiculo.COLOR_VEHICULO_ERRONEO.getMensajeError());
        }
        else{
            return true;

        }


    }

    public boolean validarDescripcion(String descripcion)throws Exception{
        if(!regexValidator.validarRegex(descripcion, RegexExpresiones.MAX100_CARACTERES.getExpresionRegular())){
            throw new Exception(MensajesVehiculo.DESCRIPCION_VEHICULO_ERRONEA.getMensajeError());
        }
        else{
            return true;

        }


    }
    public boolean validarTipo(String tipo)throws Exception{
        if(!regexValidator.validarRegex(tipo, RegexExpresiones.SOLO_LETRAS_SIN_ESPACIOS.getExpresionRegular())){
            throw new Exception(MensajesVehiculo.SOLO_LETRAS_Y_ESPACIOS.getMensajeError());
        }
        else{
            return true;

        }


    }
    public boolean validarAutonomia(Integer autonomia)throws Exception{

        if(!regexValidator.validarRegex(String.valueOf(autonomia), RegexExpresiones.NUMEROS_POSITIVOS_MAX_72.getExpresionRegular())){
            throw new Exception(MensajesVehiculo.AUTONOMIA_VEHICULO_ERRONEA.getMensajeError());
        }
        else{
            return true;

        }


    }
    public boolean validarCapacidadCarga(String capacidadCarga)throws Exception{
        if(!regexValidator.validarRegex(capacidadCarga, RegexExpresiones.NUMEROS_POSITIVOS_MAX_1000.getExpresionRegular())){
            throw new Exception(MensajesVehiculo.CAPACIDAD_CARGA_VEHICULO_ERRONEA.getMensajeError());
        }
        else{
            return true;

        }


    }
    public boolean validarAvaluo(String avaluo)throws Exception{
        if(!regexValidator.validarRegex(avaluo, RegexExpresiones.SOLO_POSITIVOS.getExpresionRegular())){
            throw new Exception(MensajesVehiculo.AVALUO_VEHICULO_ERRONEO.getMensajeError());
        }
        else{
            return true;

        }


    }



    public boolean validarModelo(String fechaModelo)throws Exception {
        if(!regexValidator.validarRegex(fechaModelo,RegexExpresiones.FORMATO_FECHA_MM_YY.getExpresionRegular())){
            throw new Exception(MensajesVehiculo.FECHA_VEHICULO_INCORRECTA.getMensajeError());
        }else{
            return true;

        }


    }





}
