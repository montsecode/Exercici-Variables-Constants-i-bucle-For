/**
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
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int anio = 1948;
	int nacimientoanio = 1975;
	
	for (anio; anio<=nacimientoanio; anio++) {

		if (((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
			
			
		System.out.println("El año es bisiesto");
		else
		System.out.println("El año no es bisiesto");
		}
			
	}

}
