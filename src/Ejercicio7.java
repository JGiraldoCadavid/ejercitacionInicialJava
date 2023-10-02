/*Crear una función que reciba un número entero y devuelva si es
par o impar en forma de texto.*/

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero: ");
        numero=sc.nextInt();

        calcularParidad(numero);

    }

    public static void calcularParidad(int numero) {
        if (numero%2==0){
            System.out.println("El número es par.");
        }else{
            System.out.println("El número es impar.");
        }
    }
}
