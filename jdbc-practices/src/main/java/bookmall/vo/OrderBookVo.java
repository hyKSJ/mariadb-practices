package bookmall.vo;

public class OrderBookVo {
	private Long no;
	private int quantity;
	private Long orderNo;
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
	public Long getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}
	public Long getBookNo() {
		return bookNo;
	}
	public void setBookNo(Long bookNo) {
		this.bookNo = bookNo;
	}
	
	@Override
	public String toString() {
		return "OrderBookVo [no=" + no + ", quantity=" + quantity + ", orderNo=" + orderNo + ", bookNo=" + bookNo + "]";
	}
	
	
}
