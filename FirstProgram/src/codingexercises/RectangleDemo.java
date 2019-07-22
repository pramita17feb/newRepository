package codingexercises;

/*- Create a class Rectangle. It has following members
- color String
- width double
- height double

- Declare all member variables of class as private.

- Define setter and getter method and pass the value to the setter method and retrieve the value from the getter method.
- getArea() and getPerimeter() methods which will calculate area and perimeter respectively.

- Create a class called TestShape, which has main method.
- Create refer to Rectangle objects respectively and pass the value by using setter method.
- Call getArea() and getPerimeter() methods to get area and perimeter of circle and reactangle and print both.*/
import java.util.*;

class Rectangle {
	private String color;
	private double width;
	private double height;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {		
		return(getWidth()*getHeight());
	}
	public double getPerimeter() {
		return(2*(getWidth()+getHeight()));
	}

}

public class RectangleDemo {
	public static void main(String[] args) {
	Rectangle obj=new Rectangle();
	obj.setColor(args[0]);
	obj.setWidth(Double.parseDouble(args[1]));
	obj.setHeight(Double.parseDouble(args[2]));
	System.out.println("Rectangle Color:"+obj.getColor());
	System.out.println("Rectangle Area:"+obj.getArea());
	System.out.println("Rectangle Perimeter:"+obj.getPerimeter());

	}
}
