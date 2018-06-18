package com.github.mahui53541.guitar.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.github.mahui53541.guitar.dao.GuitarDao;
import com.github.mahui53541.guitar.domain.Inventory;
import com.github.mahui53541.guitar.pojo.Builder;
import com.github.mahui53541.guitar.pojo.Guitar;
import com.github.mahui53541.guitar.pojo.Type;
import com.github.mahui53541.guitar.pojo.Wood;
import com.github.mahui53541.guitar.pojo.spec.GuitarSpec;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:springmvc-config.xml"})
@ActiveProfiles("mysql")//测试mysql数据库（测试sqlite是变为sqlite）
@Transactional//事务回滚，测试成功后不会持久化到数据库（如果不需要可不加）
public class GuitarTest {	
	@Autowired
	private Inventory inventory;	
	@Autowired
	private GuitarDao guitarDao;	
	@Test
	public void search(){		
		List<Guitar> all=new ArrayList<Guitar>();
		all.add(new Guitar("1",10.0d,Builder.JIANGSU, "X", Type.ACOUSTIC,Wood.CAMPHOR, Wood.CAMPHOR,3));
		all.add(new Guitar("2",15.0d,Builder.SHANDONG, "XL", Type.ACOUSTIC,Wood.BRICH, Wood.CAMPHOR,2));
		all.add(new Guitar("3",20.0d,Builder.JIANGSU, "M", Type.ACOUSTIC,Wood.CAMPHOR, Wood.KOREANPINE,5));
		
		GuitarSpec whatErinLikes = 
			      new GuitarSpec(Builder.JIANGSU, "X", 
			                     Type.ACOUSTIC,Wood.CAMPHOR, Wood.CAMPHOR,3);
		
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes,all);
		
		for(Guitar guitar:matchingGuitars){
			System.out.println("匹配吉他的序列号："+guitar.getId());
		}
	}
	
	@Test
	public void add(){
		guitarDao.add(new Guitar("testguitar",10.0d,Builder.JIANGSU, "X", Type.ACOUSTIC,Wood.CAMPHOR, Wood.CAMPHOR,3));
	}
	
	@Test
	public void delete(){
		guitarDao.delete("1");
	}
}
