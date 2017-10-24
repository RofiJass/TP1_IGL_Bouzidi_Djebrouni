package VecteurHelperTest;

import static org.junit.Assert.*;

import org.junit.Test;

import VecteurHelper.LenghtNotEqualException;
import VecteurHelper.VecteurHelper;

/**
 * <h1>VecteurHelperTest</h1>
 * <b> VecteurHelperTest est la classe cqui contient les tests sur les mehodes implémentées dans la classe {@link VecteurHelper} </b>
 *<p>
 * Elle contient commme attributs :
 * <ul>
 * <li>Une instance de la class VecteurHelper pour faire appel aux methodes .</li>
 * <li>Un vecteur initialisé pour le test des opérations unaires sur les vecteurs comme(le tri, l'inverse..).</li>
 * <li>Deux vecteurs initialisés pour le test de la somme des deux vecteurs.</li>
 * </ul>
 */
public class VecteurHelperTest {
	
	VecteurHelper vectTest = new VecteurHelper();
	int table[] = {25,65,2,0,148};
	int t1[] = {1,2,3,4,5};
	int t2[] = {1,2,3,4,5};

	/**
	 * Test method for {@link  VecteurHelper#triSelect(int[])}.
	 */
	@Test
	public void testTriSelect() {
		vectTest.triSelect(table);
		int tableT[] = {0,2,25,65,148}; 
		assertArrayEquals(tableT,vectTest.triSelect(table)) ;
	}

	/**
	 * Test method for {@link VecteurHelper#inversTab(int[])}.
	 */
	@Test
	public void testInversTab() {
		int tableI[] = {148,0,2,65,25};
		assertArrayEquals(tableI,vectTest.inversTab(table)) ;
	}
	
	/**
	 * Test method for {@link VecteurHelper#sommeVect(int[],int[])}.
	 * @throws LenghtNotEqualException Si la taille des deux vecteurs fournis en entrée de la methode n'est pas la mème. 
	 */
	@Test
	public void testSommeTable() throws LenghtNotEqualException {
		int tableS[]={2,4,6,8,10};
		assertArrayEquals(tableS,vectTest.sommeVect(t1, t2));
	 }

	/**
	 * Test method for {@link VecteurHelper#trouverMaxMin(int [])}.
	 */

	@Test
	public void testTrouverMaxMin() {
		int tMinMax[] = {0,148};
		
		assertArrayEquals(tMinMax,vectTest.trouverMaxMin(table));
	}
	
	/**
	 * Test method for {@link VecteurHelper#appFormulTab(int[])}.
	 */
	@Test
	public void testAppFormulTab() {
		int tForm[] = {50,130,4,0,296};
		vectTest.appFormulTab(table);
		assertArrayEquals(tForm,vectTest.appFormulTab(table));
	}

}
