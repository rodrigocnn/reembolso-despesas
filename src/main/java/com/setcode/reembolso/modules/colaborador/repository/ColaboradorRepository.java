package com.setcode.reembolso.modules.colaborador.repository;

import com.setcode.reembolso.modules.colaborador.model.Colaborador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {
}
