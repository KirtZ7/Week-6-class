package constructor;

public class Constructor_Types {
    public Constructor_Types() { //Declare Zero Argument Constructor

        System.out.println("Zero Argument constructor");
    }

    public Constructor_Types (int a){ //Declare one argument Constructor
        System.out.println("one Argument Constructor");
        System.out.println(a);
    }

    public Constructor_Types(int a, int b){ //Declare two argument Constructor
        System.out.println("Two argument constructor");
        System.out.println(a);
        System.out.println(b);
    }

    public Constructor_Types(int a, int b, int c){ //Declare threeo argument Constructor
        System.out.println("Two argument constructor");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public Constructor_Types(int a, int b, int c, String name){ //Declare threeo argument Constructor
        System.out.println("Two argument constructor");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(name);
    }


    public static void main(String[] args) {
        Constructor_Types ct = new Constructor_Types(); //calling 0 argument constructor
        Constructor_Types ct1 = new Constructor_Types(10); //calling 0 argument constructor
        Constructor_Types ct2 = new Constructor_Types(20, 30); //calling 0 argument constructor
        Constructor_Types ct3 = new Constructor_Types(40,50,60);
        Constructor_Types ct4 = new Constructor_Types(40,50,60,"test" );//calling 0 argument constructor

    }
}
