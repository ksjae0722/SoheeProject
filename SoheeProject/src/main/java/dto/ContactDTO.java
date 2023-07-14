package main.java.dto;

public class ContactDTO {
	private String name;		//문의자 이름
	private String email;		//문의자 이메일
	private String category;	//문의 카테고리
	private String query;		//문의내용
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}	
}
