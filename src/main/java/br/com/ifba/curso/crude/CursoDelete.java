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
public class CursoDelete {
    
    private final static EntityManagerFactory entityManagerFactoy = Persistence.createEntityManagerFactory("persistence");
    
    private final static EntityManager entityManager = entityManagerFactoy.createEntityManager();

    public static void main(String[] args) {
        boolean sucesso = false; // Flag para controlar o sucesso da operação

        try {
            
            Curso cursoEncontrado = entityManager.find(Curso.class, 1); // Tenta encontrar o curso com ID 1

            if (cursoEncontrado != null) {
                // Se o curso for encontrado, iniciar a transação e remover
                entityManager.getTransaction().begin();
                entityManager.remove(cursoEncontrado); // Remove o curso
                entityManager.getTransaction().commit();

                System.out.println("Curso deletado com sucesso!");
                JOptionPane.showMessageDialog(null, "exclusão realizada com sucesso!", "Sucesso na Exclusão", JOptionPane.INFORMATION_MESSAGE);
                sucesso = true; // Marca como sucesso
            } else {
                //Se o curso não for encontrado, informar o usuário
                System.out.println("Curso com esse ID não encontrado");
                JOptionPane.showMessageDialog(null, "ID não foi encontrado para exclusão.", "Resultado da Exclusão", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            // Em caso de erro, verificar se a transação está ativa e desfazê-la
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            // Dispara o popup de erro
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao deletar o curso. Operação não realizada.", "Erro na Exclusão", JOptionPane.ERROR_MESSAGE);
            System.err.println("Erro ao deletar o curso: " + e.getMessage());
           
        } finally {
            
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
            // Fechar o EntityManagerFactory quando a aplicação 'main' for encerrada.
            if (entityManagerFactoy != null && entityManagerFactoy.isOpen()) {
                entityManagerFactoy.close();
            }
        }
        /*//deletando curso
        Curso cursoEncontrado = entityManager.find(Curso.class, 1);
        entityManager.getTransaction().begin();
        entityManager.remove(cursoEncontrado);
        entityManager.getTransaction().commit();
        
        //fechando caminho
        entityManager.close();
        entityManagerFactoy.close();*/
    }
    
}
