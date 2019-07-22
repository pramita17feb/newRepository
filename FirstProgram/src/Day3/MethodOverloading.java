package Day3;
public class MethodOverloading {
    static int sum(int a,int b) {
        return a + b;
    }
    static int sum(int a,int b,int c) {
        return a + b + c;
    }
    
    static float sum(float a,float b) {
        return a+ b;
    }
    
    public static void main(String[] args) {
        System.out.println(sum(10,2));
        System.out.println(sum(100,200,300));
        System.out.println(sum(10.2f,20.4f));
    }
}
