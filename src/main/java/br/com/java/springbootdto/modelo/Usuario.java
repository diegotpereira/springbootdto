package br.com.java.springbootdto.modelo;

import javax.persistence.*;

import lombok.Getter;

@Entity
@Getter
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private boolean admin = false;
}
