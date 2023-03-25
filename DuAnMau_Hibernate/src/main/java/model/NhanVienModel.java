package model;

public class NhanVienModel {

	private String maNV;
	private String matKhau;
	private String hoTen;
	private String vaiTro;
	
	public NhanVienModel() {
		
	}

	public NhanVienModel(String maNV, String matKhau, String hoTen, String vaiTro) {
		
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

	@Override
	public String toString() {
		return "NhanVienModel [maNV=" + maNV + ", matKhau=" + matKhau + ", hoTen=" + hoTen + ", vaiTro=" + vaiTro + "]";
	}
	
}
