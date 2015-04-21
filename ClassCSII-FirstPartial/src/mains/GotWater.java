package mains;
import java.util.Scanner;


public class GotWater {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){
		char option = 'a';
		option = menu();
		//Llamar menu para poder salir desde el principio
		while (option != 'x'){
			double consumed = requestData();
			//Se introduce la cantidad de galones
			double amount = calculations (option,consumed);
			//Calcula el precio de acuerdo al tipo de uso
			System.out.println("\nThe total amount to pay is: $" +  amount + "\n");
			sc.nextLine();
			option = menu();
			//Llamar menu para que este en el loop
		}
		System.out.println("Bye");
		//Indicacion de que se acabo el programa
	}
	private static double requestData() {
		System.out.println("How many gallons do you use?");
		double gallons = sc.nextDouble();
		return gallons;
	}

	private static double calculations(char option, double consumed){
		double option1 = 0;
		switch (option){
		case 'R':
			option1 = (500 + (consumed*0.0005));
			break;
		case 'C':
			if (consumed < 4000000){
				option1 = 1000;}
			else if (consumed > 4000000){
				option1 = (1000 + ((consumed-4000000)*0.00025));}
			break;
		case 'I':
			if (consumed < 4000000){
				option1 = 1000;
			}
			else if (consumed > 4000000 && consumed < 10000000){
				option1 = 2000;
			}
			else if (consumed > 10000000){
				option1 = 3000;
			}
			break;
		default:
			System.out.println("Inserte una variable valida");
			break;
			//En caso de que se equivoquen de variable.
		}
		return option1;
	}
	public static char menu() {
		System.out.println("Inserte la inicial del tipo de uso de agua que tiene");
		System.out.println("Residencial (R), Comercial (C), o Industrial (I)");
		System.out.println("En cambio si desea salir ingrese 'x'");
		char option = sc.next().charAt(0);
		return option;
	}

}
