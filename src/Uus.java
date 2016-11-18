/**
 * Created by opilane on 18.11.2016.
 */
public class Uus {

    public static boolean frontAgain(String str) {
        boolean ans= false;
        char[] sca = str.toCharArray();

        char letter1= sca[0];
        char letter2=sca[1];

        int length = sca.length-1;
        char letter3=sca[length-1];
        char letter4=sca[length];

        if ((letter1==letter3) && (letter2==letter4)) {
            return true;
        }else{
            return false;
            }
        }

   public static void main(String[] args){

       System.out.print(frontAgain("edited"));
   }
}




