package operators;

public class Operator {
    public static void main(String[] args) {
        int a = 5; //declare local variables
        int b = 5; //declare local variables
        int c = 10; //declare local variables
        int d = 18;

        //Arithmetic Operators

        System.out.println("Addition =  " + (a+b));
        System.out.println("Subtraction = " + (a-c));
        System.out.println("Multiplication = " + (a*c));
        System.out.println("Division = " + (c/a));
        System.out.println("Modulus = " + (d%b));
        System.out.println("Increment = " + (++a));
        System.out.println("Decrement = " + (--d));

        //Logical Operator
        boolean logical = a<b && a >b; //Logical - Both need to be true
        System.out.println(logical); //False

        boolean logicalOR = a>b || c>b; //Logical OR - Only 1 statement needs to be true
        System.out.println(logicalOR); //True

        boolean logicalNOT = !!(a>b); //LogicalNOT - Returns opposite value of the operand
        System.out.println(logicalNOT); //True

        boolean equal = a>=b; //check if a is > b
        System.out.println(equal); //True since 6 > than 5

    }

}
