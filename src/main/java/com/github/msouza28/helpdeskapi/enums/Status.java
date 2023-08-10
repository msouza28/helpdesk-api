package com.github.msouza28.helpdeskapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
    ABERTO(0, "ABERTO"), ANDAMENTO(1, "ANDAMENTO"), ENCERRADO(2, "ENCERRADO");

    private Integer codigo;
    private String descricao;

    public static Status toEnum(Integer cod) throws IllegalAccessException{
        if(cod == null){
            return null;
        }
        for(Status p : Status.values()){
            if(cod.equals(p.getCodigo())){
                return p;
            }
        }
         throw new IllegalAccessException("Status inválido");   
        }
    }

