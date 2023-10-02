/*Realizar un pequeño programa que permita el ingreso de un
número e imprimir por consola su paridad.*/

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        int numero;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        numero= scanner.nextInt();

        if (numero%2==0){
            System.out.println("El número "+numero+" es par.");
        }else{
            System.out.println("El número "+numero+" es impar.");
        }
    }

}
