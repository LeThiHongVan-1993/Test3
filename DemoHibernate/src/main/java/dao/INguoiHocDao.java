package dao;

import java.util.ArrayList;

import entity.NguoiHoc;

public interface INguoiHocDao {

	public void them (NguoiHoc nh);
	public void sua (NguoiHoc nh);
	public void xoa (NguoiHoc nh);
	public ArrayList<NguoiHoc> danhSachNguoiHoc();
}
