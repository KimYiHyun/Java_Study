package assignment;

public class OperationEx2 {

	public static void main(String[] args) {
		
		int num = 10;
		System.out.println(++num); //문장이 끝나기전에 증가 시켜라
		System.out.println(num); 
		
		num = 10;
		System.out.println(num++); //문장이 끝나기전에 더하지말고 끝난 다음에 더해라.
		System.out.println(num); 
		
		
		System.out.println(3>5); //false
		System.out.println(3<5); //true
		
		int num1 = 10;
		int num2 = 5;
		boolean flag = (num1 > num2);
		System.out.println(flag); 
		
	}

}
