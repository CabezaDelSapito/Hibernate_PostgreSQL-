package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null,"Jose Olimpio", "olimpio@gmail.com");
		Pessoa p2 = new Pessoa(null,"Edu Rodrigues", "edu@gmail.com");
		Pessoa p3 = new Pessoa(null,"Gabriel Enrique", "gabriel@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Pronto!");
		
		
	}

}
