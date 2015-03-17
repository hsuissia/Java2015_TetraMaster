package views;

import javax.swing.*;

public class Collection_Management {

    //cm is short for "Collection Management"
    private JFrame frame_cm = null;

    public Collection_Management(){
        this.init_frame();
    }

    public void open(){
        this.frame_cm.setVisible(true);
    }

    private void init_frame(){
        this.frame_cm = new JFrame();
        this.frame_cm.setTitle("TetraMaster - Collection Management");
        this.frame_cm.setResizable(false);
        this.frame_cm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame_cm.getContentPane().setLayout(null);
    }

}
