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

        System.out.prinln("Roll no: " + roll);
        System.out.prinln("Name: " + name);
        System.out.prinln("Total: " + total);
        System.out.prinln("Percentage: " + per);
    }
}

class assign2 {

    public static void main(String[] args) {
        
        Result prachi = new Result(36, "Prachi", 99, 98, 92);
        prachi.printData();
    }
}