import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Vector;

public class Datos {

    FileReader leer;
    BufferedReader buffer;

    public void leer(File Datos) throws IOException{

        String letra = "";
        String linea;

        int cont = 0;

        Datos = new File("datos.txt");
        leer = new FileReader(Datos);
        buffer = new BufferedReader(leer);

        while (letra != null) {

            cont =+ cont;
            letra = buffer.readLine();
            linea = letra;

            Vector<Integer> operando = new Vector();
            int total = operando.Evaluate(linea);
            System.out.println("El total de la operacion " + cont + " es: " + total);
            
        }
    }
    
}
