public class Main{
	public static void main(String[] args) {
		Shape s1 = new Rectangle(2,3);
		System.out.println("Area of Rectangle : "+s1.area());
		Shape s2 = new Circle(5);
		System.out.println("Area of Circle : "+s2.area());
	}
}