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
    public class Hacks {
    String codigo;
    int  nivel;

    public Hacks(String codigo, int nivel) {
        this.codigo = codigo;
        this.nivel = nivel;
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
        return codigo;
    }
    
    
    
}
