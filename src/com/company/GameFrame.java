package com.company;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    GameFrame()
    {
       this.add(new GamePanel());
         this.setTitle("Snake");
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setResizable(false);
         this.pack();
        this.setBackground(Color.black);
         this.setVisible(true);
         this.setLocationRelativeTo(null);
    }
}
