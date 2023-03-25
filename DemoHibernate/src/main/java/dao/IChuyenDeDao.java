package dao;

import java.util.ArrayList;

import entity.ChuyenDe;

public interface IChuyenDeDao {

	public ChuyenDe them (ChuyenDe cd);
	public void sua (ChuyenDe cd);
	public ChuyenDe xoa (ChuyenDe cd);
	public ArrayList<ChuyenDe>danhSachChuyenDe();
}
