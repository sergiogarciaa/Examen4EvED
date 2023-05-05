package servicios;
import entidades.Usuarios;
import  java.util.List;

public interface InterfazUsuario {
    List<Usuarios> usuarios(List<Usuarios>listaUsuario);
}
