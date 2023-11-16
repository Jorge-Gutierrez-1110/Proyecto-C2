package com.mycompany.proyect.c2;

public class MateriaPrima{
    private int numero;
    private String nombre;
    private int cantidad;

    public MateriaPrima(int numero, String nombre, int cantidad) {
        this.numero = numero;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Número: " + numero + ", Nombre: " + nombre + ", Cantidad: " + cantidad;
    }
}