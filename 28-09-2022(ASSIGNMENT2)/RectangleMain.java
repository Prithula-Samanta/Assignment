package Assignment;

public class RectangleMain {
public static void main(String[] args) {
	  RECT obj1 = new RECT();
	  RECT obj2 = new RECT(20,25);
	  
	  System.out.println("Area = " +obj1.getArea());
	  System.out.println("New Area = " +obj2.getArea());

}
}