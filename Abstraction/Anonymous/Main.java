// Anonymous Inner Class Extending an Abstract Class - Create an abstract class Shape with 
// an abstract method draw(). Write a method createShape() in another class that uses an 
// anonymous inner class to extend Shape and provides an implementation for the draw() method.
abstract class Shape{
	abstract void drow();
}
public class Main{
	public static void main(String[] args) {
		Shape s = new Shape(){
			public void createShape(){
				System.out.println("Shape Created");
			}
			public void drow(){
 				System.out.println("Shape Drow");
 				createShape();
			}
		};
		s.drow();
	}
}

//Second Method
// abstract class Shape{
// 	abstract void drow();
// }
// class A{
// void createShape(){
// 		Shape s = new Shape(){
			
// 			public void drow(){
//  				System.out.println("Shape Drow");
// 			}
// 		};
// 		s.drow();
// 	}
// }
// public class Main{
// 	public static void main(String[] args) {
// 		A a = new A();
// 		a.createShape();
// 	}
// }