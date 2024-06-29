package AccessModifierP02;
    class class02 {
        public String publicVar = "PUBLIC";
        private String privateVar = "Private";
        protected String protectedVar = "Protected";
        String defaultVar = "Default";

    }

    public class ProjectP02 {
        public static void main(String[] args) {
            class02 c2 = new class02();
            System.out.println(c2.publicVar);
            //System.out.println(c2.privateVar);
            System.out.println(c2.protectedVar);
            System.out.println(c2.defaultVar);

        }

    }
