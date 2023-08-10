package com.github.msouza28.helpdeskapi.objetos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.github.msouza28.helpdeskapi.enums.Perfil;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
public abstract class Pessoa {


    protected Integer id;
    protected String nome;
    protected String cpf;
    protected String email;
    protected String senha;
    protected Set<Integer> perfis = new HashSet<>();
    protected LocalDate dataCriacao = LocalDate.now();

    public Pessoa(){
        super();
        addPerfil(Perfil.CLIENTE);
    }
    public Pessoa(Integer id, String nome, String cpf, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        addPerfil(Perfil.CLIENTE);
    }
    
    public Set<Perfil> getPerfis(){
        return perfis.stream().map(x -> {
            try {
                return Perfil.toEnum(x);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return null;
        }).collect(Collectors.toSet());
    }
    public void addPerfil(Perfil perfil){
        this.perfis.add(perfil.getCodigo());
    }
}
