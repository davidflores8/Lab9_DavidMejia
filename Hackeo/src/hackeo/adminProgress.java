/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackeo;

import javax.swing.JProgressBar;

/**
 *
 * @author Nadina Mazzoni
 */
public class adminProgress extends Thread{
    JProgressBar barra;
    boolean vive;
    boolean avanzar;
    int dur;
    int cant_car;
    int resultado;

    public adminProgress(JProgressBar barra, int dur, int cant_car) {
        this.barra = barra;
        this.vive = true;
        this.avanzar = true;
        this.dur=dur;
        this.cant_car=cant_car;
        this.resultado=dur*cant_car;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }
    
    public void run()
    {
        while(vive)
        {
            if(avanzar)
            {
                barra.setValue(barra.getValue()+dur/2);
            }
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                ex.printStackTrace();
            }
        }
    }
    
    
    
    
    
}
