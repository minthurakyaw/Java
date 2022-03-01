import java.util.Scanner;

class No13{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number that you wanna print for incresement : ");
        int num = s.nextInt();

        for (int i = 1; i <= num; i++){
            System.out.print(i*i);
            if (i<num){
                System.out.print("*");
            }
        }
        System.out.println();
    }
}