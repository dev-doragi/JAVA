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
	
	// memberID�� ��� ���� �� ���� ���θ� ��ȯ
	public boolean removeMember(int memberID) {
		Iterator<Member> mListIt = mList.iterator();
		while (mListIt.hasNext()) {
			Member member = mListIt.next();
			int tempID = member.getMemberID();
			
			if (tempID == memberID) {
				// �ش� ID�� ��� ���� �ϰ� true ��ȯ
				mList.remove(member);
				System.out.println(memberID + "�� ȸ���� �����Ͽ����ϴ�.");
				return true;
			}
		}
		System.out.println(memberID + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void findAll() {
		for (Member member : mList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
