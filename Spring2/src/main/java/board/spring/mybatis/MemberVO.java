package board.spring.mybatis;

public class MemberVO {

	String id;
	String password;
	String name;
	String phone;
	String email;
	String indate; 
	

	// 기본생성자 자동정의 ( 사용자 생성자 정의시 자동 삭제)
	public MemberVO(){} //다른 패키지에서도 사용가능하도록 public 왜? test패키지에서도 써야하니까
	
	//생성자
	public MemberVO(String id, String password, String name, String phone, String email) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public String getIndate() {
		return indate;
	}
	
	public void setIndate(String indate) {
		this.indate = indate;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	//toString() 메소드 오버라이딩
	@Override
	public String toString() {
		
		return id+":"+ password+":"+ name+ ":" +phone+ ":" + email+ ":" +indate;
	}
	
	
	
	
}
