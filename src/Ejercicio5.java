/*Realizar un pequeño programa que permita el ingreso de
números, almacenarlos en una colección hasta ingresar un 0.*/

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        int[] numeros= new int[100];
        int numero;
        int cont=0;
        Scanner sc= new Scanner(System.in);

        do{
            System.out.println("Ingrese un número: ");
            numero=sc.nextInt();
            numeros[cont]=numero;
            cont++;
        }while(numero!=0);

        for (int num: numeros ) {
            if (num!=0){
                System.out.println("["+num+"]");
            }
        }

    }

}
