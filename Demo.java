public class Demo{
	public static void main(String [] args){
		Rectangle r;
		Circle c;

	r = new Rectangle(); //Constructor
	c = new Circle();
        r.height = 200;
        System.out.println("Height in rectangle r updated: " + r.height);

        r.width = 30;
        double area = r.calArea();
        System.out.println("Area of Rectangle: " + area);

        
        System.out.println("This is circle class");
        System.out.println("Value in Rectangle: " + r); 
        System.out.println("Value in Circle: " + c);    
    }
}
