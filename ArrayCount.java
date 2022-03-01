import java.util.Scanner;
public class ArrayCount {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int even_count = 0, odd_count = 0;
		
		System.out.print("Enter Array Length : ");
		int array_length = s.nextInt();
		
		int number[]= new int[array_length];

		for(int j = 0; j < array_length; j++) {
			System.out.print("Enter Number" + (j+1) + "	: ");
			number[j]=s.nextInt();
			}
			
		for(int i = 0; i < array_length; i++) {
			if ( number[i] % 2 == 0 ){
				even_count++;
				}
		}
		System.out.println("Even Count : "+ even_count);
		System.out.println("Odd Count : "+ (array_length-even_count));
	}
}

	
