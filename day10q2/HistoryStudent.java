package day10q2;

public class HistoryStudent extends Student {
	
	int historyMarks;
	int civicsMarks;

	public int getHistoryMarks() {
		return historyMarks;
	}

	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}

	public int getCivicsMarks() {
		return civicsMarks;
	}

	public void setCivicsMarks(int civicsMarks) {
		this.civicsMarks = civicsMarks;
	}

	public HistoryStudent(String name, String address, int historyMarks, int civicsMarks) {
		super(name, address);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

	@Override
	public double getPercentage() {
		double percent = ((this.civicsMarks+this.historyMarks)/200.00)*100.00;
		return percent;
	}

}
