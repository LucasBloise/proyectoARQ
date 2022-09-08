package com.mycompany.proyecto.arq.lab.bloise.devoto;
import java.util.Scanner;

public class ProyectoARQLABBLOISEDEVOTO {

    public static void main(String[] args) {
        
        int opcion;
        int tiempoRutinaSistemaOperativo;
        int tiempoRutinaEntradaSalida;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las unidades de tiempo de rutina del sistema operativo");
        tiempoRutinaSistemaOperativo = sc.nextInt();
        System.out.println("Ingrese las unidades de tiempo de rutina de entrada y salida");
        tiempoRutinaEntradaSalida = sc.nextInt();
        
        do{
        
            System.out.flush();
            System.out.println("1) option 1");
            System.out.println("2) option 2");
            System.out.println("3) option 3");
            System.out.println("4) option 4");
            System.out.println("5) option 5");

            opcion=sc.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("Carga de los procesos");
                    break;

                case 2:
                    System.out.println("Mostrar grafica JSF");
                    break;

                case 3:
                    System.out.println("Mostrar grafica JSF/D");
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
