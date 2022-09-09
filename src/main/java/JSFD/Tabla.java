/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSFD;


    import java.util.*;
public class Tabla {
 
public static void init(){
    
Scanner sc=new Scanner(System.in);
System.out.println ("Ingrese la cantidad de procesos:");
int cantidadProcesos = sc.nextInt();
int procesoActual[] = new int[cantidadProcesos]; // it takes procesoActual of process
int llegada[] = new int[cantidadProcesos]; // llegada means arrival time
int duracion[] = new int[cantidadProcesos]; // duracion means burst time
int tiempoFinalizar[] = new int[cantidadProcesos]; // tiempoFinalizar means complete time
int turnoEnFila [] = new int[cantidadProcesos];// turnoEnFilaeans turn around time
int tiempoEspera[] = new int[cantidadProcesos];  // tiempoEspera means waiting time
int checkeoCompletado[] = new int[cantidadProcesos];  // checkeoCompletado means it is flag it checks process is completed or not
int auxRafaga[]= new int[cantidadProcesos];   // it is also stores brust time
    int i, tiempoSistema=0, total=0;
    float promedioTiempoEspera=0, promedioLlegada=0;
 
    for (i=0;i<cantidadProcesos;i++)
    {
     procesoActual[i]= i+1;
     System.out.println ("Ingrese el tiempo de llegada del proceso " +(i+1));
     llegada[i]= sc.nextInt();
     System.out.println("Ingrese la duracion del proceso " + (i+1));
     duracion[i]= sc.nextInt();
     auxRafaga[i]= duracion[i];
     checkeoCompletado[i]= 0;
    }
    
    while(true){
     int min=99,c=cantidadProcesos;
     if (total==cantidadProcesos)
     break;
    
     for(i=0;i<cantidadProcesos;i++)
     {
     if ((llegada[i]<=tiempoSistema) && (checkeoCompletado[i]==0) && (duracion[i]<min))
     {
     min=duracion[i];
     c=i;
     }
     }
    
     if (c==cantidadProcesos)
     tiempoSistema++;
     else
     {
     duracion[c]--;
     tiempoSistema++;
     if (duracion[c]==0)
     {
     tiempoFinalizar[c]= tiempoSistema;
     checkeoCompletado[c]=1;
     total++;
     }
     }
    }
    
    for(i=0;i<cantidadProcesos;i++)
    {
     turnoEnFila[i] = tiempoFinalizar[i] - llegada[i];
     tiempoEspera[i] = turnoEnFila[i] - auxRafaga[i];
     promedioTiempoEspera+= tiempoEspera[i];
     promedioLlegada+= turnoEnFila[i];
    }
    
    System.out.println("Proceso"+"\t"+"\t"+"Llegada"+"\t"+"\t"+"Duracion"+"\t"+"Completado"+"\t"+"Turno"+"\t"+"\t"+"EnEspera");
    for(i=0;i<cantidadProcesos;i++)
    {
     System.out.println(procesoActual[i] +"\t"+"\t"+ llegada[i]+"\t"+"\t"+ auxRafaga[i] +"\t"+"\t"+ tiempoFinalizar[i] +"\t"+"\t"+ turnoEnFila[i] +"\t"+"\t"+ tiempoEspera[i]);
    }
    
    System.out.println("\nEl tiempo en fila promedio "+ (float)(promedioLlegada/cantidadProcesos));
    System.out.println("\nEl tiempo promedio de espera es "+ (float)(promedioTiempoEspera/cantidadProcesos));
    sc.close();
}
}
