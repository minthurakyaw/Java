import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter array length  : ");
		int array_length = s.nextInt();
		
		int element[] = new int[array_length];
		for(int i=0; i < element.length ;i++) {
			System.out.print("Enter element " + (i+1)+ "  :  "  );
			element[i]=s.nextInt();
		}

		origin(element);
		reverse(element);
		
	}
	public static void origin(int element[]) {
		System.out.print("Original array : ");
		
		for (int i=0; i < element.length; i++) {
			System.out.print(element[i] + " ");
		}
	System.out.println();
	}

	public static void reverse(int element[]) {
		System.out.print("Reverse array : ");

		for(int i= element.length-1; i >= 0; i--) {
			System.out.print(element[i] + " ");
		}
	System.out.println();
	}
}

