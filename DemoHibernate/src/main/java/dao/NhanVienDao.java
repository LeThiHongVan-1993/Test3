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

public class NhanVienDao implements INhanVienDao{

	private static ArrayList<NhanVien> listNV;
	
	public void them(NhanVien nv) {
		// TODO Auto-generated method stub
		NhanVien nv1 = new NhanVien("12345", "hgkdjgoidg", "Đỗ Minh Đức", "Trưởng Phòng");
		nv1.setKhoaHoc(null);
		nv1.setNguoiHoc(null);

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

		session.save(nv1);

		session.getTransaction().commit();
	}

	public void sua(NhanVien nv) {
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

		NhanVien nv1 = (NhanVien) session.get(NhanVien.class, "12345");

		nv1.setMatKhau("AB090393");

		session.update(nv1);

		session.getTransaction().commit();
	}

	public void xoa(NhanVien nv) {
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

		NhanVien nv1 = (NhanVien) session.get(NhanVien.class, "12345");

		session.delete(nv1);

		session.getTransaction().commit();
	}

	public ArrayList<NhanVien> danhSachNhanVien() {
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

		Query q = session.createQuery("from NhanVien");
		List<NhanVien> nhanVien = q.list();

		for (NhanVien nv : nhanVien) {
			System.out.println(nv);
		}
		session.getTransaction().commit();
		return listNV;
	}

}
