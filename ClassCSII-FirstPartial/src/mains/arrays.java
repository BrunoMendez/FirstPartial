package mains;
import java.util.Scanner;

public class arrays {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Tamaño array 1: ");
		int size1 = sc.nextInt();
		System.out.println("Tamaño array 2: ");
		int size2 = sc.nextInt();
		System.out.println("Tamaño array 3: ");
		int size3 = sc.nextInt();

		int[] array1 = new int[size1];
		int[] array2 = new int[size2];
		boolean[] array3 = new boolean[size3];

		start1(array1);
		for (int i=0; i <array1.length; i++){
			System.out.println(array1[i]);
		}
		start2(array2);
		for (int i=0; i <array2.length; i++){
			System.out.println(array2[i]);
		}
		start3(array3);
		for (int i=0; i <array2.length; i++){
			System.out.println(array3[i]);
		}
	}
	public static void start1 (int A[]){
		for (int i=0; i < A.length; i++){
			A[i]= i*2;
		}
	}
	public static void start2 (int B[]){
		for (int i=0; i < B.length; i++){
			B[i]= B.length-(i+1);
		}
	}
	public static void start3 (boolean C[]){
		for (int i=0; i < C.length; i++){
			C[i]= i%2 == 0;
		}
	}

}