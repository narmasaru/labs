import java.text.NumberFormat;

public class Circle {
	public static double radius;
	public double area;
	public double circumference;
	public double getCircumference;
    private static int objectcount=0;
	

	public Circle(double radius){
		Circle.radius=radius;
		objectcount++;
	}
	
	
	
       public static double getCircumference() {
		double circumference = 2 * Math.PI * radius;
		return circumference;
	}

	public String getFormattedCircumference() {
		return formatNumber(getCircumference());
	}

	public static double getArea() {
		double area = Math.PI * radius * radius;
		return area;
	}

	public String getFormattedArea() {
		return formatNumber(getArea());
	}
	
	private String formatNumber(double x) {
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		String format = number.format(x);
		return format;
	}
	
	public static int getObjectCount(){
		
		return objectcount;
	}
	
  
}
