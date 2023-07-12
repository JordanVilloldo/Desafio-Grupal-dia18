/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Rutina;
import java.util.ArrayList;

/**
 *
 * @author Jordan
 */
public class RutinaService {

    java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");

    public void crearRutina() {
        Rutina r1 = new Rutina();

        System.out.println("Ingrese el nombre de la rutina");
        r1.setNombre(leer.next());

        System.out.println("Ingrese la duración");
        r1.setDuracion(leer.nextInt());

        System.out.println("Ingrese el nivel de dificultad");
        r1.setNivelDificultad(leer.next());

        System.out.println("Ingrese la descripción");
        r1.setDescripcion(leer.next());

        Rutina.getListaRutinas().add(r1);

        System.out.println("Rutina agregada");
    }

    public ArrayList<Rutina> obtenerRutinas() {

        return Rutina.getListaRutinas();
    }

    public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {

        Rutina.getListaRutinas().get(id).setNombre(nombre);
        Rutina.getListaRutinas().get(id).setDuracion(duracion);
        Rutina.getListaRutinas().get(id).setNivelDificultad(nivelDificultad);
        Rutina.getListaRutinas().get(id).setDescripcion(descripcion);

        System.out.println("Rutina actualizada");
    }

    public void eliminarRutina(int id) {
        Rutina.getListaRutinas().remove(id);

        System.out.println("Rutina eliminada");
    }

    public void crearRutinaPorParametro(String nombre, int duracion, String nivelDificultad, String descripcion) {
        Rutina r1 = new Rutina();

        r1.setNombre(nombre);
        r1.setDuracion(duracion);
        r1.setNivelDificultad(nivelDificultad);
        r1.setDescripcion(descripcion);

        Rutina.getListaRutinas().add(r1);
    }

}
