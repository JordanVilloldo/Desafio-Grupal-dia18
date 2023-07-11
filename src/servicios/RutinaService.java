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

    Rutina r1 = new Rutina();

    public void crearRutina() {

        System.out.println("Ingrese el id de la rutina");
        r1.setId(leer.nextInt());

        System.out.println("Ingrese el nombre de la rutina");
        r1.setNombre(leer.next());

        System.out.println("Ingrese la duración");
        r1.setDuracion(leer.nextInt());

        System.out.println("Ingrese el nivel de dificultad");
        r1.setNivelDificultad(leer.next());

        System.out.println("Ingrese la descripción");
        r1.setDescripcion(leer.next());

        r1.getListaRutinas().add(r1);

        System.out.println("Rutina agregada");
    }

    public ArrayList<Rutina> obtenerRutinas() {

        return r1.getListaRutinas();
    }

    public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {

        r1.getListaRutinas().get(id).setNombre(nombre);
        r1.getListaRutinas().get(id).setDuracion(duracion);
        r1.getListaRutinas().get(id).setNivelDificultad(nivelDificultad);
        r1.getListaRutinas().get(id).setDescripcion(descripcion);

        System.out.println("Rutina actualizada");
    }

    public void eliminarRutina(int id) {
        r1.getListaRutinas().remove(id);

        System.out.println("Rutina eliminada");
    }

}
