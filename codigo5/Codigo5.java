package org.gen.codigo5;

import java.util.Scanner; // importe el Scanner

public class Codigo5 {
	public static void main(String[] args) { // Agregue metodo main
		
	Scanner s = new Scanner(System.in);// Le agregue un System.in
    System.out.println("Introduzca un número: "); // modifique una ' por una "
    int ni = s.nextInt(); // modifique la variable ni de String a int y cambie el .nextline por .nextInt();
    int c = ni;
    
    int afo = 0;
    int noAfo = 0;// tenia dos puntos lo cambie por ;
    
    while (ni > 0) {
	  int digito = (int)(ni % 10);
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
		afo++;
      } else {
		noAfo++;
	  
	  ni /= 10;
    }
    if (afo > noAfo) {
      System.out.println("El " + c + " es un número afortunado."); //println estaba mal escrito 
    } else {
      System.out.println("El " + c + " no es un número afortunado.");
    }
    
  }
	
	}	
}
