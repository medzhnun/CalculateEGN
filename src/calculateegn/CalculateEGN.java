/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculateegn;

import java.util.Scanner;
import java.util.Random;

public class CalculateEGN {
    

    /**
     * @param args the command line arguments
     */
    
    private static int getRandomNumberInRange(int min, int max) {
		if (min >= max) {
                    throw new IllegalArgumentException("max must be greater than min");
		}
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Въведете дата на раждане (дд.мм.гггг): ");
        String birthDate = scan.nextLine();
//        System.out.print("Въведете пол (м/ж): ");
//        String sex = scan.nextLine();
        System.out.print("Въведете областен град: ");
        String province = scan.nextLine();
        int provinceNumber = 0;
        switch (province.toLowerCase()) {
            case "благоевград":
                provinceNumber = getRandomNumberInRange(Province.БЛАГОЕВГРАД.getStartIndex(), Province.БЛАГОЕВГРАД.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "бургас":
                provinceNumber = getRandomNumberInRange(Province.БУРГАС.getStartIndex(), Province.БУРГАС.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "варна":
                provinceNumber = getRandomNumberInRange(Province.ВАРНА.getStartIndex(), Province.ВАРНА.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "велико търново":
                provinceNumber = getRandomNumberInRange(Province.ВЕЛИКО_ТЪРНОВО.getStartIndex(), Province.ВЕЛИКО_ТЪРНОВО.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "видин":
                provinceNumber = getRandomNumberInRange(Province.ВИДИН.getStartIndex(), Province.ВИДИН.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "враца":
                provinceNumber = getRandomNumberInRange(Province.ВРАЦА.getStartIndex(), Province.ВРАЦА.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "габрово":
                provinceNumber = getRandomNumberInRange(Province.ГАБРОВО.getStartIndex(), Province.ГАБРОВО.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "кърджали":
                provinceNumber = getRandomNumberInRange(Province.КЪРДЖАЛИ.getStartIndex(), Province.КЪРДЖАЛИ.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "кюстендил":
                provinceNumber = getRandomNumberInRange(Province.КЮСТЕНДИЛ.getStartIndex(), Province.КЮСТЕНДИЛ.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "ловеч":
                provinceNumber = getRandomNumberInRange(Province.ЛОВЕЧ.getStartIndex(), Province.ЛОВЕЧ.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "монтана":
                provinceNumber = getRandomNumberInRange(Province.МОНТАНА.getStartIndex(), Province.МОНТАНА.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "пазарджик":
                provinceNumber = getRandomNumberInRange(Province.ПАЗАРДЖИК.getStartIndex(), Province.ПАЗАРДЖИК.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "перник":
                provinceNumber = getRandomNumberInRange(Province.ПЕРНИК.getStartIndex(), Province.ПЕРНИК.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "плевен":
                provinceNumber = getRandomNumberInRange(Province.ПЛЕВЕН.getStartIndex(), Province.ПЛЕВЕН.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "пловдив":
                provinceNumber = getRandomNumberInRange(Province.ПЛОВДИВ.getStartIndex(), Province.ПЛОВДИВ.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "разград":
                provinceNumber = getRandomNumberInRange(Province.РАЗГРАД.getStartIndex(), Province.РАЗГРАД.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "русе":
                provinceNumber = getRandomNumberInRange(Province.РУСЕ.getStartIndex(), Province.РУСЕ.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "силистра":
                provinceNumber = getRandomNumberInRange(Province.СИЛИСТРА.getStartIndex(), Province.СИЛИСТРА.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "сливен":
                provinceNumber = getRandomNumberInRange(Province.СЛИВЕН.getStartIndex(), Province.СЛИВЕН.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "смолян":
                provinceNumber = getRandomNumberInRange(Province.СМОЛЯН.getStartIndex(), Province.СМОЛЯН.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "софия - град":
                provinceNumber = getRandomNumberInRange(Province.СОФИЯ_ГРАД.getStartIndex(), Province.СОФИЯ_ГРАД.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "софия - окръг":
                provinceNumber = getRandomNumberInRange(Province.СОФИЯ_ОКРЪГ.getStartIndex(), Province.СОФИЯ_ОКРЪГ.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "стара загора":
                provinceNumber = getRandomNumberInRange(Province.СТАРА_ЗАГОРА.getStartIndex(), Province.СТАРА_ЗАГОРА.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "добрич":
                provinceNumber = getRandomNumberInRange(Province.ДОБРИЧ.getStartIndex(), Province.ДОБРИЧ.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "търговище":
                provinceNumber = getRandomNumberInRange(Province.ТЪРГОВИЩЕ.getStartIndex(), Province.ТЪРГОВИЩЕ.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "хасково":
                provinceNumber = getRandomNumberInRange(Province.ХАСКОВО.getStartIndex(), Province.ХАСКОВО.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "шумен":
                provinceNumber = getRandomNumberInRange(Province.ШУМЕН.getStartIndex(), Province.ШУМЕН.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "ямбол":
                provinceNumber = getRandomNumberInRange(Province.ЯМБОЛ.getStartIndex(), Province.ЯМБОЛ.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "друг":
                provinceNumber = getRandomNumberInRange(Province.ДРУГ_НЕИЗВЕСТЕН.getStartIndex(), Province.ДРУГ_НЕИЗВЕСТЕН.getStopIndex());
//                if ("м".equals(sex)) {
//                    
//                }
                break;           
            default:
                System.out.println("Не е област в България!");
        }
        
        String[] splitedBirthDate = birthDate.split("[\\s.,/-]+");
        int[] weight = new int[] {2, 4, 8, 5, 10, 9, 7, 3, 6};
        int fullYear = Integer.parseInt(splitedBirthDate[2]);
        int year = Integer.parseInt(splitedBirthDate[2].substring(2));
        int month = Integer.parseInt(splitedBirthDate[1]);
        if (fullYear>1999) {
            month = month+40;
        }
        if (fullYear<1900) {
            month = month+20;
        }
        
        int day = Integer.parseInt(splitedBirthDate[0]);
        
        int firstWeight = (year/10)*weight[0];
        int secondWeight = (year%10)*weight[1];
        int thirdWeight = (month/10)*weight[2];
        int fourthWeight = (month%10)*weight[3];
        int fifthWeight = (day/10)*weight[4];
        int sixWeight = (day%10)*weight[5];
        int seventhWeight = (provinceNumber/100)*weight[6];
        int eigthWeight = ((provinceNumber%100)/10)*weight[7];
        int ninethWeight = (provinceNumber%10)*weight[8];
        int tenthDigit = (firstWeight + secondWeight + thirdWeight + fourthWeight
                + fifthWeight + sixWeight + seventhWeight + eigthWeight + ninethWeight)%11;
        
        
        
        
        if (tenthDigit == 10) {
            tenthDigit = 0;
        }
        
//        System.out.println(provinceNumber);
//        System.out.println(firstWeight + " " + secondWeight + " " + thirdWeight 
//                + " " + fourthWeight + " " + fifthWeight + " " + sixWeight
//                + " " + seventhWeight + " " + eigthWeight + " " + ninethWeight + " " + tenthDigit);
        System.out.printf("%02d%02d%02d%03d%d%n", year,month,day, provinceNumber,tenthDigit);
//        System.out.println(Arrays.toString(splitedBirthDate));
    }    
}
