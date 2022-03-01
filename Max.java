class Max {
    public static void main(String[] args) {
        int x = 10;
        int y = 50;
        int z = 15;
        if (x>y && x>z) {
            System.out.print("x is maximum number.");
        } else if (y>x && y>z) {
            System.out.println("y is maximum number.");
        } else {
            System.out.println("z is maximum number.");
        }
    }
}