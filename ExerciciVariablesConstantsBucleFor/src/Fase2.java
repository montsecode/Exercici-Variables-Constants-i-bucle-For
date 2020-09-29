/**
 *FASE 2
Sabent que l’any 1948 es un any de traspàs:
● Creeu una constant amb el valor de l’any (1948).
● Creeu una variable que guardi cada quan hi ha un any de traspàs.
● Calculeu quants anys de traspàs hi ha entre 1948 i el vostre any de naixement i emmagatzemeu el valor
resultant en una variable.
● Mostreu per pantalla el resultat del càlcul

 * @author monts
 *
 */
public class Fase2 {
	

	final int anio = 1948;

	public static void main(String[] args) {
	
		
		int nacimientoanio = 1975;
				
		
			
	
		for (anio; anio<=nacimientoanio; anio++) {

			if (((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
				
			
					
					
	
			System.out.println("El año es bisiesto");
		else
			System.out.println("El año no es bisiesto");
		
			
		}
			
    }			
		
}
	
	



