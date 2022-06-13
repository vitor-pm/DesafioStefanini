package com.stefanini.hackathon.controller;

import com.stefanini.hackathon.dto.AlunoDTO;
import com.stefanini.hackathon.exception.TurmaNotFoundException;
import com.stefanini.hackathon.model.Aluno;
import com.stefanini.hackathon.mapper.AlunoDTOService;
import com.stefanini.hackathon.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class AlunoController {

    private final AlunoService alunoService;
    private final AlunoDTOService alunoDTOService;

    @Autowired
    public AlunoController(AlunoService alunoService, AlunoDTOService alunoDTOService) {
        this.alunoService = alunoService;
        this.alunoDTOService = alunoDTOService;
    }

    @GetMapping(value = "/aluno")
    public List<Aluno> findAlunos(){
        List<Aluno> alunos = alunoService.findAllAlunos();
        return  alunos;
    }

    @DeleteMapping
    public
}
