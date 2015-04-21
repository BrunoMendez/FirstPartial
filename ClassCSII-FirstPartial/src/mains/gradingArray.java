package mains;
import java.util.Scanner;

public class gradingArray {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String [] Names = new String [30];
		int [] Grades = new int [30];
		int greatest = 0;
		int greatestIndex = 0;
		int count = 0;

		for(int i = 0; i<30; i++){//for para pedir alumnos y calificaciones
			System.out.println("Inserte el nombre del alumno (* para terminar)");
			Names[i] = sc.next();
			if(Names[i] .equals("*")){
				break;//break con condicion para salir del loop
			}
			count = count +1;//se cuenta el numero de estudiantes
			System.out.println("Inserte su calificación");
			Grades[i] = sc.nextInt();
		}

		for (int i=0; i <Names.length; i++){
			if (Names[i] .equals("*")){
				break;//break para salir del loop y no imprimir "*"
			}
			System.out.println(Names[i]+": "+Grades[i]);//imprimir los nombres y las claificaciones
		}
		System.out.println("There are a total of "+count+" students \n");//numero de alumnos

		System.out.println("The student(s) with the highest score is: ");
		for (int i=0; i<Grades.length; i++){
			if (Grades[i] == greatest){
				System.out.println(Names[greatestIndex]);//imprime un nombre si hay 2 con puntuacion mas alta
			}
			if (Grades[i] >= greatest){
				greatest = Grades[i];//se actualiza greatest para que siga el loop
				greatestIndex = i;//se guarda la posicion del array en greatestIndex para saber que posicion imprimir
			}
		}
		System.out.println(Names[greatestIndex]);
		System.out.println("Score: "+Grades[greatestIndex]);
	}//se imprime con la posicion guardada previamente
}