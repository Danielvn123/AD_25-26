import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) throws Exception {
        Path path = Path.of("D:\\DANI\\Acceso a datos\\Ficheros\\archivo.txt");

       // BufferedReader bf = new BufferedReader(new InputStreamReader(new InputStream("archivo"));

        try(BufferedReader bufferedReader = Files.newBufferedReader(path)){
            String linea;
            while((linea = bufferedReader.readLine()) !=null){
                System.out.println(linea);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        }
