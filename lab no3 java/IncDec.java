public class IncDec {
    public static void main(String[] args) {
int a = 1;
int b = 2;
int c;
int d;
c = ++b;
d = a++;
c++;
System.out.println("a = " + a);
System.out.println("b = " + b);
System.out.println("c = " + c);
System.out.println("d = " + d);
    }
}

/*Let's go through the code step by step and evaluate each statement:

int a = 1; - Initialize the variable a with the value 1.
int b = 2; - Initialize the variable b with the value 2.
int c; - Declare an integer variable c without initializing it.
int d; - Declare an integer variable d without initializing it.
c = ++b; - Pre-increment the value of b and assign it to c. This means b becomes 3, and c is also set to 3.
d = a++; - Post-increment the value of a and assign it to d. This means d gets the current value of a (1), and then a is incremented to 2.
c++; - Increment the value of c by 1. So c becomes 4.
System.out.println("a = " + a); - Print the value of a. It is now 2.
System.out.println("b = " + b); - Print the value of b. It is now 3.
System.out.println("c = " + c); - Print the value of c. It is 4.
System.out.println("d = " + d); - Print the value of d. It is 1. */
