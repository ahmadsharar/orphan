/**
 * 
 */
package com.baqa.club.orphan.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.baqa.club.orphan.dao.KidsDao;
import com.baqa.club.orphan.model.Kids;

public class KidsDaoImpl extends HibernateDaoSupport implements KidsDao {

	@Override
	@Transactional
	public void doSave(Kids entity) {
		//Session session = null;
		try {
//			session = ConnectionUtil.getInstance().openSession();
//			session.beginTransaction();
			getHibernateTemplate().save(entity);
//			session.getTransaction().commit();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} 

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Kids> getAllKids(String name) {
		try {
			return (List<Kids>) getHibernateTemplate().find(
	                 "from Kids where (:name is null or name like :name)", "%"+name+"%"
	           );
		}catch (Exception ex) {
			ex.printStackTrace();
			return null;
		} 

	}

//	@Override
//	public List<Kids> getAllKids(String name) {
//		Session session = null;
//		List<Kids> kids = null;
//		try {
//			session = ConnectionUtil.getInstance().openSession();
//			CriteriaBuilder cb= getHibernateTemplate().getSessionFactory().getCriteriaBuilder();
//			CriteriaQuery<Kids> query =cb.createQuery(Kids.class);
//			Root<Kids> root = query.from(Kids.class);
//		    if(StringUtils.isNotBlank(name)) {
//		    	 query.where(cb.like(root.get("name").as(String.class), "%"+name+"%"));
//		    }
//		    query.select(root);
//			kids = session.createQuery(query).getResultList();
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		} finally {
//			ConnectionUtil.getInstance().closeSession(session);
//		}
//		return kids;
//	}

}
