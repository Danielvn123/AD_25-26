import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class EjercicioFicheros6FormaIrregular {
    public static void main(String[] args) throws Exception {

        try (BufferedWriter bw = Files.newBufferedWriter(Path.of("D:\\DANI\\Acceso a datos\\Ficheros\\alumnos.csv"),
                StandardCharsets.UTF_8)) {

            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("Introduce nombre del alumno");
                String nombre = sc.nextLine();
                if (nombre.matches("[A-Ya-z]+")) {
                    bw.write(nombre);
                    bw.write(";");
                }  else if (nombre.matches("Z")) {
                    System.out.println("Programa finalizado");
                    break;
                }

                System.out.println("Introduce la fecha");
                String fecha = sc.nextLine();

                if (fecha.matches("\\d{1,2}-\\d{1,2}-\\d{4}")) {
                    bw.write(fecha);
                } 
                else {
                    System.out.println("El formato de la fecha no es válido");
                }

                for (int i = 1; i <= 3; i++) {
                    bw.write(";");
                    System.out.println("Introduce la nota de la " + i + " evaluacion");
                    String nota = sc.nextLine();
                    bw.write(nota);
                }

                bw.newLine();

            }

        } catch (Exception e) {
        }

        System.out.println("Fin del progreso");

    }
}