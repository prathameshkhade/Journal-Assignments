import java.util.Scanner;

class Student {

    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}

class Test extends Student {

    int m1, m2, m3;
    
    Test(int roll, String name, int m1, int m2, int m3) {
        super(roll, name);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
}

class Result extends Test {

    int total;
    double per;

    Result(int roll, String name, int m1, int m2, int m3) {
        super(roll, name, m1, m2, m3);
        total = m1 + m2 + m3;
        per = total/3.0;
    }

    public void printData() {

        System.out.println("Roll no: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + per);
    }
}

class assign2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Roll number: ");
        int r = sc.nextInt();
        System.out.println("Enter name: ");
        String nm = sc.nextLine();
        System.out.println("Enter three subject marks: ");
        int m1 = s.nextInt();
        int m2 = s.nextInt();
        int m3 = s.nextInt();

        Result Rutuja = new Result(r, nm, m1, m2, m3);
        Rutuja.printData();
    }
}