import java.util.Scanner;
import java.util.Random;

class lv3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        String game = "y";
        while (game.equals("y") || game.equals("Y")){
            System.out.println("Guess Game(0 to 20) Started!!!");
            System.out.print("Guess my number : ");
            int num = s.nextInt();
            int rand = r.nextInt(20);
            System.out.println(rand);
            int count = 1;
            while ( rand != num ) {
                if (num >= 0 && num <= 20) {
                    if (num <= rand+2 && num >= rand-2 ) {
                        System.out.println("No!!  You got it wroung!! Your number is close to my number.");
                    } else {
                        System.out.println("No!! You got it wroung!! Your number is too far to my number.");
                    }
                } else {
                    System.out.println("Read the game info idiot, guess the number between 0 and 20.");
                }
                System.out.print("Guess again : ");
                num = s.nextInt();
                count++;
            }
            System.out.print("Wow!!! you got it right at ");
            switch (count) {
                case 1: System.out.println("1st time."); break;
                case 2: System.out.println("2nd time."); break;
                case 3: System.out.println("3rd time."); break;
                default: System.out.println(count + "th time."); break;
            }
            System.out.println("Wanna play again?");
            System.out.print("y/n : ");
            game = s.next();
        }
    }
}