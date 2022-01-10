package br.com.java.springbootdto.dto;

import br.com.java.springbootdto.modelo.Usuario;
import lombok.Getter;

@Getter
public class UsuarioDTO {
    
    private String nome;
    private String email;
    private String senha;

    // Transforma o DTO em um objeto do tipo Usuario
    public Usuario transformaParaObjeto() {

        return new Usuario(nome, email, senha);
    }
}
