package mains;

import java.util.Scanner;

public class Matrix {
	public static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		System.out.println("Filas: ");
		int rows = sc.nextInt();
		
		System.out.println("Columnas ");
		int columns = sc.nextInt();
		
		String [] [] theMatrix = new String [rows][columns]; //Definimos la matrix aqui.

		System.out.println("Length de la matrix: "+theMatrix.length);
		System.out.println("Length de la fila: "+theMatrix[0].length);
		
		for (int i=0; i<theMatrix.length; i++){
			for (int j=0; j<theMatrix[i].length; j++){
				theMatrix[i][j] = i+","+j;
			}
		}
		
		for (int i=0; i<theMatrix.length; i++){
			System.out.print("\n");
			for (int j=0; j<theMatrix[i].length; j++){
				System.out.print(theMatrix[i][j]+"\t");
			}
		}
	}
}
