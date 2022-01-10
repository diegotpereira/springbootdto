package br.com.java.springbootdto.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.java.springbootdto.modelo.Usuario;
import br.com.java.springbootdto.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServico {
    
    // Instanciar a classe Jpa de repositorio
    private final UsuarioRepositorio usuarioRepositorio;

    // Integrando a classe de serviço com a classe repositorio
    @Autowired
    public UsuarioServico(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    // Salvando o objeto no banco
    public Usuario salvar(Usuario usuario) {

        return usuarioRepositorio.save(usuario);
    }
}
