package sec02.exam05;

public class Account {
	private long balance;
	
	public Account() { }

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}
	
	/* JVM�� ���α׷� ���� �� ���ܰ� �߻��ϸ� �ش� ���� Ŭ������ ���� ��ü�� ����
	 * �׷��� ����� ���� ���ܴ� �����ڰ� ���� ���ܸ� �������Ѿ� ��
	 * ���� �ܰ� �����ϸ� OutOfBalanceException���ܰ� �߻���Ŵ */
	
	public void withdraw(int money) throws OutOfBalanceException {
		System.out.println("���ݾ�: " + getBalance() + ", ��� ��û��: " + money);
		
		if (balance < money) {
			throw new OutOfBalanceException("�ܰ����(���ܹ߻�): " + (money - balance) + "���� �����մϴ�.");
		}
		
		balance -= money;
	}
	

}
