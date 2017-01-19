/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraysobxectos;

import javax.swing.JOptionPane;

/**
 *
 * @author agarridogarcia
 */
public class Equipo {
    
    Xogador[] xogadores=new Xogador[3];
    //Xogador[] xog = (new Xogador("aa",1),new Xogador("bb",2));
   
    
    public String pedirNome(){
        return JOptionPane.showInputDialog(" Nome : ");
        
        
    }
    public int pedirDorsal(){
        return Integer.parseInt(JOptionPane.showInputDialog("Dorsal: "));
        
    }
    public void cargarArray(){
        for(int i=0;i>xogadores.length;i++)
            xogadores[i]= new Xogador(pedirNome(),pedirDorsal());
    }
    public void visualizar(){
        //for each
        for(Xogador xog:xogadores)
            JOptionPane.showMessageDialog(null, xog);
        //tamén se pode facer
        for(int i=0;i<xogadores.length;i++)
            System.out.println(xogadores[i]);
    }
}
