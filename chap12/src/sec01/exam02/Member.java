package sec01.exam02;

public class Member {
	private int memberID;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberID = memberId;
		this.memberName = memberName;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberId) {
		this.memberID = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	} 
	
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberID + "입니다.";
	}

}
