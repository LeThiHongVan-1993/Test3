package dao;

import java.util.ArrayList;

import entity.ChuyenDe;
import entity.KhoaHoc;

public interface IKhoaHocDao {

	public void them (KhoaHoc kh);
	public void sua (KhoaHoc kh);
	public void xoa (KhoaHoc kh);
	public ArrayList<KhoaHoc> danhSachKhoaHoc();
	public ArrayList<ChuyenDe> danhSachChuyenDe();
}
