
package calculateegn;

import calculateegn.controler.CheckEGN;

/**
 *
 * @author Medzhnun Mehmed
 */
public class MainTest {
    public static void main(String[] args) {
        CheckEGN egn = new CheckEGN();
//        System.out.println(egn.validateEGN("6704148327"));
//        System.out.println(egn.validateEGN("7507100466"));
//        System.out.println(egn.validateEGN("1352205781"));
        GenerateEGN newEGN = new GenerateEGN();
        for (String s : newEGN.generateEGN(2013, 12, 20, Province.СЛИВЕН)) {
            System.out.println(s);
        }
    }    
}
