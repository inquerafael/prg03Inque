/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade.prova;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author inque
 */
public class Turma {
    //atributos
    private String noome;
    private int anoLetivo;
    private int maxAlunos = (int) (Math.random() * 50) + 1;
    Random rand = new Random();
    
    //relacao
    private List<Aluno> alunos = new ArrayList();

    //metodos
    public void setRandAlunos() {
        Random rand = new Random();
        this.maxAlunos = rand.nextInt(50)+1;
    }
    public void addAluno(){
        
    }
    public void removerAluno(){
        
    }
    public void turmaAtiva(){
        
    }

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
