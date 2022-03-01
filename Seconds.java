class Seconds {
    public static void main(String[] args) {
        int second = 9903;
        int hour = second / 60;
        int min = hour % 60;
        hour = hour / 60;
        second = second % 60;
        System.out.println( hour + ":" + min + ":" + second );
    }
}