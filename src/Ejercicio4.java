/*Crear el código correspondiente que permita ingresar 2 cadenas
de caracteres e imprima por consola si son iguales o no.*/

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        String texto1;
        String texto2;

        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese un texto: ");
        texto1=scanner.nextLine();
        System.out.println("Ingrese otro texto: ");
        texto2=scanner.nextLine();

        if (texto1.equals(texto2)){
            System.out.println("Los textos son iguales");
        }else{
            System.out.println("Los textos son diferentes");
        }
    }

}
