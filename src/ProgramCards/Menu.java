package ProgramCards;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JFrame{
	 
   	private static final long serialVersionUID = 1L;
	    JButton ilha1,ilha2,ilha3,livre;
    	ImageIcon image = new ImageIcon("F:/ilha1.png");
    	ImageIcon image2 = new ImageIcon("F:/ilha2.png");
	    JMenuBar barrinha;
	    JMenu opcao;
	    JMenuItem config, sair;
	    Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize();
        Color ouro = new Color(238,201,0);
        Color ouroclaro = new Color(238,232,170);
        Color azul = new Color(25,25,112);

	  public Menu() {
		
	        setTitle("ILHAS");
		  barrinha = new JMenuBar();
		  
		  setJMenuBar(barrinha);
		  
		  opcao = new JMenu("Op��es");
		
		  config = new JMenuItem("Configura��es");
		  sair = new JMenuItem("sair");
		  
		  barrinha.add(opcao);
		  barrinha.setBackground(ouro);
		  
		
		  opcao.add(config);
		  opcao.add(sair);	
		  opcao.setBackground(ouro);
		  
		  
		  config.setBackground(ouroclaro);
		  config.setForeground(Color.black);
		  
		  sair.setBackground(ouroclaro);
		  sair.setForeground(Color.black);
	   
		ilha1 = new JButton(image);
		ilha1. setOpaque(false);
                ilha1.setFocusable(false);
                ilha1.setContentAreaFilled(false);
                ilha1.setBorderPainted(false);
		
                ilha2 = new JButton("MINI_BOI");
                ilha2 = new JButton(image2);
		ilha2. setOpaque(false);
                ilha2.setFocusable(false);
                ilha2.setContentAreaFilled(false);
                ilha2.setBorderPainted(false);
        
        
		ilha2.setBackground(Color.WHITE);
		ilha2.setForeground(Color.BLACK);

                ilha3 = new JButton("MINI_BOI");
		ilha3.setBackground(Color.WHITE);
		ilha3.setForeground(Color.BLACK);      
     
                livre = new JButton("MINI_BOI");
		livre.setBackground(Color.WHITE);
		livre.setForeground(Color.BLACK);
                   
		AcionaBotao c = new AcionaBotao();
		 ilha1.addActionListener(c);
		 ilha2.addActionListener(c);
                 ilha3.addActionListener(c);
                 livre.addActionListener(c);

	    Container cont = getContentPane();
		cont.setBackground(azul);
	   	cont.add(ilha1);
                cont.add(ilha2);
                cont.add(ilha3);
                cont.add(livre);
		
		setLayout(null);
		ilha1.setBounds(300,300,300,300);
		ilha2.setBounds(700,300,300,300);
		ilha3.setBounds(1100,300,300,300);
		livre.setBounds(1500,300,300,300);

                setSize(dimensao);
		setVisible(true);
		
	} 
	    
	 private class AcionaBotao implements ActionListener {

         public void actionPerformed(ActionEvent e){
        	 
         Sons.main(null);	 
       	 new TelaNiveis();
       	 dispose();
       	  
   }
   }
	public static void main(String[]args) {
		
		Menu menu = new Menu();
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}