/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto8 {

    /**
     * @param args the command line arguments
     * se pide el largo y el ancho de un terreno y se informa la superficie del
     * mismo
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int largo;
        int ancho;
        int superficie;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese el largo del terreno: ");
        largo = miScanner.nextInt();
        
        System.out.println("Ingrese el ancho del terreno: ");
        ancho = miScanner.nextInt();
        
        superficie = largo *  ancho;
        
        System.out.println("La superficie es: "+superficie);
        
    }
    
}
