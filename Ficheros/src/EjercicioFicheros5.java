import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class EjercicioFicheros5 {
    public static void main(String[] args) throws Exception {

        int num_lineas = 0;
        int num_caracteres = 0;
        int num_palabras = 0;

        try(BufferedReader br = Files.newBufferedReader(Path.of("D:\\DANI\\Acceso a datos\\Ficheros\\archivo2.txt"), StandardCharsets.UTF_8)){
            String linea;

            while((linea = br.readLine()) !=null){
                num_lineas++;
                num_caracteres+= linea.length();

                num_palabras+= linea.trim().split(" ").length;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Con buffered reader: ");
        System.out.println("\t-Numero lineas: " + num_lineas);
        System.out.println("\t-Numero caracteres: " + num_caracteres);
        System.out.println("\t-Numero palabras: " + num_palabras);
        System.out.println("Fin del progreso");

    }
}