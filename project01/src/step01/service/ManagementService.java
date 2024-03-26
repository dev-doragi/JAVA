package step01.service;

import step01.entity.StudyGroup;

/* 스터디그룹을 관리(등록, 조회, 수정, 삭제)하는 
 * ManagementServiceLogic의 기능을 정의하는 인터페이스 선언 
 */
public interface ManagementService {
		
	// 1. 스터디그룹 등록 메서드
	void register(StudyGroup studyGroup);
	
	// 2. 등록된 전체 스터디그룹을 배열로 반환하는 메서드
	StudyGroup[] findAll();
	
	// 3. id로 스터디그룹을 찾아 반환하는 메서드, id는 primary key
	StudyGroup findById(String studyId);
	
	// 4. 이름으로 스터디그룹을 찾아 반환하는 메서드, 이름이 같은 스터디 그룹이 있을 수 있다.
	StudyGroup[] findByName(String studyName);
	
	// 5. 스터디그룹 수정 메서드
	void modify(StudyGroup modifyGroup);
	
	// 6. 스터디그룹 삭제 메서드
	void remove(String studyId);
	
} // end of interface ManagementService
