package bookmall.dao.test;

import java.util.List;

import bookmall.dao.MemberDao;
import bookmall.vo.MemberVo;

public class MemberDaoTest {
	public static void main(String[] args) {
		MemberVo vo = new MemberVo();
		vo.setName("뉴상준");
		vo.setPhone("010-7135-7020");
		vo.setEmail("tkdwns9494@gmail.com");
		vo.setPassword("1234");
		
		testInsert(vo);
		testFindAll();
	}


	private static void testInsert(MemberVo vo) {
		new MemberDao().insert(vo);
		
	}
	
	
	private static void testFindAll() {
		List<MemberVo> list = new MemberDao().findAll();	
		for (MemberVo vo : list) {
			System.out.println(vo);
		}
		
	}

}