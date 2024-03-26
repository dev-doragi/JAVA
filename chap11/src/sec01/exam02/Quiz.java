package sec01.exam02;

public class Quiz <T> {
	public String questions;
	public T answers;
	
	public String getQuestions() {
		return questions;
	}
	public void setQuestions(String questions) {
		this.questions = questions;
	}
	public T getAnswers() {
		return answers;
	}
	public void setAnswers(T answers) {
		this.answers = answers;
	}
	
}
