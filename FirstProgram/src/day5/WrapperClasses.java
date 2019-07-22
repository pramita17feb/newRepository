package day5;

public class WrapperClasses {
    public static void main(String[] args) {
        
        //type casting
        int i = 10;
        double j = i;
        System.out.println(j);
        
        long p = 1000l;
        int p1 = (int)p;
        System.out.println(p1);
         //boxing
         int x = 10; //value type    
         Integer y = x; //converting to a reference type
         System.out.println(y.intValue());
         
        //unboxing
        Double b = new Double(100.20);
        double c = b; //converting the reference type to a value type
        System.out.println(c); 
        
        String str="123";
        int num=Integer.parseInt(str);
        System.out.println(num);
        
        //
        Character ch=new Character('1');
        System.out.println(Character.isDigit(ch));

        //it throws exception
        int num2=Integer.parseInt("123.45");
        System.out.println(num2);
         
    }
}
