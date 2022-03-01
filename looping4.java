class looping4 {
    public static void main(String[] args) {
        System.out.println("No. 19");
        int x = 6;
        for ( int i = 1; i <= x; i++) {
            for ( int j = x; i <= j; j--){
                System.out.print(" ");
            }
            for ( int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}