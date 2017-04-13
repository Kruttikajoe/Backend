package com.niit.watchesbackend.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.watchesbackend.model.Category;

@Repository(value="categoryDAO")

public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public CategoryDAOImpl() {
		super();
		
	}

	public CategoryDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	public boolean saveorUpdate(Category category) {

		Session s = sessionFactory.getCurrentSession();
		Transaction tx = s.beginTransaction();
		s.saveOrUpdate(category);
		tx.commit();
		return true;
	}
	

	public boolean delete(Category category) {

		try
		{
		
		Session s = sessionFactory.getCurrentSession();
		Transaction tx = s.beginTransaction();
		System.out.println("deletion");
		s.delete(category);
		System.out.println("check");
		tx.commit();
		return true;
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
		
		/*Session s = sessionFactory.getCurrentSession();
		Transaction tx = s.beginTransaction();
		s.createQuery("delete from Category where categoryid=1").executeUpdate();
		return true;*/
	}

}
