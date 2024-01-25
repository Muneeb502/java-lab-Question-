public class star {
    public static void main(String[] args) {
        System.out.println("print of star ");
        int i , j ;
        for( i= 1 ; i<=10 ;i++   ){
            
            for( j= 1 ; j<=10 ;j++ ){
             if (j>=i) {
                System.out.print("*");
             }else{
                System.out.print("");
             }

            }
            System.out.println("");

        }
    }
}
