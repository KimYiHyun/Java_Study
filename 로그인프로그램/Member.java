public class Member {
	
	//필드
	String name;
	String id;
	String password;
	int age;
	
	//생성자
	Member(String name) {
		this.name = name;
	}
	
	Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	Member(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	} 
	
	Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	
	//메소드
	void displayMember() {  
		System.out.println(name);
		System.out.println(id);
		System.out.println(password);
		System.out.println(age);
	}
	
	//login메소드
	boolean login(String id, String password) {
		if ((id.equals(this.id)) && (password.equals(this.password))) {
			return true;
		}
		else {
			return false;
		}
		
	}
}