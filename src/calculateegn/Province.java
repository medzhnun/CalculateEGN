/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package calculateegn;

/**
 *
 * @author Medzhnun Mehmed
 */
public enum Province {
    
    БЛАГОЕВГРАД(0, 43),
    БУРГАС(44, 93),
    ВАРНА(94, 139),
    ВЕЛИКО_ТЪРНОВО(140,169),
    ВИДИН(170,183),
    ВРАЦА(184, 217),
    ГАБРОВО(218, 233),
    КЪРДЖАЛИ(234, 281),
    КЮСТЕНДИЛ(282, 301),
    ЛОВЕЧ(302, 319),
    МОНТАНА(320, 341),
    ПАЗАРДЖИК(342, 377),
    ПЕРНИК(378, 395),
    ПЛЕВЕН(396, 435),
    ПЛОВДИВ(436, 501),
    РАЗГРАД(502, 527),
    РУСЕ(528, 555),
    СИЛИСТРА(556, 575),
    СЛИВЕН(576, 601),
    СМОЛЯН(602, 623),
    СОФИЯ_ГРАД(624, 721),
    СОФИЯ_ОКРЪГ(722, 751),
    СТАРА_ЗАГОРА(752, 789),
    ДОБРИЧ(790, 821),
    ТЪРГОВИЩЕ(822, 843),
    ХАСКОВО(844,871),
    ШУМЕН(872, 903),
    ЯМБОЛ(904, 925),
    ДРУГ_НЕИЗВЕСТЕН(926,999);
    
    private int startIndex;
    private int stopIndex;

    private Province(int startIndex, int stopIndex) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
    }
    
    
}
