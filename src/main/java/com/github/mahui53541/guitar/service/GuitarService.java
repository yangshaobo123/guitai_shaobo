package com.github.mahui53541.guitar.service;

import java.util.List;

import com.github.mahui53541.guitar.pojo.Guitar;
import com.github.mahui53541.guitar.pojo.spec.GuitarSpec;

/**
 * @author 马辉
 * @since JDK1.8
 * @history 2017年5月22日下午6:30:21 马辉 新建
 */
public interface GuitarService {
	
	/**
	 * @method 搜索吉他
	 * @author mahui
	 * @return List<Guitar>
	 */
	List<Guitar> search(GuitarSpec searchSpec);
	
	/**
	 * @method 查询所有吉他
	 * @author mahui
	 * @return List<Guitar>
	 */
	List<Guitar> queryByPage(int page,int rows);
	
	/**
	 * @method 新增吉他
	 * @author mahui
	 * @return void
	 */
	void add(Guitar guitar);
	
	/**
	 * @method 更新吉他
	 * @param guitar
	 * @author mahui
	 * @return void
	 */
	void update(Guitar guitar);
	
	/**
	 * @method 删除吉他
	 * @param guitar
	 * @author mahui
	 * @return void
	 */
	void delete (String id);
	
	/**
	 * @method 查询个数
	 * @param guitar
	 * @author mahui
	 * @return long
	 */
	int count ();
}
