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
		//* *Sabent que l’any 1948 es un any de traspàs:Creeu una constant amb el valor de l’any (1948).
	final static int anio = 1948;

	public static void main(String[] args) {
	
		// Creeu una variable( anio1) que guardi cada quan hi ha un any de traspàs
		/**
		 * Recursos
		 *https://stackoverflow.com/questions/1021324/java-code-for-calculating-leap-year
		 )
		 */
		
		final boolean anio1 = isLeap(anio);
        System.out.println("Valor de la variable anio1: " + anio1);
        

	// Calculeu quants anys de traspàs= anioT  hi ha entre 1948 i el vostre any de naixement i emmagatzemeu el valor
	//resultant en una variable.//* Mostreu per pantalla el resultat del càlcul
		
		
		int anysT = anioT(1975);
		System.out.println("Hi ha " + anysT + " anys de traspàs entre 1975 i " + anio );
	}
	//Recursos
	/**web:https://www.geeksforgeeks.org/year-isleap-method-in-java-with-examples/
	 *Year isLeap() method in Java with Syntax:public boolean isLeap()métode any traspas 
	 *isLeap() 
	  */
	
	public static boolean isLeap(final int anio2) {
		// TODO Auto-generated method stub
		return anio2 % 4 == 0 && anio2 % 100 != 0 || anio2 % 400 == 0;
	}
	
	//contador=>Calculeu quants anys de traspàs= anioT i ha entre 1948 i el vostre any de naixement
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
	


	
