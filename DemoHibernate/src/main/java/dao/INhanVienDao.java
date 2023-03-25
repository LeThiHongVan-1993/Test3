package dao;

import java.util.ArrayList;

import entity.NhanVien;

public interface INhanVienDao {

	public void them (NhanVien nv);
	public void sua (NhanVien nv);
	public void xoa (NhanVien nv);
	public ArrayList<NhanVien> danhSachNhanVien();
}
