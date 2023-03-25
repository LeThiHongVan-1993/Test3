package dao;

import java.util.ArrayList;

import entity.HocVien;

public interface IHocVienDao {

	public void them (HocVien hv);
	public void sua (HocVien hv);
	public void xoa (HocVien hv);
	public ArrayList<HocVien> danhSachHocVien();
}
