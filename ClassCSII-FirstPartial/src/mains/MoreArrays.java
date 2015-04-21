package mains;
import java.util.Scanner;

public class MoreArrays {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] A = {0, 4, 1, 2, 5, 0};
		int[] B = {8, 1, 4, 2, 5, 10};
		int[] C = {8, 2, 4, 2, 5, 2};
		int[] D = {8, 2, 4, 2, 5, 2};
		//Declara los valores de los arrays

		int a = zeroCount(A); //Llama el metodo zeroCount regresando la variable a
		for (int i=0; i <A.length; i++){
			System.out.println("A["+i+"]="+A[i]);//Imprime el array
		}
		System.out.println(a);//Imprime el resultado del metodo

		int b = addEvens(B);//Llama el metodo addEvens regresando la variable b
		for (int i=0; i <B.length; i++){
			System.out.println("B["+i+"]="+B[i]);//Imprime el array
		}
		System.out.println(b);//Imprime el resultado de addEvens

		int number = repetitions(C, 2);//Llama el metodo repetitions regresando la variable c
		for (int i=0; i <C.length; i++){
			System.out.println("C["+i+"]="+C[i]);//Imprime el resultado de repetitions
		}
		System.out.println(number);

		replacements(D, 2, 7);//Llama al metodo replacements
	}
	private static int zeroCount(int A[]) {
		int a =0;
		for (int i = 0; i< A.length; i++){
			if (A[i] == 0){
				a = a+1;
			}//suma 1 a la variable a cada vez que hay un 0
		}
		return a;
	}

	private static int addEvens(int B[]) {
		int b = 0;
		for (int i = 0; i< B.length; i++){
			if (B[i]%2 == 0){
				b = b + B[i];
			}//Cada vez que el residuo de un numero entre 2 es 0 (par), se suma el valor anterior de b más el valor de la posicion i del array
		}
		return b;

	}
	private static int repetitions(int C[], int number) {
		number = 0;
		for (int i = 0; i< C.length; i++){
			if (C[i] == 2){
				number = number+1;
			}//Se suma uno a la variable number cada vez que hay un 2
		}
		return number;
	}
	private static void replacements(int D[], int old, int New) {
		System.out.println("Old:");
		for (old = 0; old< D.length; old++){
			System.out.println("D["+old+"]="+D[old]);
		}//Se imprime el array D normal
		System.out.println("New:");
		for (New = 0; New< D.length; New++){
			if (D[New] == 2){
				D[New] = 7;
			}//Si se encuentra un 2 se convierte a 7
			System.out.println("D["+New+"]="+D[New]);
		}//Se imprime el array D con la conversion de 2 a 7
	}
}