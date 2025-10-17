import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class EjercicioFicheros7 {
    public static void main(String[] args) throws Exception {

        int aprobados = 0;
        String mejorAlumno = "";
        double mejorNota = 0;

        try (BufferedReader br = Files.newBufferedReader(Path.of("D:\\DANI\\Acceso a datos\\Ficheros\\alumnos.csv"),
                StandardCharsets.UTF_8)) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");

                String nombre = datos[0];
                double eval1 = Double.parseDouble(datos[2]);
                double eval2 = Double.parseDouble(datos[3]);
                double eval3 = Double.parseDouble(datos[4]);

                double notafinal = eval1 * 0.2 + eval2 * 0.3 + eval3 * 0.5;

                if (notafinal >= 5) {
                    aprobados++;
                }

                if (notafinal > mejorNota) {
                    mejorNota = notafinal;
                    mejorAlumno = nombre;
                }
            }
            System.out.println("Cantidad de alumnos con nota final >=5: " + aprobados);
            System.out.println("Alumno con mejor nota: " + mejorAlumno + " -> " + mejorNota);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
}