public class TestArrays {
    public static void main(String[] args) {
        String[] islands = new String[4];
        int[]  index = new int[4];
        int y=0;
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";  
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        while (y<4) {
           System.out.println("island = "+ islands[y]);
           y=y+1; 
        }
    }
}


        
