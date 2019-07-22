package Day3;

public class MethodProgram {
    static int multi(int num1,int num2,int num3) 
    { 
        return num1 * num2 * num3; 
    }
    
    int sum(int num1,int num2,int num3) {
        return num1 + num2 + num3;
    }
    
    public static void main(String[] args) {
        //System.out.println("Sum: " + MethodProgram.sum(10, 20, 30));
        MethodProgram obj = new MethodProgram();
        //calling the non static method
        System.out.println(obj.sum(100, 200, 300));
        //calling the static method
        System.out.println(MethodProgram.multi(10, 20, 30));
    }
}