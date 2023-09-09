package bookmall.dao.test;

import java.util.List;

import bookmall.dao.BookDao;
import bookmall.vo.BookVo;


public class BookDaoTest {
	public static void main(String[] args) {
		BookVo vo = new BookVo();
		vo.setTitle("리눅스어려워");
		vo.setPrice(20000);
		vo.setCategoryNo(3L);
		
		testInsert(vo);
		testFindAll();
	}


	private static void testInsert(BookVo vo) {
		new BookDao().insert(vo);
		
	}
	
	
	private static void testFindAll() {
		List<BookVo> list = new BookDao().findAll();
		for (BookVo vo : list) {
			System.out.println(vo);
		}
		
	}
}
