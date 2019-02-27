package br.com.andretecnologia.makeup.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("makeup");

	public EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
}
