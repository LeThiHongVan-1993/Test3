package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import entity.ChuyenDe;
import entity.HocVien;
import entity.KhoaHoc;
import entity.NguoiHoc;
import entity.NhanVien;

public class KhoaHocDao implements IKhoaHocDao{
	
	private static ArrayList<KhoaHoc> listKH;
	private static ArrayList<ChuyenDe> listCD;

	public void them(KhoaHoc kh) {
		// TODO Auto-generated method stub
		KhoaHoc kh1 = new KhoaHoc(123, "cd 01", 10, 20, "15/3/2012", "không có", "01", "12/2/2000");
		kh1.setChuyenDe(null);
		kh1.setNhanVien(null);
		Configuration con = new Configuration().configure()
				.addAnnotatedClass(ChuyenDe.class)
				.addAnnotatedClass(HocVien.class)
				.addAnnotatedClass(KhoaHoc.class)
				.addAnnotatedClass(NguoiHoc.class)
				.addAnnotatedClass(NhanVien.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(reg);

		Session session = sf.openSession();

		session.beginTransaction();

		session.save(kh1);

		session.getTransaction().commit();
	}

	public void sua(KhoaHoc kh) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration().configure()
				.addAnnotatedClass(ChuyenDe.class)
				.addAnnotatedClass(HocVien.class)
				.addAnnotatedClass(KhoaHoc.class)
				.addAnnotatedClass(NguoiHoc.class)
				.addAnnotatedClass(NhanVien.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(reg);

		Session session = sf.openSession();
		session.beginTransaction();

		KhoaHoc kh1 = (KhoaHoc) session.get(KhoaHoc.class, 123);

		kh1.setGhiChu("khóa học Java");
		
		session.update(kh1);

		session.getTransaction().commit();
	}

	public void xoa(KhoaHoc kh) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration().configure()
				.addAnnotatedClass(ChuyenDe.class)
				.addAnnotatedClass(HocVien.class)
				.addAnnotatedClass(KhoaHoc.class)
				.addAnnotatedClass(NguoiHoc.class)
				.addAnnotatedClass(NhanVien.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(reg);

		Session session = sf.openSession();
		session.beginTransaction();

		KhoaHoc kh1 = (KhoaHoc) session.get(KhoaHoc.class, 123);

		session.delete(kh1);

		session.getTransaction().commit();
	}

	public ArrayList<KhoaHoc> danhSachKhoaHoc() {
		// TODO Auto-generated method stub
		Configuration config = new Configuration().configure()
				.addAnnotatedClass(ChuyenDe.class)
				.addAnnotatedClass(HocVien.class)
				.addAnnotatedClass(KhoaHoc.class)
				.addAnnotatedClass(NguoiHoc.class)
				.addAnnotatedClass(NhanVien.class);
		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties())
				.buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(registry);
		Session session = sf.openSession();

		session.beginTransaction();

		Query q = session.createQuery("from KhoaHoc");
		List<KhoaHoc> khoaHoc = q.list();

		for (KhoaHoc kh : khoaHoc) {
			System.out.println(kh);
		}
		session.getTransaction().commit();
		return listKH;
	}

	public ArrayList<ChuyenDe> danhSachChuyenDe() {
		// TODO Auto-generated method stub
		Configuration config = new Configuration().configure().addAnnotatedClass(ChuyenDe.class)
				.addAnnotatedClass(HocVien.class).addAnnotatedClass(KhoaHoc.class).addAnnotatedClass(NguoiHoc.class)
				.addAnnotatedClass(NhanVien.class);
		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties())
				.buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(registry);
		Session session = sf.openSession();

		session.beginTransaction();

		Query q = session.createQuery("from ChuyenDe");
		List<ChuyenDe> chuyenDe = q.list();

		for (ChuyenDe cd : chuyenDe) {
			System.out.println(cd);
		}
		session.getTransaction().commit();
		return listCD;
	}

}
