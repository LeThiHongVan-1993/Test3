package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ChuyenDe")
public class ChuyenDe {

	@Id
	private String maCD;
	private String tenCD;
	private int hocPhi;
	private float thoiLuong;
	private String hinh;
	private String moTa;
	@OneToMany(mappedBy = "chuyenDe")
	private List<KhoaHoc> khoahoc = new ArrayList<KhoaHoc>();

	public ChuyenDe() {

	}

	public ChuyenDe(String maCD, String tenCD, int hocPhi, float thoiLuong, String hinh, String moTa) {

		this.maCD = maCD;
		this.tenCD = tenCD;
		this.hocPhi = hocPhi;
		this.thoiLuong = thoiLuong;
		this.hinh = hinh;
		this.moTa = moTa;
	}

	public String getMaCD() {
		return maCD;
	}

	public void setMaCD(String maCD) {
		this.maCD = maCD;
	}

	public String getTenCD() {
		return tenCD;
	}

	public void setTenCD(String tenCD) {
		this.tenCD = tenCD;
	}

	public int getHocPhi() {
		return hocPhi;
	}

	public void setHocPhi(int hocPhi) {
		this.hocPhi = hocPhi;
	}

	public float getThoiLuong() {
		return thoiLuong;
	}

	public void setThoiLuong(float thoiLuong) {
		this.thoiLuong = thoiLuong;
	}

	public String getHinh() {
		return hinh;
	}

	public void setHinh(String hinh) {
		this.hinh = hinh;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public List<KhoaHoc> getKhoahoc() {
		return khoahoc;
	}

	public void setKhoahoc(List<KhoaHoc> khoahoc) {
		this.khoahoc = khoahoc;
	}

	@Override
	public String toString() {
		return "ChuyenDe [maCD=" + maCD + ", tenCD=" + tenCD + ", hocPhi=" + hocPhi + ", thoiLuong=" + thoiLuong
				+ ", hinh=" + hinh + ", moTa=" + moTa + "]";
	}


}
