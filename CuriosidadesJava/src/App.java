import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //*Ejercicio 1 */

        System.out.println("-----------");
        System.out.println("EJERCICIO 1");

        String A = "Prueba";
        String B = "Prueba";

        if(A.equals(B)){
        System.out.println("A y B son equals");

        }
        else{
             System.out.println("A y B no son equals");

        }

        if(A==B){
                System.out.println("A y B son equals con ==");

        }
        else{
            System.out.println("A y B no son equals con ==");

        }

        String C = new String("Prueba");

         if(A.equals(C)){
        System.out.println("A y C son equals");

        }
        else{
             System.out.println("A y C no son equals");

        }

        if(A==C){
                System.out.println("A y C son equals con ==");

        }
        else{
            System.out.println("A y C no son equals con ==");

        }
        
        //*Ejercicio 2*/

        System.out.println("-----------");
        System.out.println("EJERCICIO 2");


        Integer D = 0;
        Integer E = 0;

        while(D == E){

        D = D + 1;
        E = E + 1;

    }
        if(D != E){
            System.out.println("D(" + D + ") y E(" + E + ") no son iguales");

    }

    D = 0;
    E = 0;

     while(D == E){

        D = D - 1;
        E = E - 1;

    }
        if(D != E){
            System.out.println("D(" + D + ") y E(" + E + ") no son iguales");
    }

     //*Ejercicio 3 */

        System.out.println("-----------");
        System.out.println("EJERCICIO 3");

        float F = 0;

        while(F<1){
            F = F + 0.1F;
            System.out.println(F);
        }

        //*Ejercicio 4 */

        System.out.println("-----------");
        System.out.println("EJERCICIO 4");

        float G = 0.1F;
        float H =0.2F;
        float I = G + H;

        System.out.println(G + " + " + H + " = " +I);

        System.out.println(G + " + " + H + " = " +(double)I);

       //*Ejercicio Cadenas 4.1 a*/

        System.out.println("-----------"); 
        System.out.println("EJERCICIO CADENAS 4.1 a");

        String cadena; 

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame una cadena en mayúsculas");
        cadena = teclado.nextLine();

        System.out.println(cadena.toLowerCase());


        //*Ejercicio 4.1 b*/

        System.out.println("-----------------------");
        System.out.println("EJERCICIO CADENAS 4.1 b");

        System.out.println("Dime si en la cadena hay una x");

        if (cadena.indexOf('x') !=-1){
            System.out.println("La cadena contiene el carácter 'x'.");
        }else{
            System.out.println("La cadena NO contiene el carácter 'x'.");
        }

        }
    }


