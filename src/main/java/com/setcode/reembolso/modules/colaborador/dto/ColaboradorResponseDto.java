package com.setcode.reembolso.modules.colaborador.dto;
import com.setcode.reembolso.modules.colaborador.enums.TipoColaborador;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ColaboradorResponseDto {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    @Enumerated(EnumType.STRING)
    private TipoColaborador tipo;
}
