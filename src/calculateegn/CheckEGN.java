
package calculateegn;

/**
 *
 * @author Medzhnun Mehmed
 */
public class CheckEGN {
    private int year;
    private int month;
    private int day;
    private boolean isFemale;
    private Province province;
    private boolean valid = false;
    private final int[] weights = {2, 4, 8, 5, 10, 9, 7, 3, 6};
    
    public CheckEGN(int year, int month, int day, boolean isFemale, Province province) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.isFemale = isFemale;
        this.province = province;
    }
    
    public boolean egnValidation(){
        if (year <1900) {
            month+=20;
        }
        if (year>1999) {
            month+=40;
        }
        year = year%100;
        
        
        return true;
    }
    
}
