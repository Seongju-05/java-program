package arraylist;

import java.util.ArrayList;

public class Student {

	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
	
		int total = 0;
		for (Subject subject : subjectList) {
			total += subject.getScorePoint();
			
			System.out.println("�л� " + studentName + "���� " + subject.getName() + " ������ ������ "
					+ subject.getScorePoint() + "�� �Դϴ�.");
		}
		System.out.println("�л� " + studentName + "���� ������ " + total + "�� �Դϴ�.");
	}
	
}
