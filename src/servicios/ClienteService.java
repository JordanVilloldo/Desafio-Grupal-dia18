/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Jordan
 */
public class ClienteService {

    java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");

    public void registrarCliente() {
        Cliente c1 = new Cliente();

        System.out.println("Ingrese el nombre del cliente");
        c1.setNombre(leer.next());

        System.out.println("Ingrese la edad del cliente");
        c1.setEdad(leer.nextInt());

        System.out.println("Ingrese la altura del cliente");;
        c1.setAltura(leer.nextInt());

        System.out.println("Ingrese el peso del cliente");
        c1.setPeso(leer.nextDouble());

        System.out.println("Ingrese el objetivo del cliente");
        c1.setObjetivo(leer.next());

        Cliente.getListaClientes().add(c1);

        System.out.println("Cliente registrado");
    }

    public ArrayList<Cliente> obtenerClientes() {

        return Cliente.getListaClientes();

    }

    public void actualizarCliente(int id, String nombre, int edad, int altura, double peso, String objetivo) {
        Cliente.getListaClientes().get(id).setNombre(nombre);
        Cliente.getListaClientes().get(id).setEdad(edad);
        Cliente.getListaClientes().get(id).setAltura(altura);
        Cliente.getListaClientes().get(id).setPeso(peso);
        Cliente.getListaClientes().get(id).setObjetivo(objetivo);

        System.out.println("Cliente actualizado");
    }

    public void eliminarCliente(int id) {
        Cliente.getListaClientes().remove(id);

        System.out.println("Cliente eliminado");
    }

    public void mostrarClientes() {
        for (int i = 0; i < Cliente.getListaClientes().size(); i++) {
            System.out.println(Cliente.getListaClientes().get(i));
        }
    }

    public void registrarClientePorParametros(String nombre, int edad, int altura, double peso, String objetivo) {
        Cliente c1 = new Cliente();

        c1.setNombre(nombre);
        c1.setEdad(edad);
        c1.setAltura(altura);
        c1.setPeso(peso);
        c1.setObjetivo(objetivo);

        Cliente.getListaClientes().add(c1);
    }
}