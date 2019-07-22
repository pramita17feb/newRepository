package day4;
public class StringProgram {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String name = "ram";
        String address = new String("vinay");
        
        System.out.println(name + "," + address);
        
        System.out.println(name.concat(address));
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('a'));
        System.out.println(name.contains("r"));
        System.out.println(name.length());
        System.out.println(name.equals(address));
        System.out.println(name.startsWith("r"));
        
    }
}
