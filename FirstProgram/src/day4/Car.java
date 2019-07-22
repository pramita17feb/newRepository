package day4;
class Vechicle {
    int modelno;
    String modelname;
    String color;
    
    Vechicle(int modelno,String modelname,String color) {
        this.modelno = modelno;
        this.modelname = modelname;
        this.color = color;
    }
    
    void displayDetails() {
        System.out.println("Model No: " + modelno);
        System.out.println("Name: " + modelname);
        System.out.println("Color: " + color);
    }
}

//from Prolearn faculty17 to All Participants:
public class Car extends Vechicle {
    boolean acType;
    
    Car(boolean acType,int modelno,String modelname,String color) {
        super(modelno,modelname,color);
        this.acType = acType;
    }
    
    void dislayCarDetails() {
        if(acType) 
            System.out.println("AC");
        else
            System.out.println("Non AC");
    }
    
    public static void main(String[] args) {
        Car obj = new Car(true,100,"maruti car","blue");
        obj.displayDetails();
        obj.dislayCarDetails();
    }
}
