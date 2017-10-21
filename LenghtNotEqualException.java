/**
 * 
 */
package VecteurHelper;

/**
 * <b>La classe LenghtNotEqualException est une sous classe de Exception, elle contient l'unique methode LenghtNotEqualException.
 * elle afficherait un message indiquant � l'utilisateur que la taille des 2 vecteurs fournis est diff�rente. </b>
 *
 */
public class LenghtNotEqualException extends Exception
/*L'exception d�clench�e lorsque deux vecteurs n'ont pas la m�me taille, sert pour le calcul de la somme de deux vecteurs.*/
{
	/**
     * Cette Methode est le constructeur de l'exception.
	  */
	public LenghtNotEqualException(){
	    super("La taille des deux vecteurs n'est pas identique !");
	    }

}
