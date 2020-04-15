package mypaquete;

import java.util.Arrays;
import java.util.Scanner;

public class Exercici_Noms_Ciutats_faseIII {

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
		
		String [] arrayCiutats = {city1,city2,city3,city4,city5,city6};
		String [] arrayCiutatsModificades = new String[6];
		Arrays.sort(arrayCiutats);
		
		for ( int i=0; i<arrayCiutats.length;i++) {
			arrayCiutatsModificades[i]=arrayCiutats[i].replace("a","4");
		}
		
		Arrays.sort(arrayCiutatsModificades);
		
		for ( int i=0; i<arrayCiutatsModificades.length;i++) {
			System.out.println(arrayCiutatsModificades[i]);
		}
	}
}






/*String city1= "Barcelona";
String city2= "Madrid";
String city3="Valencia";
String city4="Malaga";
String city5="Cadiz";
String city6="Santander";*/