/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto20if;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class Proyecto20if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double importe;
        String mes;
        
        Scanner misc = new Scanner(System.in);
        
        System.out.println("Ingrese el importe del pasaje");
        importe = misc.nextDouble();
        
        System.out.println("Ingrese el mes del viaje: ");
        mes = misc.next();
        
        if(mes.equals("enero"))
        {
            importe = importe * 0.90;
            System.out.println("Precio final con descuento: "+importe);
        }
        else
        {
            System.out.println("Precio final: "+importe);
        }
        
    }
    
}
