package controller;

import model.Empresa;
import model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.EmpresaService;
import service.UsuarioService;

import java.util.List;

@RestController

public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/usuario")
    private List<Usuario> verUsuario(){
        return usuarioService.verUsuario();
    }

    @PostMapping("/usuario")
    private void crearUsuario(@RequestBody Usuario usuario){
        usuarioService.crearUsuario(usuario);
    }

    @DeleteMapping("/usuario/{id}")
    private void eliminarUsuario(@PathVariable("id") Long id){
        usuarioService.eliminarUsuario(id);
    }
    @PutMapping("/usuario")
    private void editarUsuario(@RequestBody Usuario usuario){
        usuarioService.crearYActualizarUsuario(usuario);
    }
}
