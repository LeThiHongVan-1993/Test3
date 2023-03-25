package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entities.ChuyenDe;
import utilities.HibernateUtil;

public class ChuyenDeDao implements IChuyenDeDao{	

	public boolean them(ChuyenDe cd) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getFACTORY().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(cd);
			transaction.commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return false;
	}
	
	public boolean sua(ChuyenDe cd) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getFACTORY().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(cd);;
			transaction.commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return false;
	}

	public boolean xoa(ChuyenDe cd) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getFACTORY().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.delete(cd);
			transaction.commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return false;
	}

	public List<ChuyenDe> danhSachChuyenDe() {
		// TODO Auto-generated method stub
		List<ChuyenDe> lists = new ArrayList<ChuyenDe>();
		Session session = HibernateUtil.getFACTORY().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = (Query) session.createQuery("FROM ChuyenDe");
			lists = query.getResultList();
			transaction.commit();
			return lists;
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return null;
	}

}
