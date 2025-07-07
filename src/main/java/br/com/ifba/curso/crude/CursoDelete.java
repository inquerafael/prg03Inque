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
public class CursoDelete {
    
    private final static EntityManagerFactory entityManagerFactoy = Persistence.createEntityManagerFactory("persistence");
    
    private final static EntityManager entityManager = entityManagerFactoy.createEntityManager();

    public static void main(String[] args) {
        //deletando curso
        Curso cursoEncontrado = entityManager.find(Curso.class, 1);
        entityManager.getTransaction().begin();
        entityManager.remove(cursoEncontrado);
        entityManager.getTransaction().commit();
        
        //fechando caminho
        entityManager.close();
        entityManagerFactoy.close();
    }
    
}
