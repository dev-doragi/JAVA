package step02.view;

import java.util.Scanner;
import java.util.InputMismatchException;
import step02.controller.StudyGroupManagement;

//스터디그룹 등록, 조회, 수정, 삭제 작업을 위한 메뉴 클래스
public class StudyGroupMenu {
	//스캐너 객체 참조변수 필드 선언
	private Scanner scanner;
	
	/* 스터디그룹을 관리(등록, 조회, 수정, 삭제)하는 
	 * StudyGroupManagement 객체의 참조변수 필드 선언 */
	private StudyGroupManagement manage;
	
	//생성자
	public StudyGroupMenu() {
		//scanner 필드 초기화(키보드로부터 표준입력을 받기 위한 Scanner 객체 생성) 
		this.scanner = new Scanner(System.in);
		
		//manage 필드 초기화(스터디그룹을 관리(등록, 조회, 수정, 삭제)하는 StudyGroupManagement 객체 생성)
		this.manage = new StudyGroupManagement();
	}
	
	/* 메뉴에서 작업을 선택하고 해당 작업을 수행하는 메소드를 호출
	 * - 작업 Menu 출력, 작업 선택
	 * - 해당 작업을 수행하는 메소드 호출 
	 */
	public void showMenu() {
		//선택한 작업메뉴 번호
		int selectNum = 0;
		
		while (true) {
			//메뉴를 화면에 출력
			displayMenu();			
			//선택한 작업메뉴를 가져오기
			selectNum = selectMenu();	
			
			//선택한 작업메뉴 출력(테스트 후 삭제)
			System.out.println("작업메뉴 : " + selectNum);
			
			//작업메뉴에 따른 작업 메소드 호출
			switch (selectNum) {
				case 1:
					//manage.register();
					break;
				case 2: 
					//manage.findAll();
					break;
				case 3:
					//manage.findById();
					break;
				case 4: 	
					//manage.findByName();
					break;
				case 5: 
					//manage.modify();
					break;
				case 6: 
					//manage.remove();
					break;
				case 0:
					System.out.println(">>> 작업을 종료합니다.");
					return;	//while()문 종료
				default:
					System.out.println(">>> 번호를 다시 입력하세요.");
			}//end of switch()
		}//end of while()
	}//end of showMenu()
	
	//Menu 출력 메소드
	private void displayMenu() {
		System.out.println("..............................");
		System.out.println("[스터디그룹 HOME] 작업메뉴를 선택하세요");
		System.out.println("..............................");
		System.out.println("[1] 등록");
		System.out.println("[2] 검색(All)");
		System.out.println("[3] 검색(Id)");
		System.out.println("[4] 검색(Name)");
		System.out.println("[5] 수정(Id)");
		System.out.println("[6] 삭제(Id)");
		System.out.println("..............................");
		System.out.println("[0] 종료");
		System.out.println("..............................");
	}//end of displayMenu()
	
	//작업 선택 메소드
	private int selectMenu() {
		//메뉴번호 변수 선언 및 초기화
		int menuNum = 0;
		
		while (true) {	
			/* 작업 메뉴 입력받기 
			 * - 숫자외 문자를 입력하면 InputMismatchException이 발생함으로 예외처리
			*/
			try {
				System.out.print("작업메뉴 선택: ");
				
				/* 입력한 작업메뉴 정수(번호) 가져오기
				 * - scanner.nextInt(): 내부적으로 System.in.read()에 의해
				 *   정수코드를 하나씩 가져오고, CR/LF 코드는 버퍼(stdIn Buffer)에 남아있음
				 */
				menuNum = scanner.nextInt();
				break;//while문 종료
			} catch (InputMismatchException e) {
				System.out.println(">>> 0~6 이내의 숫자를 입력해주세요.");
				scanner.nextLine();//버퍼 clear(입력한 문자열 전체(라인)를 가져오기)
				/* 버퍼에 남아있는 \r(Carriage Return(13), \n(Line Feed(10)) 값 등, 
				 * 모든 코드값을 가져오면 버퍼가 clear됨 */
			}
		}//end of while()	

		if (menuNum >= 0 && menuNum <= 6) {	
			//버퍼 clear(입력한 문자열 전체(라인)를 가져오기)
			scanner.nextLine();
			return menuNum;//작업메뉴 반환
		} else  {
			System.out.println(">>> 입력한 작업메뉴 번호를 확인바랍니다: " + menuNum);
			return -1;//실패 리턴값
		}
		
	}//end of selectMenu()
}//end of class StudyGroupMenu
