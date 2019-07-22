package day6;

interface First {
    public void testMethod();
    
    /*
     * public int calc() { return 0; }
     */
}
interface Second {
     void testSecondMethod();
}
interface Third extends First,Second{
    public void testThirdMethod();
}
public class InterfaceMain implements Third {
    public void testMethod() {
        System.out.println("First Interface");
    }
    
    public void testSecondMethod() {
        System.out.println("Second Interface");
    }
    
    public void testThirdMethod() {
        System.out.println("Third Interface");
    }
    
    public static void main(String[] args) {
        InterfaceMain obj = new InterfaceMain();
        obj.testMethod();
        obj.testSecondMethod();
        obj.testThirdMethod();
    }
}
