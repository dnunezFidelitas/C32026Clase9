/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c32026clase9;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class UtilVectorJuego {
    
    private Juego[] juegos;

    public UtilVectorJuego() {
        String cantidad="";
        int cantidadInt=0;
        cantidad= JOptionPane.showInputDialog("Digite la cantidad de juegos que vamos agregar");
        cantidadInt=Integer.parseInt(cantidad);
        juegos=new Juego[cantidadInt];
        inicializaVectorJuego();
    }
    
    /**
     * Este es un metodo que imprime todo el vector;
     */
    public void imprimirVectorJuego(){
        String resultado ="";
        for (int i = 0; i < this.juegos.length; i++) {
            resultado+=juegos[i].toString() +"\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    /**
     * Este metodo inicializa el vector con datos vacios
     */
    public void inicializaVectorJuego(){
        for (int i = 0; i < this.juegos.length; i++) {
            juegos[i]= new Juego();
        }
    }
    
    /**
     * Metodo llena la información del vector con respecto a los juegos
     * @param compania 
     */
    public void llenaVectorJuego(Compania compania){
        for (int i = 0; i < this.juegos.length; i++) {
            String nombreJuego = JOptionPane.showInputDialog("Digite el nombre del juego");
            String plataForma = JOptionPane.showInputDialog("Digite la plataforma");
            juegos[i]= new Juego(nombreJuego, new Date(), compania, plataForma);
        }
    
    }
    
    /**
     *  Este metodo verifica si alguno de los juegos pertenece a la una compañia
     * Da regalia 
     */
    public void verificaPremio(String codigo){
        for (int i = 0; i < this.juegos.length; i++) {
            if (juegos[i].getCompania().getName().compareTo(codigo)==0){
                JOptionPane.showMessageDialog(null, "*************Tiene regla de juego  ****************"
                        +"\n"
                        +this.juegos[i].getCompania().getName());
            }
        }
        
    
    }
    
    
    
}
