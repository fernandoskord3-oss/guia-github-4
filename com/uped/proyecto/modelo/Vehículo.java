package com.uped.proyecto.modelo;

public class Vehículo {
    private final String placa;
    private String marca;
    private int kilometraje;

    // Constructor completo, con validación extraída a un método privado
    public Vehículo(String placa, String marca, int kilometraje) {
        validar(placa, kilometraje);
        this.placa = placa;
        this.marca = marca;
        this.kilometraje = kilometraje;
    }

    // Constructor abreviado: recibe solo placa y marca, encadenado con this()
    public Vehículo(String placa, String marca) {
        this(placa, marca, 0);
    }

    private void validar(String placa, int kilometraje) {
        if (placa == null || placa.isEmpty()) {
            throw new IllegalArgumentException("La placa no puede estar vacía.");
        }
        if (kilometraje < 0) {
            throw new IllegalArgumentException("El kilometraje no puede ser negativo.");
        }
    }

    // Método de fábrica estático que usa el constructor abreviado
    public static Vehículo nuevo(String placa, String marca) {
        return new Vehículo(placa, marca);
    }

    // Incrementa el kilometraje solo si km es mayor a 0
    public void recorrer(int km) {
        if (km > 0) {
            kilometraje += km;
        } else {
            System.out.println("Los kilómetros a recorrer deben ser mayores a 0.");
        }
    }

    @Override
    public String toString() {
        return "Vehículo{placa='" + placa + "', marca='" + marca
                + "', kilometraje=" + kilometraje + "}";
    }
}

