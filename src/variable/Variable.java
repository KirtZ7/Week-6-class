package variable;

/* */

public class Variable { //Class and constructor name has to be the same. Case Sensitive

    // Ints - whole numbers from -2147483648 to 2147483647.
    int myNumI = 101010; //Instance Variable
    float myNumF = 1.69f; //Instance Variable
    String firstString = "Hello World Kirtan"; //Instance Variable

    static int num = 100; //Static Variable
    static String myName = "Kirtan" ; //Static Variable
    public Variable(){  //Declare Constructor
        int num1 = 200; //Local Variable
    }

    //Instance Block
    {
        char x = 'A'; //local Variable
        int y = 10; //local Variable
    }

    //Static Block
    static {
        double d = 1.69d;
    }

    public static void main(String[] args) { //Main Method
        //Hello World - Local Variable inside method
        System.out.println("Hello world!");

        int a = 10;
        String name = "Kirtz"; //Declare local Variable

        //Print local variables
        System.out.println(name); // print Local
        System.out.println(a); //Print Local

        //New Line
        System.out.println("\n"); //New line

        //Print instance variables
        Variable obj = new Variable(); //Convert class into object

        System.out.println(Variable.num);
        System.out.println(obj.firstString);
        System.out.println(obj.myNumI);
        System.out.println(Variable.myName);
        System.out.println(obj.myNumF);
    }
}
