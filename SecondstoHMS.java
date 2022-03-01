import java.util.Scanner;
class SecondstoHMS {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter Seconds : ");
    int second = s.nextInt();
    int hour = second / 60;
    int min = hour % 60;
    hour = hour / 60;
    second = second % 60;
    String hours, mins, seconds;
    if (hour < 10) {
        hours = "0" + hour;
    } else {
        hours = "" + hour; 
    }
    if (min < 10) {
        mins = "0" + min;
    } else {
        mins = "" + min;
    }
    if (second < 10) {
        seconds = "0" + second;
    } else {
        seconds = "" + second;
    }
    System.out.println(hours + ":" + mins + ":" + seconds);
    }
}