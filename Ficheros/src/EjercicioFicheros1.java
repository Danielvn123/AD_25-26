import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class EjercicioFicheros1 {
      public static void main(String[] args) throws Exception {

        try (BufferedWriter bw = Files.newBufferedWriter(Path.of("D:/DANI/Acceso a datos/Ficheros/archivo.txt"))) {
            bw.write("aaañññaaa");
            bw.flush();

            bw.newLine();
            bw.write("Otra linea");

            Scanner sc = new Scanner(System.in);
            System.out.println("Dale a enter para escribir");
            sc.nextLine();

        } catch (Exception e) {

        }

        System.out.println("Fin del progreso");
    }
}
