import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("=====================================================================");
			System.out.println(" 1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.�������� ��ȸ | 6.����");
			System.out.println("=====================================================================");
			System.out.print("����> ");
			int select = sc.nextInt();
			
			if (select == 1) { 
				createAccount();
			}
			else if (select == 2) { 
				accountList();
			}
			else if (select == 3) { 
				deposit();
			}
			else if (select == 4) { 
				withdraw();
			}
			else if (select == 5) {
				search();
			}
			else if (select == 6) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

	//���»����ϱ�
	private static void createAccount() {
		System.out.println("-----------");
		System.out.println(" 1.���»���");
		System.out.println("-----------");
		
		System.out.print("���¹�ȣ�� �Է��Ͻÿ�> ");
		String ano = sc.next();
		
		System.out.print("�����ָ� �Է��Ͻÿ�> ");
		String owner = sc.next();
		
		System.out.print("�ݾ��� �Է��Ͻÿ�> ");
		int balance = sc.nextInt();
				
		Account account = new Account(ano, owner, balance);
		
		int i = 0;
		while (i<accountArray.length) {
			i++;
			if(accountArray[i] == null) { //�迭���� ��������� ����
				accountArray[i] = account;
				System.out.println("���� ����!");
				break;
			}
		}	
				
		System.out.println("\n");
		
	}
	
	//���¸�Ϻ���
	private static void accountList() {
		
		System.out.println("-----------");
		System.out.println(" 2.���¸��");
		System.out.println("-----------");
		
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i];
			if(account != null) {
				String an = account.getAno();
				String ow = account.getOwner();
				int ba = account.getBalance();
				System.out.println(an + "  " + ow + "  " + ba);
			}
		}
		System.out.println("\n");
	}

	//�����ϱ�
	private static void deposit() {
		
		System.out.println("-----------");
		System.out.println(" 3. ����");
		System.out.println("-----------");
		System.out.print("���� ��ȣ�� �Է��Ͻÿ�> ");
		String ano = sc.next();
		Account account = findAccount(ano);
		
		System.out.print("���ݾ��� �Է��Ͻÿ�> ");
		int money = sc.nextInt();
		
		if(account == null) {
			System.out.println("������ ���°� �����ϴ�.");
			return;
		}

		if(account.getAno().equals(ano)) {
			account.setBalance(account.getBalance() + money);
			System.out.println("�Ա� ����!");
		}
		System.out.println("\n");
		
	}
	
	//����ϱ�
	private static void withdraw() {
		
		System.out.println("-----------");
		System.out.println(" 4. ���");
		System.out.println("-----------");
		System.out.print("���� ��ȣ�� �Է��Ͻÿ�> ");
		String ano = sc.next();
		Account account = findAccount(ano);
		
		System.out.print("��ݾ��� �Է��Ͻÿ�> ");
		int money = sc.nextInt();
		
		if(account == null) {
			System.out.println("������ ���°� �����ϴ�.");
		}
		else if(account.getBalance()<money) {
			System.out.println("���! ��ݾ��� ���ݾ׺��� �����ϴ�.");
		}
		else {
			account.setBalance(account.getBalance() - money);
			System.out.println("��� ����!");
		}
		
		System.out.println("\n");
		
	}
	
	//Account �迭���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String sAno = accountArray[i].getAno();
					if(sAno.equals(ano)) {
						account = accountArray[i];
						break;
					}
				}
		}
		return account;
	}
	
	//������������ ��ȸ
	private static void search() {
		System.out.print("��ȸ�� ���¸� �Է��Ͻÿ�> ");
		String ano = sc.next();
		Account account = findAccount(ano);
		
		if(ano.equals(account.getAno())) {
			String an = account.getAno();
			String ow = account.getOwner();
			int ba = account.getBalance();
			System.out.println(an + "  " + ow + "  " + ba);
			System.out.println("\n");
		}
	
	}
}
