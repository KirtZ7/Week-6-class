package testMethods;

public class TestMethods {
    public static void main(String[] args) {
        TestMethods test = new TestMethods(); //create object
        test.addition(); //call method using object name
        subtraction(20,5); //call method directly (static)
        test.printName("Printing out name here"); //call method using object name
        test.multiplication(); //call method using object name
        printStatement("Testing", "Okay working"); //call method directly (static)
        test.division(10,2);
    }

    //No return type with no parameters
    public void addition() {
        int a = 10, b = 20;

        System.out.println("Addition of a and b is " + (a+b));
    }

    //no return type with parameters
    public static void subtraction(int x, int y){
        System.out.println("Subtraction of x - y is " +(x-y));
    }

    public void printName(String name){
        System.out.println(name);
    }

    //Method with return no parameters
    public void multiplication (){
        int m = 10;
        int n = 5;
        int o = m*n;
        System.out.println(o);

    }

    //with return type with parameters
    public static String printStatement(String name, String name1){
        System.out.println(name);
        System.out.println(name1);
        return name;
    }

    //with return with parameters
    public int division (int a, int b){
        int c = a/b;
        System.out.println(c);
        return c;
    }

}
