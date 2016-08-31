interface IShape{
	double getArea();
	double getPerimeter();
	String tostring();
}

abstract class Shape implements IShape{
	String color;
	boolean filled;
	Shape(){}
	Shape(String color,boolean filled){
		this.color=color;
		this.filled=filled;
	}
	String getColor(){
		return color;
	}
    void setColor(String color){
		this.color=color;
	}
	boolean isFilled(){
		return filled;
	}
	void setFilled(boolean filled){
		this.filled= filled;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract String tostring();
}

class Circle extends Shape{
	private double radius;
	Circle(){
	}
	Circle(double radius){
		this.radius=radius;
	}
	Circle(double radius,String color,boolean filled){
		super(color,filled);
		this.radius=radius;
	}
	double getRadius(){
		return radius;
	}
	void setRadius(double radius){
		this.radius=radius;
	}
	public double getArea(){
		return 3.14*radius*radius;
	}
	public double getPerimeter(){
		return 2*3.14*radius;
	}
	public String tostring(){
		return "Circle";
	}
}

class Rectangle extends Shape{
	private double width,length;
	Rectangle(){
	}
	Rectangle(double width,double length){
		this.width=width;
		this.length=length;
	}
	Rectangle(double width,double length,String color,boolean filled){
		super(color,filled);
		this.width=width;
		this.length=length;
	}
	double getWidth(){
		return width;
	}
	void setWidth(double width){
		this.width=width;
	}
	double getLength(){
		return length;
	}
	void setLength(double length){
		this.length=length;
	}
	public double getArea(){
		return width*length;
	}
	public double getPerimeter(){
		return 2*(width+length);
	}
	public String tostring(){
		return "Rectangle";
	}
}

class Square extends Rectangle{
	private double side;
	Square(){
	}
	Square(double side){
		this.side=side;
	}
	Square(double side,String color,boolean filled){
		super(side,side,color,filled);
		this.side=side;
	}
	double getSide(){
		return side;
	}
	void setSide(double side){
		this.side=side;
	}
	void setWidth(double side){
		this.side=side;
	}
	void setLength(double side){
		this.side=side;
	}
	public String tostring(){
		return "Square";
	}
}

class ShapeDemo{
	public static void main(String args[]){
		Circle c=new Circle(10,"Red",false);
		System.out.println("==========Circle==========");
		System.out.println("Color:"+c.getColor());
		c.setColor("Green");
		System.out.println("Color:"+c.getColor());
		System.out.println("Filled:"+c.isFilled());
		c.setFilled(true);
		System.out.println("Filled:"+c.isFilled());
		System.out.println("Radius:"+c.getRadius());
		c.setRadius(6);
		System.out.println("Radius:"+c.getRadius());
		System.out.println("Area:"+c.getArea());
		System.out.println("Perimeter:"+c.getPerimeter());
		System.out.println("Shape:"+c.tostring());
		
		Rectangle r=new Rectangle(10,11,"Red",false);
		System.out.println("==========Rectangle==========");
		System.out.println("Color:"+r.getColor());
		r.setColor("Green");
		System.out.println("Color:"+r.getColor());
		System.out.println("Filled:"+r.isFilled());
		r.setFilled(true);
		System.out.println("Filled:"+r.isFilled());
		System.out.println("Width:"+r.getWidth());
		r.setWidth(13);
		System.out.println("Width:"+r.getWidth());
		System.out.println("Length:"+r.getLength());
		r.setLength(12);
		System.out.println("Length:"+r.getLength());
		System.out.println("Area:"+r.getArea());
		System.out.println("Perimeter:"+r.getPerimeter());
		System.out.println("Shape:"+r.tostring());
		
		Square s=new Square(5,"Red",false);
		System.out.println("==========Square==========");
		System.out.println("Color:"+s.getColor());
		s.setColor("Green");
		System.out.println("Color:"+s.getColor());
		System.out.println("Filled:"+s.isFilled());
		s.setFilled(true);
		System.out.println("Filled:"+s.isFilled());
		System.out.println("side:"+s.getSide());
		s.setSide(8);
		System.out.println("Side:"+s.getSide());
		System.out.println("Area:"+s.getArea());
		System.out.println("Perimeter:"+s.getPerimeter());
		System.out.println("Shape:"+s.tostring());
		
	}
}