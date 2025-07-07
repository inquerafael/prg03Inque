/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.crude;

import br.com.ifba.curso.Curso;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author inque
 */
public class CursoUpdate {
    private final static EntityManagerFactory entityManagerFactoy = Persistence.createEntityManagerFactory("persistence");
    
    private final static EntityManager entityManager = entityManagerFactoy.createEntityManager();

    public static void main(String[] args) {
        boolean sucesso = false; // Flag para controlar o sucesso da operação

        try {
            Curso curso = new Curso();
            curso.setId(1); 
            curso.setNome("POO");
            curso.setCodCurso("EGS");
            curso.setAtivo(true);

            // Atualizando curso
            entityManager.getTransaction().begin();
            entityManager.merge(curso);
            entityManager.getTransaction().commit();

            sucesso = true; // Marca como sucesso se não houver exceção até aqui
            JOptionPane.showMessageDialog(null, "Operação de atualização realizada com sucesso!", "Sucesso na Atualização", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            //verificar se a transação está ativa e desfaz
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            // Dispara o popup de erro
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o curso. Operação não realizada.", "Erro na Atualização", JOptionPane.ERROR_MESSAGE);
            System.err.println("Erro ao atualizar o curso: " + e.getMessage());
           
        } finally {
            // Garante que o EntityManager seja sempre fechado, se foi criado e está aberto
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
            // Fechar o EntityManagerFactory quando a aplicação 'main' for encerrada
            if (entityManagerFactoy != null && entityManagerFactoy.isOpen()) {
                entityManagerFactoy.close();
            }
        }
        /*Curso curso = new Curso();
        curso.setId(1);
        curso.setNome("POO");
        curso.setCodCurso("EGS");
        curso.setAtivo(true);
        
        //atualizando curso
        entityManager.getTransaction().begin();
        entityManager.merge(curso);
        entityManager.getTransaction().commit();
        
        //fechando caminho
        entityManager.close();
        entityManagerFactoy.close();*/
        
    }
}
