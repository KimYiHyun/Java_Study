package loopexample;

public class BreakExample {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 1;
		
		while(true) {
			sum += num;
			if(sum > 100)
				break;
			num++;  //14까지 더했을 때 105
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
