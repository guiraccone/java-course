package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double maxGrade() {
		return this.grade1 + this.grade2 + this.grade3;
	}
}
