
package VecteurHelp;

import java.util.Scanner;

/**
 * @author pc
 *
 */
public class VecteurHelper {
	
	public int table [] ;
    public int taille=0;
    public int tableInv[]=null;
    public int tableTrie[]=null;
    
    
    /**
     * Cette methode permet d'initialiser le tableau, en donnant la taille et les objets qui construit ce tableau
	 * @param rien
	 */
    public void initTab(){
        int i,elem;
        Scanner sc = new Scanner(System.in);
        if(this.taille==0){
        System.out.println("donnez la taille du tableau : ");
        this.taille=sc.nextInt();}
        this.table = new int[taille] ;
        System.out.println("citer les élements de votre vecteur");
        for(i=0;i<taille;i++){
          elem=sc.nextInt();
          this.table[i]=elem;
        }
    }
    
    /**
     * Cette Methode permet d'afficher les élements d'un tableau donné, de son inverse (s'il existe), de la table trié (si l'utilisateur a demandé le tri) 
	 * @param args
	 */
    public void affichTab(){
        int i;
        for(i=0;i<this.taille;i++){
            System.out.print(" |"+this.table[i]+"|");
        }
        
        if(this.tableInv!=null){
        	System.out.println("");
            System.out.println("L'inverse du tableau est:");
          for(i=0;i<this.taille;i++){
            System.out.print(" |"+this.tableInv[i]+"|");
        }
          if(this.tableTrie!=null){
        	  System.out.println("");
                  System.out.println("Le tableau trie est est:");
                for(i=0;i<this.taille;i++){
                  System.out.print(" |"+this.tableTrie[i]+"|");
              } 
          }
        }
    }
    
    /**
     * Cette Methode 
	 * @param args
	 */
    public void triSelect(){
        int i,j,min,f,k;
       int tcurr[]= new int[this.taille];
       for(i=0;i<this.taille;i++){tcurr[i]=this.table[i];}
        for(i=0;i<this.taille-1;i++){
            min=tcurr[i];
            for(j=i;j<this.taille;j++){
                if(tcurr[j]<min){
                    min=tcurr[j];
                    k=j;
                    f=tcurr[i];
                    tcurr[i]=min;
                    tcurr[k]=f;     
                }
            }
        }
        this.tableTrie=tcurr;
    }
    
    
    public void inversTab(){
        this.tableInv= new int[this.taille] ;
        int i;
        for(i=0;i<this.taille;i++){
          this.tableInv[i] = this.table[this.taille-1-i];
        }
    }
    
    /************************version 1********************************/
    /***** mais ici je dois travailler avec la methode length et les methodes predifinies interdites pour ce TP!*/
   static int[] sommeVect(int[] a, int[] b) throws LenghtNotEqualException{
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
    

   /*************************Version2**********************************/
   /***celle-ci est la plus logique pour moi***************************/
   
   static VecteurHelper sommeVect(VecteurHelper a, VecteurHelper b) throws LenghtNotEqualException{
       int i ;
       /***on peut enlever les scanf hado c'est juste pour le test**/
       Scanner sc = new Scanner(System.in);
       System.out.println("donnez la taille du premier tableau : ");
       a.taille=sc.nextInt();
       System.out.println("donnez la taille du deuxième tableau : ");
       b.taille=sc.nextInt();
       if(a.taille!=b.taille){
           throw new LenghtNotEqualException();
       }else{
    	   VecteurHelper c = new VecteurHelper();
           a.initTab();
           b.initTab();
        int result[]= new int[a.taille] ; 
        for(i=0;i<a.taille;i++){
            result[i]=a.table[i]+b.table[i] ;
        }
        c.taille=a.taille;
        c.table=result;
        for(i=0;i<a.taille;i++){
            System.out.print(" |"+result[i]+"|");
        }
        return c;
       }
   }
   
   
	public static void main(String[] args) throws LenghtNotEqualException  {
		// TODO Auto-generated method stub
	        // TODO code application logic here
	        VecteurHelper o =new VecteurHelper();
	        o.initTab();
	        o.triSelect();
	        o.inversTab();
	        //System.out.println("Voici le tableau trié ");
	        o.affichTab();
	        
	        
		/*********** test de la somme ***************/
	        /*VecteurHelper a = new VecteurHelper();
	        VecteurHelper b = new VecteurHelper();
	        VecteurHelper c = new VecteurHelper();
	        c=sommeVect(a,b);
	        c.affichTab();
	        /*a.initTab();
	        a.inversTab();
	        a.affichTab();*/

	}

}

