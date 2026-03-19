public class Pascal_Triangle {
    public static void main(String[] args) {
        int r=5;
        parcals_triangle(r);
    }

    public static void parcals_triangle(int r){
        for( int i=1; i<=r; i++){
            for(int sp=0; sp<=r-i; sp++){
                System.out.print(" ");
            }
            int n=1; 
            for(int j=1; j<=i; j++){
                System.out.print(n+" ");
                n = n * (i-j) / j;
            }
            System.out.println();
        }
    }

    
}
