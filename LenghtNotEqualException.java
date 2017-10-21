/**
 * 
 */
package VecteurHelper;

/**
 * <b>La classe LenghtNotEqualException est une sous classe de Exception, elle contient l'unique methode LenghtNotEqualException.
 * elle afficherait un message indiquant à l'utilisateur que la taille des 2 vecteurs fournis est différente. </b>
 *
 */
public class LenghtNotEqualException extends Exception
/*L'exception déclenchée lorsque deux vecteurs n'ont pas la mème taille, sert pour le calcul de la somme de deux vecteurs.*/
{
	/**
     * Cette Methode est le constructeur de l'exception.
	  */
	public LenghtNotEqualException(){
	    super("La taille des deux vecteurs n'est pas identique !");
	    }

}
