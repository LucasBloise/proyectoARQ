/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author lucasbloise
 */

public class Proceso {
    
  
    
     int tiempoEjecuccion;
     int tiempoLlegada;
    

    public int getTiempoEjecuccion() {
        return tiempoEjecuccion;
    }

    public void setTiempoEjecuccion(int tiempoEjecuccion) {
        this.tiempoEjecuccion = tiempoEjecuccion;
    }
    
    public int getTiempoLlegada(){
        return tiempoLlegada;
    }
    
    public void setTiempoLlegada(int tiempoLlegada){
        this.tiempoLlegada = tiempoLlegada;
    }

    public Proceso(int tiempoEjecuccion, int tiempoLlegada) {
        this.tiempoEjecuccion = tiempoEjecuccion;
        this.tiempoLlegada = tiempoLlegada;
    }
    
}
