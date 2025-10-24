import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion;

        do {
            agenda.dameOpcion();
            System.out.println("Elige opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    agenda.crear();
                    break;
                case 2:
                    agenda.añadirContacto(sc);
                    break;
                case 3:
                    System.out.println("Introduce el nombre del contacto a buscar");
                    String nombreBuscar = sc.nextLine();
                    agenda.mostrarContacto(nombreBuscar);
                    break;
                case 4:
                    agenda.modificarContacto();
                    break;
                case 5:
                    agenda.borrarContacto();
                    break;
                case 6:
                    agenda.restaurarContacto(sc);
                    break;
                case 7:
                    agenda.mostrar();
                    break;
                case 8:
                    agenda.vaciar();
                    System.out.println("Agenda VACIA");
                    break;
                case 9:
                    System.out.println("Elige opción del submenú: ");
                    int subOpcion = sc.nextInt();
                    sc.nextLine();

                    switch (subOpcion) {
                        case 1:
                            agenda.mostrarInformacion();
                            break;
                        case 2:
                            agenda.copiaDeSeguridad();
                            break;
                        // case 3:
                        // agenda.restaurarCopiaDeSeguridad();
                        // System.out.println("Agenda VACIA");
                        // break;
                         case 4:
                            System.out.println("Submenú cerrado");
                            break;
                        default:
                            System.out.println("Opción del submenú errónea");
                            break;
                    }
                    break;

                case 10:
                    System.out.println("FINAL");
                    break;

                default:
                    System.out.println("OPCIÓN Erronea");
                    break;
            }
        } while (opcion != 15);
    }
}
