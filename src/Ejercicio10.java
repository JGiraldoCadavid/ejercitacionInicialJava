/*Crear una función que reciba una colección de números e
imprima los números pares y la suma de los números primos.*/

public class Ejercicio10 {

    public static void main(String[] args) {

        int[] numeros={3,23, 29, 31, 37, 41, 43,10, 45, 32, 1, 1, 11};

        calcularNumerosPares(numeros);
        calcularSumaNumerosPrimos(numeros);
    }

    public static void calcularSumaNumerosPrimos(int[] numeros) {
        int cont;
        int acum=0;
        for (int i = 0; i < numeros.length; i++) {
            cont=0;
            for (int j = 1; j <= numeros[i]; j++) {
                if(numeros[i]%j==0){
                    cont++;
                }
            }
            if(cont==2){
                acum+=numeros[i];
            }
        }
        System.out.println("La suma de los números primos es: "+acum);
    }

    public static void calcularNumerosPares(int[] numeros) {
        System.out.println("Número pares: ");
        for (int numero: numeros) {
            if (numero%2==0){
                System.out.println(numero+" ");
            }
        }
    }

}
