package mains;

import java.util.Scanner;

public class Matrices {
	public static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		System.out.println("Filas: ");
		int rows = sc.nextInt();

		System.out.println("Columnas: ");
		int columns = sc.nextInt();

		int [][] a = new int [rows][columns];//Le damos tamaño al matrix
		int [][] b = new int [rows][columns];
		boolean [][] c = new boolean [rows][columns];
		int [][] mat = new int [rows][columns];
		int y = 0;
		
		for(int i=0; i<mat.length; i++){
			for(int j=0; j<mat.length; j++){
				y = (int)(10*Math.random());
				mat[i][j] = y;
			}
		}
		procedure1(a);//Corre el metodo procedure1
		displayArray(a);//Se imprime el matrix c

		procedure2(b);//Corre el metodo procedure2
		displayArray(b);//Se imprime el matrix b 

		procedure3(c);//corre el metodo procedure3
		for(int i = 0; i<c.length; i++){
			System.out.print("\n");//una linea despues de cada row
			for(int j = 0; j<c[i].length; j++){
				System.out.print(c[i][j]+"\t");//un tab despues de cada numero
			}//Se imprime el matrix c por ser boolean.
		}
		System.out.println("\n\nEl metodo random es: ");
		displayArray(mat);//Se imprime el matrix mat

		int zeros = countZeros(mat);//corre el metodo countZeros
		
		System.out.println("\n\nEl resultado de countZeros es: "+zeros);//Se imprime el resultado
		
		int evens = addEven(mat);//corre el metodo addEven
		
		System.out.println("\nEl resultado de addEvens es: "+evens);//Se imprime el resultado
		
		System.out.println("\nQue numero le gustaria contar?");
		int x = sc.nextInt();
		
		int count = repetitions(mat,x);//corre el metodo repetitions
		
		System.out.println("\nEl resultado de repetitions es: "+count);//Se imprime el resultado	
	}
	public static void displayArray(int[][] mat) {//se imprime el matrix
		for(int i = 0; i<mat.length; i++){
			System.out.print("\n");//una linea despues de cada row
			for(int j = 0; j<mat[i].length; j++){
				System.out.print(mat[i][j]+"\t");//un tab despues de cada numero
			}
		}
		System.out.print("\n");
	}
	private static int repetitions(int[][] mat, int x) {
		int count = 0;
		for(int i = 0; i<mat.length; i++){
			for(int j = 0; j<mat[i].length; j++){
				if(mat[i][j]==x){
					count++;//se suma 1 cada vez que hay el numero elejido
				}
			}
		}
		return count;
	}
	public static int addEven(int[][] mat) {
		int evens = 0;
		for(int i = 0; i<mat.length; i++){
			for(int j = 0; j<mat[i].length; j++){
				if(mat[i][j]%2==0){
					evens = evens+mat[i][j];//Se suma el valor anterior mas el valor de el par cada vez que se encuentra uno
				}
			}
		}
		return evens;
	}
	public static int countZeros(int[][] mat) {
		int zeros = 0;
		for(int i = 0; i<mat.length; i++){
			for(int j = 0; j<mat[i].length; j++){
				if(mat[i][j] == 0){
					zeros++;//Se suma uno cada vez que hay un 0
				}
			}
		}
		return zeros;
	}
	public static void procedure3(boolean[][] mat) {
		int x=-1;
		for(int i = 0; i<mat.length; i++){
			for(int j = 0; j<mat[i].length; j++){
				x++;
				if(x%2==0){
					mat[i][j] = true;//Cada vez que es par es true
				}
				else{
					mat[i][j] = false;//Cada vez que no es par es false
				}
			}
		}
	}
	public static void procedure2(int[][] mat) {
		int x=-1;
		for(int i = 0; i<mat.length; i++){
			for(int j = 0; j<mat[i].length; j++){
				x=x+1;
				mat[i][j] = x;//Se suma 1 la variable para que sea una secuencia
			}
		}

	}
	public static void procedure1(int[][] mat) {
		for(int i = 0; i<mat.length; i++){
			for(int j = 0; j<mat[i].length; j++){
				mat[i][j] = i;
			}
		}
	}

}
