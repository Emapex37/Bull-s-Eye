/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bull.seye;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

import java.security.SecureRandom;
import java.util.Random;

/**
 *
 * @author EvMcQ5970
 */
public class BullSEye extends JPanel {

    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        
        //First
        Color RANDOM = ranCol();
        g.setColor(RANDOM);
        g.fillOval(10, 10, 200, 200);
        
        //Second
        Color RANDOM2 = ranCol();
        g.setColor(RANDOM2);
        g.fillOval(20, 20, 180, 180);
        
        //Third
        Color RANDOM3 = ranCol();
        g.setColor(RANDOM3);
        g.fillOval(30, 30, 160, 160);
        
        //Fourth
        Color RANDOM4 = ranCol();
        g.setColor(RANDOM4);
        g.fillOval(40, 40, 140, 140);
        
        //Fifth
        Color RANDOM5 = ranCol();
        g.setColor(RANDOM5);
        g.fillOval(50, 50, 120, 120);
        
        //Sixth
        Color RANDOM6 = ranCol();
        g.setColor(RANDOM6);
        g.fillOval(60, 60, 100, 100);
        
        //Seventh
        Color RANDOM7 = ranCol();
        g.setColor(RANDOM7);
        g.fillOval(70, 70, 80, 80);
        
        //Eigth
        Color RANDOM8 = ranCol();
        g.setColor(RANDOM8);
        g.fillOval(80, 80, 60, 60);
        
    }
    
    
    public static Color ranCol(){
        
        Random randCol = new Random();
        
        float r = randCol.nextFloat();
        float g = randCol.nextFloat();
        float b = randCol.nextFloat();
        
        Color randomColor = new Color(r, g, b);
        
        return randomColor;
    }
    
    
    
}
