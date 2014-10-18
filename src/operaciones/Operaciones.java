/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import Interfase.Principal;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Operaciones {
    private clsFuncionario func = new clsFuncionario();
    private clsSeccion seccion;
    private clsUnidad unidad;
    private clsRuta ruta;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal principal = new Principal();
        principal.setVisible(true);
    }
    
    public int ultimoIndice(int concesion){
        int indice =0;
                 indice = func.ultimoIndice(concesion);
        return indice;
    }
    
    public boolean altaFuncionario(String pNombre, String pApellido,
            int pCat, int pNumFunc, int pLibre, int pConcesion,int pChapa, int pTurno){
        boolean resultado=false;
        
        resultado = func.ingresarFunc(pNombre, pApellido, pCat, pNumFunc, pLibre, pConcesion, pChapa, pTurno);
        
        return resultado;
    }
    
  
    public boolean bajaFuncionario(int pNumFunc){
        boolean resultado = false;
        
       resultado = func.bajaFunc(pNumFunc);
      
        return resultado;
    }
    
    public boolean modiFuncionario(String pNombre, String pApellido,
            int pCat, int pNumFunc, int pLibre, int pChapa, int pTurno){
        boolean resultado=false;
        
            resultado = func.modiFuncionario(pNombre, pApellido, pCat, pNumFunc, pLibre, pChapa, pTurno);
        
        return resultado;
    }
    
    public ArrayList buscarFuncionario(int funcio){
    ArrayList<String[]> result = new ArrayList<String[]>();
    result = func.buscarFuncionario(funcio);
    
    return result;
    }
    
    public ArrayList buscarFuncionarioPorChapa(int funcio){
    ArrayList result = new ArrayList();
    ArrayList variosFunc = new ArrayList();
    int i;
    result = func.buscarFuncionarioPorChapa(funcio);
    //if (result.size()>8){
            for (i=0; i < result.size(); i=i+8){           
               clsFuncionario funcionarios = new clsFuncionario();
               funcionarios.setNroFunc(Integer.parseInt(result.get(i).toString()));
               funcionarios.setNombre(result.get(i+1).toString());
               funcionarios.setApellido(result.get(i+2).toString());
               funcionarios.setCategoria(Integer.parseInt(result.get(i+3).toString()));
               funcionarios.setChapa(Integer.parseInt(result.get(i+5).toString()));
               funcionarios.setConcesion(Integer.parseInt(result.get(i+7).toString()));
               funcionarios.setLibre(Integer.parseInt(result.get(i+4).toString()));
               funcionarios.setTurno(Integer.parseInt(result.get(i+6).toString()));
               variosFunc.add(funcionarios);
               
            }
            return variosFunc;
    //}else{
      //  return result;
    //}
    
    
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
   
public int normalizaGetTurno(int turno){
      switch (turno){
                           case 1: turno = 0;
                               break;
                           case 3: turno = 1;
                               break;
                           case 5: turno = 2;
                               break;
                           default: turno = 0;
                               break;
                            }
    
    return turno;
}

public int normalizaSetTurno(int turno){
      switch (turno){
                           case 0: turno = 1;
                               break;
                           case 1: turno = 3;
                               break;
                           case 2: turno = 5;
                               break;
                           default: turno = 1;
                               break;
                            }
    
    return turno;
}

}