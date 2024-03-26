package step01.service.logic;

import java.util.Arrays;
import step01.entity.StudyGroup;
import step01.service.ManagementService;

public class ManagementServiceLogic implements ManagementService { // 저장된 스터디그룹들을 관리하는 매니저
	// StudyGroup을 저장할 배열 선언
	private StudyGroup[] groups;
	private int index; // groups에 StudyGroup을 저장할 때 사용할 인덱스
	
	public ManagementServiceLogic() { // 생성자
		// StudyGroup을 저장할 배열 생성
		this.groups = new StudyGroup[6];
		this.index = 0;
	}
	
	@Override
	public void register(StudyGroup studyGroup) {
		// 매개변수로 받은 생성된 스터디그룹을 groups 배열에 저장
		groups[index++] = studyGroup;
	}

	@Override
	public StudyGroup[] findAll() { // 현재 저장된 스터디그룹들을 반환
		
		// groups 배열에 등록된 스터디그룹의 요소만큼 복사하여 반환
		// 0부터 index 전까지 복사
		return Arrays.copyOfRange(groups, 0, index);
	} // end of findAll

	@Override
	public StudyGroup findById(String studyId) {
		// 등록된 스터디그룹들만 뽑아서 registeredGroups 배열에 할당 (배열에서 0부터 index 전까지 복사)
		StudyGroup[] registeredGroups = Arrays.copyOfRange(groups, 0, index);
		
		// Id로 찾은 스터디그룹을 저장할 참조 변수
		StudyGroup findGroup = null;
		
		for (StudyGroup group : registeredGroups) {
			if (group.getId().equals(studyId)) { // id가 같은 스터디그룹을 찾았다면, equals() 메서드는 클래스의 객체를 비교하는 함수
				findGroup = group;
				break;
			}
		}
		return findGroup; // 찾아낸 객체(스터디 그룹) 반환
	} // end of findById

	@Override
	public StudyGroup[] findByName(String studyName) {
		// 등록된 스터디그룹들만 뽑아서 registeredGroups 배열에 할당 (배열에서 0부터 index 전까지 복사)
		StudyGroup[] registeredGroups = Arrays.copyOfRange(groups, 0, index);
		
		// 탐색된 스터디그룹을 저장할 배열 findGroups
		StudyGroup[] findGroups = new StudyGroup[registeredGroups.length];
		
		int Index = 0;
		
		for (StudyGroup group : registeredGroups) {
			if (group.getName().equals(studyName)) { // 스터디 그룹의 이름이 참조한 매개변수 studyName과 같다면,
				findGroups[Index++] = group; // findGroups 배열에 추가후 인덱스 증가
			}
		}
		
		// studyName으로 검색한 스터디그룹들이 저장된 findGroups 배열에서 스터디 그룹 Name이 저장된 요소만 복사하여 반환 (null 요소 제외)
		return Arrays.copyOfRange(findGroups, 0, Index);
	} // end of findByName

	@Override
	public void modify(StudyGroup modifyGroup) { // 스터디그룹 수정하는 메서드
		int modifyIndex = 0;
		
		for (int i = 0; i < groups.length; i++) {
			if (groups[i].getId().equals(modifyGroup.getId())) { // 생성된 그룹들이 저장된 배열과 참조 객체의 아이디를 비교
				modifyIndex = i;
				break;
			}
		}
		
		this.groups[modifyIndex] = modifyGroup;
	} // end of modify

	@Override
	public void remove(String studyId) {
		int removeIndex = 0;
		
		// 원본 배열 (groups)에서 삭제할 스터디그룹의 인덱스를 찾음
		for (int i = 0; i < groups.length; i++) {
			// 현재 존재하는 스터디 그룹들의 배열에서 삭제할 스터디의 id를 탐색
			if (groups[i].getId().equals(studyId)) { 
				removeIndex = i;
				break;
			}
		}
		
		// 배열 앞당기기 -> removeIndex위치의 배열 객체 삭제
		// removeIndex 뒤 객체들을 앞으로 당겨오면 removeIndex 위치에 있는 객체는 삭제된다.
		for (int i = removeIndex; i < this.index; i++) {
			groups[i] = groups[i + 1]; 
		}
		
		// 스터디가 삭제되었기 때문에 index 값 감소
		this.index--;
	} // end of remove

} //end of class ManagementServiceLogic
