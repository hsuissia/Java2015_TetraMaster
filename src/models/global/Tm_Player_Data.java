package models.global;

import java.util.HashMap;
import java.util.Map;

public class Tm_Player_Data {
    private String first_name = "";
    private String last_name = "";
    private String pseudo = "";
    private int number_won_game;
    private int number_lost_game;
    private int number_draw_game;
    private double win_percentage;

    public Tm_Player_Data(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
        this.init_stat();
    }
    public Tm_Player_Data(String pseudo){
        this.pseudo = pseudo;
        this.init_stat();
    }
    private void init_stat(){
        this.number_lost_game = 0;
        this.number_won_game = 0;
        this.win_percentage = 0.0;
        this.number_draw_game = 0;
    }

    private void fill_names (String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
    }

    private void fill_pseudo (String pseudo){ this.pseudo = pseudo;}

    public String update_stats(String game_result){
        if(game_result.equalsIgnoreCase("win")){
            this.number_won_game += 1;
        }
        else if(game_result.equalsIgnoreCase("lose")) {
            this.number_lost_game += 1;
        }
        else if(game_result.equalsIgnoreCase("draw")) {
            this.number_draw_game += 1;
        }
        else{
            return "Incorrect Data Format";
        }
        update_win_percentage();
        return "OK";
    }
    private void update_win_percentage(){
        this.win_percentage = ((this.number_won_game)/
                (this.number_draw_game + this.number_lost_game + this.number_won_game)) * 100;
    }
    private Map<String,String> get_formated_player_data(){
        Map<String,String> result = new HashMap<String, String>();
        result.put("first_name", first_name);
        result.put("last_name", last_name);
        result.put("pseudo", pseudo);
        result.put("number_won_game", Integer.toString(number_won_game));
        result.put("number_lost_game", Integer.toString(number_lost_game));
        result.put("number_draw_game", Integer.toString(number_draw_game));
        result.put("win_percentage", Double.toString(win_percentage));
        return result;
    }


}
