package servicios;

import entidades.Propietarios;
import entidades.Usuarios;
import entidades.Veterinarios;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ImplementacionTotal implements InterfazTotal{

    public List<Usuarios> usuarios(List<Usuarios> listaUsuario) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("C:\\Users\\sergi\\Desktop\\Fichero.txt");
            pw = new PrintWriter(fichero);

            for (Usuarios element: listaUsuario) {
                pw.println("Codigo Identificador \t Nombre \t Apellidos \t Veterinario");
                pw.println(element.getCodigoIdentificador() + "\t" + element.getNombre() + "\t" + element.getApellidos() + "\t" + element.getesVeterinario());

            }

        } catch (IOException ioe) {
            System.out.print("[ERROR] - FICHERO NO ENCONTRADO: " + fichero + "\n" + ioe);
        } finally {
            try {
                if (null != fichero)
                    fichero.close();
            }catch (IOException ioe2){
                System.out.print("[ERROR] - ERROR AL CERRAR FICHERO: " + fichero + "\n" + ioe2);
            }
        }

        return listaUsuario;
    }
}
