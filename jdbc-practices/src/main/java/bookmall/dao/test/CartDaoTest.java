package bookmall.dao.test;

import java.util.List;

import bookmall.dao.CartDao;
import bookmall.vo.CartVo;


public class CartDaoTest {
	public static void main(String[] args) {
		CartVo vo = new CartVo();
		vo.setQuantity(10);
		vo.setMemberNo(1L);
		vo.setBookNo(6L);

		testInsert(vo);
		testFindAll();
	}

	private static void testInsert(CartVo vo) {
		new CartDao().insert(vo);

	}

	private static void testFindAll() {
		List<CartVo> list = new CartDao().findAll();
		for (CartVo vo : list) {
			System.out.println(vo);
		}

	}
}
