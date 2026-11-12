/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c32026clase9;

import java.util.Date;

/**
 *
 * @author viti
 */
public class Compania {
    private int id;
    private String name;
    private Date fechaCreacion;
    private String region;

    public Compania() {
    }

    public Compania(int id, String name, Date fechaCreacion, String region) {
        this.id = id;
        this.name = name;
        this.fechaCreacion = fechaCreacion;
        this.region = region;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Compania{" + "id=" + id + ", name=" + name + ", fechaCreacion=" + fechaCreacion + ", region=" + region + '}';
    }
    
}
