package dao;

import java.util.ArrayList;

import entities.ChuyenDe;


public interface IChuyenDeDao {

	public boolean them (ChuyenDe cd);
	public boolean sua (ChuyenDe cd);
	public boolean xoa (ChuyenDe cd);
	public ArrayList<ChuyenDe>danhSachChuyenDe();
}
