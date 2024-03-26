package step02.service.logic;

import java.util.Arrays;
import step02.entity.StudyGroup;
import step02.service.ManagementService;

//ManagementService 인터페이스를 구현한 ManagementServiceLogic 클래스
public class ManagementServiceLogic implements ManagementService {
	//StudyGroup을 저장할 배열 필드 선언
	private StudyGroup[] groups;
	
	/* groups 배열에 StudyGroup을 저장할 때 사용할 인덱스 정보 필드 
	 * - StudyGroup 저장 인덱스 정보(스터디그룹이 저장될 때마다 1씩 증가)
	 */
	private int index;
	
	//생성자
	public ManagementServiceLogic() {
		//StudyGroup을 저장할 배열 생성
		this.groups = new StudyGroup[6];
		this.index = 0;//index 초기화
	}
		
	//StudyGroup 등록
	@Override
	public void register(StudyGroup studyGroup) {
		//매개변수로 받은 생성된 스터디그룹을 groups 배열에 저장 
		groups[index] = studyGroup;
		index++;//스터디그룹이 생성될 때마다 저장하고, index 증가		
	}//end of register()

	//등록된 StudyGroup 검색(전체)
	@Override
	public StudyGroup[] findAll() {
		/* groups 배열에 등록된 스터디그룹의 요소만큼 복사하여 반환
		 * 배열 복사: Arrays.copyOfRange(원본배열, from(인덱스), to(인덱스);
		 * - to(인덱스) 전까지 복사
		 */
		return Arrays.copyOfRange(groups, 0, index);
	}//end of findAll()

	//등록된 StudyGroup 검색(id)
	@Override
	public StudyGroup findById(String studyId) {
		//등록된 스터디그룹들만 뽑아내어 registeredGroups 배열에 할당(배열에서 0부터 index 전까지 복사)
		StudyGroup[] registeredGroups = Arrays.copyOfRange(groups, 0, index);
		
		//Id로 찾은 스터디그룹을 저장할 참조 변수
		StudyGroup findGroup = null;
		
		for (StudyGroup group : registeredGroups) {
			if (group.getId().equals(studyId)) {//id가 같은 스터디그룹을 찾았으면
				findGroup = group;
				break;//for()문 break
			}
		}
		return findGroup;
	}//end of findById()

	//등록된 StudyGroup 검색(name)
	@Override
	public StudyGroup[] findByName(String studyName) {
		//등록된 스터디그룹들만 뽑아내어 registeredGroups 배열에 할당
		StudyGroup[] registeredGroups = Arrays.copyOfRange(groups, 0, index);
		
		/* Name으로 찾은 스터디그룹을 저장할 배열 생성
		 * - 스터디그룹 이름이 같은 스터디그룹이 존재할 수 있기 때문에 배열로 처리 
		 */
		StudyGroup[] findGroups = new StudyGroup[registeredGroups.length];

		//findGroups 배열의 index
		int subIndex = 0;
		
		//studyName과 같은 스터디그룹을 모두 찾아 findGroups 배열에 저장
		for (StudyGroup group : registeredGroups) {
			if (group.getName().equals(studyName)) {
				findGroups[subIndex] = group;
				subIndex++;
			}
		}		

		/* studyName으로 검색한 스터디그룹들이 저장된 findGroups 배열에서 
		   스터디그룹 Name이 저장된 요소만 복사하여 반환(null 요소 제외) */
		return Arrays.copyOfRange(findGroups, 0, subIndex);
	}//end of findByName

	//StudyGroup 수정(매개변수로 전달받은 수정된 스터디그룹(modifyGroup)을 원본배열(groups)의 해당 id에 저장)
	@Override
	public void modify(StudyGroup modifyGroup) {
		/* 수정된 스터디그룹(modifyGroup)을 매개변수로 받아 StudyGroup[] 타입의 
		 * 원본 배열(groups)에서 해당 id를 찾아 수정된 modifyGroup로 변경 
		 */
		int modifyIndex = 0;
		//원본 배열(groups)에서 수정할 스터더그룹의 인덱스(modifyIndex)를 찾음
		for (int i = 0; i < groups.length; i++) {
			if (groups[i].getId().equals(modifyGroup.getId())) {//id 비교
				modifyIndex = i;
				break;
			}
		}		
		/* 스터디그룹 원본 배열(groups)의 modifyIndex 해당하는 요소에
		   수정된 스터디그룹(modifyGroup)을 저장  */
		this.groups[modifyIndex] = modifyGroup;		
		
	}//end of modify()

	//등록된 StudyGroup 삭제(id)
	@Override
	public void remove(String studyId) {
		/* 삭제할 studyId를 매개변수로 받아 원본 배열(groups)에서 삭제할 id의 인덱스(removeIndex)를 검색 */
		int removeIndex = 0;
		
		//원본 배열(groups)에서 삭제할 스터더그룹의 인덱스(removeIndex)를 찾음
		for (int i = 0; i < groups.length; i++) {
			if (groups[i].getId().equals(studyId)) {
				removeIndex = i;
				break;
			}
		}
		
		/* 원본 배열(groups)에서 삭제할 removeIndex에 해당하는 요소(groups[i])에 
		 * 다음 요소(groups[i+1])에 있는 스터디그룹 객체의 참조변수를 저장하는 방식으로
		 * removeIndex에 해당하는 스터디그룹을 삭제
		 * - int i = removeIndex: 삭제할 인텍스부터 for문 처리 
		 * */
		for (int i = removeIndex; i < this.index; i++) {
			groups[i] = groups[i+1];
		}
		
		/* this.index는 스터디그룹이 생성될 때마다 1씩 증가하기 때문에
		 * 스터디그룹이 삭제될 때마다 1씩 감소시켜야 함 
		 */
		this.index--;		
	}//end of remove()
}//end of class ManagementServiceLogic
