class looping10 {
    public static void main(String[] args) {
        System.out.println("No. 25");
        int i,j,k;
        for (i = 1; i <= 5; i++){
            for ( j = 6; j >= i; j--){
                System.out.print(" ");
            }
            for ( k = 1; k <= i*2-1; k++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}