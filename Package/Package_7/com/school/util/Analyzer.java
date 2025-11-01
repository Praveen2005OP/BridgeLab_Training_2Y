package Package.Package_7.com.school.util;
import Package.Package_7.com.school.data.*;

public class Analyzer {
	Student s = new Student();
	public float calculateAverage() {
		float average = (s.totalmarks())/300;
		return average;
	}
	
	public String findGrade() {
		if((s.totalmarks())/300>90) {
			return "A";
		}
		else if((s.totalmarks())/300>80&&(s.totalmarks())/300<=90) {
			return "B";
		}
		else if((s.totalmarks())/300>70&&(s.totalmarks())/300<=80) {
			return "C";
		}
		else if((s.totalmarks())/300>60&&(s.totalmarks())/300<=70) {
			return "D";
		}
		else if((s.totalmarks())/300>50&&(s.totalmarks())/300<=60) {
			return "E";
		}
		else {
			return "F";
		}
	}
}