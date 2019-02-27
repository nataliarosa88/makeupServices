package br.com.andretecnologia.makeup.test;

import javax.persistence.EntityManager;

import br.com.andretecnologia.makeup.util.JPAUtil;
import br.com.andretecnologia.makeup.model.Customer;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c1 = new Customer();

		c1.setName("André");

				EntityManager em = new JPAUtil().getEntityManager();

		em.getTransaction().begin();

		em.persist(c1);

		em.getTransaction().commit();

		em.close();
	
		
		
		
		
	}
}
