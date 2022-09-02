/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gato;

import javax.swing.JOptionPane;

/**
 *
 * @author Sistemas
 */
public class Gato {

   public String color;
   public String tamaño;
   public Float peso;
   public String nombre;
   public String raza;

   public Gato (String gris) {
       
   }
   
    public Gato(String color, String tamaño, Float peso, String nombre, String raza) {
        
        this.color = color;
        this.tamaño = tamaño;
        this.peso = peso;
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
        
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void Jugar () {
        JOptionPane.showConfirmDialog(null,"estoy jugando");
        System.out.println("estoy jugando");
        
    }
   public String dormir (){
       return "estoy mimido";
   }
   /**
    *@para args the command line argumnets
    */
   
   public static void main (String [] args) {
       // TODO code aplication logic here
       Gato = new Gato("gris");
               
   }
   
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Gato("gris", 45.6f, 20f "Misifus", "Angora", "Felino" ,false).jugar();
       Out.println(new Gato("Felino",false).dormir());
    
    

