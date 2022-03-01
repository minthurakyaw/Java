import java.util.Scanner;
class AICourse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println( "1: Programming Fumdamental Course \t 2: Java Advance Course \t 3: C++,.Net Course" );
        System.out.println( "Type Your Course Number" );
        int course = s.nextInt();
        int fee=0;
        switch(course){
            case 1: fee = 175000; break;
            case 2: fee = 200000; break;
            case 3: fee = 250000; break;
        }
        System.out.println( "1: Alumni \t 2: Staff \t 3: Fresher" );
        System.out.println( "Type Your ID Number" );
        int ID = s.nextInt();
        switch(ID) {
            case 1: System.out.println("You got 10% discount and Now Your Course fee is " + ( fee - fee / 100 * 10 ) ); break;
            case 2: System.out.println("You got 20% discount and Now Your Course fee is " + ( fee - fee / 100 * 20 ) ); break;
            case 3: System.out.println(fee); break;
            default: System.out.println("Unknown ID.");
        } 
    }
}