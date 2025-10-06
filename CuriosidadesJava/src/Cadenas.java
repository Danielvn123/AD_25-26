 import java.util.Scanner;

 public class Cadenas{
    
    public static void main(String [] args) throws Exception {

        //*Ejercicio Cadenas 4.1 A*/

        System.out.println("-----------------------"); 
        System.out.println("EJERCICIO CADENAS 4.1 A");

        String cadena; 

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame una cadena en mayúsculas");
        cadena = teclado.nextLine();

        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());

        

        //*Ejercicio 4.1 B*/

        System.out.println("-----------------------");
        System.out.println("EJERCICIO CADENAS 4.1 B");

        System.out.println("Dime si en la cadena hay una x");

        if (cadena.contains("x") || cadena.contains("X")) {
            System.out.println("La cadena contiene el carácter 'x'.");
        }else{
            System.out.println("La cadena NO contiene el carácter 'x'.");
        }

        //*Ejercicio 4.1 C*/

        System.out.println("-----------------------");
        System.out.println("EJERCICIO CADENAS 4.1 C");

        System.out.println("Ingresa una cadena");

        if (cadena.length() > 10){
            System.out.println("La cadena tiene más de 10 posiciones");
        }else{
            System.out.println("La cadena NO tiene más de 10 posiciones");
        }

        //*Ejercicio 4.1 D*/

        System.out.println("-----------------------");
        System.out.println("EJERCICIO CADENAS 4.1 D");

        System.out.println("¿La cadena contiene el carácter 'x' en la cuarta posición?");

         if (cadena.length() >=4){
                System.out.println("Las primeras 5 posiciones son: " + cadena);
         }
         else if(cadena.substring(3).contains("x") || (cadena.substring(3).contains("X"))){
            System.out.println("La cadena contiene el carácter 'x'.");
        }
        else{
            System.out.println("La cadena NO contiene el carácter 'x'.");
        }

        //*Ejercicio 4.1 E*/

        System.out.println("-----------------------");
        System.out.println("EJERCICIO CADENAS 4.1 E");

        System.out.println("Crea una cadena formada por las 5 primeras posiciones");

         if (cadena.length() >=5){
            String subcadena = cadena.substring(0, 5);
            System.out.println("Las primeras 5 posiciones son: " + subcadena);
        }else{
            System.out.println("La cadena tiene menos de 5 caracteres.");
        }

        //*Ejercicio 4.1 F*/

        System.out.println("-----------------------");
        System.out.println("EJERCICIO CADENAS 4.1 F");

        System.out.println("Crea una cadena formada por las 5 últimas posiciones");

         if (cadena.length() >=5){
            String subcadena = cadena.substring(cadena.length() - 5);
            System.out.println("Las últimas 5 posiciones son: " + subcadena);
        }else{
            System.out.println("La cadena tiene menos de 5 caracteres.");
        }

        //*Ejercicio 4.1 G*/

        System.out.println("-----------------------");
        System.out.println("EJERCICIO CADENAS 4.1 G");

        System.out.println("Dime si la cadena es igual que la cadena 'hola'.");

         if (cadena.equals("hola")){
            System.out.println("La cadena es hola");
        }else{
            System.out.println("La cadena NO es hola");
        }

        //*Ejercicio 4.1 H*/

        System.out.println("-----------------------");
        System.out.println("EJERCICIO CADENAS 4.1 H");

        System.out.println("Convierte la cadena a una variable.");

        Integer numero;
        try {
        numero = Integer.parseInt(cadena);
        System.out.println(numero);
        }   
        catch(NumberFormatException exception){
            System.out.println("La cadena no es un enetero");
        }
        catch(Exception e){
        System.out.println("Ha ocurrido otro tipo de error");
        System.out.println(e.getMessage());
        }
        
        //*Ejercicio 4.1 I*/
        /*
        System.out.println("-----------------------");
        System.out.println("EJERCICIO CADENAS 4.1 I");

        int decimal = Integer.parseInt(cadena, 16);
        System.out.println(decimal);

        String valoresHex = "0123456789ABCDEF";

        for(char c : cadena.toCharArray()){
            int valor = valoresHex.indexOf(c);
            decimal = decimal*16 + valor;
        }

        System.out.println(decimal);

     //*Ejercicio 4.1 J*/

        System.out.println("-----------------------");
        System.out.println("EJERCICIO CADENAS 4.1 J");

        System.out.println("Si se encuentra en su interior con 'prueva' sustituir por 'prueba'.");

        if(cadena.contains("prueva")){
            cadena = cadena.replace("prueva", "prueba");
            System.out.println(cadena);
        }

        //*Ejercicio 4.1 K*/

        System.out.println("-----------------------");
        System.out.println("EJERCICIO CADENAS 4.1 K");

        System.out.println("¿La primera posición de la cadena es igual a la ultima?");

        Character primera = cadena.charAt(0);
        Character ultima = cadena.charAt(cadena.length()-1);

        if(primera.equals(ultima)){
            System.out.println("Si, el primer caracter es igual al ultimo");
        }
        else{
            System.out.println("No, el primer caracter y el ultimo no son iguales");;
        }
        

        //*Ejercicio 4.1 L*/

        System.out.println("-----------------------");
        System.out.println("EJERCICIO CADENAS 4.1 L");

        System.out.println("¿Cuantos digitos hay en la cadena?");

        int contador = 0;

        for(int i = 0; i < cadena.length(); i++){
            char letra = cadena.charAt(i);
            if(Character.isDigit(letra)){
                contador++;
            }
        }

        System.out.println("La cadena tiene " + contador + " digitos.");

        /*Otra forma de hacer el ejercicio L */

        contador = 0;

        for(char caracterCadena : cadena.toCharArray()){
            if(Character.isDigit(caracterCadena)){
                contador ++;
            }

        }
    
         //*Ejercicio 4.1 M*/

        System.out.println("-----------------------");
        System.out.println("EJERCICIO CADENAS 4.1 M");

        System.out.println("¿La cadena es un palindromo?");

        String reverso = new StringBuilder(cadena).reverse().toString();

        if(cadena.equals(reverso)){
            System.out.println("Si, es un palindromo");
        }
        else{
            System.out.println("No, no es un palindromo");
        }
        
        /*Otra forma de hacer el Ejercicio M con i y j */

        boolean esPalindromo = true;
        for(int i = 0, j = cadena.length()-1;i < j; i++, j--){
            if(cadena.charAt(i) != cadena.charAt(j)){
                esPalindromo = false;
                break;
            }
        }

        System.out.println("Es palindromo" + esPalindromo);

        /*Otra forma de hacer el Ejercicio M pero dividiendo entre dos */

        esPalindromo = true;

        for(int i = 0; i < cadena.length()/2; i++){
            if(cadena.charAt(i) != cadena.charAt(cadena.length()-1-i)){
            esPalindromo = false;
            break;
            }
        }
            System.out.println("Es palindromo" + esPalindromo);

        //*Ejercicio 4.1 N*/

        System.out.println("-----------------------");
        System.out.println("EJERCICIO CADENAS 4.1 N");

        System.out.println("");

        char ultimo = cadena.charAt(cadena.length()-1);
        char primero = cadena.charAt(0);

        String cadena2 = cadena.substring(1,cadena.length()-1);

        cadena2 = ultimo + cadena2 + primero;

        System.out.println("La nueva cadena es" + cadena2);

        teclado.close();
    }
}
    
