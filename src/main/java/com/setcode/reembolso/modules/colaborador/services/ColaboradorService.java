package com.setcode.reembolso.modules.colaborador.services;

import com.setcode.reembolso.modules.colaborador.dto.ColaboradorCreateDto;
import com.setcode.reembolso.modules.colaborador.dto.ColaboradorResponseDto;


import java.util.List;

public interface ColaboradorService {
    List<ColaboradorResponseDto> listarTodos();
    ColaboradorResponseDto create(ColaboradorCreateDto colaborador);
    ColaboradorResponseDto update(Long id, ColaboradorCreateDto colaborador);
    void delete(Long id);
}