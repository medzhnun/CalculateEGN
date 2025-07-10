/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculateegn;

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
    private final int[] weights = new int[] {2, 4, 8, 5, 10, 9, 7, 3, 6};

    public GenerateEGN(int year, int month, int day, boolean isFemale, Province province) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.isFemale = isFemale;
        this.province = province;
    }
    
    public String[] generateEGN(int year, int month, int day, boolean female, Province province){
        int range = province.getStopIndex()-province.getStartIndex();
        String[] generatedEGN = new String[range];
        if (year < 1900) {
            month+=20;
        }
        if (year>1999) {
            month+=40;
        }
        if (year >2099 || year <0) {
            throw new IllegalArgumentException("Годината трябва да е по-малка от 2099 и да не е отрицателна");
        } else if (month < 1 || month >12 || (month<21 && month >32) ||(month<41&&month>52 )) {
            throw new IllegalArgumentException("Месеца на раждане не е определен");
        } else if(day < 1 || day >31){
            throw new IllegalArgumentException("Денят на раждане не е определен");
        } else {
            
            for (int i = province.getStartIndex(); i <= province.getStopIndex(); i++) {
                
            }
            
        }
        
        return generatedEGN;
    }
    
}
