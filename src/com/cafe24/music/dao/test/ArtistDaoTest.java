package com.cafe24.music.dao.test;

import java.util.ArrayList;
import java.util.List;

import com.cafe24.music.dao.ArtistDao;
import com.cafe24.music.vo.ArtistVo;

public class ArtistDaoTest {

	public static void main(String[] args) {
		ArtistVo vo = new ArtistVo("g-dragon");
		//insertTest(vo);
		getListTest();
		
	}//main
	
	public static void insertTest(ArtistVo vo) {
		ArtistDao dao = new ArtistDao();
		
		dao.insert(vo);
	}//insertTest
	
	public static void getListTest() {
		List<ArtistVo> list = new ArrayList<>();
		ArtistDao dao = new ArtistDao();
		list = dao.getList();
		for(ArtistVo vo : list) {
			System.out.println(list);
		}
	}

}
