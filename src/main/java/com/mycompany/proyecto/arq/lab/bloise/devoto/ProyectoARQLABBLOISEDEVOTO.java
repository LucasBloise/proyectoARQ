package com.mycompany.proyecto.arq.lab.bloise.devoto;
import Models.Proceso;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProyectoARQLABBLOISEDEVOTO {

    public static void main(String[] args) {
        
        int opcion;
        int tiempoRutinaSistemaOperativo;
        int tiempoRutinaEntradaSalida;
        List<Proceso> falpopa = new ArrayList<Proceso>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las unidades de tiempo de rutina del sistema operativo");
        tiempoRutinaSistemaOperativo = sc.nextInt();
        System.out.println("Ingrese las unidades de tiempo de rutina de entrada y salida");
        tiempoRutinaEntradaSalida = sc.nextInt();
        
        do{
        
            System.out.flush();
            System.out.println("1) Carga de los procesos");
            System.out.println("2) Mostrar grafica SJF");
            System.out.println("3) Mostrar grafica SJF/D");
            System.out.println("4) Mostrar resultados");
            System.out.println("5) Salir");

            opcion=sc.nextInt();

            
            
            switch (opcion){
                case 1:
                    System.out.println("Carga de los procesos");
                    break;

                case 2:
                    System.out.println("Mostrar grafica SJF");
                    break;

                case 3:
                    System.out.println("Mostrar grafica SJF/D");
                    break;

                case 4:
                    System.out.println("Mostrar resultados");
                    break;

                case 5:
                    System.out.println("Salir");
                    break;
            }
        }while(opcion!=5);          
    }
        
        
}
