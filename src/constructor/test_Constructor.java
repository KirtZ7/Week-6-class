package constructor;

public class test_Constructor {

    int eid; //Instance Variable
    String name; //Instance Variable
    test_Constructor (int eid, String name){ //Declare constructor
        // Use this to assign variables to constructor
        this.eid = eid;
        this.name = name;
        System.out.println(eid);
        System.out.println(name);
    }

    public static void main(String[] args) {

        //convert constructor to obj first before calling
        test_Constructor test = new test_Constructor(10,"Tested");
        test_Constructor test1 = new test_Constructor(111,"Testing");

    }
}
