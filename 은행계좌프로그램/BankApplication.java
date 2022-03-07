import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("=====================================================================");
			System.out.println(" 1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.개별계좌 조회 | 6.종료");
			System.out.println("=====================================================================");
			System.out.print("선택> ");
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
		System.out.println("프로그램 종료");
	}

	//계좌생성하기
	private static void createAccount() {
		System.out.println("-----------");
		System.out.println(" 1.계좌생성");
		System.out.println("-----------");
		
		System.out.print("계좌번호를 입력하시오> ");
		String ano = sc.next();
		
		System.out.print("계좌주를 입력하시오> ");
		String owner = sc.next();
		
		System.out.print("금액을 입력하시오> ");
		int balance = sc.nextInt();
				
		Account account = new Account(ano, owner, balance);
		
		int i = 0;
		while (i<accountArray.length) {
			i++;
			if(accountArray[i] == null) { //배열값이 비어있으면 생성
				accountArray[i] = account;
				System.out.println("계좌 생성!");
				break;
			}
		}	
				
		System.out.println("\n");
		
	}
	
	//계좌목록보기
	private static void accountList() {
		
		System.out.println("-----------");
		System.out.println(" 2.계좌목록");
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

	//예금하기
	private static void deposit() {
		
		System.out.println("-----------");
		System.out.println(" 3. 예금");
		System.out.println("-----------");
		System.out.print("계좌 번호를 입력하시오> ");
		String ano = sc.next();
		Account account = findAccount(ano);
		
		System.out.print("예금액을 입력하시오> ");
		int money = sc.nextInt();
		
		if(account == null) {
			System.out.println("생성된 계좌가 없습니다.");
			return;
		}

		if(account.getAno().equals(ano)) {
			account.setBalance(account.getBalance() + money);
			System.out.println("입금 성공!");
		}
		System.out.println("\n");
		
	}
	
	//출금하기
	private static void withdraw() {
		
		System.out.println("-----------");
		System.out.println(" 4. 출금");
		System.out.println("-----------");
		System.out.print("계좌 번호를 입력하시오> ");
		String ano = sc.next();
		Account account = findAccount(ano);
		
		System.out.print("출금액을 입력하시오> ");
		int money = sc.nextInt();
		
		if(account == null) {
			System.out.println("생성된 계좌가 없습니다.");
		}
		else if(account.getBalance()<money) {
			System.out.println("경고! 출금액이 예금액보다 많습니다.");
		}
		else {
			account.setBalance(account.getBalance() - money);
			System.out.println("출금 성공!");
		}
		
		System.out.println("\n");
		
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
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
	
	//개별계좌정보 조회
	private static void search() {
		System.out.print("조회할 계좌를 입력하시오> ");
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
