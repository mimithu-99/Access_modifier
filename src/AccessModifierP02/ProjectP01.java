package AccessModifierP02;

// Same Class
class class01{
    public String publicVar = "PUBLIC";
    private final String privateVar = "Private";
    protected String protectedVar = "Protected";
    String defaultVar = "Default";

    public void method1(){
        System.out.println(publicVar);
        System.out.println(privateVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
    }




}
public class ProjectP01 {
    public static void main(String[] args) {
        class01 obj1 = new class01();
        obj1.method1();

    }
}
