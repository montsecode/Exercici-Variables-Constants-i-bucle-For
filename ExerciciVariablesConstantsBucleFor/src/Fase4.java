/**
 * 
 * 
 * FASE 4
● Creeu una variable on juntareu el nom i els cognoms (tot en una variable) i un altre on juntareu la data
de naixement separada per “/” (tot en una variable). Mostreu per consola les variables del nom complet,
la data de naixement i si l’any de naixement es de traspàs o no.
Exemple de sortida per consola:
El meu nom és Juan Perez Gonzalez
Vaig néixer el 01/01/1979
El meu any de naixement és de traspàs

 * @author monts
 *
 */
public class Fase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String Nom = " Montse González Puentes";
		int dia = 14;
		int mes = 5;
		int anio = 1975;
		
		
		
		System.out.println("El meu nom es " +Nom);
		System.out.println("Vaig néixer el " +dia +"/" +mes+ "/" + anio);	
		
		
		if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
		  
			System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El meu any de naixement " + anio + " no és bisiesto");
        }
		
	}

}
