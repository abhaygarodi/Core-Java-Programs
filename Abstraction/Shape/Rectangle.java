public class Rectangle extends Shape{
	int length;
	int breadth;
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	public double area(){
		return length * breadth;
	}
}
