package com.setcode.reembolso.modules.colaborador.mapper;


import com.setcode.reembolso.modules.colaborador.dto.ColaboradorCreateDto;
import com.setcode.reembolso.modules.colaborador.dto.ColaboradorResponseDto;
import com.setcode.reembolso.modules.colaborador.model.Colaborador;

public class ColaboradorMapper {

    public static Colaborador toEntity(ColaboradorCreateDto dto) {
        Colaborador colaborador = new Colaborador();
        colaborador.setNome(dto.getNome());
        colaborador.setEmail(dto.getEmail());
        colaborador.setTelefone(dto.getTelefone());
        colaborador.setTipo(dto.getTipo());
        colaborador.setSenha(dto.getSenha());
        return colaborador;
    }


    public static ColaboradorResponseDto toDto(Colaborador colaborador) {
        ColaboradorResponseDto dto = new ColaboradorResponseDto();
        dto.setId(colaborador.getId());
        dto.setNome(colaborador.getNome());
        dto.setEmail(colaborador.getEmail());
        dto.setTelefone(colaborador.getTelefone());
        dto.setTipo(colaborador.getTipo());
        return dto;
    }
}
