package model;

public class ChuyenDeModel {

	private String maCD;
	private String tenCD;
	private int hocPhi;
	private float thoiLuong;
	private String hinh;
	private String moTa;
	
	public ChuyenDeModel() {
	
	}
	public ChuyenDeModel(String maCD, String tenCD, int hocPhi, float thoiLuong, String hinh, String moTa) {
	
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
	@Override
	public String toString() {
		return "ChuyenDeModel [maCD=" + maCD + ", tenCD=" + tenCD + ", hocPhi=" + hocPhi + ", thoiLuong=" + thoiLuong
				+ ", hinh=" + hinh + ", moTa=" + moTa + "]";
	}
}
