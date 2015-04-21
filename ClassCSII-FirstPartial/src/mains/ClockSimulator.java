package mains;
import java.util.Scanner;
public class ClockSimulator {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String [] args){
		System.out.println("Ingrese la hora actual: ");
		int hours = sc.nextInt();

		System.out.println("Ingrese los minutos actuales: ");
		int minutes = sc.nextInt();

		System.out.println("Ingrese los segundos actuales: ");
		int seconds = sc.nextInt();

		Clock reloj = new Clock(hours, minutes, seconds);

		reloj.correctTime();
		String.format("%01d", reloj.GetHours());
		String.format("%01d", reloj.GetMinutes());
		String.format("%01d", reloj.GetSeconds());
		System.out.println("Hora actual: "+String.format("%02d", reloj.GetHours())+":"+String.format("%02d", reloj.GetMinutes())+":"+String.format("%02d", reloj.GetSeconds()));

		System.out.println("Desea modificar el tiempo (Yes = 1/No = 0)");
		int modificar = sc.nextInt();

		while(modificar == 1){

			System.out.println("Cuantas horas desea agregar?");
			int extrahours = sc.nextInt();

			System.out.println("Cuantos minutos desea agregar?");
			int extraminutes = sc.nextInt();

			System.out.println("Cuantos segundos desea agregar?");
			int extraseconds = sc.nextInt();

			hours = hours+extrahours;
			minutes = minutes+extraminutes;
			seconds = seconds+extraseconds;

			Clock reloj2 = new Clock(hours, minutes, seconds);
			reloj.correctTime();
			String.format("%01d", reloj2.GetHours());
			String.format("%01d", reloj2.GetMinutes());
			String.format("%01d", reloj2.GetSeconds());
			System.out.println("Hora actual: "+String.format("%02d", reloj2.GetHours())+":"+String.format("%02d", reloj2.GetMinutes())+":"+String.format("%02d", reloj2.GetSeconds()));


			System.out.println("Desea modificar el tiempo (Y/N)");
			modificar = sc.nextInt();
		}
		System.out.println("bye");
	}
}
