package bookshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bookshop.vo.BookShopVo;

public class BookShopDao {
	public void updateRent(BookShopVo vo) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 1. JDBC Driver Class 로딩
			Class.forName("org.mariadb.jdbc.Driver");

			// 2. 연결하기
			String url = "jdbc:mariadb://192.168.0.177:3307/webdb?charset=utf8";
			conn = DriverManager.getConnection(url, "webdb", "webdb");

			// 3. SQL 준비
			String sql = "update book" + "  set rent = 'Y'" + " where no = ?";
			pstmt = conn.prepareStatement(sql);

			// 4. binding
			pstmt.setInt(1, vo.getNo());

			// 5. SQL 실행
			rs = pstmt.executeQuery();

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패:" + e);
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				// 6. 자원정리
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public List<BookShopVo> findAll() {
		List<BookShopVo> result = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 1. JDBC Driver Class 로딩
			Class.forName("org.mariadb.jdbc.Driver");

			// 2. 연결하기
			String url = "jdbc:mariadb://192.168.0.177:3307/webdb?charset=utf8";
			conn = DriverManager.getConnection(url, "webdb", "webdb");
			// 3. SQL 준비
			String sql = "select *" + "  from book a, author b" + " where a.author_no = b.no";
			pstmt = conn.prepareStatement(sql);

			// 4. binding
//			pstmt.setInt(1, vo.getNo());

			// 5. SQL 실행
			rs = pstmt.executeQuery();

			// 6. 결과 처리
			while (rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String rent = rs.getString(3);
				String name = rs.getString(4);
				
				BookShopVo vo = new BookShopVo();
				vo.setNo(no);
				vo.setTitle(title);
				vo.setRent(rent);
				vo.setName(name);

				result.add(vo);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패:" + e);
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				// 6. 자원정리
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}
}
