package com.github.mahui53541.guitar.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.mahui53541.guitar.dao.GuitarDao;
import com.github.mahui53541.guitar.domain.Inventory;
import com.github.mahui53541.guitar.pojo.Guitar;
import com.github.mahui53541.guitar.pojo.spec.GuitarSpec;
import com.github.mahui53541.guitar.service.GuitarService;
import com.github.pagehelper.PageHelper;

@Service("guitarService")
public class GuitarServiceImpl implements GuitarService{

	@Autowired
	private GuitarDao guitarDao;
	@Autowired
	private Inventory inventory;
	@Override
	public List<Guitar> search(GuitarSpec searchSpec){
		List<Guitar> guitars=guitarDao.findAll();
		return inventory.search(searchSpec, guitars);
	}
	
	@Override
	public void add(Guitar guitar) {
		guitarDao.add(guitar);
	}
	
	@Override
	public void update(Guitar guitar) {
		guitarDao.update(guitar);
	}
	
	@Override
	public void delete(String id) {
		guitarDao.delete(id);
	}

	@Override
	public List<Guitar> queryByPage(int page,int rows) {
		PageHelper.startPage(page,rows); 
		return guitarDao.findAll();
	}

	@Override
	public int count() {
		return guitarDao.count();
	}

}
