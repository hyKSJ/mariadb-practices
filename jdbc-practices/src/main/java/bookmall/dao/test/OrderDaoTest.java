package bookmall.dao.test;

import java.util.List;

import bookmall.dao.OrderDao;
import bookmall.vo.OrderVo;

public class OrderDaoTest {
	public static void main(String[] args) {
		OrderVo vo = new OrderVo();
		vo.setOrderNo("00000123");
		vo.setPrice(20000);
		vo.setAddress("서울시 강남구");
		vo.setMemberNo(1L);

		testInsert(vo);
		testFindAll();
	}

	private static void testInsert(OrderVo vo) {
		new OrderDao().insert(vo);

	}

	private static void testFindAll() {
		List<OrderVo> list = new OrderDao().findAll();
		for (OrderVo vo : list) {
			System.out.println(vo);
		}

	}
}
