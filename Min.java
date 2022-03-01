class Min{
    public static void main(String[] args) {
        int x = 10, y = 20, z = 15;
        if (x<y && x<z) {
            System.out.println("x is minimum number.");
        } else if ( y<x && y<z ) {
            System.out.println("y is minimum number.");
        } else {
            System.out.println("z is minimum number.");
        }
    }
}