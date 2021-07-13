package za.co.bmw;

/**
 * A palindrome is a word, number, phrase, or other sequence of characters which 
   reads the same backward as forward, such as madam or racecar 

  TEST:
   mom -> true
   madam -> true
   racecar -> true
   shoprite -> false
   Was it a car or a cat I saw? -> true
   Mr. Owl ate my metal worm -> true
 */
public class Palindrome {
    public static void main(String[] args) {
        String emptyString = "";
        String strToReverse = "mom";
//        String strToReverse = "madam";
//        String strToReverse = "racecar";
//        String strToReverse = "shoprite";
//        String strToReverse = "Was it a car or a cat I saw?".replace( " ", "").replace(".", "").replace("?", "");
//        String strToReverse = "Mr. Owl ate my metal worm".replace(" ", "").replace(".", "").replace("?", "");

        for (int i = strToReverse.length() - 1; i >= 0; i--) {
            emptyString = emptyString + strToReverse.charAt(i);
        }

        System.out.println(emptyString.equalsIgnoreCase(strToReverse));
    }
}
