package br.com.java.springbootdto.dto;

import br.com.java.springbootdto.modelo.Usuario;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class UsuarioRespostaDTO {
    
    private Long id;
    private String nome;
    private String email;
    private boolean admin;

    public static UsuarioRespostaDTO transformaEmDTO(Usuario usuario) {

        return new UsuarioRespostaDTO(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.isAdmin());
    }
}
