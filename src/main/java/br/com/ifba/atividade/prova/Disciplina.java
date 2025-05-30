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
public class Disciplina {
    //atributos
    private String nome;
    private String cod;
    //relacoes
    private List<Professor> professores = new ArrayList();
    private List<Turma> turma = new ArrayList();

    //metodos da classe
    
    //gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
    
    
}
