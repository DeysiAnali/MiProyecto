


import modelo.Persona;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Deysi
 */
public class MainApp {
     public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("María", 30);
        
        persona1.saludar();
        persona2.saludar();
    }
}
