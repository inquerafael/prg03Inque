/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade.prova;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author inque
 */
public class Aluno extends Pessoa{
    //atributos
    private String matricula;
    //relacoes
    private List<Responsavel> responsavel = new ArrayList();
    private List<Turma> turma = new ArrayList();
    
    
    //gets and sets
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
}
