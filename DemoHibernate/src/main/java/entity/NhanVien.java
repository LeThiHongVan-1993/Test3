package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

@Entity
@Table(name="nhanvien")
public class NhanVien {

	@Id
	private String maNV;
	private String matKhau;
	private String hoTen;
	private String vaiTro;
	@OneToMany(mappedBy="nhanVien")
	private List<KhoaHoc> khoaHoc = new ArrayList<KhoaHoc>();
	@OneToMany(mappedBy="nhanVien")
	private List<NguoiHoc> nguoiHoc = new ArrayList<NguoiHoc>();
	public NhanVien() {
		
	}
	
	public NhanVien(String maNV, String matKhau, String hoTen, String vaiTro) {
		
		this.maNV = maNV;
		this.matKhau = matKhau;
		this.hoTen = hoTen;
		this.vaiTro = vaiTro;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getVaiTro() {
		return vaiTro;
	}
	public void setVaiTro(String vaiTro) {
		this.vaiTro = vaiTro;
	}
	
	public List<KhoaHoc> getKhoaHoc() {
		return khoaHoc;
	}
	public void setKhoaHoc(List<KhoaHoc> khoaHoc) {
		this.khoaHoc = khoaHoc;
	}
	public List<NguoiHoc> getNguoiHoc() {
		return nguoiHoc;
	}
	public void setNguoiHoc(List<NguoiHoc> nguoiHoc) {
		this.nguoiHoc = nguoiHoc;
	}
	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", matKhau=" + matKhau + ", hoTen=" + hoTen + ", vaiTro=" + vaiTro + "]";
	}
	
	
}
