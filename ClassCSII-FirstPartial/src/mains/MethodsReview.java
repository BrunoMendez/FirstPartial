package mains;
import java.util.Scanner;


public class MethodsReview {

	public static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		int vocales = 0;
		int consonantes = 0;
		int y = 0;
		double avg=0;
		int numeros=0;
		int letras=0;
		int error = 0;
		double suma=0;
		int number=1;
		int letter=1;
		int z;
		double cuenta=0;

		System.out.println("Inserte numeros o letras.");
		String x = sc.next();
		
		for(int i=0; i<(x.length()); i++){
			z=Character.getNumericValue(x.charAt(i));
			if (z>=0 && z <=9){
				number = 0;}
			else if (z>=10 && z<=35){
				letter = 0;}
			else
				error = 1;
			}//Aquí te dice si es numero, letra, ambos o error.
		
		if (error == 1){
			System.out.println("Por favor escriba solo letras o numeros.");}
		//Si se escribe algo que no es una letra o numero marca error
		else if (number == 0 && letter == 0){
			doNumberAndLetter(x, numeros, error, letras);
		}//Corre el metodo de numeros y letras si cumple con los requerimientos.
		else if (number==0){
			long a = Long.parseLong(x);
			doNumber(a, cuenta, suma, numeros, avg);
		}//Corre el metodo de numeros y convierte el input a long
		else
			doLetter(x, vocales, consonantes, y);
	}//Si no corre niuno de los anteriores, corre el de solo letras


	public static void doLetter(String x, int vocales, int consonantes, int y) {
		while(y<x.length()){
			char character = x.charAt(y);
			y=y+1;
			switch (character){
			case 'a':
				vocales = vocales+1;
				break;
			case 'A':
				vocales = vocales+1;
				break;
			case 'e':
				vocales = vocales+1;
				break;
			case 'E':
				vocales = vocales+1;
				break;
			case 'i':
				vocales = vocales+1;
				break;
			case 'I':
				vocales = vocales+1;
				break;
			case 'o':
				vocales = vocales+1;
				break;
			case 'O':
				vocales = vocales+1;
				break;
			case 'u':
				vocales = vocales+1;
				break;
			case 'U':
				vocales = vocales+1;
				break;
			default:
				consonantes = consonantes+1;
				break;
			}//Switch con todas las vocales, y si no se agrega una consonante.
			}
			System.out.println(vocales+" Vocale(s) y "+consonantes+" Consonante(s)");
		
	}


	private static void doNumberAndLetter(String x, int numeros, int letras, int z) {
		for(int i=0; i<(x.length()); i++){
			z=Character.getNumericValue(x.charAt(i));
			if (z>=0 && z <=9){//Si es de 0 a 9 se agrega un numero
				numeros = numeros +1;}
			else if (z>=10 && z<=35){//si es de 10 a 35 se agrega una letra
				letras = letras+1;}
			}
				
		System.out.println("Hay "+numeros+" numeros y "+letras+" letras");
		
	}


	public static void doNumber(long a, double cuenta, double suma, int numeros, double avg) {
		while(a>9){
			numeros = (int) (a%10);//Separa los numeros de 1 en 1
			suma = numeros+suma;//Suma todos
			cuenta = cuenta+1;//Se lleva la cuenta de cuantos suma.
			a = a/10;	//Se divide entre 10 por si queda solo 1 numero
		}
			avg = (suma+a)/(cuenta+1);//Se divide la suma y la cuenta
		System.out.println("Su promedio es "+avg);
	}
	
				
	}
