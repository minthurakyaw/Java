import java.util.Scanner;

class No11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of e : ");
        int e = s.nextInt();
        System.out.print("Enter value of f : ");
        int f = s.nextInt();
        System.out.print("Enter value of g : ");
        int g = s.nextInt();
        System.out.print("Enter value of h : ");
        int h = s.nextInt();
        // int e=1, f=2, g=3, h=4;
        int result = (++e) - (--f) - (g--) + (++h);
        System.out.println("Result : " + result);
        System.out.println(e + " " + f + " " + g + " " + h);

        System.out.print("Enter value of e : ");
        e = s.nextInt();
        System.out.print("Enter value of f : ");
        f = s.nextInt();
        System.out.print("Enter value of g : ");
        g = s.nextInt();
        System.out.print("Enter value of h : ");
        h = s.nextInt();
        // int  e=2;  f=3;  g=4;  h=4;
        result = (--e) - (--f) + (++g) - (h--);
        System.out.println("Result : " + result);
        System.out.println(e + " " + f + " " + g + " " + h);
    }
}