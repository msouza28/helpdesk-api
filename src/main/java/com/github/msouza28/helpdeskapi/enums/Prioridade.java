package com.github.msouza28.helpdeskapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Prioridade {
    BAIXA(0, "BAIXA"), MEDIA(1, "MEDIA"), ALTA(2, "ALTA");

    private Integer codigo;
    private String descricao;

    public static Prioridade toEnum(Integer cod) throws IllegalAccessException{
        if(cod == null){
            return null;
        }
        for(Prioridade p : Prioridade.values()){
            if(cod.equals(p.getCodigo())){
                return p;
            }
        }
         throw new IllegalAccessException("Prioridade inválido");   
        }
    }

