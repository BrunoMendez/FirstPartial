package mains;
import java.util.Scanner;

public class ExtraPoints {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Inserte su String:");
		String x = sc.next();
		
		boolean[] arrayboolean;

		if (x.charAt(0) == '['){
			for (int i = 1; i<x.length(); i++){
				switch (x.charAt(i)){
				case 't':
					arrayboolean = new boolean [] {x != null}; 
					System.out.println(arrayboolean);
					break;
				case 'r':
					arrayboolean = new boolean [] {x != null}; 
					System.out.println(arrayboolean);
					break;
				case 'u':
					arrayboolean = new boolean [] {x != null}; 
					System.out.println(arrayboolean);
					break;
				case 'e':
					arrayboolean = new boolean [] {x != null}; 
					System.out.println(arrayboolean);
					break;
				}
			}
		}
	}
}
