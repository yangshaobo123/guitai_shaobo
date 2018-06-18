package com.github.mahui53541.guitar.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.mahui53541.guitar.pojo.Guitar;
import com.github.mahui53541.guitar.pojo.spec.GuitarSpec;
import com.github.mahui53541.guitar.service.GuitarService;
import com.github.mahui53541.guitar.util.UUIDUtil;

@Controller
@RequestMapping("/")
public class GuitarController extends BaseController{
	@Autowired
	private GuitarService guitarService;
	
	
	@RequestMapping(value = "/queryAll", method = RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> queryAll(String asc,
			@RequestParam(required = false, defaultValue = "0") int offset,
            @RequestParam(required = false, defaultValue = "10") int limit) throws Exception{
		Map<String,Object> data=new HashMap<String,Object>();
		data.put("total", guitarService.count());
		data.put("rows", guitarService.queryByPage(offset, limit));
		return data;
    }
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	@ResponseBody
	public List<Guitar> search(GuitarSpec guitarSpec) throws Exception{
		return guitarService.search(guitarSpec);
    }
	
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> add(Guitar guitar) throws Exception{
		try{
			guitar.setId(UUIDUtil.generate());
			guitarService.add(guitar);
			return this.ajaxSuccessResponse();
		}catch(Exception e){
			return this.ajaxFailureResponse(); 
		}
		
    }
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> delete(String id) throws Exception{
		try{
			guitarService.delete(id);
			return this.ajaxSuccessResponse();
		}catch(Exception e){
			return this.ajaxFailureResponse();
		}
		
    }
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> update(Guitar guitar) throws Exception{
		try{
			guitarService.update(guitar);
			return this.ajaxSuccessResponse();
		}catch(Exception e){
			return this.ajaxFailureResponse();
		}
    }
	
}
