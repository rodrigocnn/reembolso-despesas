package com.setcode.reembolso.modules.colaborador.services;

import com.setcode.reembolso.modules.colaborador.dto.ColaboradorCreateDto;
import com.setcode.reembolso.modules.colaborador.dto.ColaboradorResponseDto;
import com.setcode.reembolso.modules.colaborador.mapper.ColaboradorMapper;
import com.setcode.reembolso.modules.colaborador.model.Colaborador;
import com.setcode.reembolso.modules.colaborador.repository.ColaboradorRepository;
import org.springframework.stereotype.Service;
import static com.setcode.reembolso.modules.colaborador.mapper.ColaboradorMapper.*;

import java.util.List;
import java.util.Optional;

@Service
public class ColaboradorServiceImpl implements ColaboradorService{
    private final ColaboradorRepository colaboradorRepository;

    public ColaboradorServiceImpl(ColaboradorRepository colaboradorRepository) {
        this.colaboradorRepository = colaboradorRepository;
    }

    @Override
    public List<ColaboradorResponseDto> listarTodos() {
        return colaboradorRepository.findAll()
                .stream()
                .map(ColaboradorMapper::toDto)
                .toList();
    }

    @Override
    public ColaboradorResponseDto create(ColaboradorCreateDto dto) {
        Colaborador colaborador = toEntity(dto);
        colaboradorRepository.save(colaborador);
        return toDto(colaborador);
    }

    @Override
    public ColaboradorResponseDto update(Long id, ColaboradorCreateDto dto) {
        Optional<Colaborador> existente = colaboradorRepository.findById(id);

        if (existente.isEmpty()) {
            throw new RuntimeException("Colaborador não encontrado com id: " + id);
        }

        Colaborador colaboradorAtualizado = Colaborador.builder()
                .id(id)
                .nome(dto.getNome())
                .email(dto.getEmail())
                .telefone(dto.getTelefone())
                .senha(dto.getSenha())
                .tipo(dto.getTipo())
                .build();

        Colaborador salvo = colaboradorRepository.save(colaboradorAtualizado);
        return toDto(salvo);
    }


    @Override
    public void delete(Long id) {

    }
}
