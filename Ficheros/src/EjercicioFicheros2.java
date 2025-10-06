import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class EjercicioFicheros2 {
    public static void main(String[] args) throws Exception {

        try (BufferedWriter bw = Files.newBufferedWriter(Path.of("D:/DANI/Acceso a datos/Ficheros/archivo2.txt"),
                StandardCharsets.UTF_8)) {
            String linea;
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("Escribe linea");
                linea = sc.nextLine();
                if (linea.equals("fin")) {
                    break;
                }

                bw.write(linea);
                bw.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();

        }

        System.out.println("Fin del progreso");
    }
}
