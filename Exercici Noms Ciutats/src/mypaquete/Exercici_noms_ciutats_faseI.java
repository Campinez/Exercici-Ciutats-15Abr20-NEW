package mypaquete;

import java.util.Scanner;

public class Exercici_noms_ciutats_faseI {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String city1;
		String city2;
		String city3;
		String city4;
		String city5;
		String city6;
		
		System.out.println("Introduce el nombre de la ciudad: ");
		city1 = entrada.nextLine();
		System.out.println("Introduce el nombre de la ciudad: ");
		city2 = entrada.nextLine();
		System.out.println("Introduce el nombre de la ciudad: ");
		city3 = entrada.nextLine();
		System.out.println("Introduce el nombre de la ciudad: ");
		city4 = entrada.nextLine();
		System.out.println("Introduce el nombre de la ciudad: ");
		city5 = entrada.nextLine();
		System.out.println("Introduce el nombre de la ciudad: ");
		city6 = entrada.nextLine();
		
		System.out.print(city1+", "+city2+", "+city3+", "+city4+", "+city5+" y "+city6);
	
	
	}

}
