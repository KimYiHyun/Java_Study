package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "이순신");
		studentLee.address = "서울시 영등포구 여의도동";
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "경기도 남양주시 별내동";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
