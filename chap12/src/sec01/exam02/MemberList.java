package sec01.exam02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MemberList {
	private List<Member> mList;
	
	public MemberList() {
		mList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		mList.add(member);
	}
	
	// memberID로 멤버 삭제 후 삭제 여부를 반환
	public boolean removeMember(int memberID) {
		Iterator<Member> mListIt = mList.iterator();
		while (mListIt.hasNext()) {
			Member member = mListIt.next();
			int tempID = member.getMemberID();
			
			if (tempID == memberID) {
				// 해당 ID의 멤버 삭제 하고 true 반환
				mList.remove(member);
				System.out.println(memberID + "번 회원을 삭제하였습니다.");
				return true;
			}
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
	}
	
	public void findAll() {
		for (Member member : mList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
