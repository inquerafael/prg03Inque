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
public class CursoSave {
    
    private final static EntityManagerFactory entityManagerFactoy = Persistence.createEntityManagerFactory("persistence");
    
    private final static EntityManager entityManager = entityManagerFactoy.createEntityManager();
    
    public static void main(String[] args) {
        boolean sucesso = false;
        try{
            //criado um nonvo obj tipo curso
            Curso curso = new Curso();
            curso.setId(1);
            curso.setNome("carlos");
            curso.setCodCurso("01");
            curso.setAtivo(true);
        
            //salvando o curso
            entityManager.getTransaction().begin();
            entityManager.persist(curso);
            entityManager.getTransaction().commit();
            System.out.println("Curso salvo com sucesso!");
            
            sucesso = true; // Marca como sucesso se não houver exceção até aqui
            JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        
        } catch(Exception e) {
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback(); // Desfaz a transação se ativa
            }
            // Dispara o popup de erro
            JOptionPane.showMessageDialog(null, "A operação não pôde ser realizada.", "Erro na Operação", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Ainda recomendado para depuração no console
        
        
        } finally {
            // Garante que o EntityManager seja sempre fechado
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
            // Para um método main, fechar o EMF aqui é aceitável
            if (entityManagerFactoy != null && entityManagerFactoy.isOpen()) {
                entityManagerFactoy.close();
            }
        
        }
        
        
        /*//fechando o caminho
        entityManager.close();
        entityManagerFactoy.close();*/
    }
    
    
}
