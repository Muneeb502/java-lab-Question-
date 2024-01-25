   /**
    * employee
    */
    class employee {
          int idno ;
          String name;
          double salaray;
       public void details(int id , String nam , double sala){
            idno= id;
            name = nam;
            salaray = sala;
             display();  
       }
       public void display(){
         System.out.println(idno+" "+name+" "+salaray); 
       }
    
   }
public class empoy_detail {
    public static void main(String[] args) {
        employee es1 = new employee();
        employee es2 = new employee();
        employee es3 = new employee();
        es1.details(101, "manzoor" , 45000.0);
        es2.details(102, "manzoor", 25000.0);
        es3.details(103, "salman", 25000.0);

    }
}
