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

public class CursoFind {
    
    private final static EntityManagerFactory entityManagerFactoy = Persistence.createEntityManagerFactory("persistence");
    
    private final static EntityManager entityManager = entityManagerFactoy.createEntityManager();

    public static void main(String[] args) {
        
        Curso cursoEncontrado = null; // Para armazenar o curso encontrado
        boolean sucesso = false; // Flag para controlar o sucesso da operação

        
        try{
            cursoEncontrado = entityManager.find(Curso.class, 1);
            
            if (cursoEncontrado != null) {
                System.out.println("Curso encontrado: " + cursoEncontrado.getNome());
                
                JOptionPane.showMessageDialog(null, "Curso encontrado: " + cursoEncontrado.getNome(), "Sucesso na Busca", JOptionPane.INFORMATION_MESSAGE);
                sucesso = true; // Marca como sucesso se o curso foi encontrado
            } else {
                System.out.println("Curso com ID 1 não encontrado no banco de dados.");
                JOptionPane.showMessageDialog(null, "Curso com o ID especificado não foi encontrado.", "Resultado da Busca", JOptionPane.WARNING_MESSAGE);
            }
            
        }catch(Exception ex){
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            // Dispara o popup de erro
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao buscar o curso. Operação não realizada.", "Erro na Busca", JOptionPane.ERROR_MESSAGE);
            System.err.println("Erro ao buscar o curso: " + ex.getMessage());
            
        } finally {
            // Garante que o EntityManager seja sempre fechado, se foi criado e está aberto
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
            // Fechar o EntityManagerFactory quando a aplicação 'main' for encerrada.
            if (entityManagerFactoy != null && entityManagerFactoy.isOpen()) {
                entityManagerFactoy.close();
            }
        }
        /*//buscando curso
        entityManager.getTransaction().begin();
        Curso cursoEncontrado = entityManager.find(Curso.class, 1);
        System.out.print("curso: " + cursoEncontrado.getNome());
        
        //fechando caminho
        entityManager.close();
        entityManagerFactoy.close();*/
        
    }
    
}
