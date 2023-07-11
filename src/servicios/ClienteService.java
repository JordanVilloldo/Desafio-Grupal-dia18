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
    
    Cliente c1 = new Cliente();
    
    
    public void registrarCliente(){
        
        System.out.println("Ingrese el id del cliente");
        c1.setId(leer.nextInt());
        
        System.out.println("Ingrese el nombre del cliente");
        c1.setNombre(leer.next());
        
        System.out.println("Ingrese la edad del cliente");
        c1.setEdad(leer.nextInt());
        
        System.out.println("Ingrese la altura del cliente");
        c1.setAltura(leer.nextInt());
        
        System.out.println("Ingrese el peso del cliente");
        c1.setPeso(leer.nextDouble());
        
        System.out.println("Ingrese el objetivo del cliente");
        c1.setObjetivo(leer.next());
        
        c1.getListaClientes().add(c1);
        
        System.out.println("Cliente registrado");
    }
    
    public ArrayList<Cliente> obtenerClientes(){
        
        
        return c1.getListaClientes();
    }
    
    public void actualizarCliente(int id, String nombre, int edad, int altura, double peso, String objetivo){
        c1.getListaClientes().get(id).setNombre(nombre);
        c1.getListaClientes().get(id).setEdad(edad);
        c1.getListaClientes().get(id).setAltura(altura);
        c1.getListaClientes().get(id).setPeso(peso);
        c1.getListaClientes().get(id).setObjetivo(objetivo);
        
        System.out.println("Cliente actualizado");
    }
    
    public void eliminarCliente(int id){
        c1.getListaClientes().remove(id);
        
        System.out.println("Cliente eliminado");
    }
    
    public void mostrarClientes(){
        for (int i = 0; i < c1.getListaClientes().size(); i++) {
            System.out.println(c1.getListaClientes().get(i));
            
        }
    }
}
