public class numberprint {
    public static void main(String[] args) {
        int i , j, v;
        for( i= 0 ; i<10 ;i++   ){
            
            for( j= 0 ; j<10;j++ ){
             if (j<=i) {
                  v= i*j;
                System.out.print(v+" ");
            
             }
             else{
             System.out.print("  ");
             }

            }
            System.out.println("");

        }
    }
}

/*
0
0 1
0 2 4
0 3 6 9
0 4 8 12 16
0 5 10 15 20 25
0 6 12 18 24 30 36
0 7 14 21 28 35 42 49
0 8 16 24 32 40 48 56 64
0 9 18 27 36 45 54 63 72 81
 */
