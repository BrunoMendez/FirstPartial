package mains;

public class FormaGeometrica {
	public static double radio;
	
	public FormaGeometrica (double radius){
		radio = radius;
	}
	public FormaGeometrica (){
		radio = 10;
	}
	
	public double displayArea(){
		double area = Math.PI * radio * radio;
		return area;
	}
	public void defineRadius(double radius){
		radio = radius;
	}
}
