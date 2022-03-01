import java.util.Scanner;
import java.util.Random;

class lv4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        String user_answer = "y";
        while (user_answer.equals("y") || user_answer.equals("Y")) {
            System.out.println("Guess Game Started!!!");
            System.out.print("Enter max possible number : ");
            int max = s.nextInt();
            int rand = r.nextInt(max);
            System.out.println("Random number : " + rand);
            System.out.print("Guess my number(0 to " + max + ") : ");
            int num = s.nextInt();
            int count = 1;
            while ( num != rand ) {
                if (num >= 0 && num <= max) { /* num <= rand+2 && num >= rand-2 */
                    if ( num >= rand-2 && num <= rand+2) {
                        System.out.println("No!! You got it wroung!! Your number is closed to my number.");
                    } else {
                        System.out.println("No!! You got it wroung!! You number is too far to my number.");
                    }
                } else {
                    System.out.println("Read the game info idiot, guess the number between 0 and " + max + ".");
                }
                System.out.print("Guess again (0 to " + max + ") : ");
                num = s.nextInt();
                count++;
            }
            System.out.print("Wow!!! you got it right at");
            switch (count) {
                case 1: System.out.println(count + "st time."); break;
                case 2: System.out.println(count + "nd time."); break;
                case 3: System.out.println(count + "rd time."); break;
                
                default: System.out.println(count + "th time."); break;
            }
            System.out.print("Wanna try again?\n(y/n) : ");
            user_answer = s.next();
        }
    }
}