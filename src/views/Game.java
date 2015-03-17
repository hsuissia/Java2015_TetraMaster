package views;

import javax.swing.*;

public class Game {

    private JFrame frame_gm = null;

    public Game(){
        this.init_frame();
    }

    public void open(){
        this.frame_gm.setVisible(true);
    }

    private void init_frame(){
        this.frame_gm = new JFrame();
        this.frame_gm.setTitle("TetraMaster - Collection Management");
        this.frame_gm.setResizable(false);
        this.frame_gm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame_gm.getContentPane().setLayout(null);
    }
}
