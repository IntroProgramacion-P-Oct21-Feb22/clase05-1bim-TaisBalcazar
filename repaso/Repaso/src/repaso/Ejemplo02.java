/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author TaisBalcazar
 */
public class Ejemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombrePais;
        String capitalPais;
        double extension;
        
        System.out.println("Ingrese la población del país");
        extension = entrada.nextDouble();
        
        /* Despues de un dato numerico (entero o double), se tiene que hacer la 
        limpieza del baffer, agregando antes del dato cadena: entrada.nexLine();
        */
        
        entrada.nextLine();
        
        System.out.println("Ingrese nombre del país");
        nombrePais = entrada.nextLine();
                
        System.out.println("Ingrese capital del país");
        capitalPais = entrada.nextLine();
        
        System.out.printf("Datos de país\n\tNombre:%s\n\tCapital:%s"
                + "\n\tPoblación:%.2f\n", nombrePais, capitalPais, extension);
        
    }
    
}
