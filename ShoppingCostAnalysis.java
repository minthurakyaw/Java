import java.util.Scanner;
class ShoppingCostAnalysis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many items did you buy today?");
        System.out.print("Enter Your items number : ");
        int x = s.nextInt();
        int total = 0, i, max = 0, min = 0; //declare variables type
        for ( i = 1; i <= x; i++) {
            System.out.print("Enter Item " + i + " Amount : " );
            int amount = s.nextInt();
            // Total Amount
            total += amount;
            // Maximum Number
            if (amount > max) {
                max = amount;
            }
            // Minimum Number
            if (min > amount) {
                min = amount;
            } else if (min == 0){
                min = amount;
            }
        }
        float avg = total/x;
        System.out.println("Maximum amount : " + max);
        System.out.println("Minimum amount : " + min);
        System.out.println("Average amount : " + avg);
        System.out.println("Total amount : " + total);
    }
}