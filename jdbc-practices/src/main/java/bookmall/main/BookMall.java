package bookmall.main;

import java.util.List;

import bookmall.dao.BookDao;
import bookmall.dao.CartDao;
import bookmall.dao.CategoryDao;
import bookmall.dao.MemberDao;
import bookmall.dao.OrderBookDao;
import bookmall.dao.OrderDao;
import bookmall.vo.BookVo;
import bookmall.vo.CartVo;
import bookmall.vo.CategoryVo;
import bookmall.vo.MemberVo;
import bookmall.vo.OrderBookVo;
import bookmall.vo.OrderVo;

public class BookMall {

	public static void main(String[] args) {

		System.out.println("## 회원리스트");

		MemberVo memberVo1 = new MemberVo();
		MemberVo memberVo2 = new MemberVo();
		MemberDao memberDao = new MemberDao();

		memberVo1.setName("김상준");
		memberVo1.setPhone("010-7135-7020");
		memberVo1.setEmail("tkdwns9494@gmail.com");
		memberVo1.setPassword("1234");
		memberVo2.setName("류백");
		memberVo2.setPhone("010-1234-1234");
		memberVo2.setEmail("backrye@gmail.com");
		memberVo2.setPassword("0000");
		memberDao.insert(memberVo1);
		memberDao.insert(memberVo2);

		List<MemberVo> memberlist = memberDao.findAll();

		for (MemberVo vo : memberlist) {
			System.out.println(vo);
		}

		System.out.println("## 카테고리");

		CategoryVo categoryVo1 = new CategoryVo();
		CategoryVo categoryVo2 = new CategoryVo();
		CategoryVo categoryVo3 = new CategoryVo();
		CategoryDao categoryDao = new CategoryDao();

		categoryVo1.setName("요리");
		categoryVo2.setName("의학");
		categoryVo3.setName("기계");

		categoryDao.insert(categoryVo1);
		categoryDao.insert(categoryVo2);
		categoryDao.insert(categoryVo3);

		List<CategoryVo> categorylist = categoryDao.findAll();

		for (CategoryVo vo : categorylist) {
			System.out.println(vo);
		}

		System.out.println("## 상품");

		BookVo bookVo1 = new BookVo();
		BookVo bookVo2 = new BookVo();
		BookVo bookVo3 = new BookVo();
		BookDao bookDao = new BookDao();

		bookVo3.setTitle("백종원 요리법");
		bookVo3.setPrice(15000);
		bookVo3.setCategoryNo(1L);
		bookVo1.setTitle("의사란");
		bookVo1.setPrice(20000);
		bookVo1.setCategoryNo(2L);
		bookVo2.setTitle("열역학");
		bookVo2.setPrice(35000);
		bookVo2.setCategoryNo(3L);
		bookDao.insert(bookVo1);
		bookDao.insert(bookVo2);
		bookDao.insert(bookVo3);

		List<BookVo> booklist = bookDao.findAll();

		for (BookVo vo : booklist) {
			System.out.println(vo);
		}

		System.out.println("## 카트");

		CartVo cartVo1 = new CartVo();
		CartVo cartVo2 = new CartVo();
		CartDao cartDao = new CartDao();

		cartVo1.setQuantity(2);
		cartVo1.setMemberNo(2L);
		cartVo1.setBookNo(1L);
		cartVo2.setQuantity(3);
		cartVo2.setMemberNo(1L);
		cartVo2.setBookNo(3L);

		cartDao.insert(cartVo1);
		cartDao.insert(cartVo2);

		List<CartVo> cartlist = cartDao.findAll();

		for (CartVo vo : cartlist) {
			System.out.println(vo);
		}

		System.out.println("## 주문");

		OrderVo orderVo1 = new OrderVo();
		OrderDao orderDao = new OrderDao();

		orderVo1.setOrderNo("202309063215");
		orderVo1.setPrice(35000);
		orderVo1.setAddress("경주시 강변로");
		orderVo1.setMemberNo(2L);

		orderDao.insert(orderVo1);

		List<OrderVo> orderlist = orderDao.findAll();

		for (OrderVo vo : orderlist) {
			System.out.println(vo);
		}

		System.out.println("## 주문도서");

		OrderBookVo orderBookVo1 = new OrderBookVo();
		OrderBookVo orderBookVo2 = new OrderBookVo();
		OrderBookDao orderBookDao = new OrderBookDao();

		orderBookVo1.setQuantity(1);
		orderBookVo1.setOrderNo(1L);
		orderBookVo1.setBookNo(1L);

		orderBookVo2.setQuantity(1);
		orderBookVo2.setOrderNo(1L);
		orderBookVo2.setBookNo(2L);

		orderBookDao.insert(orderBookVo1);
		orderBookDao.insert(orderBookVo2);

		List<OrderBookVo> orderbooklist = orderBookDao.findAll();

		for (OrderBookVo vo : orderbooklist) {
			System.out.println(vo);
		}
	}

}