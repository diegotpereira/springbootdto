package br.com.java.springbootdto.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.java.springbootdto.modelo.Usuario;
import br.com.java.springbootdto.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServico {
    
    private final UsuarioRepositorio usuarioRepositorio;

    @Autowired
    public UsuarioServico(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    public Usuario salvar(Usuario usuario) {

        return usuarioRepositorio.save(usuario);
    }
}
