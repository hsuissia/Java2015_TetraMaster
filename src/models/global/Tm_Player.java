package models.global;

public class Tm_Player {
    private Tm_Player_Data player_data = null;

    private Tm_Player(String pseudo){
        player_data = new Tm_Player_Data(pseudo);

    }
    private Tm_Player(String first_name, String last_name){
        player_data = new Tm_Player_Data(first_name,last_name);
    }

    public Tm_Player_Data get_Tm_Player_Data(){
        return player_data;
    }
}
