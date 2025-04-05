package com.setcode.reembolso.modules.despesas.model;


import com.setcode.reembolso.modules.colaborador.enums.TipoColaborador;
import com.setcode.reembolso.modules.despesas.enums.TipoDespesa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Despesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private BigDecimal Valor;
    @Enumerated(EnumType.STRING)
    private TipoDespesa tipo;
}





