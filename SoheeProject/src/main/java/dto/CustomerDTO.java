package main.java.dto;

public class CustomerDTO {
	private String userName;		//사용자 이름
	private String email;			//사용자 이메일
	private String phoneNumber;		//사용자 전화번호
	private String address;			//사용자 주소
	private String z_code;			//사용자 우편번호
	private String userID;			//사용자 아이디
	private String userPassword;	//사용자 비밀번호
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZ_code() {
		return z_code;
	}
	public void setZ_code(String z_code) {
		this.z_code = z_code;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}
