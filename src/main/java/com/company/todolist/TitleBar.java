/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.todolist;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author kamau
 */
public class TitleBar extends JPanel {

    public TitleBar() {
        this.setPreferredSize(new Dimension(400, 80));
      //  this.setBackground(Color.red);
      JLabel title = new JLabel("To Do List");
      title.setPreferredSize(new Dimension(200,80));
      title.setFont(new  Font("sans-serif", Font.BOLD, 20));
      title.setHorizontalAlignment(JLabel.CENTER);
      
      this.add(title);
    }
    
    
}
