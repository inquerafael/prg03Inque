package br.com.ifba.curso.crude;

import br.com.ifba.curso.Curso;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author inque
 */

public class CursoFind {
    
    private final static EntityManagerFactory entityManagerFactoy = Persistence.createEntityManagerFactory("persistence");
    
    private final static EntityManager entityManager = entityManagerFactoy.createEntityManager();

    public static void main(String[] args) {
        //buscando curso
        entityManager.getTransaction().begin();
        Curso cursoEncontrado = entityManager.find(Curso.class, 1);
        System.out.print("curso: " + cursoEncontrado.getNome());
        
        //fechando caminho
        entityManager.close();
        entityManagerFactoy.close();
        
    }
    
}
