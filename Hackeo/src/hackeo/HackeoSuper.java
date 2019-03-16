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
public class HackeoSuper extends Hacks{
    
   int fallidos;

    public HackeoSuper(String codigo, int nivel) {
        super(codigo, nivel);
    }

    public int getFallidos() {
        return fallidos;
    }

    public void setFallidos(int fallidos) {
        this.fallidos = fallidos;
    }
    
    public void Aumentar()
     {
         this.fallidos=fallidos+1;
     }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    
    
    

    @Override
    public String toString() {
        return super.toString();
    }


    
}
