package _objectArray;

public class Student {
	private String name;
	private String subject;
	private int score;
	
	public Student() {
		
	}
	
	public Student(String name,String subject,int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public int getScore() {
		return score;
	}
	
	public String inform() {
		return name + " / " + subject + " / " + score;
	}
}
