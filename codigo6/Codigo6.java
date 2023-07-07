package org.gen.codigo6;

import java.util.Scanner; // importe desde la Java.util un Scanner 

public class Codigo6 {

	    public static void main(String[] args) {
	    	
	   Scanner scanner = new Scanner(System.in); // Agregue un Scanner
	        int n[] = new int[20];
	        
	        for (int i = 0; i < 20; i++) {
	            n[i] = (int)(Math.random() * 381) + 20;
	            System.out.print(n[i] + " ");
	        }
	        
	        System.out.println("\n¿Qué números quiere resaltar? ");
	        System.out.println("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	        int opcion = scanner.nextInt(); // modifique el parse por un scanner
	        
	        int multiplo = (opcion == 1) ? 5 : 7; // intercambie el ? por : 
	        
	        for (int e : n) { // quite el forEach
	            if (e % multiplo == 0) {
	                System.out.print("[" + e + "] ");
	            } else {
	                System.out.print(e + " ");
	            }
	        }
	        
	    }
	    }
	  
