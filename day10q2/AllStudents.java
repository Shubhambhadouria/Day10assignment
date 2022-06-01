package day10q2;

public class AllStudents {

	public static void main(String[] args) {
		
		HistoryStudent h1 = new HistoryStudent("Shubham","276 Durgesh Vihar", 67, 80);
		double x = h1.getPercentage();
		System.out.println(x);
		
		ScienceStudent s1 = new ScienceStudent("Shubham","276 Durgesh Vihar", 67, 80, 69);
		double y = s1.getPercentage();
		System.out.println(y);

	}

}
