import calculateArea;
import System.until.Scanner;

public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    System.out.prinln("Enter legth and breadth of rectangle: ");
    int len = s.nextInt();
    int breadth = s.nextInt();
    System.out.prinln("Area of Rectangle = " + Area.Rectangle(len, breadth));

    System.out.prinln("\nEnter radius of circle: ");
    int rad = s.nextInt();
    System.out.prinln("Area of circle = " + Area.Circle(rad));

    s.close();
}