import java.util.Scanner;

public class Ejercicio13 {

    static int capacidadMaxima=500;
    static int dineroRecaudado=0;

    public static void main(String[] args) {
        int opcion;
        Scanner sc= new Scanner(System.in);


        do{
            System.out.println("Seleccione una de las siguientes opciones: \n\n" +
                    "1 - Ingresar datos personales\n" +
                    "2 - Capacidad disponible\n" +
                    "3 - Dinero recaudado\n" +
                    "4 - Salir del sistema\n\n" +
                    "Ingrese la opción: ");
            opcion=sc.nextInt();

            realizarProcesos(opcion);

        }while(opcion!=4);

    }

    public static void realizarProcesos (int opcion){

        switch (opcion){
            case 1:
                ingresarDatos();
                break;
            case 2:
                System.out.println("La capacidad disponible es de: "+capacidadMaxima+"\n");
                break;
            case 3:
                System.out.println("El dinero recaudado es de: "+dineroRecaudado+"\n");
                break;
            case 4:
                System.out.println("Hasta la próxima");
                System.exit(0);
            default:
                System.out.println("Debe ingresar un valor entre 1 y 4");
        }

    }

    public static void ingresarDatos(){
        String nombre;
        int edad;
        String DNI;
        String pase;
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese los siguientes datos: ");
        System.out.println("Nombre: ");
        nombre= sc.nextLine();
        System.out.println("Edad: ");
        edad=sc.nextInt();
        sc.nextLine();
        System.out.println("DNI: ");
        DNI= sc.nextLine();
        System.out.println("Pase: ");
        pase=sc.nextLine();

        validarEdad(edad,pase);

    }

    public static void validarEdad(int edad,String pase) {
        if(edad>=21){
            System.out.println("Puede ingresar \n");
            validarPase(pase);
        }else{
            System.out.println("No se permite el ingreso \n");
        }
    }

    public static void validarPase(String pase){
            if(!pase.equalsIgnoreCase("vip")){
                cobrarEntrada();
            }
    }
    
    public static void cobrarEntrada(){
        double cobro;
        String entrada;
        Scanner sc=new Scanner(System.in);

        System.out.println("¿Desea comprar entrada normal o VIP?\n");
        entrada=sc.nextLine();
        if(entrada.equalsIgnoreCase("vip")){
            cobro=2000/2;
        }else{
            cobro=1500/2;
        }
        System.out.println("Bienvenido!! \n");
        capacidadMaxima--;
        dineroRecaudado+=cobro;
    }


}
