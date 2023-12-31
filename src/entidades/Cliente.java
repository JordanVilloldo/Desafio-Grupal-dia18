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
public class Cliente {

    private int id;
    private String nombre;
    private int edad;
    private int altura;
    private double peso;
    private String objetivo;

    private static ArrayList<Cliente> listaClientes = new ArrayList<>();

    private static int idAsignado = 0;

    public Cliente() {
        this.id = idAsignado;
        idAsignado++; // este sera el id para el proximo en instanciarse
    }

    public Cliente(String nombre, int edad, int altura, double peso, String objetivo) {

        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.objetivo = objetivo;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public static ArrayList<Cliente> getListaClientes() {
        return listaClientes; 
    }

    @Override
    public String toString() {
        return "Cliente{" + "id: " + id + ", nombre: " + nombre + ", edad: " + edad + " años, altura: " + altura + "cm, peso: " + peso + "kg, objetivo: " + objetivo + '}' + "\n";
    }

}