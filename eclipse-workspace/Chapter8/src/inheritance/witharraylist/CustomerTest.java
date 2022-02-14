package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010,"�̼���");
		Customer customerShin = new Customer(10011,"�Ż��Ӵ�");
		Customer customerKim = new GoldCustomer(10012,"������");
		Customer customerHong = new GoldCustomer(10013,"ȫ�浿");
		Customer customerPark = new VIPCustomer(10014,"�����ż�", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerKim);
		customerList.add(customerHong);
		customerList.add(customerPark);
		
		System.out.println("========= ������ ���=========");
		
	for(Customer customer : customerList) {
		System.out.println(customer.showCustomerInfo());
	}
	
	System.out.println("========= �����������ʽ� ����Ʈ ��� =========");
	
	int price = 10000;
	for(Customer customer : customerList) {
		
		int cost = customer.calcPrice(price);
		
		System.out.println(customer.getCustomerName() + "���� " + cost + "�� �����ϼ̽��ϴ�.");
		System.out.println(customer.showCustomerInfo());
	}
	
	}
}
