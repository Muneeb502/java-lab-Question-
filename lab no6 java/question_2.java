public class question_2 {
    public static void main(String[] args) {
        int row = 4;
        int col = 5; 
        int pat = 3;
        int cont1 = 0 ;
        int cont2 = 0 ;
        int[][] pat1 = new int[row][col];
        int[][] pat2 = new int[row][col];
        int[][][] pat3 = new int[pat][row][col];
        for(int i =0;i<row;i++){
            for(int j=0 ; j< col ; j++ ){
                pat1[i][j] = cont1++;
                System.out.print(pat1[i][j]+" ");
            }
            System.out.println("");
        }
            System.out.println("");
            System.out.println("");
        for(int i =0;i<row;i++){
            for(int j=0 ; j< col ; j++ ){
              if (j<=i) {
                pat2[i][j] = cont2++;
                System.out.print(pat2[i][j]+" ");
              }  
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        for(int k = 0 ; k<pat;k++){
            for(int i =0;i<row;i++){
                for(int j=0 ; j< col ; j++ ){
               pat3[k][i][j] = k*i*j ;
               System.out.print(pat3[k][i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        }
    }
}