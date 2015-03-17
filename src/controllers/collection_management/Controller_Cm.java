package controllers.collection_management;

import views.Collection_Management;

public class Controller_Cm {

    private Collection_Management frame_cm = null;

    public Controller_Cm(){
        this.frame_cm = new Collection_Management();
    }

    public void start_collection_management(){
        this.frame_cm.open();
    }
}
