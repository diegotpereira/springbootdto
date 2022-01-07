package br.com.java.springbootdto.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;


import br.com.java.springbootdto.modelo.Usuario;
import br.com.java.springbootdto.servico.UsuarioServico;

@RequestMapping("/usuarios")
@RestController
public class UsuarioControle {

    private final UsuarioServico usuarioServico;

    @Autowired
    public UsuarioControle(UsuarioServico usuarioServico) {
        this.usuarioServico = usuarioServico;
    }
    
    @PostMapping
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario) {
           
        usuario = usuarioServico.salvar(usuario);

        return new ResponseEntity<>(usuario, HttpStatus.CREATED);
    }
}
