package sec01.exam02;

public class QuizMain {

	public static void main(String[] args) {
		// Ÿ�� �Ķ���� T�� String Ÿ������ ��ü
		Quiz<String> q1 = new Quiz<String>();
		q1.setQuestions("���� �ȵ���̵� �� ������ ���� ���� ���հ���ȯ��(IDE)��?");
		q1.setAnswers("Android Studio");
		System.out.println("Q1. " + q1.getQuestions());
		System.out.println("==> [����] " + q1.getAnswers());
		System.out.println();
		
		Quiz<Boolean> q2 = new Quiz<>();
		q2.setQuestions("�ڹٴ� ��ü���� ���� OOP�� Ư���� ĸ��ȭ, ���, �߻�ȭ, �������� �����Ѵ�.");
		q2.setAnswers(true);
		System.out.println("Q2. " + q2.getQuestions());
		System.out.println("==> [����] " + q2.getAnswers());
		System.out.println();
		
		Quiz<Integer> q3 = new Quiz<>();
		q3.setQuestions("�ڹ� ���� ������ Java SE JDK(Java Development Kit)�� �ֽ� ������?");
		q3.setAnswers(21);
		System.out.println("Q3. " + q3.getQuestions());
		System.out.println("==> [����] " + q3.getAnswers());
		System.out.println();

	}

}
