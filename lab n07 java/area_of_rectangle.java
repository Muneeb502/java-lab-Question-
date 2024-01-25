/**
 * Innerarea_of_rectangle
 */
import java.util.Scanner;
 class rectangle {
        double lenght;
        double width;
      public void area(double len , double widt ){
        lenght = len;
        width= widt;
        double area = lenght*width;
        System.out.println("THR AREA OF RECTANGLE IS : "+ area);

      }
    
}
public class area_of_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangle re = new rectangle();
        System.out.print("ENETER THE LENGHT  OF RECTANGLE  : ");
        double len= sc.nextDouble();
        System.out.print("ENTER HTE WIDTH OF RECTANGLE : ");
        double widt = sc.nextDouble();
        re.area(len, widt);
    }
}
