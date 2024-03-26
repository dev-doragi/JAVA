package sec01.exam02;

public class MemberMain {

	public static void main(String[] args) {

		MemberList memberList = new MemberList();
		
		Member m1 = new Member(1001, "손흥민");
		Member m2 = new Member(1002, "이강인");
		Member m3 = new Member(1003, "봉준호");
		Member m4 = new Member(1004, "아이유");
		
		memberList.addMember(m1);
		memberList.addMember(m2);
		memberList.addMember(m3);
		memberList.addMember(m4);

		memberList.findAll();
		
		// 삭제할 id 가져오기
		int delID = m3.getMemberID();
		System.out.println("삭제할 ID: " + delID);
		
		memberList.removeMember(delID);
		memberList.findAll();
	}

}
