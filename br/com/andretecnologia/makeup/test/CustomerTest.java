package br.com.andretecnologia.makeup.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;import br.com.andretecnologia.makeup.model.Customer;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setName("André");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("makeup");
		EntityManager em = entityManagerFactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(c1);
		em.getTransaction().commit();
		Customer c = em.find(Customer.class, 1);
		System.out.println(c.getName());
		em.close();
	}
}
