public class TimeZone {
    public static void main(String[] args) {
        int totalSeconds = 32890;
        checkTimeZone(totalSeconds);
    }

    public static void checkTimeZone(int totalSeconds){

        int hours = totalSeconds / 3600;
        int remaningSeconds = totalSeconds % 3600;
        int minutes = remaningSeconds / 60;
        int seconds = remaningSeconds % 60;
        System.out.println(hours+ "hr " + minutes +"min " + seconds +"sec " );    
    }
}
