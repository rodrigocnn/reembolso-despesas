package com.setcode.reembolso.modules.colaborador.services;

import com.setcode.reembolso.modules.colaborador.model.Colaborador;
import com.setcode.reembolso.modules.colaborador.repository.ColaboradorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColaboradorServiceImpl implements ColaboradorService{
    private final ColaboradorRepository colaboradorRepository;

    public ColaboradorServiceImpl(ColaboradorRepository colaboradorRepository) {
        this.colaboradorRepository = colaboradorRepository;
    }

    @Override
    public List<Colaborador> listarTodos() {
        return colaboradorRepository.findAll();
    }

    @Override
    public Colaborador create(Colaborador colaborador) {
        return this.colaboradorRepository.save(colaborador);
    }

    @Override
    public Colaborador update(Long id, Colaborador colaborador) {
        Optional<Colaborador> existente = colaboradorRepository.findById(id);

        if(existente.isEmpty()){
            throw new RuntimeException("Colaborador não encontrado com id: " + id);
        }

        return colaboradorRepository.save(
                Colaborador.builder()
                        .nome(colaborador.getNome())
                        .email(colaborador.getEmail())
                        .telefone(colaborador.getTelefone())
                        .senha(colaborador.getSenha())
                        .tipo(colaborador.getTipo())
                        .build()
        );
    }

    @Override
    public void delete(Long id) {

    }
}
