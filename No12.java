import java.util.Scanner;

class No12{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Start point for decresement : ");
        int start_point = s.nextInt();
        System.out.print("Enter End point for decresement : ");
        int end_point = s.nextInt();

        System.out.print("Start point " + start_point + " to End point " + end_point + " is ");
        for (int i = start_point; i >= end_point; i--){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}