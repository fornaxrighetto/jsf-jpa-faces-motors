package br.com.motors.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Danilo Righetto - Fornax
 * @version 1.0
 * @since 1.0
 * 
 *        the class JPAUtil
 */
public class JPAUtil {
	/* Definindo a EntityManagerFactory seja criada apenas uma vez na aplicacao */
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
}
