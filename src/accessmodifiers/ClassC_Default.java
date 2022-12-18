package accessmodifiers;

public class ClassC_Default {
    String fName = "Kirtan";
    String lName = "Jagdish";

    int m = 500;
    int n = 300;
    int a = n+m;

    public static void main(String[] args) {
        ClassC_Default cd = new ClassC_Default();
        System.out.println(cd.fName);
        System.out.println(cd.lName);
        System.out.println(cd.m);
        System.out.println(cd.a);
    }
}