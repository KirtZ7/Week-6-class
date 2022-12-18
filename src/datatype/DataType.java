package datatype;

public class DataType {
    public static void main(String[] args) { // Main Method

        //Primitive Datatype

            /* Numeric datatype */

        //byte - whole numbers from -128 to 127
        byte myNum = 100;
        System.out.println(myNum);
        //Short - whole numbers from -32768 to 32767
        short myNum1 = 5000;
        System.out.println(myNum1);
        // Ints - whole numbers from -2147483648 to 2147483647
        int myNum2 = 101010;
        System.out.println(myNum2);
        // Long - whole numbers from -9223372036854775808 to 9223372036854775807 *L*
        long myNum3 = 1658656456L;
        System.out.println(myNum3);
        // Float - Fractional numbers *f*
        float myNum4 = 1.69f;
        System.out.println(myNum4);
        //Double - Fractional *d*
        double myNum5 = 1.96d;
        System.out.println(myNum5);

        System.out.println("\n"); //New LINE

            /* Non numeric datatype*/

        /* Character tests */
        char myChar = 'K';
        System.out.println(myChar);

        /* Boolean Simple tests*/
        boolean isJavaFunT = true;
        boolean isJavaFunF = false;
        System.out.println(isJavaFunT); //Output true value
        System.out.println(isJavaFunF); //Output False Value


        /* String */
        String firstString = "Hello World Kirtan";
        System.out.println(firstString);

        System.out.println("\n"); //New LINE


    }

}
