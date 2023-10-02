/*Crear otra función que ocupe la del punto anterior para poder
crear una pequeña calculadora usando switch. Tener en cuenta
el caso de la división por 0.*/

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Ejercicio11.crearMenuCalculadora();

    }

    public static void calcularOperaciones(byte opcion) {
        int numero1, numero2;
        Scanner sc= new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        numero1=sc.nextInt();
        System.out.println("Ingrese un número: ");
        numero2=sc.nextInt();

        switch (opcion){
            case 1:
                sumar(numero1,numero2);
                break;
            case 2:
                restar(numero1,numero2);
                break;
            case 3:
                multiplicar(numero1,numero2);
                break;
            case 4:
                dividir(numero1,numero2);
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No seleccionó un valor entre 0 y 4");
        }
    }

    public static void sumar(int numero1,int numero2){
        System.out.println(numero1+numero2);
    }

    public static void restar(int numero1,int numero2){
        System.out.println(numero1-numero2);
    }

    public static void multiplicar(int numero1,int numero2){
        System.out.println(numero1*numero2);
    }

    public static void dividir(int numero1,int numero2){
        if (numero2!=0){
            System.out.println(numero1/numero2);
        }else{
            System.out.println("No se puede dividir por cero");
        }
    }

}
