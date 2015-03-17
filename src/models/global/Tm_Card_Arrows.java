package models.global;

import java.util.*;

public class Tm_Card_Arrows {
    private Map <String, Boolean> arrow_list = new HashMap <String,Boolean> ();
    private List<String> arrow_name_list = new ArrayList<String>();

    private void init_arrow_name_list(){
        this.arrow_name_list.add("north");
        this.arrow_name_list.add("south");
        this.arrow_name_list.add("west");
        this.arrow_name_list.add("east");
        this.arrow_name_list.add("north_east");
        this.arrow_name_list.add("north_west");
        this.arrow_name_list.add("south_east");
        this.arrow_name_list.add("south_west");
    }
    private void init_arrow_list(){
        for(String arrow_name: this.arrow_name_list)
            this.arrow_list.put(arrow_name, false);
    }

    private void init_random_arrows(){
        Random rnd = new Random();
        for(String arrow_name: this.arrow_name_list)
            this.arrow_list.put(arrow_name, rnd.nextBoolean());
    }
    public String change_arrow(String arrow_name, boolean value){
        if(this.arrow_list.replace(arrow_name, value) == null)
            return "This arrow_name cannot be found";
        else
            return "OK";
    }
    public boolean get_arrow_value(String key){
        return this.arrow_list.get(key);
    }
    public Tm_Card_Arrows(String mode){
        this.init_arrow_name_list();
        if(mode.equalsIgnoreCase("random"))
            this.init_random_arrows();
        else
            this.init_arrow_list();
    }
}
