class looping1 {
    public static void main(String[] args) {
        System.out.println("No. 16");
        int x = 6;
        for ( int i = 1; i <= x; i ++) {
            for ( int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        System.out.println();
        }   
    }
}