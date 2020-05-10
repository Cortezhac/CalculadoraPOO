/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;
import java.io.*;

/**
 *
 * @author Irvin Cortez
 */
public class Main {
    public static void main(String[] args)throws IOException{

        mostrarMenu();
    }
    
    public static void mostrarMenu()throws IOException{
        int opcion;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("*****************");
        System.out.println("Suma        1");
        System.out.println("Restar      2");
        System.out.println("Multiplicar 3");
        System.out.println("Dividir     4");
        System.out.println("*****************");
        
        
        switch(opcion = leer.read()){
            case 1 :
                Suma suma = new Suma();
                break;
            case 2 :
                Resta resta = new Resta();
                break;
            case 3 :
                Multiplicacion suma = new Multipliacion();
                break;
            case 4 :
                Division suma = new Division();
                break;
        }
    }
}
