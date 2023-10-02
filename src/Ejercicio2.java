/*
Realizar un pequeño programa que permita ingresar 3 números
e imprimir por consola cuál es el mayor.
*/

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        byte numero1;
        byte numero2;
        byte numero3;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        numero1= scanner.nextByte();
        System.out.println("Ingrese el segundo número: ");
        numero2= scanner.nextByte();
        System.out.println("Ingrese el tercer número: ");
        numero3= scanner.nextByte();

        if (numero1>numero2 && numero1>numero3){
            System.out.println("El numero mayor es: "+numero1);
        }else if(numero2>numero3){
            System.out.println("El numero mayor es: "+numero2);
        }else{
            System.out.println("El numero mayor es: "+numero3);
        }
    }


}
