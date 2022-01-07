package ifexample;

public class SwitchCase2 {

	public static void main(String[] args) {
		
		int month = 10;
		int day;
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 9: case 11:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4: case 6: case 8: case 10:
			day = 30;
			break;
			
			default:
				day = 0;
			break;

		}
		System.out.println(month + "월의 날짜는 " + day + "일까지 입니다.");
	}

}
