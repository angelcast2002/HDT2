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

public class Vector<T> implements IStack<T>, IPosfixCalc {

    Stack<T> pila = new Stack();

    @Override
    public int count() {
        // TODO Auto-generated method stub
        return pila.size();
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return pila.isEmpty();
    }

    @Override
    public T peek() {
        // TODO Auto-generated method stub
        return pila.peek();
    }

    @Override
    public T pull() {
        // TODO Auto-generated method stub
        return pila.pop();
    }

    @Override
    public void push(T value) {
        // TODO Auto-generated method stub
        pila.push(value);
    }

    @Override
    public int Evaluate(String expresion) {
        // TODO Auto-generated method stub

        String cadena = expresion;
        Vector<Integer> operacion = new Vector<>();
        String [] partes = cadena.split("|");
        List<String> Partes = Arrays.asList(partes);
        int num1 = 0, num2 = 0;

        for (int i = 0; i < Partes.size(); i++) {
            try {
                Character.isDigit(cadena.charAt(i));
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("No puede ingresar lineas en blanco, revise su entrada e intente de nuevo");
                System.exit(1);
            }
            if (Character.isDigit(cadena.charAt(i))){

                int num = Integer.parseInt(Partes.get(i));
                operacion.push(num);

            }

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
    }

    
}
