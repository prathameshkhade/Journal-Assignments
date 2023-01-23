import pkgArea.area;
import java.util.Scanner;

class Assign4 {

	public static void main (String[] args) {

		Scanner s = new Scanner(System.in);
		area a = new area();

		System.out.println("Enter length and breadth: ");
		int len = s.nextInt();
		int breadth = s.nextInt();
		System.out.println("Area of Rectangle: " + a.rectangle(len, breadth));

		System.out.println("\nEnter radius of circle: ");
		int rad = s.nextInt();
		System.out.println("Area of Circle: " + a.circle(rad));
	}
}