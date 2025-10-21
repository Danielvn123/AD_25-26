import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Agenda {

    Scanner sc = new Scanner(System.in);

    private ArrayList<Contacto> Agenda;

    public Agenda() {
        Agenda = new ArrayList<Contacto>();
    }

    //Crear la agenda con o sin contactos
    public void crear() {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Quieres crear una agenda con contactos (s/n)?");
        String respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            Agenda.clear();
            System.out.println("Agenda creada con contactos");
        } else if (respuesta.equalsIgnoreCase("n")) {
            Agenda.clear();
            Agenda.add(new Contacto("Daniel", 645231564, "danielv@gmail.com"));
            Agenda.add(new Contacto("Carmen", 650345621, "carmenc@gmail.com"));
            Agenda.add(new Contacto("Elena", 665421598, "elenag@gmail.com"));
            Agenda.add(new Contacto("Alejandro", 632514687, "alejandrot@gmail.com"));
            Agenda.add(new Contacto("Javier", 615224966, "javip@gmail.com"));
            Agenda.add(new Contacto("Ismael", 624531245, "ismaell@gmail.com"));
            System.out.println("Agenda creada sin contactos");
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

    //Vaciamos la agenda
    public void vaciar() {
        Agenda.clear();
    }


    public void añadirContacto(Contacto nuevo) {
        if (nuevo == null) {
            System.out.println("No se puede añadir un contacto nulo.");
            return;
        }

        Contacto existente = dameContacto(nuevo.getNombre());
        if (existente != null) {
            System.out.println("El contacto '" + nuevo.getNombre() + "' ya existe en la agenda.");
        } else {
            Agenda.add(nuevo);
            System.out.println("Contacto añadido correctamente: " + nuevo.getNombre());
        }
    }

    public void añadirContactoConsola(Scanner sc) {
        System.out.println("Introduce el nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Introduce telefono: ");
        int telefono = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce eel email: ");
        String email = sc.nextLine();

        Contacto nuevo = new Contacto(nombre, telefono, email);
        añadirContacto(nuevo);
    }

    //Mostramos el contacto que elegimos nosotros
    public void mostrarContacto(String nombre) {
        Contacto contacto = dameContacto(nombre);

        if (contacto == null)
            System.out.println("Contacto no ENCONTRADO" + nombre);
        else {
            contacto.mostrarAgenda();
        }
    }

    //Mostramos la agenda entera de contactos
    public void mostrar() {
        if (Agenda.isEmpty())
            System.out.println("Agenda VACIA");
        else {
            int contador = 0;
            for (Contacto c : Agenda) {
                c.mostrarAgenda();
                contador++;
                System.out.println("La agenda contiene " + contador + " contactos");
            }
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
