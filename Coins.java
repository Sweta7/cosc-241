/**
   Coins.java
   Application class provided for la21, COSC241 2017
   to count heads and tail in coin and count run.
*/
package week02;
import java.util.Random;

/** class Coins.
    @author Sweta kumari
*/

public class Coins{

    /** a representation of a head. */
    public static final boolean HEADS = true;
    /** a representation of a tails. */
    public static final boolean TAILS = false;
    /** a representation of a coins. */
    private boolean[] coins;
    
    /** creating instance of Coins constructor and calling various
        method on it.
        @param args not used
    */
    public static void main(String[] args) {
        boolean[] b = {HEADS, TAILS, HEADS, HEADS, TAILS};
        Coins c = new Coins(b);
        //        System.out.println(c.countHeads());
        //        System.out.println(c.toString());
        //        System.out.println(c.countRuns());
        Coins c2 = new Coins("HTHT");
        System.out.println(c2.countHeads());
        System.out.println(c2.toString());
        System.out.println(c2.countRuns());
        Coins c3 = new Coins(5);
        // System.out.println(c3.countHeads());
        //System.out.println(c3.toString());
        // System.out.println(c3.countRuns());
    }

    /** creating Coins constructor taking boolean.
        @param coins array.
    */
    public Coins(boolean[] coins) {
        this.coins = coins;
    }
    
    /** creating Coins constructor taking String c.
        @param c as a String.
    */

    public Coins(String c){
        this.coins = new boolean[c.length()];
        for(int i=0; i<coins.length; i++){
            if(c.charAt(i)=='H'){
                coins[i]=HEADS;
            }else{
                coins[i]=TAILS;
            }
        }    
    }
    
    /** creating Coins constructor taking length.
        @param length to get in constructor.
    */

    public Coins(int length){
        this.coins = new boolean[length];
        Random rand= new Random();
        for(int i =0; i<coins.length; i++){
            coins[i]= rand.nextBoolean();    
        }
    }

    /** to count number of Heads.
        @return the count as the number of heads appeared
    */
    
    public int countHeads(){
        int count=0;
        for(int i=0; i<coins.length; i++){
            if(coins[i]==HEADS){
                count++;
            }
        }
        return count;              
    }

    /** tostring method to convert head to H and tail to T and store in String.
        @return the string for coins  array.
    */
    
    public String toString(){
        String c="";
        for(int i=0; i<coins.length; i++){
            if(coins[i]==HEADS){
                c+='H';
            }else{
                c+='T';
            }
        }
        return c;   
    }

    /** method to count number of runs, if two index are differnt. 
        @return number of runs in array.
    */

    public int countRuns(){
        int run=1;
        for(int i=0; i<(coins.length-1); i++){
            if(!(coins[i]==coins[i+1])){
                //if(!(coins[i] && coins[i+1]))
                run++;
            }
        }
        return run; 
    }    
}
