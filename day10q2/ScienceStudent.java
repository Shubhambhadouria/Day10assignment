package day10q2;

public class ScienceStudent extends Student{


	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	public int getPhisicsMarks() {
		return phisicsMarks;
	}

	public void setPhisicsMarks(int phisicsMarks) {
		this.phisicsMarks = phisicsMarks;
	}

	public int getChemistryMarks() {
		return chemistryMarks;
	}

	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}

	public int getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	public ScienceStudent(String name, String address, int phisicsMarks, int chemistryMarks, int mathsMarks) {
		super(name, address);
		this.phisicsMarks = phisicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

	@Override
	public double getPercentage() {
		
		double percent = ((this.phisicsMarks+this.chemistryMarks+this.mathsMarks)/300.00)*100.00;
		return percent;
		
	}
	
	
}
