/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculateegn;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class CalculateEGN {
    
//    $EGN_WEIGHTS = array(2,4,8,5,10,9,7,3,6);
//
//                                           /* Отделени номера */
//    $EGN_REGIONS["Благоевград"]       = 43;  /* от 000 до 043 */ 
//    $EGN_REGIONS["Бургас"]            = 93;  /* от 044 до 093 */ 
//    $EGN_REGIONS["Варна"]             = 139; /* от 094 до 139 */ 
//    $EGN_REGIONS["Велико Търново"]    = 169; /* от 140 до 169 */ 
//    $EGN_REGIONS["Видин"]             = 183; /* от 170 до 183 */ 
//    $EGN_REGIONS["Враца"]             = 217; /* от 184 до 217 */ 
//    $EGN_REGIONS["Габрово"]           = 233; /* от 218 до 233 */ 
//    $EGN_REGIONS["Кърджали"]          = 281; /* от 234 до 281 */ 
//    $EGN_REGIONS["Кюстендил"]         = 301; /* от 282 до 301 */ 
//    $EGN_REGIONS["Ловеч"]             = 319; /* от 302 до 319 */ 
//    $EGN_REGIONS["Монтана"]           = 341; /* от 320 до 341 */ 
//    $EGN_REGIONS["Пазарджик"]         = 377; /* от 342 до 377 */ 
//    $EGN_REGIONS["Перник"]            = 395; /* от 378 до 395 */ 
//    $EGN_REGIONS["Плевен"]            = 435; /* от 396 до 435 */ 
//    $EGN_REGIONS["Пловдив"]           = 501; /* от 436 до 501 */ 
//    $EGN_REGIONS["Разград"]           = 527; /* от 502 до 527 */ 
//    $EGN_REGIONS["Русе"]              = 555; /* от 528 до 555 */ 
//    $EGN_REGIONS["Силистра"]          = 575; /* от 556 до 575 */ 
//    $EGN_REGIONS["Сливен"]            = 601; /* от 576 до 601 */ 
//    $EGN_REGIONS["Смолян"]            = 623; /* от 602 до 623 */ 
//    $EGN_REGIONS["София - град"]      = 721; /* от 624 до 721 */ 
//    $EGN_REGIONS["София - окръг"]     = 751; /* от 722 до 751 */ 
//    $EGN_REGIONS["Стара Загора"]      = 789; /* от 752 до 789 */ 
//    $EGN_REGIONS["Добрич (Толбухин)"] = 821; /* от 790 до 821 */ 
//    $EGN_REGIONS["Търговище"]         = 843; /* от 822 до 843 */ 
//    $EGN_REGIONS["Хасково"]           = 871; /* от 844 до 871 */ 
//    $EGN_REGIONS["Шумен"]             = 903; /* от 872 до 903 */ 
//    $EGN_REGIONS["Ямбол"]             = 925; /* от 904 до 925 */ 
//    $EGN_REGIONS["Друг/Неизвестен"]   = 999; /* от 926 до 999 - Такъв регион понякога се ползва при
//                                                                родени преди 1900, за родени в чужбина
//                                                                или ако в даден регион се родят повече
//                                                                деца от предвиденото. Доколкото ми е
//                                                                известно няма правило при ползването
    private static final String[] PROVINCES = new String[]{"Благоевград", "Бургас",
        "Варна", "Велико Търново", "Видин", "Враца", "Габрово", "Кърджали", "Кюстендил", 
        "Ловеч", "Монтана", "Пазарджик", "Перник", "Плевен", "Пловдив", "Разград", 
        "Русе", "Силистра", "Сливен", "Смолян", "София-град", "София-окръг", 
        "Стара Загора", "Добрич", "Търговище", "Хасково", "Шумен", "Ямбол", "Друг/Неизвестен"};
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
                provinceNumber = getRandomNumberInRange(94, 140);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "велико търново":
                provinceNumber = getRandomNumberInRange(140, 170);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "видин":
                provinceNumber = getRandomNumberInRange(170, 184);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "враца":
                provinceNumber = getRandomNumberInRange(184, 218);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "габрово":
                provinceNumber = getRandomNumberInRange(218, 234);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "кърджали":
                provinceNumber = getRandomNumberInRange(234, 282);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "кюстендил":
                provinceNumber = getRandomNumberInRange(282, 302);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "ловеч":
                provinceNumber = getRandomNumberInRange(302, 320);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "монтана":
                provinceNumber = getRandomNumberInRange(320, 342);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "пазарджик":
                provinceNumber = getRandomNumberInRange(342, 378);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "перник":
                provinceNumber = getRandomNumberInRange(378, 396);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "плевен":
                provinceNumber = getRandomNumberInRange(396, 436);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "пловдив":
                provinceNumber = getRandomNumberInRange(436, 502);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "разград":
                provinceNumber = getRandomNumberInRange(502, 528);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "русе":
                provinceNumber = getRandomNumberInRange(528, 556);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "силистра":
                provinceNumber = getRandomNumberInRange(556, 576);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "сливен":
                provinceNumber = getRandomNumberInRange(576, 602);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "смолян":
                provinceNumber = getRandomNumberInRange(602, 624);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "софия - град":
                provinceNumber = getRandomNumberInRange(624, 722);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "софия - окръг":
                provinceNumber = getRandomNumberInRange(722, 752);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "стара загора":
                provinceNumber = getRandomNumberInRange(752, 790);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "добрич":
                provinceNumber = getRandomNumberInRange(790, 822);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "търговище":
                provinceNumber = getRandomNumberInRange(822, 844);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "хасково":
                provinceNumber = getRandomNumberInRange(844, 872);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "шумен":
                provinceNumber = getRandomNumberInRange(872, 904);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "ямбол":
                provinceNumber = getRandomNumberInRange(904, 926);
//                if ("м".equals(sex)) {
//                    
//                }
                break;
            case "друг":
                provinceNumber = getRandomNumberInRange(926, 999);
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
