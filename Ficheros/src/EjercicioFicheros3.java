import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class EjercicioFicheros3 {
    public static void main(String[] args) throws Exception {

        //Ruta del archivo
        Path ruta = Path.of("D:/DANI/Acceso a datos/Ficheros/archivo2.txt");

        //BufferedReader para leer los ficheros
        try (BufferedReader br = Files.newBufferedReader(ruta,StandardCharsets.UTF_8)) {
            String linea;

            //Recorremos la linea hasta que sea nulo y dps imprimimos lo que este en el fichero en mayuscula
            while ((linea = br.readLine()) != null) {
                System.out.println(linea.toUpperCase());
            }

        } catch (Exception e) {
        }

        System.out.println("Fin del progreso");
    }
}