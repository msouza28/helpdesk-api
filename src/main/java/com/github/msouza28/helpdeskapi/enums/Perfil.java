package com.github.msouza28.helpdeskapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Perfil {
    ADMIN(0, "ROLE_ADMIN"), CLIENTE(1, "ROLE_CLIENTE"), TECNICO(2, "ROLE_TECNICO");

    private Integer codigo;
    private String descricao;

    public static Perfil toEnum(Integer cod) throws IllegalAccessException{
        if(cod == null){
            return null;
        }
        for(Perfil p : Perfil.values()){
            if(cod.equals(p.getCodigo())){
                return p;
            }
        }
         throw new IllegalAccessException("Perfil inválido");   
        }
    }

