/**
 * 
 */
package VecteurHelper;

import java.util.Scanner;

/**
 * @author Bouzidi Djebrouni
 *
 */
public class VecteurHelper {
	
    /**
     * Cette methode permet d'initialiser le tableau, en donnant la taille et les objets qui constituent ce tableau.
	 * @param Tableau à initialiser
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
    }
    
    
    /**
     * Cette Methode effectue le tri par sélection d'un tableau.
	 * @param a tableau à trier
	 * @return tcurr tableau trié.
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
     * Cette Methode inverse l'ordre des éléments d'un tableau.
	 * @param a tableau à inverser
	 * @return tableInv tableau dont les éléments sont dans l'ordre inverse de celui en entrée.
	 */
    public int[] inversTab(int[] a){
    	int tableInv[] = null;
        int i;
        for(i=0;i<a.length;i++){
          tableInv[i] = a[a.length-1-i];
        }
        return tableInv;
    }
    
    /**
     * Cette Methode calcule la somme de deux vecteurs. elle renvoie une exception si les deux tableaux n'ont pas la mème taille.
	 * @param a et b, deux tablaux qu'on calcule leur somme.
	 * @return result, tableau résultant de la somme de a et b.
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
         //this.table = result;
         for(i=0;i<tailA;i++){
             System.out.print(" |"+result[i]+"|");
         }
         return result;
        }
    }
    

   /**
    * Cette Methode calcule le min et le max d'un tableau.
    ** @param a tableau pour lequel on veut trouver le min et le max.
    ** @return {min,max} , un tableau contenant le min et max de a.
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
    * Cette Methode applique la formule *2 à tous les éléments d'un tableau.
	 * @param a tableau auquel on veut appliquer la formule
	 * @return b renvoie le tableau résultant de la formule.
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
