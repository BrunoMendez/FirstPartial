package mains;

import java.util.Scanner;

public class RainfallMatrix {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String [] ArrayWeekdays = {"Week", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		//Se crea un array con la parte de letras de la semana para no hacer una matriz tipo String
		double [][] matrix = new double [4][8];//Se crea la matriz

		fillMatrix(matrix, ArrayWeekdays);//Corre el metodo fillMatrix

		for(int i = 0; i<ArrayWeekdays.length; i++){//Se imprime el array de los dias
			if(i<3 || i==5){
				System.out.print(ArrayWeekdays[i]+"\t\t");//Se usan 2 tabuladores para que esten a la misma altura.
			}
			else{
				System.out.print(ArrayWeekdays[i]+"\t");//Se usa 1 tabulador para los dias mas largos
			}
		}
		for(int i = 0; i<matrix.length; i++){//Se imprime la matriz
			System.out.print("\n");//una linea despues de cada row
			for(int j = 0; j<matrix[i].length; j++){
				System.out.print(matrix[i][j]+"\t\t");//un tab despues de cada numero
			}
		}

		highestRainfall(matrix, ArrayWeekdays);//Corre el metodo que te da los dias con mas lluvia
		rainfallPerMonth(matrix);//Corre el metodo que te da el total por mes
		rainfallPerWeek(matrix);//Corre el metodo que te da el total por semana
		moreThan(matrix);//Corre el metodo que cuenta cuantos dias son mayores a 5.4
		average(matrix);//Corre el metodo que te da el promedio de lluvia
	}

	public static void average(double[][] matrix) {
		double count = 0;
		for (int i = 0; i<matrix.length; i++){
			for(int j = 0; j<matrix[i].length; j++){
				if(j!=0){
					count = matrix[i][j] + count;//Se suman todos los numeros de la matriz menos los de la semana
				}
			}
		}
		System.out.println("\nThe average rainfall per month is: "+(count/28));//Se divide la suma entre 28 para sacar el promedio
	}

	public static void moreThan(double[][] matrix) {
		int count = 0;
		for (int i = 0; i<matrix.length; i++){
			for(int j = 0; j<matrix[i].length; j++){
				if(matrix[i][j] > 5.4){
					count++;//Se actualiza la variable cada vez que el numero es mayor a 5.4
				}
			}
		}
		System.out.println("\nThe amount of days that exceed 5.4 inches of rainfall are: "+count);
	}

	public static void rainfallPerWeek(double[][] matrix) {
		double week1 = 0;
		double week2 = 0;
		double week3 = 0;
		double week4 = 0;
		for (int i = 0; i<matrix.length; i++){
			for(int j = 0; j<matrix[i].length; j++){
				if(j!=0 && i==0){
					week1 = matrix[i][j] + week1;//Se suman todos los de la primera fila menos los de la primera columna
				}
				if(j!=0 && i==1){
					week2 = matrix[i][j] + week2;//Se suman todos los de la segunda fila menos los de la primera columna
				}
				if(j!=0 && i==2){
					week3 = matrix[i][j] + week3;//Se suman todos los de la tercera fila menos los de la primera columna
				}
				if(j!=0 && i==3){
					week4 = matrix[i][j] + week4;//Se suman todos los de la cuarta fila menos los de la primera columna
				}
			}
		}
		System.out.println("\nThe total rainfall for week 1 is: "+week1);
		System.out.println("The total rainfall for week 2 is: "+week2);
		System.out.println("The total rainfall for week 3 is: "+week3);
		System.out.println("The total rainfall for week 4 is: "+week4);
	}

	public static void rainfallPerMonth(double[][] matrix) {
		double count = 0;
		for (int i = 0; i<matrix.length; i++){
			for(int j = 0; j<matrix[i].length; j++){
				if(j!=0){
					count = matrix[i][j] + count;//Se suman todos los numeros de la matriz menos los de la primera columna
				}
			}
		}
		System.out.println("\nThe total of rainfall per month is: "+count);
	}

	public static void highestRainfall(double[][] matrix, String[] arrayWeekdays) {
		double highest = 0;
		System.out.println("\nThe day(s) with the most rainfall are: ");
		for (int i = 0; i<matrix.length; i++){
			for(int j = 0; j<matrix[i].length; j++){
				if(j!=0 && matrix[i][j] > highest){
					highest = matrix[i][j];
				}//Se hace una variable que se actualiza cada vez que encuentra un numero mayor a su valor actual con ese mismo numero.
			}
		}
		for (int i = 0; i<matrix.length; i++){//Se hace otro for para sacar todos los dias que tienen el numero mas alto.
			for(int j = 0; j<matrix[i].length; j++){
				if(matrix[i][j] == highest){
					System.out.println(arrayWeekdays[j]+" of week "+(i+1));
				}
			}
		}
		System.out.println("With "+highest+" inches of rain");
	}

	public static void fillMatrix(double [][]matrix, String []arrayWeekdays) {
		for (int i = 0; i<matrix.length; i++){
			for(int j = 0; j<matrix[i].length; j++){
				matrix[0][0] = 1;
				matrix[1][0] = 2;
				matrix[2][0] = 3;
				matrix[3][0] = 4;//Se llena la primera columna con los 4 numeros de las semanas
				if(j!=0){
					System.out.println("Insert the inches of rainfall of week "+(i+1)+" on "+arrayWeekdays[j]);
					double rainfall = sc.nextDouble();//Te pide el valor de cada dia de cada semana
					matrix[i][j] = rainfall;//Se actualiza el valor que le das a la posicion que te pide
				}
			}
		}
	}
}