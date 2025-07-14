
package calculateegn;

import calculateegn.controller.CheckEGN;

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
        for (String s : newEGN.generateEGN(2002, 2, 20, Province.ДРУГ_НЕИЗВЕСТЕН)) {
            System.out.println(s);
        }
    }    
}
