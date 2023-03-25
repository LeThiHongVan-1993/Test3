package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hocvien")
public class HocVien {

	@Id
	private int maHV;
	private int maKH;
	private String maNH;
	private String diem;
	@ManyToOne
	private NguoiHoc nguoiHoc;
	@ManyToOne
	private KhoaHoc khoaHoc;

	public HocVien() {

	}

	public HocVien(int maHV, int maKH, String maNH, String diem) {

		this.maHV = maHV;
		this.maKH = maKH;
		this.maNH = maNH;
		this.diem = diem;
	}

	public int getMaHV() {
		return maHV;
	}

	public void setMaHV(int maHV) {
		this.maHV = maHV;
	}

	public int getMaKH() {
		return maKH;
	}

	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}

	public String getMaNH() {
		return maNH;
	}

	public void setMaNH(String maNH) {
		this.maNH = maNH;
	}

	public String getDiem() {
		return diem;
	}

	public void setDiem(String diem) {
		this.diem = diem;
	}

	public NguoiHoc getNguoiHoc() {
		return nguoiHoc;
	}

	public void setNguoiHoc(NguoiHoc nguoiHoc) {
		this.nguoiHoc = nguoiHoc;
	}

	public KhoaHoc getKhoaHoc() {
		return khoaHoc;
	}

	public void setKhoaHoc(KhoaHoc khoaHoc) {
		this.khoaHoc = khoaHoc;
	}

	@Override
	public String toString() {
		return "HocVien [maHV=" + maHV + ", maKH=" + maKH + ", maNH=" + maNH + ", diem=" + diem + "]";
	}

}
