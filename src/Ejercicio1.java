/*
Crear las variables correspondientes para leer tu nombre,
apellido y edad e imprimirlos por consola en una oración.
*/


import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        String nombre;
        String apellido;
        byte edad;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre=scanner.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido=scanner.nextLine();
        System.out.println("Ingrese su edad: ");
        edad= scanner.nextByte();

        System.out.println("Hola, soy "+nombre+" "+apellido+" y tengo "+edad+" años de edad.");
    }

}
