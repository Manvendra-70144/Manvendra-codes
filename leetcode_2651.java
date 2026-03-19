public class leetcode_2651 {
    public static void main(String[] args) {
        int arrivalTime = 13, delayedTime = 12 ;
        System.out.println(calculate_delayed_arrival_time(arrivalTime,delayedTime));
    }

    public static int calculate_delayed_arrival_time(int arrivalTime, int delayedTime){

        int a = arrivalTime+delayedTime;
        return a>=24 ? a%24 : a;
    }
    
}
