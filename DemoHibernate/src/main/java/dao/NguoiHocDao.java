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

public class NguoiHocDao implements INguoiHocDao{

	private static ArrayList<NguoiHoc> listNH;
	
	public void them(NguoiHoc nh) {
		// TODO Auto-generated method stub
		NguoiHoc nh1 = new NguoiHoc("1111", "Đỗ Bảo Hà Anh", "11/05/2021", "Nữ", "0982022392", "HaAnh@gmail.com", "Không có ghi chú", "12345", "17/3/2023");
		nh1.setHocvien(null);
		nh1.setNhanVien(null);

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

		session.save(nh1);

		session.getTransaction().commit();
	}

	public void sua(NguoiHoc nh) {
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

		NguoiHoc nh1 = (NguoiHoc) session.get(NguoiHoc.class, "1111");

		nh1.setGhiChu("Đã update");

		session.update(nh1);

		session.getTransaction().commit();
	}

	public void xoa(NguoiHoc nh) {
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

		NguoiHoc nh1 = (NguoiHoc) session.get(NguoiHoc.class, "1111");

		session.delete(nh1);

		session.getTransaction().commit();
	}

	public ArrayList<NguoiHoc> danhSachNguoiHoc() {
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

		Query q = session.createQuery("from NguoiHoc");
		List<NguoiHoc> nguoiHoc = q.list();

		for (NguoiHoc nh : nguoiHoc) {
			System.out.println(nh);
		}
		session.getTransaction().commit();
		return listNH;
	}

}
