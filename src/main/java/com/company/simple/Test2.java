package com.company.simple;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.ImagesDao;
import com.company.dto.ImagesDto;
import com.company.service.ImagesService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml")
public class Test2 {

	@Autowired
	ApplicationContext context;

	@Autowired
	ImagesDao dao;

	@Autowired
	ImagesService service;

	@Test
	@Ignore
	public void test0() {
		System.out.println(context);
	}

	@Test // @Ignore
	public void test1() {
		System.out.println(dao.readAll());
	}

	// insert
	@Test @Ignore
	public void test2() {
		ImagesDto dto = new ImagesDto();
		dto.setFno(63);
		if (dto.getIname1() != null) {
			System.out.println(dao.insert1(dto));
		} else {
			System.out.println(dao.insert2(dto));
		}
	}

	// update
	@Test //@Ignore
	public void test3() {
		ImagesDto dto = new ImagesDto();
		System.out.println(dao.delete(63));
		String[] dt = {dto.getIname1(),dto.getIname2(),dto.getIname3(),dto.getIname4()};
		for(int i = 0; i < 4; i++) {
			if(dt[i] != null) {
				dao.insert1(dto);
			}
		}
	}

	// select
	@Test @Ignore
	public void test4() {
		System.out.println(dao.readimg());
	}

	// delete
	@Test @Ignore
	public void test5() {
		System.out.println(dao.delete(2));
	}

	@Test // @Ignore
	public void test6() {
		System.out.println(dao.readAll());
	}

	@Test @Ignore
	public void test7() {
		ImagesDto dto = new ImagesDto();

		System.out.println(service.insert1(dto));
	}

	@Test @Ignore
	public void test8() {
		ImagesDto dto = new ImagesDto();

		System.out.println(service.update1(dto));
	}

	@Test @Ignore
	public void test9() {
		System.out.println(service.read());
	}

	@Test
	@Ignore
	public void test10() {
		System.out.println(service.delete(3));
	}

	@Test
	@Ignore
	public void test11() {
		System.out.println(service.readAll());
	}
}
