package mains;

import java.util.Arrays;
import java.util.Scanner;

public class MoreArrays1 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Inserte el tamaño del arrayA");
		int tamaño1 = sc.nextInt();//Tamaño array
		int[] arrayA = new int[tamaño1];//
		
		System.out.println("Inserte el tamaño del arrayB");
		int tamaño2 = sc.nextInt();//Tamaño array
		int[] arrayB = new int[tamaño2];
		
		System.out.println("Inserte el tamaño del arrayC");
		int tamaño3 = sc.nextInt();//Tamaño array
		int[] arrayC = new int[tamaño3];
		
		System.out.println("Inserte el tamaño del arrayD");
		int tamaño4 = sc.nextInt();//Tamaño array
		int[] arrayD = new int[tamaño4];
		
		for(int i = 0; i<tamaño1; i++){
			arrayA[i] = (int) (2*Math.random()) * (int) (10*Math.random());//Llena arrayA y agrega 0s
		}
		for(int i = 0; i<tamaño1; i++){
			arrayB[i] = (int) (10*Math.random());//Llena arrayB normalmente
		}
		for(int i = 0; i<tamaño1; i++){
			arrayC[i] = (int) (10*Math.random());//Llena arrayC normalmente
		}
		for(int i = 0; i<tamaño1; i++){
			arrayD[i] = (int) (10*Math.random());//Llena arrayD normalmente
		}
		
		System.out.println(Arrays.toString(arrayA));//Imprime el arrayA
		int zeros = countZero(arrayA);//Llama el motodo countZero
		System.out.println("Tiene "+zeros+" ceros");//Imprime el resultado
		
		System.out.println(Arrays.toString(arrayB));//Imprime el arrayB
		int suma = addEvens(arrayB);//Llama el motodo addEvens
		System.out.println("La suma de los pares es: "+suma);//Imprime el resultado
		
		
		System.out.println("Inserte el numero que quiere contar");
		int numero = sc.nextInt();//Pide el numero a contar
		System.out.println(Arrays.toString(arrayC));//Imprime el arrayC
		int count = repetitions(arrayC, numero);//Llama el metodo repetitions
		System.out.println(numero+" se repite "+count+" veces");//Imprime el resultado
		
		System.out.println("Inserte el valor a cambiar:");
		int old = sc.nextInt();//Pide el valor a cambiar
		System.out.println("Inserte el valor nuevo");
		int nuevo = sc.nextInt();//Pide el valor al que cambia
		System.out.println("El viejo es :"+Arrays.toString(arrayD));//Imprime el arrayD normal
		replacement(arrayD, old, nuevo);
		System.out.println("El nuevo es :"+Arrays.toString(arrayD));//Imprime el arrayD nuevo
	}

	public static void replacement(int[] arrayD, int old, int nuevo) {
		for (int i = 0; i<arrayD.length; i++){
			if (arrayD[i] == old){
				arrayD[i] = nuevo;//Si se encuentra el numero que se pidio, lo reemplaza
			}
		}
		
	}

	public static int repetitions(int[] arrayC, int numero) {
		int count = 0;
		for(int i=0; i<arrayC.length; i++){
			if (arrayC[i] == numero){
				count = count+1;//Se actualiza la variable cada vez que se encuentra el numero que se pidio
			}
		}
		return count;//Se regresa la variable
	}

	public static int addEvens(int[] arrayB) {
		int suma = 0;
		for (int i = 0; i<arrayB.length; i++){
			if (arrayB[i]%2 == 0){
				suma = suma+arrayB[i];//Se suma el actual valor de suma mas el par encontrado.
			}
		}
		return suma;//Se regresa la variable suma
	}

	public static int countZero(int[] arrayA) {
		int zeros = 0;
		for(int i = 0; i<arrayA.length; i++){
			if (arrayA[i] == 0){
				zeros = zeros+1;//Se actualiza la variable cada vez que se encuentra un 0
			}
		}
		return zeros;//Se regresa la variable zeros.
	}

}
