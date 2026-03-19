class Patterns {
    public static void main(String[] args) {
        int rows = 4;
        square_Hollow(rows);
        number_Increasing_Reverse_Triangle(rows);
        number_Triangle(rows);
        number_Increasing_Triangle(rows);
        number_changing_Triangle(rows);
        zero_one_triangle(rows);
        palindrome_Triangle(rows);
        star_rombous(rows);
        butterfly(rows);
        mirror_image_triangle(rows);
        hollow_reverse_triangle(rows);
        // odd_number_star_triangle(rows);
    }

    public static void square_Hollow(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i == 0 || j == 0 || i == rows - 1 || j == rows - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void number_Increasing_Reverse_Triangle(int rows) {

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void number_Triangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int sp = 1; sp <= rows - i; sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void number_Increasing_Triangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void number_changing_Triangle(int rows){
        int x=1;
        for(int i=1; i<rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int rows){
        for( int i=0; i<rows; i++){
            for(int j=0; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void palindrome_Triangle(int rows){
        for(int i=1; i<=rows; i++){
            //spaces 
            for(int sp=1; sp<=rows-i; sp++){
                System.out.print("  ");
            }
            // logic one  
            for(int j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            // logic two
            for(int j=2; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void star_rombous(int rows){
        for(int i=1; i<=rows; i++){
            // spaces 
            for(int sp = 1; sp<=i; sp++){
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=rows; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void butterfly(int rows){
        int r = (rows*2)/2;
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){                
                    System.out.print("* ");
            }
            // spaces 
            for(int sp=1; sp<=2*(r-i); sp++){
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++){
                    System.out.print("* ");
            }
            System.out.println();
        }
        // lower half 
        for(int i=rows-1; i>=1; i--){
            for(int j=1; j<=i; j++){                
                    System.out.print("* ");
            }
            // spaces 
            for(int sp=1; sp<=2*(r-i); sp++){
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++){
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void mirror_image_triangle(int rows){
        for(int i=1; i<=rows; i++){
            // spaces 
            for(int sp=1; sp<=i; sp++){
                System.out.print(" ");
            }
            for(int j=i; j<=rows; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // lower half 
        for(int i=rows-1; i>=1; i--){
            // spaces 
            for(int sp=1; sp<=i; sp++){
                System.out.print(" ");
            }
            for(int j=i; j<=rows; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void hollow_reverse_triangle(int rows){
        for(int i=0; i<rows; i++){
            // spaces 
            for(int sp=0; sp<i; sp++){
                System.out.print(" ");
            }
            // logic 
            for(int j=0; j<rows-i; j++){
                if(i==0 || i==rows-1 || j==0 || j==rows-i-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}