import java.util.Scanner;
class No1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your name : ");
        String name = s.next();
        byte[] bytes = name.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes)
        {
            int val = b;
            for (int i = 0; i < 8; i++)
            {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            binary.append(' ');
        }
        System.out.println("'" + name + "' to binary: " + binary);
    }
}