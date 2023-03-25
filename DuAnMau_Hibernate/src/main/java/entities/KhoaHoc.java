package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="khoahoc")
public class KhoaHoc {

	@Id
	private int maKH;
	private String maCD;
	private int hocPhi;
	private float thoiLuong;
	private String ngayKG;
	private String ghiChu;
	private String maNV;
	private String ngayTao;
	@ManyToOne
	private ChuyenDe chuyenDe;
	@ManyToOne
	private NhanVien nhanVien;
	public KhoaHoc() {
		
	}

	public KhoaHoc(int maKH, String maCD, int hocPhi, float thoiLuong, String ngayKG, String ghiChu, String maNV,
			String ngayTao) {
		
		this.maKH = maKH;
		this.maCD = maCD;
		this.hocPhi = hocPhi;
		this.thoiLuong = thoiLuong;
		this.ngayKG = ngayKG;
		this.ghiChu = ghiChu;
		this.maNV = maNV;
		this.ngayTao = ngayTao;
	}

	public int getMaKH() {
		return maKH;
	}

	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}

	public String getMaCD() {
		return maCD;
	}

	public void setMaCD(String maCD) {
		this.maCD = maCD;
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

	public String getNgayKG() {
		return ngayKG;
	}

	public void setNgayKG(String ngayKG) {
		this.ngayKG = ngayKG;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(String ngayTao) {
		this.ngayTao = ngayTao;
	}

	public ChuyenDe getChuyenDe() {
		return chuyenDe;
	}

	public void setChuyenDe(ChuyenDe chuyenDe) {
		this.chuyenDe = chuyenDe;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	@Override
	public String toString() {
		return "KhoaHoc [maKH=" + maKH + ", maCD=" + maCD + ", hocPhi=" + hocPhi + ", thoiLuong=" + thoiLuong
				+ ", ngayKG=" + ngayKG + ", ghiChu=" + ghiChu + ", maNV=" + maNV + ", ngayTao=" + ngayTao + "]";
	}
	

}
