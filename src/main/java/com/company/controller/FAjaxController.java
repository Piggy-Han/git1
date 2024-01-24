package com.company.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class FAjaxController {
	/*
	//1. 수동으로 만든 버젼
	@RequestMapping( value="/Ajax01", method=RequestMethod.GET )
	@ResponseBody
	public String ajax01() {
		// 처리해주고 - service
		return "{'name':'sally','age':3}"; //경로로 넘길께 - view
	}
	
	//2. Dto
	@RequestMapping( value="/Ajax02", method=RequestMethod.GET )
	@ResponseBody
	public FAjaxDto ajax02() {
		// 처리해주고 - service
		return new FranDto(); //경로로 넘길께 - view
	}
	
	//3. 조립버젼
	@RequestMapping( value="/Ajax03", method=RequestMethod.GET )
	@ResponseBody
	public Map<String, Object > ajax03(int no){
		Map<String, Object> result = new HashMap<>();
		// 처리해주고 - service
		result.put("result", Boolean.TRUE);
		result.put(  "data"   ,    no    );
		return result; //경로로 넘길께 - view
	}
	//http://localhost:8080/using009/Ajax03?no=1
	
	//4. 조립버젼													글꼴이 깨지면 추가하기
	@RequestMapping( value="/Ajax04", method=RequestMethod.GET //,produces="application/json; charset=UTF-8"
			)
	@ResponseBody
	public Map<String, Object > ajax04(FAjaxDto dto){
		Map<String, Object> result = new HashMap<>();
		// 처리해주고 - service
		result.put("result", Boolean.TRUE);
		result.put(  "data"   ,    dto    );
		return result; //경로로 넘길께 - view
	}
	//http://localhost:8080/using009/Ajax04?no=1&name=sally&age=3*/
}
