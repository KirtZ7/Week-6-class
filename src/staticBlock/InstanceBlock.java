package staticBlock;

public class InstanceBlock {
    //Declare instance block

    String name; //Instance variable
    { //Instance block 1
        System.out.println("Instance block 1");
        name = "Java block 1 name";
    }

    String name1;
    { //Instance block 2
        System.out.println("Instance block 2");
        name1 = "Java block 2 name1";
    }

    public void display(){ //instance class to displace names
        System.out.println(name);
        System.out.println(name1);
    }

    public static void main(String[] args) { //main method
        InstanceBlock i = new InstanceBlock(); //create obj
        i.display();
        System.out.println("Instance Block main method");
    }
}
