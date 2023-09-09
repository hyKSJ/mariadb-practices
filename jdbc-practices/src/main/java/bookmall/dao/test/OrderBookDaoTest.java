package bookmall.dao.test;

import java.util.List;

import bookmall.dao.OrderBookDao;
import bookmall.vo.OrderBookVo;


public class OrderBookDaoTest {
	public static void main(String[] args) {
		OrderBookVo vo = new OrderBookVo();
		vo.setQuantity(1);
		vo.setOrderNo(2L);
		vo.setBookNo(4L);
		
		testInsert(vo);
		testFindAll();
	}


	private static void testInsert(OrderBookVo vo) {
		new OrderBookDao().insert(vo);
		
	}
	
	
	private static void testFindAll() {
		List<OrderBookVo> list = new OrderBookDao().findAll();
		for (OrderBookVo vo : list) {
			System.out.println(vo);
		}
		
	}
}
