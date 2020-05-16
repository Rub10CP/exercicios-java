package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.rectangle_java;

public class progrma_java {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		rectangle_java react = new rectangle_java();
		
		System.out.println("Enter rectangle width and height:");
		react.height = sc.nextDouble();
		react.width = sc.nextDouble();
		
		
		System.out.printf("AREA = %.2f%n", react.area());  
		System.out.printf("PERIMETER  = %.2f%n", react.perimeter());  
		System.out.printf("DIAGONAL  = %.2f%n", react.diagonal()); 
		
		
		sc.close();
		

	}

}
