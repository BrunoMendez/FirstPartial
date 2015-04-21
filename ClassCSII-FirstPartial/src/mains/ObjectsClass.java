package mains;
import java.util.Scanner;

public class ObjectsClass {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Hola a todos, este es un ejemplo de objetos");
		System.out.println("Por favor inserta el radio del circulo: ");
		double elRadio = sc.nextInt();
		
		FormaGeometrica circulo = new FormaGeometrica(elRadio);
		double area = circulo.displayArea();
		System.out.println("El área del círculo es: "+area);
		
		FormaGeometrica circulo2 = new FormaGeometrica();
		circulo2.defineRadius(20);
		area = circulo2.displayArea();
		System.out.println("El area del circulo es: "+area);

	}

}
