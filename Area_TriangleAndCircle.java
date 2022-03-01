import java.util.Scanner;

class Area_TriangleAndCircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of base : ");
        int b = s.nextInt();
        System.out.print("Enter value of high : ");
        int h = s.nextInt();
        
        System.out.println("Area of Triangle is "+ 0.5*b*h);

        System.out.print("Enter value of radius : ");
        int r = s.nextInt();

        System.out.print("Area of Circle is " + 3.142*r*r);
    }
}