import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.print("Enter array length : ");
		int array_length= s.nextInt();
		
		int number [] = new int[array_length];
		for(int i=0; i<array_length; i++) {
			System.out.print("Number "+ (i+1) + "  is  : ");
			number[i]=s.nextInt();
		}
		
		System.out.print("Enter Search Number  :  ");
		int num = s.nextInt();
		
		for(int j=0; j < number.length; j++) {
			if(number[j] == num) {
				System.out.println("number" +"[" +(j+1)+"]" + "=" + num );
			}
		}
	}

}
