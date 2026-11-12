/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c32026clase9;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author viti
 */
public class Juego {
    private int id;
    private String nombre;
    private Date fechaCreacion;
    private Compania compania;
    private String plataforma;

    public Juego() {
        Random aleatorio= new Random();
        this.id=aleatorio.nextInt(0, 1000);
        this.fechaCreacion=new Date();
        
    }

     
    public Juego( String nombre, Date fechaCreacion, Compania compania, String plataforma) {
        Random aleatorio= new Random();
        this.id=aleatorio.nextInt(0, 1000);
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.compania = compania;
        this.plataforma = plataforma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Compania getCompania() {
        return compania;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Juego{" + "id=" + id + ", nombre=" + nombre + ", fechaCreacion=" + fechaCreacion + ", compania=" + compania + ", plataforma=" + plataforma + '}';
    }
    
    
    
            
     
    
    
}
