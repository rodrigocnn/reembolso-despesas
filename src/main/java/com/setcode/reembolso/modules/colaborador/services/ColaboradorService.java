package com.setcode.reembolso.modules.colaborador.services;

import com.setcode.reembolso.modules.colaborador.model.Colaborador;

import java.util.List;

public interface ColaboradorService {
    List<Colaborador> listarTodos();
    Colaborador create(Colaborador colaborador);
    Colaborador update (Long id,Colaborador colaborador);
    void delete(Long id);
}