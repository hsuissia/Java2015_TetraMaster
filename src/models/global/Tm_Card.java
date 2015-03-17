package models.global;

import models.global.Tm_Card_Arrows;
import models.global.Tm_Player;

public class Tm_Card {
    private String power = "";
    /*
        P -> Physical
        M -> Magical
        X -> Flexible
        A -> Assault
     */
    private String battle_class = "";
    private String physical_defense = "";
    private String magical_defense = "";
    /*
        0: 00 -> 15
        1: 16 -> 31
        ....
        F: 240 -> 255
        (16 x F(15) = 240 (+15)
     */
    private Tm_Player owner = null;
    private Tm_Card_Arrows card_arrows;
    private int card_image_id;

    public Tm_Card(){
        this.card_arrows = new Tm_Card_Arrows("random");
    }

}
