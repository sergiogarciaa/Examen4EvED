package servicios;
import java.io.*;
import java.util.List;
import java.util.Scanner;

import entidades.Propietarios;
import entidades.Usuarios;
import entidades.Veterinarios;

public class ImplementacionUsuario implements InterfazUsuario {
    public List<Usuarios> usuarios(List<Usuarios> listaUsuario) {
        int contador = 1;
        Propietarios propietarios1 = new Propietarios();
        Veterinarios veterinarios1 = new Veterinarios();

        String comprobacion = "";
        boolean esVeterinario = false;
        Usuarios usuarios2 = new Usuarios();
        Scanner sc = new Scanner(System.in);
        boolean datosCompletados = false;

            // TOMA DE DATOS
            System.out.println("--REGISTRO--");
            usuarios2.setCodigoIdentificador(contador);
            System.out.println("Introduzca su nombre");
            usuarios2.setNombre(sc.next());
            System.out.println("Introduzca su apellido");
            usuarios2.setApellidos(sc.next());
            System.out.println("Es veterinario?");
            comprobacion = sc.next();
            if (comprobacion.toLowerCase() == "si") {
                esVeterinario = true;
                usuarios2.setEsVeterinario(esVeterinario);
                System.out.println("Introduzca su numero de colegiado");
                veterinarios1.setNumeroColegiado(sc.next());
            } else if (comprobacion.toLowerCase() == "no") {
                esVeterinario = false;
                usuarios2.setEsVeterinario(esVeterinario);
                System.out.println("Cuántas mascotas tiene?");
                propietarios1.setnumeroMascotas(sc.nextInt());
            }
            else{
                System.err.println("Es veterinario no ha sido respondido");
            }


        listaUsuario.add(usuarios2);
        return listaUsuario;
    }
}
