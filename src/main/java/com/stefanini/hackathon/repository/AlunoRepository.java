package com.stefanini.hackathon.repository;

import com.stefanini.hackathon.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
