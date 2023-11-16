package com.mycompany.proyect.c2;

import java.util.ArrayList;

public class Inventario{
    private ArrayList<MateriaPrima> materiasPrimas;

    public Inventario() {
        this.materiasPrimas = new ArrayList<>();
    }

    public void registrarMateriaPrima(MateriaPrima materiaPrima) {
        materiasPrimas.add(materiaPrima);
        System.out.println("Materia prima registrada con éxito.");
    }

    public void borrarMateriaPrima(int numero) {
        for (MateriaPrima materiaPrima : materiasPrimas) {
            if (materiaPrima.getNumero() == numero) {
                materiasPrimas.remove(materiaPrima);
                System.out.println("Materia prima eliminada con éxito.");
                return;
            }
        }
        System.out.println("Materia prima no encontrada.");
    }

    public MateriaPrima buscarMateriaPrima(int numero) {
        for (MateriaPrima materiaPrima : materiasPrimas) {
            if (materiaPrima.getNumero() == numero) {
                return materiaPrima;
            }
        }
        return null;
    }

    public void mostrarListaMateriasPrimas() {
        for (MateriaPrima materiaPrima : materiasPrimas) {
            System.out.println(materiaPrima);
        }
    }
}