import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Menu {
    public static void main(String[] args) throws IOException {

        File Doc;
        Doc = new File("datos.txt");
        Datos datos = new Datos();

        System.out.println("-- Calculadora PosFix --");
        

        if (!Doc.exists()) {
            
            System.out.println("No ha proporcionado ningun archivo, por favor proporcione uno");
            
        } else {

            datos.leer(Doc);
            
        }
        
    }
}
