package br.com.ucb.Model;

import br.com.ucb.Controller.TipoFuncionario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteBD {
    public static void main(String[] args) {

        Professor p1 = new Professor("Gustavo Ribeiro", "111.111.444-22",
                "email@exemplo.com", "33548866", "15/07/1995", TipoFuncionario.PROFESSOR);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("siged_ucb");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();
        em.persist(p1);
        em.getTransaction().commit();
        em.close();



    }
}
