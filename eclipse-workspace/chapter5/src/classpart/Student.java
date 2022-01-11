package classpart;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfor() {
		System.out.println(studentName + "," + address);
	}
	
	/* public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "대구시 달서구 옥포";
		
		studentLee.showStudentInfo();
	}
	*/
}
