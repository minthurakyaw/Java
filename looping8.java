class looping8 {
    public static void main(String[] args) {
        System.out.println("No. 23");
        int i,j,k;
        for ( i = 6; 1 <= i; i--) {
            for ( k = 1; k <= i; k++ ) {
                System.out.print(k + " ");
            }
            System.out.println();
        } 
    }
}