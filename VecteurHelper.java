/**
 * 
 */


import java.util.Scanner;

/**
 * <b>VecteurHelper est la classe contenant plusieurs methodes qui effectuent des opérations sur un vecteur ou plusieurs.</b>
 * <p>
 * Les opérations que assure la class VecteurHelper sont les suivants:
 * <ul>
 * <li>Trier les élements d'un vecteur donné.</li>
 * <li>Sommer deux vecteurs donnés en entrée, cette opération déclenche une exception si la taille des deux vecteurs n'est pas la mème.</li>
 * <li>Fournir l'inverse d'un vecteur Inv{1,2,3}={3,2,1}.</li>
 * <li>Obtenir simultanément le min et le max d'un vecteur.</li>
 * <li>Applique la fonction F(x)=2x à tout élement du vecteur.</li>
 * </ul>
 * <p>
 * De plus, il y a une methode qui permet l'initialisation des élements du vecteur.
 * </p>
 * 
 * @author Djebrouni Yasmine_Bouzidi Halima.
 * @version 1.0 (Réaliser en language Java sous l'IDE Eclipse).
 **/

public class VecteurHelper {
	
    /**
     * Cette methode permet d'initialiser le vecteur, en donnant la taille et les objets qui constituent ce vecteur.
	 * @param a vecteur à initialiser.
	 */
    public void initTab(int[] a){
        int i,elem,taille=0;
        Scanner sc = new Scanner(System.in);
        if(a.length==0){
        System.out.println("donnez la taille du tableau : ");
        taille=sc.nextInt();}
        a = new int[taille] ;
        System.out.println("citer les élements de votre vecteur");
        for(i=0;i<taille;i++){
          elem=sc.nextInt();
          a[i]=elem;
        }
        sc.close();
    }
    
    
    /**
     * Cette Methode effectue le tri par sélection d'un vecteur.
	 * @param a vecteur à trier
	 * @return un vecteur trié.
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
     * Cette Methode inverse l'ordre des éléments d'un vecteur.
	 * @param a vecteur à inverser
	 * @return un vecteur dont les éléments sont dans l'ordre inverse de celui en entrée.
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
     * Cette Methode calcule la somme de deux vecteurs.
	 * @param a un vecteur.
	 * @param b un vecteur.
	 * @return un vecteur résultant de la somme de a et b.
	 * @throws LenghtNotEqualException Si les deux vecteurs n'ont pas la mème taille (le nombre d'élements).
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
    * Cette Methode calcule le min et le max d'un vecteur.
    ** @param a vecteur pour lequel on veut trouver le min et le max.
    ** @return un vecteur contenant le min et max de a, de la forme [min,max].
	 */
   public int[] trouverMaxMin(int a[]){
	   int max, min;
	   min = a[0];
       max = a[0];
       
       int i;
       for(i=1;i<a.length;i++)
       /*Parcourir les éléments de a en cherchant*/{

   		if (a[i]<min) { min = a[i];}
		if (a[i]>max) { max = a[i];}
       }
		return new int[] {min,max};
       }
   
   /**
    * Cette Methode applique la formule *2 à tous les éléments d'un vecteur.
	 * @param a vecteur auquel on veut appliquer la formule
	 * @return  renvoie le vecteur résultant de la formule.
	 */   
	public int[] appFormulTab(int[] a){
       int i;
       int[] b = new int[a.length];/*Tableau résutltat*/
       for(i=0;i<a.length;i++)
    /*Parcourir le tableau en entrée, appliquer la formule *2 à ses entrées et les mettre dans le tableau b*/
       {
         b[i] = a[i]*2;
       }
    	   return b;
   }
	
}
