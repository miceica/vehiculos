package com.ceica.Modelos;

import java.time.LocalDate;

public class Automovil extends VehiculoMotorizado {
    private int puertas;

    public Automovil(String marca, String modelo, LocalDate fechaFabricacion, String combustible, int puertas) {
        super(marca, modelo, fechaFabricacion, combustible);
        this.puertas = puertas;
    }

    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println(", puertas: " + puertas);
    }
}
