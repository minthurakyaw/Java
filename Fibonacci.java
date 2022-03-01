import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many times do you want to loop?");
        int times = s.nextInt();
        int x =1, y = 1;
        for ( int i = 1; i <= times; i++) {
            int result = x + y;
            if ( i == 1) {
                System.out.println("F" + i + " : " + x);
            } else if ( i == 2) {
                System.out.println("F" + i + " : " + y);
            } else {
                System.out.println("F" + i + " : " + result);
            }
            x = y;
            y = result;
        }
    }   
}