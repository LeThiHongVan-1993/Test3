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

public class HocVienDao implements IHocVienDao{

	private static ArrayList<HocVien> listHocVien;
	
	public void them(HocVien hv) {
		// TODO Auto-generated method stub

		HocVien hv1 = new HocVien(123, 01, "1", "9.5");
		hv1.setNguoiHoc(null);
		hv1.setKhoaHoc(null);

		Configuration con = new Configuration().configure().addAnnotatedClass(ChuyenDe.class)
				.addAnnotatedClass(HocVien.class)
				.addAnnotatedClass(KhoaHoc.class)
				.addAnnotatedClass(NguoiHoc.class)
				.addAnnotatedClass(NhanVien.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(reg);

		Session session = sf.openSession();

		session.beginTransaction();

		session.save(hv1);

		session.getTransaction().commit();
		
	}

	public void sua(HocVien hv) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration().configure().addAnnotatedClass(ChuyenDe.class)
				.addAnnotatedClass(HocVien.class)
				.addAnnotatedClass(KhoaHoc.class)
				.addAnnotatedClass(NguoiHoc.class)
				.addAnnotatedClass(NhanVien.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(reg);

		Session session = sf.openSession();
		session.beginTransaction();

		HocVien hv1 = (HocVien) session.get(HocVien.class, 123);

		hv1.setMaNH("9999");
		
		session.update(hv1);

		session.getTransaction().commit();
	}

	public void xoa(HocVien hv) {
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

		HocVien hv1 = (HocVien) session.get(HocVien.class, 123);

		session.delete(hv1);

		session.getTransaction().commit();
	}

	public ArrayList<HocVien> danhSachHocVien() {
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

		Query q = session.createQuery("from HocVien");
		List<HocVien> hocVien = q.list();

		for (HocVien hv : hocVien) {
			System.out.println(hv);
		}
		session.getTransaction().commit();
		return listHocVien;
	}

}
