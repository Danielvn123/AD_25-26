
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cadena");
        String cadena = teclado.nextLine();

        System.out.println("============");
        System.out.println("Apartado A");

        if (cadena.matches("\\d{4} ?[A-Z]{3}")) {
            System.out.println("La cadena es una matrícula");
        } else {
            System.out.println("La cadena no es una matrícula");
        }



        System.out.println("============");
        System.out.println("Apartado B");

        if (cadena.matches("[0][1]+")) {
            System.out.println("La cadena es un número binario");
        } else {
            System.out.println("La cadena no es un número binario");
        }



        System.out.println("============");
        System.out.println("Apartado C");

        if (cadena.matches("[0-9A-Fa-f]{5,8}")) {
            System.out.println("La cadena es un número hexadecimal");
        } else {
            System.out.println("La cadena no es un número hexadecimal");
        }



        System.out.println("============");
        System.out.println("Apartado D");

        if (cadena.matches("\\D{4}-\\{2}-\\{2}")) {
            System.out.println("La cadena es una fecha formato YYYY-MM-DD");
        } else {
            System.out.println("La cadena no es una fecha formato YYYY-MM-DD");
        }



        System.out.println("============");
        System.out.println("Apartado E");

        if (cadena.matches("\\D{4}-\\{1,2}-\\{1,2}")) {
            System.out.println("La cadena es una fecha formato YYYY-M-D");
        } else {
            System.out.println("La cadena no es una fecha formato YYYY-MM-DD");
        }


        
        System.out.println("============");
        System.out.println("Apartado F");

        if (cadena.matches("^`@\\W-_]{2,15}")) {
            System.out.println("La cadena es un usuario en twitter");
        } else {
            System.out.println("La cadena no es un usuario en twitter");
        }
    }

}
