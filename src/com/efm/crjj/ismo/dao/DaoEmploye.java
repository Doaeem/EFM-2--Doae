package com.efm.crjj.ismo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.efm.crjj.ismo.model.Employe;

import com.efm.crjj.ismo.model.Employe;
import com.efm.crjj.ismo.util.HibernateUtil;


public class DaoEmploye implements IDao<Employe> {

	@Override
	public List<Employe> getAll() {
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		List<Employe> avions = s.createQuery("from Employe").getResultList();
		t.commit();
		s.close();
		return avions;
	}

	@Override
	public Employe getOne(int id) {
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		return s.get(Employe.class, id);
	}

	@Override
	public boolean save(Employe obj) {
		try {
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = s.beginTransaction();
		s.saveOrUpdate(obj);
		transaction.commit();
		return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean delete(Employe obj) {
		try {
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			Transaction t = session.beginTransaction();

			session.delete(obj);

			t.commit();
			session.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
