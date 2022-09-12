package service;

import model.Empresa;
import model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import repository.EmpresaRepository;
import repository.UsuarioRepository;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> verUsuario(){
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.addAll(usuarioRepository.findAll());
        return usuarios;
    }

    public void crearUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }
    public void eliminarUsuario(Long id){
        usuarioRepository.deleteById(id);
    }
    public void crearYActualizarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
