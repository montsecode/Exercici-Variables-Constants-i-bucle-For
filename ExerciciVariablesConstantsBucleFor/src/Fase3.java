/**Fase3
 * Partint de l’any 1948 heu de fer un bucle for i mostrar els anys de traspàs fins arriba al vostre any de
naixement.
ATENCIO! Haureu de canviar el tipus de variable de l’any 1948 per poder modificar-la.
● Creeu una variable bool que sera certa si l’any de naixement és de traspàs o falsa si no ho és.(0,75 punts)
● En cas de que la variable bool sigui certa, heu de mostrar per consola una frase on ho digui, en cas de ser
falsa mostrareu la frase pertinent. Creeu dues variables string per guardar les frases. (1,5 punts)
 * @author monts
 *
 */
public class Fase3 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int anio = 1948;
	int nacimientoanio = 1975;
	
	// Partint de l’any 1948 heu de fer un bucle for i mostrar els anys de traspàs fins arriba al vostre any de
	//naixement.
	
	
	
	for (int anio1=anio; anio1<=nacimientoanio;  anio1 ++) {

		     if((( anio1%4==0)) && ((anio1 % 100 != 0) || (anio1 % 400 == 0))) {
		    	 
		     

           	
               System.out.println("Mostrar els anys de traspàs entre " + anio + " i " + nacimientoanio + ":");
			
	     }
	
	  }
	 
	
	}
			
	
	

