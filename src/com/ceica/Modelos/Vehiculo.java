package com.ceica.Modelos;

import java.time.LocalDate;

public class Vehiculo {
    private String marca;
    private String modelo;
    private LocalDate fechaFabricacion;

    public Vehiculo(String marca, String modelo, LocalDate fechaFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", modelo: " + modelo + ", fecha de fabricacion: " + fechaFabricacion);
    }
}
