/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackeo;

/**
 *
 * @author Nadina Mazzoni
 */
public class HackeoRegular extends Hacks{
    int exitosos;
    
    public HackeoRegular(String codigo, int nivel) {
        super(codigo, nivel);
    }

    public int getExitosos() {
        return exitosos;
    }

    public void setExitosos(int exitosos) {
        this.exitosos = exitosos;
    }
     public void Aumentar()
     {
         this.exitosos=exitosos+1;
     }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
    
    
    
}
