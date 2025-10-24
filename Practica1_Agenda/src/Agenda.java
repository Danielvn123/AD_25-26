import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.io.PrintWriter;


public class Agenda {

    Scanner sc = new Scanner(System.in);

    private ArrayList<Contacto> Agenda;

    private final String archivoAgenda = "archivoAgenda";

    public Agenda() {
        Agenda = new ArrayList<Contacto>();
    }

    // Crear la agenda con o sin contactos
    public void crear() {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Quieres crear una agenda con contactos (s/n)?");
        String respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("n")) {
            Agenda.clear();
            guardarAgendaEnArchivo();
            System.out.println("Agenda creada sin contactos");
        } else if (respuesta.equalsIgnoreCase("s")) {
            Agenda.clear();
            Agenda.add(new Contacto("Daniel", 645231564, "danielv@gmail.com"));
            Agenda.add(new Contacto("Carmen", 650345621, "carmenc@gmail.com"));
            Agenda.add(new Contacto("Elena", 665421598, "elenag@gmail.com"));
            Agenda.add(new Contacto("Alejandro", 632514687, "alejandrot@gmail.com"));
            Agenda.add(new Contacto("Javier", 615224966, "javip@gmail.com"));
            Agenda.add(new Contacto("Ismael", 624531245, "ismaell@gmail.com"));
            guardarAgendaEnArchivo();
            System.out.println("Agenda creada con contactos");
        } else {
            System.out.println("Respuesta no válida");
            crear();
        }
    }

    //
    private Contacto dameContacto(String nombre) {
        for (Contacto c : Agenda) {
            if (c.getNombre() != null && c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    // Vaciamos la agenda
    public void vaciar() {
        Agenda.clear();
        guardarAgendaEnArchivo();

    }

    // Método en el que añadimos un contacto a la agenda
    public void añadirContacto(Scanner sc) {
        System.out.println("Introduce el nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Introduce telefono: ");
        int telefono = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce el email: ");
        String email = sc.nextLine();

        for (Contacto c : Agenda) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El contacto con nombre " + nombre + "ya existe en la agenda");
                return;
            }
        }
        Agenda.add(new Contacto(nombre, telefono, email));
        System.out.println("Contacto añadido correctamente");
        guardarAgendaEnArchivo();
    }

    // Mostramos el contacto que elegimos nosotros
    public void mostrarContacto(String nombre) {
        Contacto contacto = dameContacto(nombre);

        if (contacto == null || contacto.isBorrado()) {
            System.out.println("Contacto no ENCONTRADO " + nombre);
        } else {
            contacto.mostrarAgenda();
        }
    }

    // Mostramos la agenda entera de contactos
    public void mostrar() {
        if (Agenda.isEmpty())
            System.out.println("Agenda VACIA");
        else {
            int contador = 0;
            for (Contacto c : Agenda) {
                if (!c.isBorrado()) { // Selecciona solo los contactos activos
                    c.mostrarAgenda();
                    contador++;
                }
            }
            System.out.println("La agenda contiene " + contador + " contactos");
        }
    }

    // Método para modificar un contacto ya existente
    public void modificarContacto() {
        System.out.println("Introduce el nombre del contacto que quieres modificar: ");
        String nombre = sc.nextLine();

        boolean encontrado = false;

        for (Contacto c : Agenda) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;

                System.out.println("Introduce el nuevo nombre: ");
                String nuevoNombre = sc.nextLine();
                c.setNombre(nuevoNombre);

                System.out.println("Introduce el nuevo teléfono: ");
                int nuevoTelefono = sc.nextInt();
                sc.nextLine();
                c.setTelefono(nuevoTelefono);

                System.out.println("Introduce el nuevo email: ");
                String nuevoEmail = sc.nextLine();
                c.setCorreo(nuevoEmail);

                System.out.println("Contacto modificado correctamente.");
                guardarAgendaEnArchivo();
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún contacto con el nombre " + nombre + ".");
        }
    }

    // Método que borra un contacto ya existente en la agenda
    public void borrarContacto() {
        System.out.println("Introduce el nombre del contacto que quieres borrar: ");
        String nombre = sc.nextLine();

        boolean encontrado = false;

        for (Contacto c : Agenda) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;

                if (!c.isBorrado()) {
                    c.setBorrado(true);
                    System.out.println("Contacto " + nombre + " borrado");
                } else {
                    System.out.println("El contacto " + nombre + " ya está borrado");
                }
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encuentra ningún contacto con ese nombre " + nombre);
        }
    }

    // Método creado para guardar contactos de la agenda en un archivo
    public void guardarAgendaEnArchivo() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(archivoAgenda))) {
            for (Contacto c : Agenda) {
                pw.println(c.getNombre() + "," + c.getTelefono() + "," + c.getCorreo() + "," + c.isBorrado());
            }
            System.out.println("Agenda guardada correctamente en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al guardar la agenda: " + e.getMessage());
        }
    }

    // Método para recuperar contactos borrados
    public void restaurarContacto(Scanner sc) {
        System.out.println("Introduce el nombre del contacto que quieres recuperar: ");
        String nombre = sc.nextLine();

        boolean encontrado = false;

        for (Contacto c : Agenda) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                if (c.isBorrado()) {
                    c.setBorrado(false);
                    System.out.println("Contacto '" + nombre + "' recuperado correctamente.");
                } else {
                    System.out.println("El contacto '" + nombre + "' ya está activo.");
                }
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún contacto con el nombre '" + nombre + "'.");
        }
    }

    public static void Menu() {

        System.out.println("    MENU    ");
        System.out.println("============");
        System.out.println("1. Crear agenda");
        System.out.println("2. Añadir contacto");
        System.out.println("3. Consultar contacto");
        System.out.println("4. Modificar contacto");
        System.out.println("5. Borrar contacto");
        System.out.println("6. Restaurar contacto");
        System.out.println("7. Ver contactos");
        System.out.println("8. Vaciar agenda");
        System.out.println("9. Ver más opciones");
        System.out.println("10. Salir");
    }

    // Método en el cual se muestran los datos del archivo
    public void mostrarInformacion() {
        try {
            File archivo = new File(archivoAgenda);

            if (!archivo.exists()) {
                System.out.println("El archivo de la agenda no existe.");
                return;
            }

            System.out.println("Información del archivo:");
            System.out.println("------------------------------");
            System.out.println("Ubicación: " + archivo.getAbsolutePath());
            System.out.println("Tamaño: " + archivo.length() + " bytes");

            System.out.println("Permisos: ");
            System.out.println("  Lectura: " + archivo.canRead());
            System.out.println("  Escritura: " + archivo.canWrite());
            System.out.println("  Ejecución: " + archivo.canExecute());

            String ultimaMod = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                    .format(new java.util.Date(archivo.lastModified()));
            System.out.println("Última modificación: " + ultimaMod);

        } catch (Exception e) {
            System.out.println("Error al mostrar la información del archivo: " + e.getMessage());
        }
    }

    // Método para la copia de seguridad
    public void copiaDeSeguridad() {
    File archivoOriginal = new File(archivoAgenda);

    if (!archivoOriginal.exists()) {
        System.out.println("No se puede hacer la copia de seguridad: el archivo original no existe.");
        return;
    }

    // Crear nombre único con fecha y hora
    String fechaHora = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
    String nombreCopia = "archivoAgenda_backup_" + fechaHora + ".txt";
    File copiaArchivo = new File(archivoOriginal.getParent(), nombreCopia);

    try (BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
         BufferedWriter bw = new BufferedWriter(new FileWriter(copiaArchivo))) {

        String linea;
        while ((linea = br.readLine()) != null) {
            bw.write(linea);
            bw.newLine(); 
        }

        System.out.println("Copia de seguridad creada correctamente: " + copiaArchivo.getAbsolutePath());

    } catch (IOException e) {
        System.out.println("Error al crear la copia de seguridad: " + e.getMessage());
    }
}


    public static void NuevoMenu() {

        System.out.println("    NUEVO MENU    ");
        System.out.println("==================");
        System.out.println("1. Mostrar información del archivo");
        System.out.println("2. Hacer copia de seguridad");
        System.out.println("3. Restaurar copia de seguridad");
        System.out.println("4. Volver");
    }

    public void dameOpcion() {

        Menu();
    }
}
