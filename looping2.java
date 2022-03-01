class looping2 {
    public static void main(String[] args) {
        System.out.println("No. 17");
        int x = 6;
        for ( int i = 1 ; i <= x; i++) {
            for ( int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for ( int k = x; k >= i; k--) {
                System.out.print( "* " );
            }
            System.out.println();
        }
    }
}