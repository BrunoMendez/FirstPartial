package mains;
public class Car {

	double gasmileage, gallons, startMiles, endMiles;
	String clasify = null;

	public Car(double imillas, double emillas, double galones){
		startMiles = imillas;
		endMiles = emillas;
		gallons = galones;
	}
	public double milesPerGallon(){
		gasmileage = (endMiles - startMiles)/gallons;
		return gasmileage;
	}

	public String carClassify(){
		if (gasmileage < 15.0){
			clasify = "Gas Hog";
		}
		else if (gasmileage > 30.0){
			clasify = "Economy Car";
		}
		else if (gasmileage >= 15.0 && gasmileage <= 30.0) {
			clasify = null;
		}
		return clasify;
	}
}