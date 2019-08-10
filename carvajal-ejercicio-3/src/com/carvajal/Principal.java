package com.carvajal;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        int opcion;

        boolean continuar = true;
        while(continuar){
            System.out.println("*****INVESA*****");
            System.out.println("1. Ford");
            System.out.println("2. Toyota");
            System.out.println("3. Honda");
            System.out.println("4. Nissan");
            System.out.println("5. Mostar vehiculos Toyota y Nissan");
            System.out.println("6. Salir");
            opcion = lectorDeDatos.solicitarEntero("Ingrese una opcion: ");

            switch(opcion){
                case 1:
                    Ford ford1 = new Ford();
                    ford1.marca = lectorDeDatos.solicitarString("Ingrese la marca: ");
                    ford1.color = lectorDeDatos.solicitarString("Ingrese el color: ");
                    ford1.anio = lectorDeDatos.solicitarEntero("Ingrese el año: ");
                    ford1.precio = lectorDeDatos.solicitarDouble("Ingrese el precio: ");
                    vehiculos.add(ford1);

                    System.out.println("El carro ha sido creado exitosamente\n");
                    break;
                case 2:
                    Toyota toyota1 = new Toyota();
                    toyota1.marca = lectorDeDatos.solicitarString("Ingrese la marca: ");
                    toyota1.color = lectorDeDatos.solicitarString("Ingrese el color: ");
                    toyota1.anio = lectorDeDatos.solicitarEntero("Ingrese el año: ");
                    toyota1.precio = lectorDeDatos.solicitarDouble("Ingrese el precio: ");
                    vehiculos.add(toyota1);

                    System.out.println("El carro ha sido creado exitosamente\n");
                    break;
                case 3:
                    Honda honda1 = new Honda();
                    honda1.marca = lectorDeDatos.solicitarString("Ingrese la marca: ");
                    honda1.color = lectorDeDatos.solicitarString("Ingrese el color: ");
                    honda1.anio = lectorDeDatos.solicitarEntero("Ingrese el año: ");
                    honda1.precio = lectorDeDatos.solicitarDouble("Ingrese el precio: ");
                    vehiculos.add(honda1);

                    System.out.println("El carro ha sido creado exitosamente\n");
                    break;
                case 4:
                    Nissan nissan1 = new Nissan();
                    nissan1.marca = lectorDeDatos.solicitarString("Ingrese la marca: ");
                    nissan1.color = lectorDeDatos.solicitarString("Ingrese el color: ");
                    nissan1.anio = lectorDeDatos.solicitarEntero("Ingrese el año: ");
                    nissan1.precio = lectorDeDatos.solicitarDouble("Ingrese el precio: ");
                    vehiculos.add(nissan1);

                    System.out.println("El carro ha sido creado exitosamente\n");
                    break;
                case 5:
                    if(vehiculos.isEmpty()) {
                        System.out.println(">>> No existe ningun carro creado <<<");
                    } else {
                        for (Vehiculo v: vehiculos) {
                            if(v instanceof Toyota) {
                                System.out.println("\n*** Autos Toyota ***");
                                System.out.println("--> Marca: " + v.marca);
                                System.out.println("--> Color: " + v.color);
                                System.out.println("--> Año: " + v.anio);
                                System.out.println("--> Precio: " + v.precio);
                            }
                            if(v instanceof Nissan){
                                System.out.println("\n*** Autos Nissan ***");
                                System.out.println("--> Marca: " + v.marca);
                                System.out.println("--> Color: " + v.color);
                                System.out.println("--> Año: " + v.anio);
                                System.out.println("--> Precio: " + v.precio);
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Hasta pronto");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
    }
}
