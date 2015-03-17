package controllers.global;

import controllers.collection_management.Controller_Cm;
import controllers.game.Controller_Game;

public class Controller_Tetramaster {

    private Controller_Cm ctrl_cm = null;
    private Controller_Game ctrl_gm = null;

    public Controller_Tetramaster(){
        this.ctrl_cm = new Controller_Cm();
        this.ctrl_gm = new Controller_Game();
    }

    public void start_game(){
        this.ctrl_cm.start_collection_management();
    }
}
