/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Jordan
 */
public class Rutina {

    private int id;
    private String nombre;
    private int duracion;
    private String nivelDificultad;
    private String descripcion;

    private static ArrayList<Rutina> listaRutinas = new ArrayList<>();

    private static int idAsignado = 0;

    public Rutina() {
        this.id = idAsignado;
        idAsignado++; // este sera el id para el proximo en instanciarse
    }

    public Rutina(String nombre, int duracion, String nivelDificultad, String descripcion) {

        this.nombre = nombre;
        this.duracion = duracion;
        this.nivelDificultad = nivelDificultad;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static ArrayList<Rutina> getListaRutinas() {
        return listaRutinas;
    }

    @Override
    public String toString() {
        return "Rutina{" + "id: " + id + ", nombre: " + nombre + ", duracion: " + duracion + "min, nivelDificultad: " + nivelDificultad + ", descripcion: " + descripcion + '}' + "\n";
    }

}