import java.io.File;
import java.util.Calendar;
import java.util.Scanner;

public class ExerciciosClaseFile {
    public static void main(String[] args) throws Exception {

        System.out.println("===========");
        System.out.println("EJERCICIO 1");

        File f = new File("D:\\DANI\\Acceso a datos\\FICHERO.txt");
        System.out.println("El nombrer es: " + f.getName());
        System.out.println("Existe: " + f.exists());
        System.out.println("Directorio: " + f.isDirectory());
        System.out.println("Fichero: " + f.isFile());
        System.out.println("La ruta absoluta es :" + f.getAbsolutePath());
        System.out.println("La ruta canonica es :" + f.getCanonicalPath());
        System.out.println("El tamaño en bytes es :" + f.length());

        // Ejercicio2

        System.out.println("===========");
        System.out.println("EJERCICIO 2");

        System.out.println("Permisos de lectura: " + f.canWrite());
        System.out.println("Permisos de escritura: " + f.canRead());
        System.out.println("Permisos de ejecución: " + f.canExecute());

        // Ejercicio3

        System.out.println("===========");
        System.out.println("EJERCICIO 3");

        File dir = new File("D:\\DANI\\Acceso a datos\\prueba");
        File subdir = new File("D:\\DANI\\Acceso a datos\\prueba\\subdirectorio");

        if (dir.mkdir()) {
            System.out.println("Dir creado");
            if (subdir.mkdir()) {
                System.out.println("Subdir creado");
            } else {
                System.out.println("Subdir ya existe");
            }
        } else {
            System.out.println("Dir ya existe");
        }

        // Ejercicio4

        System.out.println("===========");
        System.out.println("EJERCICIO 4");

        Scanner teclado = new Scanner(System.in);
        String respuesta;

        File datos = new File("D:\\DANI\\Acceso a datos\\prueba\\datos.txt");

        if (datos.createNewFile()) {
            System.out.println("El fichero datos.txt creado correctamente.");
        } else {
            System.out.println("El fichero datos.txt ya existe.");
        }
        System.out.println("¿Quieres borrar el fichero datos.txt? (s/n)");
        respuesta = teclado.nextLine();

        if (respuesta.equals("s")) {
            datos.delete();
            System.out.println("El fichero datos.txt ha sido borrado");
        } else {
            System.out.println("El fichero datos.txt no se borró");
        }

        // Ejercicio5

        System.out.println("===========");
        System.out.println("EJERCICIO 5");

        String ruta = "D:\\DANI\\Acceso a datos";

        File carpeta = new File(ruta);

        String[] nombres = carpeta.list();
        File[] rutas = carpeta.listFiles();

        for (String nombre : nombres) {
            System.out.println("-" + nombre);
        }

        System.out.println("-----------");

        for (File ruta2 : rutas) {
            System.out.println("-" + ruta2.getAbsolutePath());
        }

        System.out.println("Solo archivos: ---------------");
        for (File ruta2 : rutas) {
            if (ruta2.isFile()) {
                System.out.println("-" + ruta2.getAbsolutePath());
            }
        }

        // Ejercicio6

        System.out.println("===========");
        System.out.println("EJERCICIO 6");

        System.out.println("Solo archivos txt: --------------");

        for (File ruta2 : rutas) {
            if (ruta2.isFile()) {
                if (ruta2.getAbsolutePath().endsWith(".txt")) {
                    System.out.println(ruta2.getAbsolutePath());
                }
            }
        }

        // Ejercicio7

        System.out.println("===========");
        System.out.println("EJERCICIO 7");

        File copia = new File("D:\\DANI\\Acceso a datos\\prueba\\copia.txt");

        if (datos.exists()) {
            datos.renameTo(copia);
            System.out.println("El nombre del archivo datos.txt se cambió a copia.txt");
        } else {
            System.out.println("El fichero datos.txt no existe o ya se ha cambiado el nombre anteriormente");
        }

        // Ejercicio8

        System.out.println("===========");
        System.out.println("EJERCICIO 8");

        Calendar c = Calendar.getInstance();

        c.setTimeInMillis(datos.lastModified());

        System.out.println(c.getTime());

        // Ejercicio9

        System.out.println("===========");
        System.out.println("EJERCICIO 9");

        recursivo(dir, 0);
    }

    public static void recursivo(File dir, int level) {
        File[] lista = dir.listFiles();
        for (File file : lista) {
            for (int i = 0; i < level; i++) {
                System.out.print("\t");
            }
            System.out.println(file.getName());
            if (file.isDirectory()) {
                recursivo(file, level + 1);
            }
        }
    }
}

