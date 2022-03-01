import java.util.Scanner;

class No15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of x : ");
        int num = s.nextInt();
        int x = 0;
        for ( x = 2 ; x<num ; x++){
            int y=x;
            do{
                System.out.print(x);
                y+=2;
            }  while(y<10);
        System.out.println();
        }
        
        System.out.print("Enter value of num : ");
        num = s.nextInt();
        System.out.print("Enter value of x : ");
        x = s.nextInt();
        while (x <= num){
        int y=0;
        do{
            System.out.print(x);
            y++;
            }  while ( y > x);
        System.out.println();
        x++;
        }
        
        System.out.print("Enter value of num : ");
        num = s.nextInt();
        System.out.print("Enter value of x : ");
        x = s.nextInt();
        for( int i=x; i>num ; i--){
            System.out.print( i   + ":");
            for ( int j=1; j<=i ; j++){
                System.out.print(j);
            }
        System.out.println( ":" + i );
        }
    }
}