package com.example.manuel.mypitarra;

/**
 * Created by manuel on 10/14/16.
 */
public class Participante {
    protected String nombre;
    protected int turno;

    public Participante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
}
