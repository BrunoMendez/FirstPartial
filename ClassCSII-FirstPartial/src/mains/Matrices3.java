package mains;

import java.util.Scanner;

public class Matrices3 {
	public static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		System.out.println("Give the value of n: ");
		int n = sc.nextInt();
		int [][] matrix = new int [n][n];
		int [][] newmatrix = new int [n][n];
		matrixfill(n, matrix);//Llena la matrix
		display(matrix);//La imprime

		System.out.println("1.) Addition, 2.) Transpose Matrix, 3.) Exit");
		int menu = sc.nextInt();
		

		while(menu!=3){//loop para que se salga cuando escojan exit
			switch(menu){
			case 1:
				additions(matrix, n);
				break;
			case 2:
				newmatrix=transpose(matrix);
				display(newmatrix);//Se imprime el metodo nuevo
				break;
			case 3:
				System.out.println("The end");
				break;
			default:
				System.out.println("Please insert a valid input");
			}
		matrixfill(n, matrix);
		System.out.println("\n1.) Addition, 2.) Transpose Matrix, 3.) Exit");
		menu = sc.nextInt();
	}
	}

public static void display(int[][] matrix) {
	for(int i = 0; i<matrix.length; i++){
		System.out.print("\n");//una linea despues de cada row
		for(int j = 0; j<matrix[i].length; j++){
			System.out.print(matrix[i][j]+"\t");//un tab despues de cada numero
		}
	}
	System.out.print("\n\n");
}	

public static void matrixfill(int n, int[][] matrix) {
	int x = 0;
	for(int i=0; i<matrix.length; i++){
		for (int j=0; j<matrix[i].length; j++){
			x = (int)(40*Math.random());//Se llena con numeros aleatoreos
			matrix[i][j] = x;
		}
	}
}

public static int[][] transpose(int[][] matrix) {
	int [][] newmatrix = new int[matrix.length][matrix[0].length];
	for(int i=0; i<matrix.length; i++){
		for(int j=0; j<matrix[i].length; j++){
			newmatrix[i][j] = matrix[j][i];//Se crea una nueva matrix y se le da el valor opuesto a la inicial
		}
	}
	return newmatrix;	
}

public static void additions(int[][] matrix, int n) {
	int diagonalsum = 0;
	int abovediagonal = 0;
	int belowdiagonal = 0;
	int outer = 0;
	int inner = 0;
	for(int i=0; i<matrix.length; i++){
		for(int j=0; j<matrix[i].length; j++){
			if(i==j){//Si son iguales i y j se agrea a la suma diagonal (0,0. 1,1. etc.)
				diagonalsum = diagonalsum+matrix[i][j];
			}
			if (j>i){//Cuando j sea mayor a i se suma a el abovediagonal
				abovediagonal = abovediagonal+matrix[i][j];
			}
			if (j<i){//Cuando j sea menor a i se suma el belowdiagonal
				belowdiagonal = belowdiagonal+matrix[i][j];
			}
			if (i==0||j==0||j==matrix.length-1||i==matrix.length-1){
				outer = matrix[i][j] + outer;//Se suma cuando i o j sean 0 o sean la ultima posicion
			}
			else if (i!=0||j!=0||j!=matrix.length-1||i!=matrix.length-1){
				inner = matrix[i][j] + inner;//Lo opuetso de el outer
			}
		}
	}
	System.out.println("The sum of the diagonal is:\t\t\t"+diagonalsum);
	System.out.println("\nThe sum of the above of the diagonal is:\t"+abovediagonal);
	System.out.println("\nThe sum of the below of the diagonal is:\t"+belowdiagonal);
	System.out.println("\nThe sum of the outer numbers is:\t\t"+outer);
	System.out.println("\nThe sum of the inner numbers is:\t\t"+inner);
}

}
