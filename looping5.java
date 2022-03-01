class looping5 {
    public static void main(String[] args) {
        System.out.println("No. 20");
        int x = 5, i, j, k;
        for ( i = 1; i <= x; i++) {
            for ( j = x; j >= i; j--) {
                System.out.print(" ");
            }
            for ( k = 1; k <= (i); k++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}