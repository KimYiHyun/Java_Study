package loopexample;

public class Gugudan {

	public static void main(String[] args) {
		
		/*int dan;
		int times;
		
		for(dan =2; dan <=9; dan++) {
			for(times = 1; times<=9; times++) {
				System.out.println(dan + " x " + times + " = " + dan*times);
			}
			System.out.println();
		} */
		
		int dan = 2;
		int times = 1;
		
		while (dan <= 9) {
			times = 1; //초기화하지않으면 2단만 나옴
			if(dan%2 != 0){ 
				dan++;  //꼭 넣어줘야함
				continue;
			}
			while (times <=9) {				
				System.out.println(dan + " x " + times + " = " + dan*times);
				times++;
			}
			dan++;
			System.out.println();
		}
		
		
	}

}
