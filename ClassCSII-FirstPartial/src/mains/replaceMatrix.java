package mains;

import java.util.Scanner;

public class replaceMatrix {
	public static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		System.out.println("Rows: ");
		int rows = sc.nextInt();
		
		System.out.println("Columns; ");
		int columns = sc.nextInt();
		
		int [] [] matrix = new int [rows][columns]; //Definimos la matrix aqui.
		
		matrixFill(matrix);//Corre el metodo que llena la matrix con numeros aleatoreos
		displayMatrix(matrix);//Corre el metodo para imprimir la matrix
		
		System.out.println("\nWhat number would you like to replace?");
		int num = sc.nextInt();//Pide el numero que quieres quitar
		System.out.println("With what number would you like to replace it?");
		int numReplacement = sc.nextInt();//Pide el numero que quieres poner
		int[][] newMatrix = replace(matrix, num, numReplacement);//Corre el metodo que intercambia los numeros
		
		displayMatrix(newMatrix);//Se imprime la matrix con los numeros cambiados

	}

	public static void matrixFill(int[][] matrix) {
		int x = 0;
		for(int i=0; i<matrix.length; i++){
			for (int j=0; j<matrix[i].length; j++){
				x = (int)(10*Math.random());//Se llena con numeros aleatoreos
				matrix[i][j] = x;
			}
		}
	}
	public static void displayMatrix(int[][] matrix){//Se imprime la matrix
		for(int i = 0; i<matrix.length; i++){
			System.out.print("\n");//una linea despues de cada row
			for(int j = 0; j<matrix[i].length; j++){
				System.out.print(matrix[i][j]+"\t\t");//un tab despues de cada numero
			}
		}
	}
	public static int[][] replace (int [][] matrix, int num, int numReplacement){
		for(int i=0; i<matrix.length; i++){
			for (int j=0; j<matrix[i].length; j++){
				if(matrix[i][j] == num){
					matrix[i][j] = numReplacement;
				}//Cuando el numero que quieres quitar sale, lo cambia por el que quieres poner
			}
		}
		return matrix;	//Regresa la matrix con el numero cambiado.
	}

}
