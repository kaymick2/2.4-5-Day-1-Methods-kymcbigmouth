
//Kyle McDowell
//Methods and operations with math 
import java.io.PrintStream;

class Main {
  public static void main(String[] args) {
    int x = 4;
    int z = 6;
    PrintStream chaos = System.out;
    chaos.println("");
    chaos.println("is this a method?");
    // yes it is.
    message();
    chaos.println("For x = 4 and z = 6,");
    chaos.println("x + z = " + (addition(x, z)));
    chaos.println("x - z = " + (subtraction(x, z)));
    chaos.println("x*z = " + (multiplication(x, z)));
    chaos.println("x/z = " + (division(x, z)));
  }

  public static void message() {
    System.out.println("here's another method");
    // prints a message

  }

  // #2
  public static int addition(int x, int z) {
    int a = x + z;
    return a;
    // calls x and z from main, defines a as x + z and puts a on deck to be returned
    // if called from the main method
  }

  public static int subtraction(int x, int z) {
    int b = x - z;
    return b;
    // calls x and z, defines b as x - z and tells the program to return b if called
  }

  public static int multiplication(int x, int z) {
    int c = x * z;
    return c;
    // calls x and z, defines c as x*z, and puts c to be returned if called
  }

  public static int division(int x, int z) {
    int d = x / z;
    return d;
    // calls x and z, defines d as x/z, and puts d to be returned if method is
    // called. if the method is called, you need to call x and z as parameters (as
    // they are the required parameters), which puts x and z into the method, kind
    // of like a function. return d; says that if you put x and z in, you get d out.
  }
}
