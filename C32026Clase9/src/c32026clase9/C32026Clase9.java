/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c32026clase9;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author viti
 */
public class C32026Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UtilVectorJuego nuevo = new UtilVectorJuego();
        nuevo.imprimirVectorJuego();
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.YEAR, -100);
        
        Date resultadoDate = calendar.getTime();
        
        Compania nintendo = new Compania(1, "Nintendo Company", resultadoDate, "Japon");
        Compania sony = new Compania(1, "Sony", resultadoDate, "Japon");
        nuevo.llenaVectorJuego(nintendo);
        nuevo.imprimirVectorJuego();
        
        UtilVectorJuego juegoSony = new UtilVectorJuego();
        juegoSony.imprimirVectorJuego();
        juegoSony.llenaVectorJuego(sony);
        juegoSony.imprimirVectorJuego();
        
        juegoSony.verificaPremio("SONY");
        nuevo.verificaPremio("Nintendo Company");
        
        
                
    }
    
}
