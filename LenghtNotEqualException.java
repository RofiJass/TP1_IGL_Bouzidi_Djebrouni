/**
 * 
 */
package VecteurHelper;

/**
 *  <h1>LenghtNotEqualException</h1>
 * <b>La classe LenghtNotEqualException est une sous classe de Exception, elle contient l'unique methode LenghtNotEqualException.
 * elle afficherait un message indiquant à l'utilisateur que la taille des 2 vecteurs fournis est différente. </b>
 *
 */
public class LenghtNotEqualException extends Exception{
	/**
     * Cette Methode est le constructeur de l'exception, et celle-ci qui va afficher le message de l'exception en faisant appel au constructeur de la class Exception.
	  */
	public LenghtNotEqualException(){
	    super("La taille des deux vecteurs n'est pas identique !");
	    }

}
