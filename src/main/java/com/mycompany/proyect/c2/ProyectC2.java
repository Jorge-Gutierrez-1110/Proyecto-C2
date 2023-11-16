package com.mycompany.proyect.c2;

import java.util.Scanner;

public class ProyectC2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1 - Registrar materia prima");
            System.out.println("2 - Borrar materia prima");
            System.out.println("3 - Buscar por número de materia prima");
            System.out.println("4 - Modificar");
            System.out.println("5 - Mostrar lista de materias primas");
            System.out.println("6 - Regresar");
            System.out.print("Ingrese la opción deseada: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Registro de materia prima
                    System.out.print("Ingrese el número de materia prima: ");
                    int numero = scanner.nextInt();
                    System.out.print("Ingrese el nombre de materia prima: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese la cantidad de materia prima: ");
                    int cantidad = scanner.nextInt();

                    MateriaPrima nuevaMateriaPrima = new MateriaPrima(numero, nombre, cantidad);
                    inventario.registrarMateriaPrima(nuevaMateriaPrima);
                    break;

                case 2:
                    // Borrar materia prima
                    System.out.print("Ingrese el número de materia prima a borrar: ");
                    int numeroBorrar = scanner.nextInt();
                    inventario.borrarMateriaPrima(numeroBorrar);
                    break;

                case 3:
                    // Buscar por número de materia prima
                    System.out.print("Ingrese el número de materia prima a buscar: ");
                    int numeroBuscar = scanner.nextInt();
                    MateriaPrima materiaEncontrada = inventario.buscarMateriaPrima(numeroBuscar);

                    if (materiaEncontrada != null) {
                        System.out.println("Materia prima encontrada: " + materiaEncontrada);
                    } else {
                        System.out.println("Materia prima no encontrada.");
                    }
                    break;

                case 4:
                    // Modificar una materia prima (en este caso, la cantidad)
                    System.out.print("Ingrese el número de materia prima a modificar: ");
                    int numeroModificar = scanner.nextInt();
                    MateriaPrima materiaModificar = inventario.buscarMateriaPrima(numeroModificar);

                    if (materiaModificar != null) {
                        System.out.println("Materia prima actual: " + materiaModificar);
                        System.out.print("Ingrese la nueva cantidad: ");
                        int nuevaCantidad = scanner.nextInt();
                        materiaModificar.setCantidad(nuevaCantidad);
                        System.out.println("Cantidad modificada con éxito.");
                    } else {
                        System.out.println("Materia prima no encontrada.");
                    }
                    break;

                case 5:
                    // Mostrar lista de materias primas
                    inventario.mostrarListaMateriasPrimas();
                    break;

                case 6:
                    // Salir del programa
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        }
    }
}