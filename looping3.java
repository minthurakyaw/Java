class looping3 {
    public static void main(String[] args) {
        System.out.println("No. 18");
        int x = 6;
        for ( int i = 1; i <= x; i++) {
            for ( int k = x; k >= i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}