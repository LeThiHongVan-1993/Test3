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

public class ChuyenDeDao implements IChuyenDeDao {

	private static ArrayList<ChuyenDe> listCD;

	public ChuyenDe them(ChuyenDe cd) {
		// TODO Auto-generated method stub
		ChuyenDe cd1 = new ChuyenDe("ma cd", "ten cd", 0, 0, "bcxz", "");
		cd1.setKhoahoc(null);

		Configuration con = new Configuration().configure().addAnnotatedClass(ChuyenDe.class)
				.addAnnotatedClass(HocVien.class).addAnnotatedClass(KhoaHoc.class).addAnnotatedClass(NguoiHoc.class)
				.addAnnotatedClass(NhanVien.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(reg);

		Session session = sf.openSession();

		session.beginTransaction();

		session.save(cd1);

		session.getTransaction().commit();
		return cd1;
	}

	public void sua(ChuyenDe cd) {
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

		ChuyenDe cd1 = (ChuyenDe) session.get(ChuyenDe.class, "ma cd");

		cd.setTenCD("Java");
		cd.setHocPhi(11111);
		cd.setThoiLuong(20);
		cd.setHinh("hinhabc");
		cd.setMoTa("không có gì");

		session.update(cd);

		session.getTransaction().commit();
	}

	public ChuyenDe xoa(ChuyenDe cd) {
		// TODO Auto-generated method stub
		try {
			Configuration con = new Configuration().configure().addAnnotatedClass(ChuyenDe.class)
					.addAnnotatedClass(HocVien.class).addAnnotatedClass(KhoaHoc.class).addAnnotatedClass(NguoiHoc.class)
					.addAnnotatedClass(NhanVien.class);
	
			ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
	
			SessionFactory sf = con.buildSessionFactory(reg);
	
			Session session = sf.openSession();
			session.beginTransaction();
	
			ChuyenDe cd1 = (ChuyenDe) session.get(ChuyenDe.class, "?");
	
			session.delete(cd1);
	
			session.getTransaction().commit();
		} catch (Exception e) {
			return null;
		}
		
		return cd;
	}

	public ArrayList<ChuyenDe> danhSachChuyenDe() {
//		 TODO Auto-generated method stub
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
