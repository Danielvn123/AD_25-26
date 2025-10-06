import java.io.File;
public class App {
    public static void main(String[] args) throws Exception {
        String ruta="D:\\DANI\\Acceso a datos\\EjerciciosFicheros";
        if(args.length>=1) ruta=args[0];

        File fich = new File(ruta);

        if(!fich.exists()){
            System.out.println("No existe el fichero o directorio ("+ruta+").");
        }
        else{
            if(fich.isFile()){
                System.out.println(ruta + "es un fichero");
            }
            else{
                System.out.println(ruta + "Es un directorio. Contenidos: ");
                File[] ficheros=fich.listFiles(); 
                for(File f: ficheros){
                    String textoDescr= f.isDirectory() ? "/":
                    f.isFile() ? "_":"?";
                    System.out.println("("+ textoDescr +" )" + f.getName());
                }
            }
            System.out.println("El nombrer es: " + fich.getName());
            System.out.println("La ruta absoluta es :" + fich.getAbsolutePath());
            System.out.println("La ruta canonica es :" + fich.getCanonicalPath());
            System.out.println("El tamaño en bytes es :" + fich.length());

        }

    //Ejercicio2 

    

    }
}
