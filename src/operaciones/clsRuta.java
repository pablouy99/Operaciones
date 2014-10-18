/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;
import Persistencia.pRuta;
import java.util.ArrayList;

/**
 *
 * @author Pablo Mateus
 */
public class clsRuta {
    String numRuta;
    String recorrido;
    int frecuencia;
    int turno;
    
    pRuta ruta = new pRuta();

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getNumRuta() {
        return numRuta;
    }

    public void setNumRuta(String numRuta) {
        this.numRuta = numRuta;
    }

    public String getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(String recorrido) {
        this.recorrido = recorrido;
    }

    public pRuta getRuta() {
        return ruta;
    }

    public void setRuta(pRuta ruta) {
        this.ruta = ruta;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    
    
    public String buscarRecorrido(String barrio){
        String resultado = ruta.buscarRecorrido(barrio);
        return resultado;
    }
    
    public ArrayList<String> buscarRuta(int pRuta, int altaObaja){
        ArrayList<String> resultado = new ArrayList<String>();
        resultado = ruta.buscarRuta(pRuta, altaObaja);
       
        return resultado;
    }
    
    public int buscarTurno(String pRuta, int altaObaja){
        int resultado = ruta.buscarTurno(pRuta , altaObaja);
        return resultado;
    }
    
    public int buscarFrecuencia(String pRuta, int altaObaja){
        int resultado = ruta.buscarFrecuencia(pRuta, altaObaja);
        return resultado;
    }
    
}
