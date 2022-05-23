
import java.util.*;

public class exercise1 {

	
	/* En una Clase Java, crear un método para solucionar el siguiente problema:

	   1. Crear un algoritmo para: obtener los número enteros del string, 

	   2. Crear una lista a partir de ese resultado 

	   3. Filtrar en una lista nueva los impares 

	   4. Retornar la suma de los mismos

	String myString= "asfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342r"

	*/
	
	public static void main (String[] args) {
		String miCadena= "asfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342r";
		char []	string_div = miCadena.toCharArray();
		String n="";
		String impar="";
		int suma=0;
		
			for (int i=0; i<string_div.length; i++) {
				if(Character.isDigit(string_div[i])) {
					n+=string_div[i];
					if (string_div[i] %2 != 0) {
						impar+= string_div[i];
					}
				}
			}	
			System.out.println("1. Numeros enteros: "+n);
			System.out.println("3. Numeros pares: "+impar);
			
			for (int j=0; j<impar.length(); j++ ) {
				suma += Integer.parseInt(String.valueOf(impar.charAt(j)));
			}
			System.out.println("4. Suma numeros: "+suma);
	}
}
