/*Crear una función que reciba una colección de números y
devuelva la suma de los números impares.*/

public class Ejercicio9 {

    public static void main(String[] args) {

        int[] numeros={3,23, 29, 31, 37, 41, 43,10, 45, 32, 1, 1, 11};

        calcularSumaNumerosImpares(numeros);
    }

    public static void calcularSumaNumerosImpares(int[] numeros) {
        System.out.println("Los número impares son: ");
        for (int numero: numeros) {
            if (numero%2==1){
                System.out.print(numero+" ");
            }
        }
    }

}
