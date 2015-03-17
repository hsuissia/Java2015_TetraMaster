package controllers.game;

import views.Game;

public class Controller_Game {

    private Game frame_gm = null;

    public Controller_Game(){
        this.frame_gm = new Game();
    }
    public void start_game(){
        this.frame_gm.open();
    }
}
