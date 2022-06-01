package day10q4;

public class Main {

	public static void main(String[] args) {

		Area a1 = new Area();
		int x = a1.circleArea(7);
		int y = a1.rectangleArea(40, 50);
		int z = a1.squareArea(50);
		System.out.println("The Area of Circle is : "+x);
		System.out.println("The Area of Rectangle is : "+y);
		System.out.println("The Area of Square is : "+z);

	}

}
