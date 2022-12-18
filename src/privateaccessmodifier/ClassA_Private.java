package privateaccessmodifier;

public class ClassA_Private {
    private  String text = "Kirtan Jagdish";
    private int x = 230;
    private String email = "Kirtz_777@hotmail.co.uk";

    public static void main(String[] args ) {
        ClassA_Private z = new ClassA_Private();
        System.out.println(z.x);
        System.out.println(z.text);
        System.out.println(z.email);

    }
}