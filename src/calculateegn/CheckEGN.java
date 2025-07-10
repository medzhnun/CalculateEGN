
package calculateegn;


/**
 *
 * @author Medzhnun Mehmed
 */
public class CheckEGN {

    private final int[] weights = {2, 4, 8, 5, 10, 9, 7, 3, 6};
    
     
    public boolean validateEGN(String egn){
        int tempEGN = 0;
        int checkDigit;
        if (egn.isEmpty() || egn.length() != 10 || !egn.matches("[0-9]+")) {
            throw new IllegalArgumentException("Липсващо или неправилно ЕГН");
        } else if(Integer.parseInt(egn.substring(6, 9))>999 || Integer.parseInt(egn.substring(6, 9)) < 0){
            throw new IllegalArgumentException("Не съществуващ регион");
        } else if ((Integer.parseInt(egn.substring(2, 4)) > 12 && 
                      Integer.parseInt(egn.substring(2, 4)) != 32 &&
                      Integer.parseInt(egn.substring(2, 4)) !=52) ||
                      Integer.parseInt(egn.substring(4, 6)) > 31){
            throw new IllegalArgumentException("Неправилна дата на раждане");
        } else {
            for (int i = 0; i < egn.length()-1; i++) {
                tempEGN += (egn.charAt(i)-'0')*weights[i];
            }
            checkDigit= tempEGN%11;
        }
        
        return Integer.parseInt(egn.substring(egn.length()-1)) == checkDigit;
    }
}
