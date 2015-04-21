package mains;
import java.util.Scanner;
public class CarCalculator {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("FIRST CAR INFORMATION: ");

		System.out.println("First odometer reading:");
		double startMiles = sc.nextDouble();

		System.out.println("Final odometer reading:");
		double endMiles = sc.nextDouble();

		System.out.println("Gallons of gas consumed:");
		double gallons = sc.nextDouble();

		Car mileage = new Car(startMiles, endMiles, gallons);

		double gasmileage = mileage.milesPerGallon();
		System.out.println("Miles per gallon: "+gasmileage);


		String clasify = mileage.carClassify();
		if(clasify != null){
			System.out.println(clasify);
		}

		System.out.println("SECOND CAR INFORMATION");

		System.out.println("First odometer reading:");
		startMiles = sc.nextDouble();

		System.out.println("Final odometer reading:");
		endMiles = sc.nextDouble();

		System.out.println("Gallons of gas consumed:");
		gallons = sc.nextDouble();

		Car mileage2 = new Car(startMiles, endMiles, gallons);

		gasmileage = mileage2.milesPerGallon();
		System.out.println("Miles per gallon: "+gasmileage);

		clasify = mileage2.carClassify();
		if(clasify != null){
			System.out.println(clasify);
		}
	}
}
