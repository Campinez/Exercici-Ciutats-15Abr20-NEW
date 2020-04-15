package mypaquete;

import java.util.Arrays;

public class Exercici_Noms_Ciutats_FaseIV {

	public static void main(String[] args) {
		String city1= "Barcelona";
		String city2= "Madrid";
		String city3="Valencia";
		String city4="Malaga";
		String city5="Cadiz";
		String city6="Santander";
		
		String [] Barcelona = new String[9];
		String [] Madrid = new String[6];
		String [] Valencia = new String[8];
		String [] Malaga = new String[6];
		String [] Cadiz = new String[5];
		String [] Santander = new String[9];
		
		for( int i=0; i<Barcelona.length; i++) {
			char result =city1.charAt(i);
			String letra = Character.toString(result);
			Barcelona[i]= letra;
		}
		for( int i=0; i<Madrid.length; i++) {
			char result =city2.charAt(i);
			String letra = Character.toString(result);
			Madrid[i]= letra;
		}
		for( int i=0; i<Valencia.length; i++) {
			char result =city3.charAt(i);
			String letra = Character.toString(result);
			Valencia[i]= letra;
		}
		for( int i=0; i<Malaga.length; i++) {
			char result =city4.charAt(i);
			String letra = Character.toString(result);
			Malaga[i]= letra;
		}
		for( int i=0; i<Cadiz.length; i++) {
			char result =city5.charAt(i);
			String letra = Character.toString(result);
			Cadiz[i]= letra;
		}
		for( int i=0; i<Santander.length; i++) {
			char result =city6.charAt(i);
			String letra = Character.toString(result);
			Santander[i]= letra;
		}
		
		
		for( int i=Barcelona.length-1; i >=0; i--) {
			System.out.print(Barcelona[i]);
		}
		System.out.println();
		for( int i=Madrid.length-1; i >=0; i--) {
			System.out.print(Madrid[i]);
		}
		System.out.println();
		for( int i=Valencia.length-1; i >=0; i--) {
			System.out.print(Valencia[i]);
		}
		System.out.println();
		for( int i=Malaga.length-1; i >=0; i--) {
			System.out.print(Malaga[i]);
		}
		System.out.println();
		for( int i=Cadiz.length-1; i >=0; i--) {
			System.out.print(Cadiz[i]);
		}
		System.out.println();
		for( int i=Santander.length-1; i >=0; i--) {
			System.out.print(Santander[i]);
		}
	}

}
