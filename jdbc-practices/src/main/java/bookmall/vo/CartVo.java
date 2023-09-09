package bookmall.vo;

public class CartVo {
	private Long no;
	private int quantity;
	private Long memberNo;
	private Long bookNo;
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Long getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(Long memberNo) {
		this.memberNo = memberNo;
	}
	public Long getBookNo() {
		return bookNo;
	}
	public void setBookNo(Long bookNo) {
		this.bookNo = bookNo;
	}
	
	@Override
	public String toString() {
		return "CartVo [no=" + no + ", quantity=" + quantity + ", memberNo=" + memberNo + ", bookNo=" + bookNo + "]";
	}

	
}
