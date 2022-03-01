import java.util.Scanner;

class Salary{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter maxtime : ");
        int maxtime =s.nextInt();
        System.out.print("Enter number of pointion : ");
        int position = s.nextInt();
        int hourwork[] = new int[position];
        double salary[] = new double[position];
        double payrate[] = new double[position];

        System.out.print("Enter overtime rate : ");
        double overtimerate = s.nextDouble();

        // hourly pay rate 
        for (int i = 0; i < position; i++){
            System.out.print("Enter payrate for position " + (i+1) + " : ");
            payrate[i] = s.nextDouble();
        }

        // calculating salary
        for (int j = 0; j < hourwork.length; j++){
            System.out.print("Enter Working hours for position " + (j+1) + " : ");
            hourwork[j] = s.nextInt();

            if ( hourwork[j] <= maxtime ) {
                salary[j] = hourwork[j] * payrate[j];
            } else if (hourwork[j] > maxtime) {
                salary[j] = ((hourwork[j]-maxtime)*overtimerate + maxtime) * payrate[j];
            }
        }

        // Printing Salary
        for (int k = 0; k < position; k++) {
            System.out.println("Salary for Position " + (k+1) + " : " + salary[k]);
        }
    }
}