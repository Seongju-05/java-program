package ifexample;

public class SwitchCase {

	public static void main(String[] args) {

		int rank = 1;
		char medalColor;
		
		switch(rank) {
		case 1: medalColor = 'G';
				break;
		case 2: medalColor = 'S';
				break;
		case 3: medalColor = 'B';
				break;
		default: medalColor = 'A';
		}
		System.out.println(rank + "�� �Ŵ��� ������ " + medalColor + "�Դϴ�.");
	}

}
