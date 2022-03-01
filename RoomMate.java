import java.util.Scanner;

class RoomMate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number of your roommates : ");
        int num = s.nextInt();
        String name[] = new String[num];

        // Collecting RoomMate's name
        for (int i = 0; i < num; i++){
            System.out.print("Enter roommate " + (i+1) + " name : ");
            name[i] = s.next();
        }

        // table heading
        System.out.println("No.\tName");

        // table entries
        for (int j = 0; j < num; j++){
            System.out.println((j+1)+"\t"+name[j]);
        }
    }
}