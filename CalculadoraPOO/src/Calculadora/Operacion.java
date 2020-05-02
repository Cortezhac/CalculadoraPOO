/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author Admin
 */
public class Operacion {
    //Atributos
    private double DatoUno;
    private double DatoDos;
    private char Operador;
    // Constructor vacio
    public Operacion(){
        
    }
    // Metodos getter y setter
    public double getDatoUno() {
        return DatoUno;
    }

    public void setDatoUno(double DatoUno) {
        this.DatoUno = DatoUno;
    }

    public double getDatoDos() {
        return DatoDos;
    }

    public void setDatoDos(double DatoDos) {
        this.DatoDos = DatoDos;
    }

    public char getOperador() {
        return Operador;
    }

    public void setOperador(char Operador) {
        this.Operador = Operador;
    }
    
}
