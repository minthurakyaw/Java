class HMS {
    public static void main(String[] args) {
        int hour = 1 ;
        int min = 2 ;
        int second = 5 ;
	    second += hour*60*60 + min*60 ;
        System.out.println("Total Seconds is " + second);
    }
}