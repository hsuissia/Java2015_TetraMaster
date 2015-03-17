package models.game;

import models.collection_management.Cm_Current_Deck;
import models.global.Tm_Player;
import models.global.Tm_Player_Data;

public class Gm_Player {
    private String color = "";
    private Cm_Current_Deck player_deck = null;
    private final Tm_Player_Data player_data;

    public Gm_Player(Tm_Player global_player, String color, Cm_Current_Deck player_deck){
        this.color = color;
        this.player_data = global_player.get_Tm_Player_Data();
        this.player_deck = player_deck;
    }
}
