package VecteurHelperTest;

import static org.junit.Assert.*;

import VecteurHelper.LenghtNotEqualException;
import VecteurHelper.VecteurHelper; 

import org.junit.Test;

import VecteurHelper.VecteurHelper;
import static junit.framework.TestCase.fail;

/**
 * <h1>LenghtNotEqualExceptionTest</h1>
 * <b> LenghtNotEqualException est la classe qui effectue le test sur l'exception LenghtNotEqualException</b> 
 * @see LenghtNotEqualException
 */

public class LenghtNotEqualExceptionTest
/*Test de l'exception déclenchée lorsque deux tableaux n'ont pas la mème taille*/

{
	/**
	 * Test method for {@link  LenghtNotEqualException#LenghtNotEqualException()}.
	 * Cette methode effectue le test sur l'egalité entre le message de l'exception enlevé et le message que l'exception LenghtNotEqualException affiche 
	 */
	@Test
	public void testLenghtNotEqualException() 
	/*Test du constructeur de la classe LenghtNotEqualException*/
	{
		try
		{
			VecteurHelper a = new VecteurHelper();
			int[] table1 = {1,2,3};
			int[] table2 = {1,2};
			a.sommeVect(table1, table2);
			fail();
			
		}
		catch(LenghtNotEqualException e)
		{
			assert(e.getMessage().contains("La taille des deux vecteurs n'est pas identique !"));
		}
	}

}
