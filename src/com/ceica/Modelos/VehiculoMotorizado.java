package com.ceica.Modelos;

import java.time.LocalDate;

public class VehiculoMotorizado extends Vehiculo {
    private String combustible;

    public VehiculoMotorizado(String marca, String modelo, LocalDate fechaFabricacion, String combustible) {
        super(marca, modelo, fechaFabricacion);
        this.combustible = combustible;
    }

    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println(", combustible: " + combustible);
    }

}
