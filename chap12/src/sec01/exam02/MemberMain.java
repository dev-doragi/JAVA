package sec01.exam02;

public class MemberMain {

	public static void main(String[] args) {

		MemberList memberList = new MemberList();
		
		Member m1 = new Member(1001, "�����");
		Member m2 = new Member(1002, "�̰���");
		Member m3 = new Member(1003, "����ȣ");
		Member m4 = new Member(1004, "������");
		
		memberList.addMember(m1);
		memberList.addMember(m2);
		memberList.addMember(m3);
		memberList.addMember(m4);

		memberList.findAll();
		
		// ������ id ��������
		int delID = m3.getMemberID();
		System.out.println("������ ID: " + delID);
		
		memberList.removeMember(delID);
		memberList.findAll();
	}

}
