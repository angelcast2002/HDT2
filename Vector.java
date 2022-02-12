import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Vector<T> implements IStack<T>, IPosfixCalc {

    Stack<T> pila = new Stack();

    @Override
    public int count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public T peek() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T pull() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void push(T value) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int Evaluate(String expresion) {
        // TODO Auto-generated method stub

        String cadena = expresion;
        Vector<Integer> operador = new Vector();
        String [] partes = dato.split("|");
        List<String> Partes = Arrays.asList(partes);

        for (int i = 0; i < Partes.size(); i++) {

            if (Character.isDigit(cadena.charAt(i))){

                int num = Integer.parseInt(Partes.get(i));
                operador.push(num);

            }
            
        }
        return 0;
    }

    
}
