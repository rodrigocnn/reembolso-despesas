package com.setcode.reembolso.modules.colaborador.controller;

import com.setcode.reembolso.modules.colaborador.model.Colaborador;
import com.setcode.reembolso.modules.colaborador.services.ColaboradorService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ResponseEntity<List<Colaborador>> listarTodos() {
        List<Colaborador> colaboradores = this.colaboradorService.listarTodos();
        if (colaboradores.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(colaboradores);
    }

    @PostMapping
    public Colaborador criar(@RequestBody Colaborador colaborador) {
        return colaboradorService.create(colaborador);
    }
}
