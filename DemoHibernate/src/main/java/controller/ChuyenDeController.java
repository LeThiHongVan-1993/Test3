package controller;

import java.util.List;

import dao.ChuyenDeDao;
import entity.ChuyenDe;

public class ChuyenDeController {
	
	private final ChuyenDeDao dao;

	public ChuyenDeController() {
		super();
		this.dao = new ChuyenDeDao();
	}
	
	public ChuyenDe them(ChuyenDe cd) {
		if (cd == null) {
			return null;
		}
	
		return dao.them(cd);
	}
	
	public List<ChuyenDe> getAll() {
		return dao.danhSachChuyenDe();
	}

	public ChuyenDe xoa(ChuyenDe cd) {
		if (cd == null) {
			return null;
		}
		
		return dao.xoa(cd);
	}
}
