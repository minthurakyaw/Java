import java.util.Scanner;
class No5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of c : ");
        int c = s.nextInt();
        c*=5 + 5;
        System.out.println(c);

        System.out.print("Enter value of e : ");
        int e = s.nextInt();
        e %= 2 * 3 + 2;
        System.out.println(e);

        System.out.print("Enter String of num : ");
        String num = s.next();
        num += 5;
        System.out.println(num);

        System.out.print("Enter value of a : ");
        int a = s.nextInt();
        System.out.print("Enter value of b : ");
        int b = s.nextInt();
        System.out.print("Enter value of c : ");
        c = s.nextInt();
        // int a=-1 ,  b=1 , c=0;
        a*=  b  -=    c   +=2;
        System.out.println(a  + " " +  b  + " " +  c);
    }
}