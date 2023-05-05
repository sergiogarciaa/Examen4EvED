package controladores;


import entidades.Usuarios;
import servicios.ImplementacionTotal;
import servicios.ImplementacionUsuario;
import servicios.InterfazTotal;
import servicios.InterfazUsuario;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Usuarios> listaUsuarios = new ArrayList<Usuarios>();
        ImplementacionUsuario implementacionUsuario = new ImplementacionUsuario();


        System.out.println(implementacionUsuario.usuarios(listaUsuarios));




    }
}