package org.example.modelos;


import org.example.helpers.mensajes.MensajesVehiculo;

import org.example.helpers.validaciones.VehiculoValidacion;




import static org.example.helpers.mensajes.MensajesVehiculo.*;

public class Vehiculo {


    //Inyectando una dependencia de la clase vehiculo validacion

    private VehiculoValidacion vehiculoValidacion = new VehiculoValidacion();


    //id
    private Integer id; //solo numeros positivos

    //marca
    private String marca; //solo letras y espacios y maximo 50 caracteres sin caracteres especiales

    //modelo
    private String modelo; //CON EL PROFE

    //kilometraje
    private Double kilometraje; //solo positivos y maximo 100.000

    //color
    private String color; //solo letras y espacios y maximo 20 caracteres

    //descripcion
    private String descripcion; //maximo 100 caracteres

    //tipo
    private String tipo; //solo letras SIN ESPACIOS

    //autonomia
    private Integer autonomia; //solo numeros positivos maximo 72

    //capacidadCarga
    private Double capacidadCarga; // solo numeros positivos y maximo 1000

    //avaluo
    private Integer avaluo; //solo positivos

    //CONSTRUCTORES DE LA CLASE


    public Vehiculo() {
    }

    public Vehiculo(Integer id, String marca, String modelo, Double kilometraje, String color, String descripcion, String tipo, Integer autonomia, Double capacidadCarga, Integer avaluo) {

        setId(id);
        setMarca(marca);
        setModelo(modelo);
        setKilometraje(kilometraje);
        setColor(color);
        setDescripcion(descripcion);
        setTipo(tipo);
        setAutonomia(autonomia);
        setCapacidadCarga(capacidadCarga);
        setAvaluo(avaluo);

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if (id > 0) {
            System.out.println("todo esta correcto");
        } else {

            System.out.println(ID_VEHICULO_ERRONEO.getMensajeError());

        }
    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        try {
            this.vehiculoValidacion.validarMarca(marca);
            System.out.println("todo esta correcto");

        } catch (Exception error) {
            System.out.println(MARCA_VEHICULO_ERRONEO.getMensajeError());

        }
    }

    public VehiculoValidacion getVehiculoValidacion() {
        return vehiculoValidacion;
    }

    public void setVehiculoValidacion(VehiculoValidacion vehiculoValidacion) {
        this.vehiculoValidacion = vehiculoValidacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        try {
            if (this.vehiculoValidacion.validarModelo(modelo)) {
                System.out.println("todo esta correcto");
            }
        } catch (Exception e) {
            System.out.println(FECHA_VEHICULO_INCORRECTA.getMensajeError());

        }
    }

    public Double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Double kilometraje) {
        try {
            if (this.vehiculoValidacion.validarKilometraje(String.valueOf(kilometraje))) {
                System.out.println("todo esta correcto");
            }
        } catch (Exception e) {
            System.out.println(MensajesVehiculo.KILOMETRAJE_VEHICULO_ERRONEO.getMensajeError());

        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        try {
            if (this.vehiculoValidacion.validarColor(color)) {
                System.out.println("todo esta correcto");
            }
        } catch (Exception e) {
            System.out.println(MensajesVehiculo.COLOR_VEHICULO_ERRONEO.getMensajeError());

        }

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        try {
            if (this.vehiculoValidacion.validarDescripcion(descripcion)) {
                System.out.println("todo esta correcto");
            }
        } catch (Exception e) {
            System.out.println(MensajesVehiculo.DESCRIPCION_VEHICULO_ERRONEA.getMensajeError());

        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        try {
            if (this.vehiculoValidacion.validarTipo(tipo)) {
                System.out.println("todo esta correcto");
            }
        } catch (Exception e) {
            System.out.println(SOLO_LETRAS_Y_ESPACIOS.getMensajeError());

        }
    }

    public Integer getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(Integer autonomia) {
        try {
            if (this.vehiculoValidacion.validarAutonomia(autonomia)) {
                System.out.println("todo esta correcto");
            }
        } catch (Exception e) {
            System.out.println(MensajesVehiculo.AUTONOMIA_VEHICULO_ERRONEA.getMensajeError());

        }
    }

    public Double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(Double capacidadCarga) {
        try {
            if (this.vehiculoValidacion.validarCapacidadCarga(String.valueOf(capacidadCarga))) {
                System.out.println("todo esta correcto");
            }
        } catch (Exception e) {
            System.out.println(MensajesVehiculo.CAPACIDAD_CARGA_VEHICULO_ERRONEA.getMensajeError());

        }

    }

    public Integer getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(Integer avaluo){
                try {
                    if (this.vehiculoValidacion.validarAvaluo(String.valueOf(avaluo))) {
                        System.out.println("todo esta correcto");
                    }
                } catch (Exception e) {
                    System.out.println(MensajesVehiculo.AVALUO_VEHICULO_ERRONEO.getMensajeError());

                }
            }}




