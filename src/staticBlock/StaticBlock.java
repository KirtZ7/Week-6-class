package staticBlock;

/* Execution order -
* 1. Static blocks
* 2. Instance block
* 3. Constructor
* 4. Main Method
* */


public class StaticBlock {
    static { //Declare static block
        System.out.println("Java is robust");
    }

    //Declare Instance block
    {
        String name = "Instance Block"; //declare instance block
        System.out.println("This is instance box");
        System.out.println(name);
    }

    static{ //declare static block
        int a = 10;
        int b = 20;
        System.out.println(a+b);
    }

    public static void main(String[] args) { //call main method
        StaticBlock m = new StaticBlock();
        System.out.println("Static block execution");
    }

    static { //static block
        System.out.println("last static block");
    }

    public StaticBlock (){ //Declare constructor
        System.out.println("Declared constructor");
    }


}
