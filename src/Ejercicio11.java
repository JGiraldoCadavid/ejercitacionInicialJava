/*Crear una función que imprima por consola un pequeño
menú con las opciones básicas de una calculadora agregando
la opción 0 para salir del mismo.*/

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        crearMenuCalculadora();

    }

    public static void crearMenuCalculadora() {
        byte opcion;
        Scanner sc= new Scanner(System.in);

        do {
            System.out.println("Seleccione una de las siguientes opciones: \n" +
                    "1 - Sumar\n" +
                    "2 - Restar\n" +
                    "3 - Multiplicar\n" +
                    "4 - Dividir\n" +
                    "0 - Salir");
            opcion=sc.nextByte();

            Ejercicio12.calcularOperaciones(opcion);

        }while (opcion!=0);
    }

}
