package scheduler;

public class PriortyAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("���� ����� ���� ���� ��ȭ�� ���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ��ų�� ���� ���� ������ ��⿭ �տ� �켱 ��ġ�մϴ�.");
	}

}
