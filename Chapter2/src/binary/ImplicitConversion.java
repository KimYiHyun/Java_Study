package binary;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10;  //1
		int num = bNum; //4
		
		System.out.println(num);
		
		long lNum = 10;
		float fNum = lNum;  //8바이트를 4바이트에 저장.
		
		System.out.println(fNum);
		
		double dNum = fNum + num;  //dNum이 double로 형변환됨
		System.out.println(dNum);
	}

}
