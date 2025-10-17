import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EjercicioFicheros8 {

    public static void main(String[] args) throws Exception {

        ArrayList<Trabajador> lista = new ArrayList<>();

        Trabajador t1 = new Trabajador("Pepita", 3000.0, "Jefa", 20);
        Trabajador t2 = new Trabajador("Pedro", 2000.0, "Encargado", 30);
        Trabajador t3 = new Trabajador("Luisa", 1500.0, "Directora", 40);
        Trabajador t4 = new Trabajador("Maria", 1400.0, "Subdirectora", 50);
        Trabajador t5 = new Trabajador("Juan", 1000.0, "Trabajador", 70);

        lista.add(t1);
        lista.add(t2);
        lista.add(t3);
        lista.add(t4);
        lista.add(t5);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("trabajadores.dat"))) {
            out.writeObject(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("trabajadores.dat"))) {

            ArrayList<Trabajador> listaLeida = (ArrayList<Trabajador>) in.readObject();

            for (Trabajador t : listaLeida) {
                System.out.println(t.toString());
            }
        }
    }
}