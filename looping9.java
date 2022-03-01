class looping9 {
    public static void main(String[] args) {
        System.out.println("No. 24");
        int i,j,k;
        for (i = 1; i <= 6; i++){
            for (j = 5; j >= i; j--){
                System.out.print("  ");
            }
            for (k = 1; k <= i; k++){
                System.out.print( k + " ");
            }
            System.out.println();
        }
    }
}