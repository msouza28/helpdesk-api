package com.github.msouza28.helpdeskapi.objetos;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends Pessoa {

    private List<Chamado> chamados = new ArrayList();
    
}
