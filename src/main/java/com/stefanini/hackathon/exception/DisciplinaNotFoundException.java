package com.stefanini.hackathon.exception;

public class DisciplinaNotFoundException extends Exception{
    public DisciplinaNotFoundException(Long id) {
       super("Disciplina não encontrado com id:" +id);
    }
}
