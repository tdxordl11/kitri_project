package board.spring.mybatis;

public class MemberVO {

	String id;
	String password;
	String name;
	String phone;
	String email;
	String indate; 
	

	// �⺻������ �ڵ����� ( ����� ������ ���ǽ� �ڵ� ����)
	public MemberVO(){} //�ٸ� ��Ű�������� ��밡���ϵ��� public ��? test��Ű�������� ����ϴϱ�
	
	//������
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

	//toString() �޼ҵ� �������̵�
	@Override
	public String toString() {
		
		return id+":"+ password+":"+ name+ ":" +phone+ ":" + email+ ":" +indate;
	}
	
	
	
	
}
