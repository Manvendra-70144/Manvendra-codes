public class leetcode_452 {
    public static void main(String[] args) {
        int [] [] points = {{3,29},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}};
        System.out.println(minimum_no_Arrows_to_Burst_Ballon(points));
    }

    public static int minimum_no_Arrows_to_Burst_Ballon(int [][] points){
        sort(points);
        int arrow = 1;
        int prevEnd = points[0][1];
        for(int i=1; i<points.length; i++){
            int [] interval = points[i];
            if(prevEnd < interval[0]){
                prevEnd = interval[1];
                arrow++;
            }
        }
        System.out.println();
        return arrow;
    }

    public static void sort(int [][] points){
        for(int i=0; i<points.length-1; i++){
            for(int j=0; j<points.length-1-i; j++){
                if(points[j][1] > points[j+1][1]){
                    int [] temp = points[j];
                    points[j] = points[j+1];
                    points[j+1] = temp;
                }
            }
        }
    }
    
}
