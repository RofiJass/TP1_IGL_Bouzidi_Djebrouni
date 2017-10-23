/**
 * 
 */
package VecteurHelper;

import java.util.Scanner;

/**
 * <h1>VecteurHelper Application!</h1>
 * <b>VecteurHelper est la classe contenant plusieurs methodes qui effectuent des op�rations sur un vecteur ou plusieurs.</b>
 * <p>
 * Les op�rations que assure la class VecteurHelper sont les suivants:
 * <ul>
 * <li>Trier les �lements d'un vecteur donn�.</li>
 * <li>Sommer deux vecteurs donn�s en entr�e, cette op�ration d�clenche une exception si la taille des deux vecteurs n'est pas la m�me.</li>
 * <li>Fournir l'inverse d'un vecteur Inv{1,2,3}={3,2,1}.</li>
 * <li>Obtenir simultan�ment le min et le max d'un vecteur.</li>
 * <li>Applique la fonction F(x)=2x � tout �lement du vecteur.</li>
 * </ul>
 * <p>
 * De plus, il y a une methode qui permet l'initialisation des �lements du vecteur.
 * </p>
 * 
 * @author Djebrouni Yasmine_Bouzidi Halima.
 * @version 1.0 (R�alis� en language Java sous l'IDE Eclipse).
 * @ since 2017-10-21
 **/

public class VecteurHelper {
	
    /**
     * Cette methode permet d'initialiser le vecteur, en donnant la taille et les �lements de ce vecteur.
	 * @param a un vecteur � initialiser.
	 * @retunr rien
	 */
    public void initTab(int[] a){
        int i,elem,taille=0;
        Scanner sc = new Scanner(System.in);
        if(a.length==0){
        System.out.println("donnez la taille du tableau : ");
        taille=sc.nextInt();}
        a = new int[taille] ;
        System.out.println("citer les �lements de votre vecteur");
        for(i=0;i<taille;i++){
          elem=sc.nextInt();
          a[i]=elem;
        }
        sc.close();
    }
    
    
    /**
     * Cette Methode effectue le tri par s�lection d'un vecteur.
	 * @param a un vecteur � trier, ce dernier doit �tre initialis�.
	 * @return un vecteur tri�.
	 */
    public int[] triSelect(int[] a){
        int i,j,min,f,k;
       int tcurr[]= new int[a.length];
       for(i=0;i<a.length;i++){tcurr[i]=a[i];}
        for(i=0;i<a.length-1;i++){
            min=tcurr[i];
            for(j=i;j<a.length;j++){
                if(tcurr[j]<min){
                    min=tcurr[j];
                    k=j;
                    f=tcurr[i];
                    tcurr[i]=min;
                    tcurr[k]=f;     
                }
            }
        }
        return tcurr;
    }
    
    /**
     * Cette Methode inverse l'ordre des �l�ments d'un vecteur. par exemple le vecteur initiale est celui-ci : [1,2,3] son inverse est : [3,2,1].
	 * @param a un vecteur � inverser
	 * @return un vecteur dont les �l�ments sont dans l'ordre inverse de celui en entr�e.
	 */
    public int[] inversTab(int[] a){
    	int[] tableInv= new int[a.length] ;
        int i;
        for(i=0;i<a.length;i++){
          tableInv[i] = a[a.length-1-i];
        }
        return tableInv;
    }
    
    /**
     * Cette Methode calcule la somme de deux vecteurs, si on a vect1 = [1,2,3] et vect2 = [1,2,3] alors le vecteur resultat est le suivant : [2,4,6].
	 * @param a le premier vecteur param�tre de la methode..
	 * @param b le deuxi�me vecteur param�tre de la methode..
	 * @return un vecteur r�sultat de la somme de a et b.
	 * @throws LenghtNotEqualException Si les deux vecteurs n'ont pas la m�me taille (le nombre d'�lements).
	 * @see LenghtNotEqualException
	 */
    public int[] sommeVect(int[] a, int[] b) throws LenghtNotEqualException{
        int i,tailA,tailB ;
        tailA=a.length;
        tailB=b.length;
        if(tailA!=tailB){        	
            throw new LenghtNotEqualException();
        }else{
         int result[]= new int[tailA] ; 
         for(i=0;i<tailA;i++){
             result[i]=a[i]+b[i] ;
         }
         return result;
        }
    }
    

   /**
    * Cette Methode calcule le min et le max d'un vecteur, par exemple cherche le MinMax du vect = [25,0,9563] alors la methode renvoie le vecteur [0,9563] qui contient le MinMax du vecteur en entr�e.
    ** @param a vecteur pour lequel on veut trouver le min et le max.
    ** @return un vecteur contenant le min et max de a, sous la forme [min,max].
	 */
   public int[] trouverMaxMin(int a[]){
	   int max, min;
	   min = a[0];
       max = a[0];
       
       int i;
       for(i=1;i<a.length;i++)
       /*Parcourir les �l�ments de a en cherchant*/{

   		if (a[i]<min) { min = a[i];}
		if (a[i]>max) { max = a[i];}
       }
		return new int[] {min,max};
       }
   
   /**
    * Cette Methode applique la formule *2 � tous les �l�ments d'un vecteur.
	 * @param a vecteur auquel on veut appliquer la formule
	 * @return  renvoie le vecteur r�sultat de la formule.
	 */   
	public int[] appFormulTab(int[] a){
       int i;
       int[] b = new int[a.length];/*Tableau r�sutltat*/
       for(i=0;i<a.length;i++)
    /*Parcourir le tableau en entr�e, appliquer la formule *2 � ses entr�es et les mettre dans le tableau b*/
       {
         b[i] = a[i]*2;
       }
    	   return b;
   }
	
}
