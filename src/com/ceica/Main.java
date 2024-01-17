package com.ceica;

import com.ceica.Modelos.Automovil;
import com.ceica.Modelos.Motocicleta;
import com.ceica.Modelos.Vehiculo;
import com.ceica.Modelos.VehiculoMotorizado;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Opel","Astra", LocalDate.of(2000,5,5));
        VehiculoMotorizado vehiculoMotorizado1 = new VehiculoMotorizado("Mercedes","Clase A",LocalDate.of(2001,5,5),"gasolina");
        Automovil automovil1 = new Automovil("Mazda","CX-30",LocalDate.of(2020,5,5),"Gasolina",5);
        Motocicleta motocicleta1 = new Motocicleta("Honda","Sakura",LocalDate.of(2010,5,5),"Electrica","Scooter");

        vehiculo1.mostrarDetalles();
        vehiculoMotorizado1.mostrarDetalles();
        automovil1.mostrarDetalles();
        motocicleta1.mostrarDetalles();
    }
}