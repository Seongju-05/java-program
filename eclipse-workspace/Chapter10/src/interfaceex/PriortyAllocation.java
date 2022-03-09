package scheduler;

public class PriortyAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("고객의 등급이 높은 고객의 전화를 먼저 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 스킬이 가장 높은 상담원의 대기열 앞에 우선 배치합니다.");
	}

}
