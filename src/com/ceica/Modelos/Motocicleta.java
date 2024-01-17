package com.ceica.Modelos;

import java.time.LocalDate;

public class Motocicleta extends VehiculoMotorizado{
    private String tipoMotocicleta;

    public Motocicleta(String marca, String modelo, LocalDate fechaFabricacion, String combustible, String tipoMotocicleta) {
        super(marca, modelo, fechaFabricacion, combustible);
        this.tipoMotocicleta = tipoMotocicleta;
    }

    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println(", tipo de motocicleta: " + tipoMotocicleta);
    }
}
