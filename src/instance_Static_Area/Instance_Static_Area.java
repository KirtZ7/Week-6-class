package instance_Static_Area;


// Calling instance to instance method - Direct
// Calling Static variable to Instance method - Direct or via class name
// Calling Static variable to Static method - Direct or via class name
// Calling Instance variable to static method via creating an object

public class Instance_Static_Area {
    int a = 10; //Instance Variable
    float b = 41.25f; //Instance Variable
    static double c = 632.524d; //Static Variable
    static String name = "Kirtan"; //Static variable


    void m1(){ //Declare instance method
        System.out.println("This is the instance method");
        int x = 50; //Local variable - inside method
        System.out.println(x);
        System.out.println(a); //call instance variable directly
        System.out.println(name); //call static variable directly
        System.out.println(Instance_Static_Area.name); //call static variable using class name
    }

    static void m2() { //Declare static method
        Instance_Static_Area obj = new Instance_Static_Area(); //Create object
        //Instance_Static_Area is the class name, obj is the ref variable name
        //New is a keyword, Instance_Static_Area() Constructor - Obj + class name needs to be same

        System.out.println(obj.a); //Call Instance Variable to Static method using obj name
        System.out.println(obj.b); //Call Instance Variable to Static method using obj name
        System.out.println(name); // //Call Instance Variable to Static method directly
        System.out.println(Instance_Static_Area.c);  //Call Static Variable to Static method using class name
        System.out.println("This is the Static method");
        int y = 123;
        System.out.println(y);
    }

    public static void main(String[] args) { //Main method - predefined method

        Instance_Static_Area a = new Instance_Static_Area(); //Create object
        a.m1(); // Call instance method to static method using object name
        m2(); // call static method to static directly
        Instance_Static_Area.m2(); //call static methods to static via class name

    }
}
