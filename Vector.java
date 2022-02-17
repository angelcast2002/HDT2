/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Angel
 */
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author caste
 * @param <T>
 */
public class Vector<T> implements IStack<T>, IPosfixCalc {

    Stack<T> pila = new Stack();

    /**
     *
     * @return el valor del tamaño de la pila
     */
    @Override
    public int count() {
        // TODO Auto-generated method stub
        return pila.size();
    }

    /**
     *
     * @return true si la pila esta vacia
     */
    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return pila.isEmpty();
    }

    /**
     *
     * @return regresa el valor del dato que se encuentre mas arriba
     */
    @Override
    public T peek() {
        // TODO Auto-generated method stub
        return pila.peek();
    }

    /**
     *
     * @return regresa el valor del dato mas arriba de la pila
     */
    @Override
    public T pull() {
        // TODO Auto-generated method stub
        return pila.pop();
    }

    /**
     *
     * @param value resultado de la operacion
     */
    @Override
    public void push(T value) {
        // TODO Auto-generated method stub
        pila.push(value);
    }

    @Override
    public int Evaluate(String expresion) {
        // TODO Auto-generated method stub

        String cadena = expresion;
        //creamos un String con los datos que se leyeron
        Vector<Integer> operacion = new Vector<>();
        String [] partes = cadena.split("|");
        //se separa la cadena por carácteres
        List<String> Partes = Arrays.asList(partes);
        int num1 = 0, num2 = 0;

        for (int i = 0; i < Partes.size(); i++) {
            try {
                Character.isDigit(cadena.charAt(i));
                //verificamos si el caracter es un digito
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("No puede ingresar lineas en blanco, revise su entrada e intente de nuevo");
                System.exit(1);
            }
            if (Character.isDigit(cadena.charAt(i))){

                int num = Integer.parseInt(Partes.get(i));
                operacion.push(num);

            }
            //Buscamos coincidencia en los operandos para hacer las operaciones necesarias
            else if (Partes.get(i).equals("+")) {
                try {

                    num1 = operacion.pull();
                    num2 = operacion.pull();

                } catch (Exception FueraDeRango) {
                    //TODO: handle exception
                    System.out.println("No puede ingresar lineas en blanco");
                    System.exit(1);
                }
                
                int resultado = num1 + num2;
                operacion.push(resultado);
                if(pila.size()==1){
                    break;
                } 
            }
            else if (Partes.get(i).equals("-")) {
                try {

                    num1 = operacion.pull();
                    num2 = operacion.pull();

                } catch (Exception FueraDeRango) {
                    //TODO: handle exception
                    System.out.println("No puede ingresar lineas en blanco");
                    System.exit(1);
                }

                int resultado = num1 - num2;
                operacion.push(resultado); 
                if(pila.size()==1){
                    break;
                }
            }
            else if (Partes.get(i).equals("*")) {
                try {

                    num1 = operacion.pull();
                    num2 = operacion.pull();

                } catch (Exception FueraDeRango) {
                    //TODO: handle exception
                    System.out.println("No puede ingresar lineas en blanco");
                    System.exit(1);
                }
                int resultado = num1 * num2;
                operacion.push(resultado); 
                if(pila.size()==1){
                    break;
                }
            }
            else if (Partes.get(i).equals("/")) {
                try {

                    num1 = operacion.pull();
                    num2 = operacion.pull();

                } catch (Exception FueraDeRango) {
                    //TODO: handle exception
                    System.out.println("No puede ingresar lineas en blanco");
                    System.exit(1);
                }
                try {
                    int resultado = num2 / num1;
                    operacion.push(resultado); 
                } catch (Exception cero) {
                    //TODO: handle exception
                    System.out.println("No se puede dividir por cero, revise su entrada e intente de nuevo");
                    System.exit(1);
                }
                if(pila.size()==1){
                    break;
                }
                
            }
            else{
                System.out.println("Caracter invalido, no se puede realizar la operacion");
            }
        }
        return operacion.peek();
        //retornamos el valor del dato mas arriba de la pila
    }

    
}
