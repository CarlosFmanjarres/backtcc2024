package org.example.modelos;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class FechasJava {

    public void probarFechas(){
        //1. configurar una fecha desde el usuario
        int anio = 1989;
        int mes = 6;
        int dia = 23;
        LocalDate fechaUsuario=LocalDate.of(anio,mes,dia);
        System.out.println("La fecha ingresada por el usuario es: "+fechaUsuario);


        //2. configurar una fecha desde el sistema}
        LocalDate fechaSistema = LocalDate.now();
        System.out.println("La fecha ingresada por el sistema es: "+fechaSistema);


        //Operaciones comunes con fechas en un servidor
        //Calcular la diferencia entre dos fechas


        Long diferenciaDias = ChronoUnit.DAYS.between(fechaUsuario,fechaSistema);
        Long diferenciaMeses = ChronoUnit.MONTHS.between(fechaUsuario,fechaSistema);
        Long diferenciaAnios = ChronoUnit.YEARS.between(fechaUsuario,fechaSistema);


        System.out.println("Han pasado " + diferenciaDias+ " días desde que naciste");
        System.out.println("Han pasado " + diferenciaMeses+ " meses desde que naciste");
        System.out.println("Han pasado " + diferenciaAnios+ " años desde que naciste");


        DayOfWeek diaDeLaSemana=fechaSistema.getDayOfWeek(); //obteniendo el dia de una fechaa
        LocalDate fechaActualizada = fechaSistema.plusDays(5); //agregando dias a una fecha
        System.out.println("la fecha actualizada es "+fechaSistema);
        System.out.println("el dia es "+ fechaActualizada.getDayOfWeek() );



        //Obteniendo datos de una fecha


        DayOfWeek diaSemanaFecha = fechaSistema.getDayOfWeek();

        int diaMes = fechaSistema.getDayOfMonth();
        int diaAnio = fechaSistema.getDayOfYear();

        System.out.println(fechaSistema);
        System.out.println(diaSemanaFecha);
        System.out.println(diaMes);
        System.out.println(diaAnio);



        //Cambiar formato de una fecha


        DateTimeFormatter formato  = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormato = fechaSistema.format(formato);

        System.out.println(fechaSistema);
        System.out.println(fechaFormato);
    }
}
