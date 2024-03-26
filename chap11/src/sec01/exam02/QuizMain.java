package sec01.exam02;

public class QuizMain {

	public static void main(String[] args) {
		// 타입 파라미터 T를 String 타입으로 대체
		Quiz<String> q1 = new Quiz<String>();
		q1.setQuestions("구글 안드로이드 앱 개발을 위한 공식 통합개발환경(IDE)는?");
		q1.setAnswers("Android Studio");
		System.out.println("Q1. " + q1.getQuestions());
		System.out.println("==> [정답] " + q1.getAnswers());
		System.out.println();
		
		Quiz<Boolean> q2 = new Quiz<>();
		q2.setQuestions("자바는 객체지향 언어로 OOP의 특성인 캡슐화, 상속, 추상화, 다형성을 지원한다.");
		q2.setAnswers(true);
		System.out.println("Q2. " + q2.getQuestions());
		System.out.println("==> [정답] " + q2.getAnswers());
		System.out.println();
		
		Quiz<Integer> q3 = new Quiz<>();
		q3.setQuestions("자바 개발 도구인 Java SE JDK(Java Development Kit)의 최신 버전은?");
		q3.setAnswers(21);
		System.out.println("Q3. " + q3.getQuestions());
		System.out.println("==> [정답] " + q3.getAnswers());
		System.out.println();

	}

}
