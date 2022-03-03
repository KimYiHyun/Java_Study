package assignment;

public class OperationEx3 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = (((num1 = num1 + 10) < 10) && ((i=i+2) > 10) );
		System.out.println(value); //앞 항이 거짓이므로 i가 연산되지 않고, num1만 계산됨.
		System.out.println(num1); 
		System.out.println(i); 
	}

}
