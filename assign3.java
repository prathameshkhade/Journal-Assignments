 using System.util.Scanner;

 class Factorial {

    public long fact(int num) { 
        int f = 1;
        for(int i = 1; i < num; i++)
            f *= num;
        return f;
    }

    public static void main(String []args) {
        
        Scanner s = new Scanner(Scanner.in);
        System.out.prinln("Enter Number: ");
        int n = s.nextInt();
        System.out.prinln("Factorial = " + fact(n));
        s.close();
    }
 }