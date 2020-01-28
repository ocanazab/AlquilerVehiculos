/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nacho
 */
public class Validaciones {
     
    //Constructor
    public void Validaciones(){
        
    }
    
    public boolean esNumero(String texto){
        try{            
            Float.parseFloat(texto);
            return true;
        }catch(NumberFormatException ex){
            return false;
        }
    }
    
    public boolean compruebaDNI(String dni) {
        
        int numdni=0;
        int resto=0;
        String letra="";
        String tablaletras[]={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        Boolean resultado=false;
        
        try{
            numdni=Integer.parseInt(dni.substring(0, 8));
            resto=numdni%23;
            letra=tablaletras[resto];
            String letradni=dni.substring(8);
            
            if (letra.equals(dni.substring(8))){
            resultado=true;
            }            
        }finally{
            return resultado;        
        }
    }
}
