package com.github.msouza28.helpdeskapi.objetos;

import java.time.LocalDate;

import com.github.msouza28.helpdeskapi.enums.Prioridade;
import com.github.msouza28.helpdeskapi.enums.Status;

import lombok.Data;

@Data
public class Chamado {
    private Integer id;
    private LocalDate dataAbertura = LocalDate.now();
    private LocalDate dataFechamento;
    private Prioridade prioridade;
    private Status  status;
    private String titulo;
    private String obersavacoes;

    private Tecnico tecnico;
    private Cliente cliente;

    public Chamado() {
     super();
    }

    public Chamado(Integer id, Prioridade prioridade, Status status, String titulo, String obersavacoes,
            Tecnico tecnico, Cliente cliente) {
        this.id = id;
        this.prioridade = prioridade;
        this.status = status;
        this.titulo = titulo;
        this.obersavacoes = obersavacoes;
        this.tecnico = tecnico;
        this.cliente = cliente;
    }
    
}
