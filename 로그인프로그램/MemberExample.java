import java.util.Scanner;


public class MemberExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String id, password;
		
		//2-1
		Member user1 = new Member(null);
		System.out.print("user1�� �̸��� �Է��Ͻÿ�: ");
		user1.name = sc.next();
		
		System.out.println("\t");
		
		Member user2 = new Member(null, null);
		System.out.print("user2�� �̸��� �Է��Ͻÿ�: ");
		user2.name = sc.next();
		System.out.print("user2�� id�� �Է��Ͻÿ�: ");
		user2.id = sc.next();
		
		System.out.println("\t");
		
		Member user3 = new Member(null, null, null);
		System.out.print("user3�� �̸��� �Է��Ͻÿ�: ");
		user3.name = sc.next();
		System.out.print("user3�� id�� �Է��Ͻÿ�: ");
		user3.id = sc.next();
		System.out.print("user3�� password�� �Է��Ͻÿ�: ");
		user3.password = sc.next();
		
		System.out.println("\t");
		
		Member user4 = new Member(null, null, null, 0);
		System.out.print("user4�� �̸��� �Է��Ͻÿ�: ");
		user4.name = sc.next();
		System.out.print("user4�� id�� �Է��Ͻÿ�: ");
		user4.id = sc.next();
		System.out.print("user4�� password�� �Է��Ͻÿ�: ");
		user4.password = sc.next();
		System.out.print("user4�� ���̸� �Է��Ͻÿ�: ");
		user4.age = sc.nextInt();
		
		System.out.println("\t");
		System.out.println("\t");
		
		
		//2-2	
		System.out.println("<user1�� ����>");
		user1.displayMember(); 
		System.out.println("\t");
		
		System.out.println("<user2�� ����>");
		user2.displayMember();
		System.out.println("\t");
		
		System.out.println("<user3�� ����>");
		user3.displayMember();
		System.out.println("\t");
		
		System.out.println("<user4�� ����>");
		user4.displayMember();
		System.out.println("\t");
		System.out.println("\t");
		
		//������ �ʵ� �� �߰� �Է�
		System.out.println("������ ������ �Է��Ͻÿ�>");
		System.out.print("user1�� id�� �Է��Ͻÿ�: ");
		user1.id = sc.next();
		System.out.print("user1�� password�� �Է��Ͻÿ�: ");
		user1.password = sc.next();
		System.out.print("user1�� ���̸� �Է��Ͻÿ�: ");
		user1.age = sc.nextInt();
		System.out.println("\t");
		
		System.out.print("user2�� password�� �Է��Ͻÿ�: ");
		user2.password = sc.next();
		System.out.print("user2�� ���̸� �Է��Ͻÿ� : ");
		user2.age = sc.nextInt();
		System.out.println("\t");
		
		System.out.print("user3�� ���̸� �Է��Ͻÿ�: ");
		user3.age = sc.nextInt();
		System.out.println("\t");
		
		//������ �ʵ� �� �Է� �� �ܼ� ���
		System.out.println("<user1�� ����>");
		user1.displayMember(); 
		System.out.println("\t");
		
		System.out.println("<user2�� ����>");
		user2.displayMember();
		System.out.println("\t");
		
		System.out.println("<user3�� ����>");
		user3.displayMember();
		System.out.println("\t");
		
		System.out.println("<user4�� ����>");
		user4.displayMember();
		System.out.println("\t");
		System.out.println("\t");
				
		
		//2-3.login
		System.out.println("login>");
		System.out.print("�α��� �� ���̵� �Է��Ͻÿ�: ");
		id = sc.next();
		System.out.print("�α��� �� ��й�ȣ�� �Է��Ͻÿ�: ");
		password = sc.next();
		Boolean result = false;
		
		//user1 ��ü�� ���� login()�޼ҵ� ȣ��
		result = user1.login(id,  password); 
		if(result) {
			System.out.println(id + "��, �α��� �����Ͽ����ϴ�.");
		}
		else
			System.out.println(id + "��, �α��� �����Ͽ����ϴ�.");
		
		//user2 ��ü�� ���� login()�޼ҵ� ȣ��
		result = user2.login(id,  password); 
		if(result) {
			System.out.println(id + "��, �α��� �����Ͽ����ϴ�.");
		}
		else
			System.out.println(id + "��, �α��� �����Ͽ����ϴ�.");
		
		//user3 ��ü�� ���� login()�޼ҵ� ȣ��
		result = user3.login(id,  password); 
		if(result) {
			System.out.println(id + "��, �α��� �����Ͽ����ϴ�.");
		}
		else
			System.out.println(id + "��, �α��� �����Ͽ����ϴ�.");
		
		//user4 ��ü�� ���� login()�޼ҵ� ȣ��
		result = user4.login(id,  password); 
		if(result) {
			System.out.println(id + "��, �α��� �����Ͽ����ϴ�.");
		}
		else
			System.out.println(id + "��, �α��� �����Ͽ����ϴ�.");

		
	}

}
