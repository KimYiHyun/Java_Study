package classpart;

public class Student {  //학생 클래스
	
	int studentID;             //학번
	String studentName;        //학생 이름
	int grade;                 //학년
	String address;            //사는 곳

	public Student() {}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	
	public void showStudentInfor() {    
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	
	
}

