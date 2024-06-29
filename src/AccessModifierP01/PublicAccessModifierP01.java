package AccessModifierP01;

public class PublicAccessModifierP01 {
    public int myVar = 10;
    public String name = "Muntaha";

    public void myMethod(){
        System.out.println("This is a public method");
    }
    public void myAddress(){
        System.out.println("Dhaka, Bangladesh");
    }


    public static void main(String[] args) {
        PublicAccessModifierP01 obj1 = new PublicAccessModifierP01();
        System.out.println(obj1.myVar);
        System.out.println(obj1.name);

        obj1.myMethod();
        obj1.myAddress();
    }
}
