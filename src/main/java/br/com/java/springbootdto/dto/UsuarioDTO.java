package br.com.java.springbootdto.dto;

import br.com.java.springbootdto.modelo.Usuario;
import lombok.Getter;
import javax.validation.constraints.*;

@Getter
public class UsuarioDTO {
    
    @NotBlank(message = "{name.not.blank}")
    private String nome;
    
    @NotBlank(message = "{email.not.blank}")
    @Email(message = "{email.not.valid}")
    private String email;

    @NotBlank(message = "{senha.not.blank}")
    private String senha;

    // Transforma o DTO em um objeto do tipo Usuario
    public Usuario transformaParaObjeto() {

        return new Usuario(nome, email, senha);
    }
}
