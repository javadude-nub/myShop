package boxOG;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class SHOPGUI extends JFrame {

	SHOPGUI() {
		// ADDS GUI AND IT'S COMPONENTS
		
		// Set the size of the frame
        setSize(900, 550);
    
        getContentPane().setBackground(Color.WHITE);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);         
        setResizable(true);   
        setUndecorated(true); 
        setLocationRelativeTo(null);
        setVisible(true);
        
        JPanel choicePanel = new JPanel();
        JPanel clipBoard = new JPanel();
        JPanel centerPanel = new JPanel(new GridLayout(5, 1));
        JPanel leftpanel = new JPanel();

        Dimension buttonSize = new Dimension(150, 100);

     //exit button
        RoundedButtons exitButton = new RoundedButtons("LOG OFF");
        exitButton.setFont(new Font("SansSerif Bold", Font.BOLD, 20));
        exitButton.setForeground(Color.WHITE);
        exitButton.setBackground(new Color(30, 136, 229));
        exitButton.setPreferredSize(buttonSize);
        exitButton.setFocusPainted(false);
        exitButton.addActionListener(e -> System.exit(0));

     //inventory button
        RoundedButtons intButton = new RoundedButtons("INVENTORY");
        intButton.setFont(new Font("SansSerif Bold", Font.BOLD, 18));
        intButton.setBackground(Color.WHITE);
        intButton.setForeground(new Color(68, 112, 173));
        intButton.setPreferredSize(buttonSize);
        intButton.setFocusPainted(false); 

     //buy button
        RoundedButtons buyButton = new RoundedButtons("BUY NOW");
        buyButton.setFont(new Font("SansSerif Bold", Font.BOLD, 18));
        buyButton.setForeground(new Color(68, 112, 173));
        buyButton.setBackground(Color.WHITE);
        buyButton.setPreferredSize(buttonSize);
        buyButton.setFocusPainted(false);

     //purchase button
        RoundedButtons purcButton = new RoundedButtons("PURCHASE");
        purcButton.setFont(new Font("SansSerif Bold", Font.BOLD, 18));
        purcButton.setForeground(new Color(68, 112, 173));
        purcButton.setBackground(Color.WHITE);
        purcButton.setPreferredSize(buttonSize);
        purcButton.setFocusPainted(false);

     // Placer in choice panel
        choicePanel.setLayout(new BoxLayout(choicePanel, BoxLayout.X_AXIS));
        choicePanel.add(buyButton);
        choicePanel.add(Box.createHorizontalStrut(20));
        choicePanel.add(intButton);
        choicePanel.add(Box.createHorizontalGlue());
        choicePanel.add(Box.createHorizontalStrut(165));
        choicePanel.add(purcButton);
        choicePanel.add(Box.createHorizontalGlue());
        choicePanel.add(Box.createHorizontalGlue());
        choicePanel.add(Box.createHorizontalGlue());
        choicePanel.add(exitButton);
       
     //essentials
       
        add(choicePanel, BorderLayout.NORTH);
        choicePanel.setBackground(new Color(30, 136, 229));
        Border lineBorder = BorderFactory.createLineBorder(Color.WHITE, 15);
        Border emptyBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        Border compoundBorder = BorderFactory.createCompoundBorder(lineBorder, emptyBorder);
        choicePanel.setBorder(compoundBorder);
        
     //clipboard panel props
        
        clipBoard.add(Box.createHorizontalStrut(75));
        add(clipBoard, BorderLayout.WEST);
        clipBoard.setBackground(new Color(30, 136, 229));
        Border lineboardBd = BorderFactory.createLineBorder(Color.WHITE, 15);
        Border empboardBd = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        Border compboardBd = BorderFactory.createCompoundBorder(lineboardBd, empboardBd);
        clipBoard.setBorder(compboardBd);
        clipBoard.add(Box.createHorizontalStrut(250));
        
        
     //shelf int panel
        centerPanel.add(Box.createHorizontalStrut(250));
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(new Color(30, 136, 229));
        Border centlineB = BorderFactory.createLineBorder(Color.WHITE, 15);
        Border emptCenBd = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        Border compCendBd = BorderFactory.createCompoundBorder(centlineB, emptCenBd);
        centerPanel.setBorder(compCendBd);
        centerPanel.add(Box.createHorizontalStrut(250));
        
        
     //left panel
        add(leftpanel, BorderLayout.EAST);
        leftpanel.setBackground(new Color(30, 136, 229));
        Border LEFTlineB = BorderFactory.createLineBorder(Color.WHITE, 15);
        Border LEFTemptBd = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        Border LEFTcompdBd = BorderFactory.createCompoundBorder(LEFTlineB, LEFTemptBd);
        leftpanel.setBorder(LEFTcompdBd);
        leftpanel.add(Box.createHorizontalStrut(250));
        
  	
	}

}
