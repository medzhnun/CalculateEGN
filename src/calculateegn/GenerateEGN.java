
package calculateegn;

import calculateegn.controller.CheckDigitGenerator;

/**
 *
 * @author Medzhnun Mehmed
 */
public class GenerateEGN {
    private int egnCounts = 0;
    private int year;
    private int month;
    private int day;
    private boolean isFemale;
    private Province province;
    
//    public GenerateEGN(int year, int month, int day, boolean isFemale, Province province) {
//        this.year = year;
//        this.month = month;
//        this.day = day;
//        this.isFemale = isFemale;
//        this.province = province;
//    }
    
    public String[] generateEGN(int year, int month, int day, Province province){
        int range = province.getStopIndex()-province.getStartIndex()+1;
         String[] generatedEGN = new String[range];
        if (year < 1900) {
            month+=20;
        }
        if (year>1999) {
            month+=40;
        }
        if (year >2099 || year <= 1800) {
            throw new IllegalArgumentException("Годината трябва да е между 1800 и 2099 и да не е отрицателна");
        } else if (month < 1 || (month<21 && month >32) ||(month<41 && month > 52 )) {
            throw new IllegalArgumentException("Месеца на раждане не е определен");
        } else if(day < 1 || day >31){
            throw new IllegalArgumentException("Денят на раждане не е определен");
        } else {

            String shortDateTime = String.format("%02d", year%100)
                                            .concat(String.format("%02d", month))
                                            .concat(String.format("%02d", day));
            String egnWithoutCheck ;
            for (int i = 0; i <range; i++) {
                egnWithoutCheck = shortDateTime.concat(String.format("%03d",province.getStartIndex()+i));
                int checkDigit = new CheckDigitGenerator().generateCheckDigit(egnWithoutCheck);
                generatedEGN[i] = egnWithoutCheck.concat(String.valueOf(checkDigit));
            }            
        }        
        return generatedEGN;
    }    
}
