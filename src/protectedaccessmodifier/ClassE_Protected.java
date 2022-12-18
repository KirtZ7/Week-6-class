package protectedaccessmodifier;

public class ClassE_Protected extends ClassD_protected{

    public static void main(String[] args) {
        ClassE_Protected ce = new ClassE_Protected();
        System.out.println(ce.a);
        System.out.println(ce.b);
        System.out.println(ce.text);
    }
}