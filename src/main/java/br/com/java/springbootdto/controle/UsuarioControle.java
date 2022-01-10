package br.com.java.springbootdto.controle;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import br.com.java.springbootdto.dto.UsuarioDTO;
import br.com.java.springbootdto.dto.UsuarioRespostaDTO;
import br.com.java.springbootdto.modelo.Usuario;
import br.com.java.springbootdto.servico.UsuarioServico;

@RequestMapping("/usuarios")
@RestController
public class UsuarioControle {

    // Instancia da classe de serviço
    private final UsuarioServico usuarioServico;

    // Integrando Controle e serviço
    @Autowired
    public UsuarioControle(UsuarioServico usuarioServico) {
        this.usuarioServico = usuarioServico;
    }
    
    // Salvando o objeto com auxilio do serviço
    @PostMapping
    public ResponseEntity<UsuarioRespostaDTO> salvar(@RequestBody @Valid UsuarioDTO dto) {
           
        Usuario usuario = usuarioServico.salvar(dto.transformaParaObjeto());

        return new ResponseEntity<>(UsuarioRespostaDTO.transformaEmDTO(usuario), HttpStatus.CREATED);
    }
}
