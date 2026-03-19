import java.util.ArrayList;
import java.util.List;

public class Snake_Pattern_GFG {
    public static void main(String[] args) {
        int max[][] = { { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 27, 29, 37, 48 },
                        { 32, 33, 39, 50 } };
        print_Snake_Pattern(max);
    }

    public static void print_Snake_Pattern(int[][] grid) {

        int colEnd = grid[0].length-1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            if (i % 2 == 0) {
                for(int j=0; j<=colEnd; j++){
                    list.add(grid[i][j]);
                }
            }if (i % 2 != 0){
                for(int j=colEnd; j>=0; j--){
                    list.add(grid[i][j]);
                }
            }
        }

        System.out.println(list);
    }

}
