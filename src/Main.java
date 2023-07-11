
import entidades.Cliente;
import servicios.ClienteService;
import servicios.RutinaService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jordan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ClienteService cs = new ClienteService();
        RutinaService rs = new RutinaService();

        // Registros clientes
        for (int i = 0; i < 5; i++) {
            cs.registrarCliente();
        }

        // crear rutinas
        for (int i = 0; i < 5; i++) {
            rs.crearRutina();
        }
        

        // mostrar clientes y rutinas
        System.out.println(cs.obtenerClientes());
        //cs.mostrarClientes();
        System.out.println(rs.obtenerRutinas());

        // actualizar clientes
        cs.actualizarCliente(0, "cindy", 26, 155, 65, "nuevo");
        cs.actualizarCliente(3, "anonymus", 999, 99, 99, "");

        // actualizar rutinas
        rs.actualizarRutina(0, "recreo", 0, "facil", "solo comer");
        rs.actualizarRutina(2, "spinning", 30, "Medio", "");

        // mostrar clientes y rutinas
        System.out.println("Actualizados:");
        System.out.println(cs.obtenerClientes());
        System.out.println(rs.obtenerRutinas());

        // eliminar clientes
        cs.eliminarCliente(1);

        // eliminar rutinas
        rs.eliminarRutina(0);

        // mostrar clientes y rutinas
        System.out.println("Eliminados:");
        System.out.println(cs.obtenerClientes());
        System.out.println(rs.obtenerRutinas());

    }

}
