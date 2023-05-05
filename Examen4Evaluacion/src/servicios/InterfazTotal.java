package servicios;
import entidades.Propietarios;
import entidades.Usuarios;
import entidades.Veterinarios;

import  java.util.List;


public interface InterfazTotal {
    List<Usuarios> usuarios(List<Usuarios>listaUsuario);
}
