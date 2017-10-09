/**
 * 
 */
package com.baqa.club.orphan.util;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author aabusharar
 *
 */
public class ConnectionUtil {

	@Autowired
	private SessionFactory sessionFactory;

	private ConnectionUtil() {
		super();
	}

	/**
	 * 
	 * @return
	 */
	public static ConnectionUtil getInstance() {
		return InitHelper.INSTANCE;
	}
	
	/**
	 * 
	 * @return
	 */
	public Session openSession() {
		return sessionFactory.openSession();
	}
	
	/**
	 * 
	 * @param session
	 */
	public void closeSession(Session session) {
		if(session != null && session.isOpen()) {
			session.close();
		}
	}
	
	/**
	 * 
	 * @param session
	 */
	public void rollbackTrans(Session session) {
		if(session != null && session.getTransaction() != null) {
			session.getTransaction().rollback();
		}
	}
	
	/**
	 * 
	 * @param <T>
	 * @param clazz
	 * @param session
	 * @return
	 */
	public <T> CriteriaQuery<T> createCriteria(Class<T> clazz , Session session) {
		return session.getCriteriaBuilder().createQuery(clazz);
	}
	


	/**
	 * 
	 * @author aabusharar
	 *
	 */
	private static class InitHelper {
		private static final ConnectionUtil INSTANCE = new ConnectionUtil();
	}
}
