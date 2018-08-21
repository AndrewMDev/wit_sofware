package poo;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			
			  Scanner teclado = new Scanner(System.in); 
		        String nombre, nombre1 = "" ; 
		        
		        System.out.println("Ingrese un nombre"); 
		        nombre = teclado.nextLine(); 
		        
		        for (int i = nombre.length()-1; i>=0; i--) { 
		        	nombre1+= nombre.charAt(i); 
		        			        	
		           }
		        	
		            if(nombre1.equalsIgnoreCase(nombre)) {
		        	System.out.println(" Es palindromo");
		        }else {
		        	System.out.println("No Es palindromo");
		        }
		        
		       
		        
		        
		       


	}

}
