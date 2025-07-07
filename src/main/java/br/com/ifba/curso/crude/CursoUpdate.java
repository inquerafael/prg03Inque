/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.crude;

import br.com.ifba.curso.Curso;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author inque
 */
public class CursoUpdate {
    private final static EntityManagerFactory entityManagerFactoy = Persistence.createEntityManagerFactory("persistence");
    
    private final static EntityManager entityManager = entityManagerFactoy.createEntityManager();

    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setId(1L);
        curso.setNome("POO");
        curso.setCodCurso("EGS");
        curso.setAtivo(true);
        
        //atualizando curso
        entityManager.getTransaction().begin();
        entityManager.merge(curso);
        entityManager.getTransaction().commit();
        
        //fechando caminho
        entityManager.close();
        entityManagerFactoy.close();
        
    }
}
