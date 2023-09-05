package bookshop.main;

import java.util.List;
import java.util.Scanner;

import bookshop.dao.BookShopDao;
import bookshop.vo.BookShopVo;
import hr.dao.vo.EmployeesVo;

public class BookShop {
	public static void main(String[] args) {
		displayBookInfo();

		Scanner scanner = new Scanner(System.in);
		System.out.print("대여 하고 싶은 책의 번호를 입력하세요:");
		int no = scanner.nextInt();
		scanner.close();

		BookShopVo vo = new BookShopVo();
		vo.setNo(no);

		new BookShopDao().updateRent(vo);

		displayBookInfo();
	}

	private static void displayBookInfo() {
		System.out.println("*****도서 정보 출력하기******");
		List<BookShopVo> list = new BookShopDao().findAll();

		for (BookShopVo vo : list) {
			System.out.println(vo.getNo() + ":" + vo.getTitle() + ":" + vo.getRent() + ":" + vo.getName());
		}
	}
}