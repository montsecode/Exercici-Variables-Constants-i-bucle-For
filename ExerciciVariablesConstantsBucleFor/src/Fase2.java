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


public class Fase2 {
		//* Creeu una constant amb el valor de l’any (1948).
	final static int anio = 1948;

	public static void main(String[] args) {
	
		// Creeu una variable( anio1) que guardi cada quan hi ha un any de traspàs= anio1.
		/**
		 * Recursos
		 *https://stackoverflow.com/questions/1021324/java-code-for-calculating-leap-year
		 *Year isLeap() method in Java with Syntax:public boolean isLeap()métode any traspas 
		 *isLeap() =(https://www.geeksforgeeks.org/year-isleap-method-in-java-with-examples/)
		 */
		
		final boolean anio1 = isLeap(anio);
        System.out.println("Valor de la variable esanydeTraspas: " + anio1);
	}

	private static boolean isLeap(int anio2) {
		// TODO Auto-generated method stub
		return anio2 % 4 == 0 && anio2 % 100 != 0 || anio2 % 400 == 0;
	}
	

		// Calculeu quants anys de traspàs= anioT  hi ha entre 1948 i el vostre any de naixement i emmagatzemeu el valor
		//resultant en una variable.
	
	int anysdeTraspas = anioT(1975);
	

	public static int anioT(final int anio3) {

		int contador = 0;

		for (int i = anio3; i > anio; i--) {
        if (isLeap(i)) {
            contador++;
        }
     
    }

    return contador;
    
	}
	
	
}

//* Mostreu per pantalla el resultat del càlcul
// Calculeu quants anys de traspàs hi ha entre 1948 i el vostre any de naixement i emmagatzemeu el valor
//resultant en una variable.

/** No se incluir esta impresión por pantall en el lugar correcto
 * System.out.println("Hi ha " + anysdeTraspas + " anys de traspàs entre 1975 i " + anio);
 */
	
