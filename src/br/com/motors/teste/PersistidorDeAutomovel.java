package br.com.motors.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.motors.entity.AutomovelEntity;
import br.com.motors.entity.JPAUtil;

/** 
 * @author Danilo Righetto - Fornax
 * @version 1.0
 * @since 1.0
 * 
 * the class PersistidorDeAutomovel
 * */
public class PersistidorDeAutomovel {
	/** testing the database */
	public static void main(String[] args) {
		/** Criando uma conexao com o Banco de Dados definido no persistence-unit */
		EntityManagerFactory emf = Persistence.
				createEntityManagerFactory("default");
		
		/** o metodo createEntityManager representa uma conexao com a unidade de persistencia. */
		EntityManager em = emf.createEntityManager();
		
		/* Usando o EntityManager atraves da classe JPAUtil
		EntityManager em = JPAUtil.getEntityManager();
		*/
		
		/** Criando um objeto AutomovelEntity */
		AutomovelEntity auto = new AutomovelEntity();
		auto.setAnoFabricacao(2010);
		auto.setModelo("Ferrari");
		auto.setObservacoes("Nunca foi batido");
		
		/** EntityManager realiza a persistencia */
		EntityTransaction tx = em.getTransaction();
		tx.begin(); //Delimitando a transacao
		em.persist(auto);
		tx.commit(); //Delimitando a transacao
		
		/* fechado a conexao com o banco */
		em.close();
		emf.close();
		
		
	}
}
