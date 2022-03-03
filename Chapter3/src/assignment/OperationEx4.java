package assignment;

public class OperationEx4 {

	public static void main(String[] args) {
		int num1 = 10;
		System.out.println(num1 += 1);
		System.out.println(num1 %= 10); 
		num1 -= 1;  // num1 = num1 - 1
		System.out.println(num1); 
		
		
		int num = (5 < 3) ? 10 : 20;  //숫자가 아니라 문장이 올 수 도 있음.
		System.out.println(num); 
	}

}
