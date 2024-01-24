package com.company.simple;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.FranDao;
import com.company.dto.FranDto;
import com.company.service.FranService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml")
public class Test1 {
	
	@Autowired
	ApplicationContext context;
	
	@Autowired
	FranDao dao;

	@Autowired
	FranService service;

	@Test @Ignore
	public void test0() { System.out.println(context); }
	
	@Test @Ignore
	public void test1() {
		System.out.println(dao.readAll());
	}

	// insert
	@Test @Ignore
	public void test2() {
		FranDto dto = new FranDto();
	
		dto.setFname("세민만두222");
		dto.setCnum(2);
		dto.setStarttime("10:00");
		dto.setEndtime("22:00");
		dto.setCost(15000);
		dto.setMno(2);
		dto.setAddress("강남역 11번출구");
		dto.setContent("세민이가 만든 만들어 먹다가 팔다 그만둔 만두");
		dto.setPhone("010-0000-0000"); 
		System.out.println(dao.insert(dto));
	}

	// update
	@Test @Ignore
	public void test3() {
		FranDto dto = new FranDto();
		
		dto.setFno(2);
		dto.setFname("세민만두333");
		dto.setCnum(2);
		dto.setStarttime("10:00");
		dto.setEndtime("22:00");
		dto.setCost(15000);
		dto.setMno(2);
		dto.setAddress("강남역 11번출구");
		dto.setContent("세민이가 만든 만들어 먹다가 팔다 그만둔 만두");
		dto.setPhone("010-0000-0000"); 
		
		System.out.println(dao.update(dto));
	}

	// select
	@Test @Ignore
	public void test4() {
		System.out.println(dao.read(10));
	}

	// delete
	@Test @Ignore
	public void test5() {
		System.out.println(dao.delete(2));
	}

	@Test @Ignore
	public void test6() {
		System.out.println(dao.readAll());
	}

	@Test @Ignore
	public void test7() {
		FranDto dto = new FranDto();
		
		dto.setFno(2);
		dto.setFname("세민만두333");
		dto.setCnum(2);
		dto.setStarttime("10:00");
		dto.setEndtime("22:00");
		dto.setCost(15000);
		dto.setMno(2);
		dto.setAddress("강남역 11번출구");
		dto.setContent("세민이가 만든 만들어 먹다가 팔다 그만둔 만두");
		dto.setPhone("010-0000-0000"); 
		
		System.out.println(service.insert(dto));
	}

	@Test @Ignore
	public void test8() {
		FranDto dto = new FranDto();
		
		dto.setFno(3);
		dto.setFname("세민만두444");
		dto.setCnum(2);
		dto.setStarttime("10:00");
		dto.setEndtime("22:00");
		dto.setCost(15000);
		dto.setMno(2);
		dto.setAddress("강남역 11번출구");
		dto.setContent("세민이가 만든 만들어 먹다가 팔다 그만둔 만두");
		dto.setPhone("010-0000-0000"); 
		
		System.out.println(service.update(dto));
	}
	@Test @Ignore
	public void test9() {
		System.out.println(service.read(3));
	}
	@Test @Ignore
	public void test10() {
		System.out.println(service.delete(3));
	}
	@Test @Ignore
	public void test11() {
		System.out.println(service.readAll());
	}
}
