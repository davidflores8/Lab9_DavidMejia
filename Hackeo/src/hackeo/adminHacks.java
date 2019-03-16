/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackeo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nadina Mazzoni
 */
public class adminHacks {
    ArrayList <Hacks>hackeos=new ArrayList();
    File archivo=null;

    public adminHacks(String path) {
        archivo=new File (path);
    }

    public ArrayList<Hacks> getHackeos() {
        return hackeos;
    }

    public void setHackeos(ArrayList<Hacks> hackeos) {
        this.hackeos = hackeos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
   public void cargarArchivo() throws FileNotFoundException
    {
        Scanner sc=null;
        hackeos=new ArrayList();
        if (archivo.exists())
        {
            try
            {
                sc=new Scanner (archivo);
                sc.useDelimiter(";");
                while(sc.hasNext())
                {
                    hackeos.add(new Hacks(sc.next(),sc.nextInt()));
                }
            }
            catch(Exception e)
            {
                sc.close();
            }
        }
    }
    
    public void escribirArchivo() throws IOException
    {
        FileWriter fw=null; 
        BufferedWriter bw=null;
        try
        {
            fw=new FileWriter(archivo, false);
            bw =new BufferedWriter(fw);
            for (Hacks t:hackeos)
            {
                bw.write(t.getCodigo()+";");
                bw.write(t.getNivel()+";");
            }
            bw.flush();
        }
        catch(Exception e)
        {
            bw.close();
            fw.close();
        }
    }
    
    
    
}
