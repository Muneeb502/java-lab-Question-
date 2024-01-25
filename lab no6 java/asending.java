public class asending {
    public static void main(String[] args) {
        int a;
        int[] num = {3,6,8,7,5,4};
        System.out.print("NUMBER WITHOUT ASCENDING :");
        for(int i = 0 ; i < num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println("");
        System.out.print("NUMBER WITH ASCENDIND  :");
        for(int k = 0 ; k < num.length;k++){
            for(int j =k ; j < num.length; j++){
                if (num[k] > num[j]) {
                    a = num[k];
                    num[k] = num[j];
                    num[j]=a;
                }
            }
        }
        for(int s =0; s < num.length ;s++) {
             System.out.print(num[s]+ " ");
        }
    }

}
