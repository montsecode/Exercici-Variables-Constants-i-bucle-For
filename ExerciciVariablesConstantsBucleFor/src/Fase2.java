/**
*FASE 2
*Sabent que l’any 1948 es un any de traspàs:
* Creeu una constant amb el valor de l’any (1948).
* Creeu una variable que guardi cada quan hi ha un any de traspàs.
* Calculeu quants anys de traspàs hi ha entre 1948 i el vostre any de naixement i emmagatzemeu el valor
*resultant en una variable.
* Mostreu per pantalla el resultat del càlcul

 * @author monts
 *
 */

import java.util.Scanner;
public class Fase2 {
	
	Static final int anio = 1948;

	public static void main(String[] args) {
	
		//Los años son guardadas como variables
		int anio = 1948;
		int nacimientoanio = 1975;
		//Comprobamos si el primer año  es bisiesto y mostramos los años
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
            for (int contador = anio; contador = nacimientoanio ; contador += 4) {
                System.out.println(contador);
			
            }
            
            
        //si no es bisiesto creamos  variable temporal para comparación en el bucle
		}else {
		 
        // La inicializamos la variable temporal con el año de la primera fecha
		int aniob = anio;
		
		//En cada paso por el bucle, aumentamos en uno la variable temporal. 
		//La condición para seguir en el bucle es que el año de la variable 
		 //temporal sea igual o inferior al añonacimiento
			do {
				aniob = aniob + 1;
			} while ((aniob % 4 != 0) && ((aniob % 100 == 0) || (aniob % 400 != 0)));
			
			
			//Con un bucle for, imprimimos los años: comenzamos con la variable 
            // temporal, aumentamos 4 años y terminamos con el año de la fecha nacimiento
			for (int contador = aniob; contador = nacimientoanio; contador += 4) {		
				System.out.println(contador);
					
	
			}
		
			
		}
			
    }			
		
}
	
	



