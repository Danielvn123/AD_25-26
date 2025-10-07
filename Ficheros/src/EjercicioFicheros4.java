import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EjercicioFicheros4 {
    public static void main(String[] args) throws Exception {

        try {
            //Leyendo con List
            List<String> lineas = Files.readAllLines(Path.of("D:/DANI/Acceso a datos/Ficheros/archivo2.txt"),
                    StandardCharsets.UTF_8);

            for (String linea : lineas) {
                System.out.println(linea.toUpperCase());
            }

            //Leyendo con readString
            String ficheroCompleto = Files.readString(Path.of("D:/DANI/Acceso a datos/Ficheros/archivo2.txt"),StandardCharsets.UTF_8);
            System.out.println(ficheroCompleto);

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Fin del progreso");
    }
}