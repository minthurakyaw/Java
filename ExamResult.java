import java.util.Scanner;
class ExamResult {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many subjects did you sit in your exam room?");
        System.out.print("Type the number of your subjects : ");
        int number = s.nextInt(), min = 0, max = 0, marks = 0;
        for ( int i = 1; i <= number; i++) {
            System.out.print("Your subject " + i + " marks : " );
            marks = s.nextInt();
            if (min > marks) {
                min = marks;
            } else if (min == 0) {
                min = marks;
            }
            if (max < marks) {
                max = marks;
            } 
        }
        if ( marks >= 0 && marks <= 100) {
            if ( min >= 0 && min < 40 ) {
                System.out.println("You failed the exam.");
            } else if ( min >= 40){
                if ( max < 65) {
                    System.out.println("You pass the exam.");
                } else if ( max >= 65 && max < 80) {
                    System.out.println("You pass the exam with Credit.");
                } else {
                    System.out.println("You pass the exam with distinction.");
                }
            }
        } else {
            System.out.println("System Error");
        }
    }
}