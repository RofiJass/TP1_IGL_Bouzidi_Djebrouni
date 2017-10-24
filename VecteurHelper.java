/**
 * 
 */

import java.util.Scanner;


/**

 * <b>VecteurHelper est la classe contenant plusieurs methodes qui effectuent des opÃ©rations sur un vecteur ou plusieurs.</b>
=======
 * <h1>VecteurHelper Application </h1>
 * <b>VecteurHelper est la classe contenant plusieurs methodes qui effectuent des opérations sur un vecteur ou plusieurs.</b>
 * <p>
 * Les opÃ©rations que assure la class VecteurHelper sont les suivants:
 * <ul>
 * <li>Trier les Ã©lements d'un vecteur donnÃ©.</li>
 * <li>Sommer deux vecteurs donnÃ©s en entrÃ©e, cette opÃ©ration dÃ©clenche une exception si la taille des deux vecteurs n'est pas la mÃ¨me.</li>
 * <li>Fournir l'inverse d'un vecteur Inv{1,2,3}={3,2,1}.</li>
 * <li>Obtenir simultanÃ©ment le min et le max d'un vecteur.</li>
 * <li>Applique la fonction F(x)=2x Ã  tout Ã©lement du vecteur.</li>
 * </ul>
 * <p>
 * De plus, il y a une methode qui permet l'initialisation des Ã©lements du vecteur.
 * </p>
 * 
 * @author Djebrouni Yasmine_Bouzidi Halima.

 * @version 1.0 (RÃ©aliser en language Java sous l'IDE Eclipse).
=======
 * @version 1.0 (Réalisé en language Java sous l'IDE Eclipse).
 * @ since 2017-10-21

 **/

public class VecteurHelper {
	
    /**

     * Cette methode permet d'initialiser le vecteur, en donnant la taille et les objets qui constituent ce vecteur.
	 * @param a vecteur Ã  initialiser.
=======
     * Cette methode permet d'initialiser le vecteur, en donnant la taille et les élements de ce vecteur.
	 * @param vect un vecteur à initialiser.
	 * @retunr rien

	 */
    public void initTab(int[] vect){
        int i,elem,taille=0;
        Scanner sc = new Scanner(System.in);
        if(vect.length==0){
        System.out.println("donnez la taille du tableau : ");
        taille=sc.nextInt();}

        a = new int[taille] ;
        System.out.println("citer les Ã©lements de votre vecteur");
=======
        vect = new int[taille] ;
        System.out.println("citer les élements de votre vecteur");

        for(i=0;i<taille;i++){
          elem=sc.nextInt();
          vect[i]=elem;
        }
        sc.close();
    }
    
    
    /**

     * Cette Methode effectue le tri par sÃ©lection d'un vecteur.
	 * @param a vecteur Ã  trier
	 * @return un vecteur triÃ©.
=======
     * Cette Methode effectue le tri par sélection d'un vecteur.
	 * @param vect un vecteur à trier, ce dernier doit ètre initialisé.
	 * @return un vecteur trié.

	 */
    public int[] triSelect(int[] vect){
        int i,j,min,f,k;
       int tcurr[]= new int[vect.length];
       for(i=0;i<vect.length;i++){tcurr[i]=vect[i];}
        for(i=0;i<vect.length-1;i++){
            min=tcurr[i];
            for(j=i;j<vect.length;j++){
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

     * Cette Methode inverse l'ordre des Ã©lÃ©ments d'un vecteur.
	 * @param a vecteur Ã  inverser
	 * @return un vecteur dont les Ã©lÃ©ments sont dans l'ordre inverse de celui en entrÃ©e.
=======
     * Cette Methode inverse l'ordre des éléments d'un vecteur. par exemple le vecteur initiale est celui-ci : [1,2,3] son inverse est : [3,2,1].
	 * @param vect un vecteur à inverser
	 * @return un vecteur dont les éléments sont dans l'ordre inverse de celui en entrée.

	 */
    public int[] inversTab(int[] vect){
    	int[] tableInv= new int[vect.length] ;
        int i;
        for(i=0;i<vect.length;i++){
          tableInv[i] = vect[vect.length-1-i];
        }
        return tableInv;
    }
    
    /**

     * Cette Methode calcule la somme de deux vecteurs.
	 * @param a un vecteur.
	 * @param b un vecteur.
	 * @return un vecteur rÃ©sultant de la somme de a et b.
	 * @throws LenghtNotEqualException Si les deux vecteurs n'ont pas la mÃ¨me taille (le nombre d'Ã©lements).
=======
     * Cette Methode calcule la somme de deux vecteurs, si on a vect1 = [1,2,3] et vect2 = [1,2,3] alors le vecteur resultat est le suivant : [2,4,6].
	 * @param vect1 le premier vecteur paramètre de la methode..
	 * @param vect2 le deuxième vecteur paramètre de la methode..
	 * @return un vecteur résultat de la somme de a et b.
	 * @throws LenghtNotEqualException Si les deux vecteurs n'ont pas la mème taille (le nombre d'élements).
	 * @see LenghtNotEqualException

	 */
    public int[] sommeVect(int[] vect, int[] vect2)throws LenghtNotEqualException{
        int i,tailA,tailB ;
        tailA=vect.length;
        tailB=vect.length;
        if(tailA!=tailB){        	
            throw new LenghtNotEqualException();
        }else{
         int result[]= new int[tailA] ; 
         for(i=0;i<tailA;i++){
             result[i]=vect[i]+vect[i] ;
         }
         return result;
        }
    }
    

   /**
    * Cette Methode calcule le min et le max d'un vecteur, par exemple cherche le MinMax du vect = [25,0,9563] alors la methode renvoie le vecteur [0,9563] qui contient le MinMax du vecteur en entrée.
    ** @param vect vecteur pour lequel on veut trouver le min et le max.
    ** @return un vecteur contenant le min et max de a, sous la forme [min,max].
	 */
   public int[] trouverMaxMin(int vect[]){
	   int max, min;
	   min = vect[0];
       max = vect[0];
       
       int i;

       for(i=1;i<a.length;i++)
       /*Parcourir les Ã©lÃ©ments de a en cherchant*/{
=======
       for(i=1;i<vect.length;i++)
       /*Parcourir les éléments de a en cherchant*/{


   		if (vect[i]<min) { min = vect[i];}
		if (vect[i]>max) { max = vect[i];}
       }
		return new int[] {min,max};
       }
   
   /**

    * Cette Methode applique la formule *2 Ã  tous les Ã©lÃ©ments d'un vecteur.
	 * @param a vecteur auquel on veut appliquer la formule
	 * @return  renvoie le vecteur rÃ©sultant de la formule.
=======
    * Cette Methode applique la formule f(x)=2x à tous les éléments d'un vecteur.
	 * @param vect vecteur auquel on veut appliquer la formule
	 * @return  renvoie le vecteur résultat de la formule.

	 */   
	public int[] appFormulTab(int[] vect){
       int i;

       int[] b = new int[a.length];/*Tableau rÃ©sutltat*/
       for(i=0;i<a.length;i++)
    /*Parcourir le tableau en entrÃ©e, appliquer la formule *2 Ã  ses entrÃ©es et les mettre dans le tableau b*/
=======
       int[] b = new int[vect.length];/*Tableau résutltat*/
       for(i=0;i<vect.length;i++)
    /*Parcourir le tableau en entrée, appliquer la formule *2 à ses entrées et les mettre dans le tableau b*/

       {
         b[i] = vect[i]*2;
       }
    	   return b;
   }
	
}
