package com.setcode.reembolso.modules.colaborador.controller;

import com.setcode.reembolso.modules.colaborador.dto.ColaboradorCreateDto;
import com.setcode.reembolso.modules.colaborador.dto.ColaboradorResponseDto;
import com.setcode.reembolso.modules.colaborador.model.Colaborador;
import com.setcode.reembolso.modules.colaborador.services.ColaboradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {

    @Autowired
    private final ColaboradorService colaboradorService;

    public ColaboradorController(ColaboradorService colaboradorService) {
        this.colaboradorService = colaboradorService;
    }

    @GetMapping
    public ResponseEntity<List<ColaboradorResponseDto>> listarTodos() {
        List<ColaboradorResponseDto> colaboradores = this.colaboradorService.listarTodos();
        if (colaboradores.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(colaboradores);
    }

    @PostMapping
    public ResponseEntity<ColaboradorResponseDto> criar(@RequestBody ColaboradorCreateDto colaborador) {

       return ResponseEntity.status(HttpStatus.CREATED)
               .body(colaboradorService.create(colaborador));


    }
}
