package test;

public class FirstD extends Dormitory implements ForWho {
	@Override
	public void Info() {
		System.out.println("����� 1����� �����Դϴ�.");
		System.out.println("ȣ�� ��ȣ: " + getNumber());
		System.out.println("����: " + getSex());
	}
	
	@Override
	public void setPlace(String sex) {
		if ( sex == "����" || sex == "����") {
			System.out.println("���� ������ ���� ������ �̿��ϼ���.");
		}
		else if ( sex == "����" || sex == "����") {
			System.out.println("���� ������ ������ ������ �̿��ϼ���.");
		}
		else {
			System.out.println("������ �߸� �ԷµǾ����ϴ�. ���α׷��� �ٽ� �����ϼ���.");
		}
	}
	
	@Override
	public void isFor() {
		System.out.println("������ ���� ������Դϴ�.");
	}
}
