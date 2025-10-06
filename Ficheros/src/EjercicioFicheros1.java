import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class EjercicioFicheros1 {
    public static void main(String[] args) throws Exception {
        Path path = Path.of("D:\\DANI\\Acceso a datos\\Ficheros\\archivo.txt");

        try (BufferedWriter bw = Files.newBufferedWriter(Path.of("D:/DANI/Acceso a datos/Ficheros/archivo.txt"),StandardCharsets.UTF_8)) {
            bw.write("aaañññaaa");

        } catch (Exception e) {

        }

        System.out.println("Fin del progreso");
        /* 
        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
    }
}