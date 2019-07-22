package day4;
class Vechicle1 {
    int modelno;
    String modelname;
    String color;
    
    Vechicle1(int modelno,String modelname,String color) {
        this.modelno = modelno;
        this.modelname = modelname;
        this.color = color;
    }
    
    void displayDetails1() {
        System.out.println("Model No: " + modelno);
        System.out.println("Name: " + modelname);
        System.out.println("Color: " + color);
    }
}

//from Prolearn faculty17 to All Participants:
public class Car1 extends Vechicle1 {
    boolean acType;
    
    Car1(boolean acType,int modelno,String modelname,String color) {
        super(modelno,modelname,color);
        this.acType = acType;
    }
    
    void displayDetails1() {
    	super.displayDetails1();//calling the super class method in sub class
    	
        if(acType) 
            System.out.println("AC");
        else
            System.out.println("Non AC");
    }
    
    public static void main(String[] args) {
        Car1 obj = new Car1(true,100,"maruti car","blue");
        obj.displayDetails1();
      
    }
}
