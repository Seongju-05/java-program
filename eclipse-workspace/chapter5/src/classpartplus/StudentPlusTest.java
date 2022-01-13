package classpartplus;

public class StudentPlusTest {

public static void main(String[] args) {
		
		StudentPlus studentLee = new StudentPlus();
		studentLee.studentName = "이순신";
		studentLee.address = "서울시 서울";
		studentLee.studentID = 100;
		
		StudentPlus studentKim = new StudentPlus();
		studentKim.studentName = "김장군";
		studentKim.address = "부산시 부산";
		studentKim.studentID = 101;
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}
}
