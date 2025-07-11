
package calculateegn.controler;


/**
 *
 * @author Medzhnun Mehmed
 */
public class CheckEGN {
    
    private int check;
     
    public boolean validateEGN(String egn){

        if (egn.isEmpty() || egn.length() != 10 || !egn.matches("[0-9]+")) {
            throw new IllegalArgumentException("Липсващо или неправилно ЕГН");
        } else if(Integer.parseInt(egn.substring(6, 9))>999 || Integer.parseInt(egn.substring(6, 9)) < 0){
            throw new IllegalArgumentException("Не съществуващ регион");
        } else if ((Integer.parseInt(egn.substring(2, 4)) > 12 && 
                      (Integer.parseInt(egn.substring(2, 4)) < 21 || Integer.parseInt(egn.substring(2, 4)) > 32) &&
                      (Integer.parseInt(egn.substring(2, 4)) < 41 || Integer.parseInt(egn.substring(2, 4)) > 52) ||
                      Integer.parseInt(egn.substring(4, 6)) > 31)){
            throw new IllegalArgumentException("Неправилна дата на раждане");
        } else {
            check = new CheckDigitGenerator().geerateCheckDigit(egn.substring(0, 9));
        }
        
        return Integer.parseInt(egn.substring(egn.length()-1)) == check;
    }
}
