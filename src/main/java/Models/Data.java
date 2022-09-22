/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Scanner;

/**
 *
 * @author AgustinDevoto
 */
public class Data extends Proceso{
    Scanner teclado = new Scanner(System.in);
    public void cargarDatos() {
        System.out.println("|--------------------------------------------|");
        System.out.print("Ingrese el tiempo de ejecucion del proceso ");
        tiempoEjecucion=teclado.nextLine();
            
        
        System.out.println("|--------------------------------------------|");
    }
}
