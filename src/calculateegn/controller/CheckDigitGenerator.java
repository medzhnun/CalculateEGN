
package calculateegn.controller;

/**
 *
 * @author Medzhnun Mehmed
 */
public class CheckDigitGenerator {
    private int sum;
    private final int[] weights = {2, 4, 8, 5, 10, 9, 7, 3, 6};
    private int checkDigit;
    
    public int generateCheckDigit(String shortEGN){
        for (int i = 0; i < shortEGN.length(); i++) {
            sum += (shortEGN.charAt(i)-'0')*weights[i];
        }
        checkDigit = sum%11;
        if (sum%11 == 10) {
            checkDigit = 0;
        }
        return checkDigit;
    }
}
