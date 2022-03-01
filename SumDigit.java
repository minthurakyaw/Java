import java.util.Scanner;

class SumDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number : ");
        int x = s.nextInt();
        int sum = sumdigit(x);
        System.out.println("Sum Digits : " + sum);
    }
    public static int sumdigit(int x) {
        int sum = 0;
        while ( x > 0 ) {
            sum = sum + (x % 10);
            x = x/10;
        }
        return sum;
    }
}