/*Crear una función que reciba una colección de números y
devuelva la suma de los números impares.*/

public class Ejercicio8 {

    public static void main(String[] args) {

        int[] numeros= {1,2,3,4,5,6,7,8,9,10};

        sumarImpares(numeros);

    }

    public static void sumarImpares(int[] numeros) {
        int acumulador=0;
        for (int numero: numeros ) {
            if (numero%2!=0){
                acumulador+=numero;
            }
        }
        System.out.println("La suma de impares es: "+acumulador);
    }

}
