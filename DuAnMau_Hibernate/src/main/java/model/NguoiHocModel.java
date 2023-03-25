package model;

public class NguoiHocModel {

	private String maNH;
	private String hoTen;
	private String ngaySinh;
	private String gioiTinh;
	private String dienThoai;
	private String email;
	private String ghiChu;
	private String maNV;
	private String ngayDK;
	
	public NguoiHocModel() {
		
	}
	public NguoiHocModel(String maNH, String hoTen, String ngaySinh, String gioiTinh, String dienThoai, String email,
			String ghiChu, String maNV, String ngayDK) {
		
		this.maNH = maNH;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.dienThoai = dienThoai;
		this.email = email;
		this.ghiChu = ghiChu;
		this.maNV = maNV;
		this.ngayDK = ngayDK;
	}
	
	public String getMaNH() {
		return maNH;
	}
	public void setMaNH(String maNH) {
		this.maNH = maNH;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDienThoai() {
		return dienThoai;
	}
	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getNgayDK() {
		return ngayDK;
	}
	public void setNgayDK(String ngayDK) {
		this.ngayDK = ngayDK;
	}
	@Override
	public String toString() {
		return "NguoiHocModel [maNH=" + maNH + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh
				+ ", dienThoai=" + dienThoai + ", email=" + email + ", ghiChu=" + ghiChu + ", maNV=" + maNV
				+ ", ngayDK=" + ngayDK + "]";
	}
	
}
