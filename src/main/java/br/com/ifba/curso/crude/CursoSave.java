package br.com.ifba.curso.crude;

import br.com.ifba.curso.Curso;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author inque
 */
public class CursoSave {
    
    private final static EntityManagerFactory entityManagerFactoy = Persistence.createEntityManagerFactory("persistence");
    
    private final static EntityManager entityManager = entityManagerFactoy.createEntityManager();
    
    public static void main(String[] args) {
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
        
        //fechando o caminho
        entityManager.close();
        entityManagerFactoy.close();
    }
    
    
}
