package model;

public class HocVienModel {

	private int maHV;
	private int maKH;
	private String maNH;
	private String diem;
	
	public HocVienModel() {
	
	}

	public HocVienModel(int maHV, int maKH, String maNH, String diem) {
		
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

	@Override
	public String toString() {
		return "HocVienModel [maHV=" + maHV + ", maKH=" + maKH + ", maNH=" + maNH + ", diem=" + diem + "]";
	}
}
