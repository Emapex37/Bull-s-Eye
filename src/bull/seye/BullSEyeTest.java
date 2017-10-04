/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bull.seye;

import javax.swing.JFrame;

/**
 *
 * @author EvMcQ5970
 */
public class BullSEyeTest {
    
    public static void main(String[] args){
        
        
        BullSEye panel = new BullSEye();
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);      
        application.setVisible(true);
        
    }
    
    
    
}
