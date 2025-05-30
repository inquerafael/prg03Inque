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
public class Turma {
    //atributos
    private String noome;
    private int anoLetivo;
    //relacao
    private List<Aluno> alunos = new ArrayList();

    
    //gets e sets
    public String getNoome() {
        return noome;
    }

    public void setNoome(String noome) {
        this.noome = noome;
    }

    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }
    
    
}
