/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import Persistencia.pFuncionario;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class clsFuncionario {
    private String nombre;
    private String apellido;
    private int categoria;
    private int nroFunc;
    private int libre;
    private int concesion;
    private int turno;
    private int chapa;
    
    
    pFuncionario funcionario = new pFuncionario();
    
       
    public int ultimoIndice(int concesion){
        int indice = funcionario.ultimoIndice(concesion);
        return indice;
    }
    
    public boolean ingresarFunc(String pNombre, String pApellido,
            int pCat, int pNumFunc, int pLibre, int pConcesion, int pChapa, int pTurno){
           boolean resp = false;
            this.nombre = pNombre;
            this.apellido = pApellido;
            this.categoria = pCat;
            this.nroFunc = pNumFunc;
            this.libre = pLibre;
            this.concesion = pConcesion;
            this.chapa = pChapa;
            this.turno = pTurno;
            
            
           resp = funcionario.ingresar(this);
            
           return resp;
       }
    
    public boolean modiFuncionario(String pNombre, String pApellido,
            int pCat, int pNumFunc, int pLibre, int pChapa, int pTurno){
           boolean resp = false;
            this.nombre = pNombre;
            this.apellido = pApellido;
            this.categoria = pCat;
            this.nroFunc = pNumFunc;
            this.libre = pLibre;
            this.chapa = pChapa;
            this.turno = pTurno;
            
            
           resp = funcionario.modificar(this);
            
           return resp;
       }
    
    public String getApellido() {
        return apellido;
    }

    public int getCategoria() {
        return categoria;
    }
  
    public int getLibre() {
        return libre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNroFunc() {
        return nroFunc;
    }

    public int getChapa() {
        return chapa;
    }
    public int getTurno() {
        return turno;
    }
    public int getConcesion() {
        return concesion;
    }
    
      public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public void setLibre(int libre) {
        this.libre = libre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNroFunc(int nroFunc) {
        this.nroFunc = nroFunc;
    }

      public void setChapa(int chapa) {
        this.chapa = chapa;
    }
        public void setTurno(int turno) {
        this.turno = turno;
    }
         public void setConcesion(int concesion) {
        this.concesion = concesion;
    }
      
    public boolean bajaFunc(int nroFun){
               
        return funcionario.bajaFunc(nroFun);
    }
    
    public ArrayList buscarFuncionario(int nroFun){
               
        return funcionario.buscarFunc(nroFun);
    }
    public ArrayList buscarFuncionarioPorChapa(int nroFun){
        
         
        return funcionario.buscarFuncPorChapa(nroFun);
    }
    
}
