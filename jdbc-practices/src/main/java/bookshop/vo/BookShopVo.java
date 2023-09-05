package bookshop.vo;

public class BookShopVo {
	private int no;
	private String title;
	private String rent;
	private String name;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRent() {
		return rent;
	}
	public void setRent(String rent) {
		this.rent = rent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "BookShopVo [no=" + no + ", title=" + title + ", rent=" + rent + ", name=" + name + "]";
	}
	
	
}
