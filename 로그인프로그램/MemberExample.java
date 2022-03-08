import java.util.Scanner;


public class MemberExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String id, password;
		
		//2-1
		Member user1 = new Member(null);
		System.out.print("user1의 이름을 입력하시오: ");
		user1.name = sc.next();
		
		System.out.println("\t");
		
		Member user2 = new Member(null, null);
		System.out.print("user2의 이름을 입력하시오: ");
		user2.name = sc.next();
		System.out.print("user2의 id를 입력하시오: ");
		user2.id = sc.next();
		
		System.out.println("\t");
		
		Member user3 = new Member(null, null, null);
		System.out.print("user3의 이름을 입력하시오: ");
		user3.name = sc.next();
		System.out.print("user3의 id를 입력하시오: ");
		user3.id = sc.next();
		System.out.print("user3의 password를 입력하시오: ");
		user3.password = sc.next();
		
		System.out.println("\t");
		
		Member user4 = new Member(null, null, null, 0);
		System.out.print("user4의 이름을 입력하시오: ");
		user4.name = sc.next();
		System.out.print("user4의 id를 입력하시오: ");
		user4.id = sc.next();
		System.out.print("user4의 password를 입력하시오: ");
		user4.password = sc.next();
		System.out.print("user4의 나이를 입력하시오: ");
		user4.age = sc.nextInt();
		
		System.out.println("\t");
		System.out.println("\t");
		
		
		//2-2	
		System.out.println("<user1의 정보>");
		user1.displayMember(); 
		System.out.println("\t");
		
		System.out.println("<user2의 정보>");
		user2.displayMember();
		System.out.println("\t");
		
		System.out.println("<user3의 정보>");
		user3.displayMember();
		System.out.println("\t");
		
		System.out.println("<user4의 정보>");
		user4.displayMember();
		System.out.println("\t");
		System.out.println("\t");
		
		//부족한 필드 값 추가 입력
		System.out.println("부족한 정보를 입력하시오>");
		System.out.print("user1의 id를 입력하시오: ");
		user1.id = sc.next();
		System.out.print("user1의 password를 입력하시오: ");
		user1.password = sc.next();
		System.out.print("user1의 나이를 입력하시오: ");
		user1.age = sc.nextInt();
		System.out.println("\t");
		
		System.out.print("user2의 password를 입력하시오: ");
		user2.password = sc.next();
		System.out.print("user2의 나이를 입력하시오 : ");
		user2.age = sc.nextInt();
		System.out.println("\t");
		
		System.out.print("user3의 나이를 입력하시오: ");
		user3.age = sc.nextInt();
		System.out.println("\t");
		
		//부족한 필드 값 입력 후 단순 출력
		System.out.println("<user1의 정보>");
		user1.displayMember(); 
		System.out.println("\t");
		
		System.out.println("<user2의 정보>");
		user2.displayMember();
		System.out.println("\t");
		
		System.out.println("<user3의 정보>");
		user3.displayMember();
		System.out.println("\t");
		
		System.out.println("<user4의 정보>");
		user4.displayMember();
		System.out.println("\t");
		System.out.println("\t");
				
		
		//2-3.login
		System.out.println("login>");
		System.out.print("로그인 할 아이디를 입력하시오: ");
		id = sc.next();
		System.out.print("로그인 할 비밀번호를 입력하시오: ");
		password = sc.next();
		Boolean result = false;
		
		//user1 객체에 대한 login()메소드 호출
		result = user1.login(id,  password); 
		if(result) {
			System.out.println(id + "님, 로그인 성공하였습니다.");
		}
		else
			System.out.println(id + "님, 로그인 실패하였습니다.");
		
		//user2 객체에 대한 login()메소드 호출
		result = user2.login(id,  password); 
		if(result) {
			System.out.println(id + "님, 로그인 성공하였습니다.");
		}
		else
			System.out.println(id + "님, 로그인 실패하였습니다.");
		
		//user3 객체에 대한 login()메소드 호출
		result = user3.login(id,  password); 
		if(result) {
			System.out.println(id + "님, 로그인 성공하였습니다.");
		}
		else
			System.out.println(id + "님, 로그인 실패하였습니다.");
		
		//user4 객체에 대한 login()메소드 호출
		result = user4.login(id,  password); 
		if(result) {
			System.out.println(id + "님, 로그인 성공하였습니다.");
		}
		else
			System.out.println(id + "님, 로그인 실패하였습니다.");

		
	}

}
