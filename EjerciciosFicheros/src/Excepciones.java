import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("EJERCICIO 13.1");

        /*
         * Haz un programa que solicite al usuario dos números enteros y los intente
         * dividir (división entera, sin decimales). Si se produce algún error el
         * programa no finalizará
         * de forma abrupta si no que capturará la excepción ocurrida: o bien entrada de
         * valores incorrectos o
         * bien por división por cero, informando al usuario de lo que ha acontecido.
         * Finalmente, mostrará el
         * resultado de la división, que será cero en caso de cualquiera de los dos
         * errores posibles.
         * Nota: para provocar la excepción, hacemos la división de enteros, sin
         * casting: double res=num1 /num2; con num2=0. Si hiciésemos el casting: double
         * res = (double) num1 /
         * num2; no se produce la excepción, informa que el resultado es ‘Infinity’.
         */

        int num1 = 0;
        int num2 = 0;
        int resultado = 0;

        try {
            System.out.println("Dame numero 1: ");
            num1 = teclado.nextInt();

            System.out.println("Dame numero 2: ");
            num2 = teclado.nextInt();

            resultado = num1 / num2;

        } catch (InputMismatchException e) {

            resultado = 0;

        } catch (ArithmeticException e) {

            resultado = 0;
        }

        System.out.println("Resultado de la división: " + resultado);

        System.out.println("EJERCICIO 13.2");

        /*
         * Haz un programa que tenga definido un Array de 7 posiciones de
         * double que representa la temperatura media en una ciudad durante una semana
         * (puedes generar valores al azar entre 0 y 40
         * para llenarlo). Se le solicitará al usuario que introduzca dos posiciones
         * (entre 0 y 6), y calculará la
         * temperatura media entre esos días de la semana, ambos inclusive. Si los
         * valores introducidos no son
         * válidos, por estar fuera de los límites del array se capturará la excepción y
         * la media será cero.
         */

        double[] array = new double[7];

        for (int i = 0; i < 7; i++) {
            array[i] = Math.random() * 40;
            System.out.println("Temperatura día " + i + " : " + array[i]);
        }

        System.out.println("Introduce número 1: ");
        int a = teclado.nextInt();

        System.out.println("Introduce número 2: ");
        int b = teclado.nextInt();

        if (a > b) {
            int aux = a;
            a = b;
            b = aux;
        }

        double suma = 0;
        double media;

        try {
            for (int i = a; i <= b; i++) {
                suma = array[i];
            }
            media = suma / (b - a + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Numeros incorrectos");
            media = 0;
        }
        System.out.println("La media: " + media);

        System.out.println("EJERCICIO 13.4");

        /*
         * Crear una función leerEntero(int max, int min) que solicite al usuario la
         * entrada de un número
         * entero y que valide que es un valor entero y que está comprendido entre los
         * parámetros
         * max y min (esto es, mayor o igual que min y menor o igual que max). El
         * usuario deberá repetir la entrada de
         * datos hasta que lo haga bien, devolviendo finalmente la función el valor
         * introducido y validado. La
         * función controlará las posibles excepciones (por ejemplo caracteres no
         * numéricos).
         */

        leerEntero(9, 1);
    }

    public static Integer leerEntero(int max, int min) {

        Scanner teclado = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Introduce un entero: ");
                String cadena = teclado.next();
                int numero = Integer.parseInt(cadena);

                if (numero > min && numero < max) {
                    teclado.close();
                    System.out.println("Numero valido");
                    return numero;
                } else {
                    System.out.println("Numero no valido. Introduce un nuevo numero");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no valida ");
                teclado.next();
            }

         System.out.println("EJERCICIO 13.4");

        }

    }

        /*Realiza una función/método que se le pase por parámetro una cadena que representa una
        dirección de correo electrónico. En caso de que la cadena no cumpla las condiciones sintácticas de
        un email, se generará una excepción llamada EmailInvalidoException con mensaje: “Formato email
        inválido”. Si no se produce la excepción, el método devolverá la parte del email previa a la arroba.
        Los requisitos que tiene que tener una dirección de email podrían ser: número mínimo de
        caracteres=5, una arroba y al menos un punto después de la arroba. Hacer también un programa
        que llame a la función anterior y capture la excepción generada. */

        public static String validarEmail(String email) throws EmailInvalidoException{

            if(email.length() < 5){
                throw new EmailInvalidoException();
            }

            if(!email.contains("@")){
                throw new EmailInvalidoException();
            }

            int posicion = email.indexOf("@");
            int posicion2 = email.indexOf(".");
            String subString = email.substring(posicion);

            if(!subString.contains(".")){
                throw new EmailInvalidoException();
            }
            return email.substring(0, posicion2);
            }
        }
