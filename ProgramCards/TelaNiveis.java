import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class TelaNiveis extends JFrame {
	   JLabel rotulo1;
	   JMenuBar barrinha;
	   JMenu opcao;
	   JMenuItem ilhas, config, sair;
	   JButton nivel[] = new JButton[10];
	   ImageIcon imaNivel[] = new ImageIcon[10];
	   Color azul = new Color(18,10,143);
       Color azulc = new Color(65,105,225);
       Color ouro = new Color(238,201,0);
	   Font font = new Font("Arial",Font.BOLD,30);
	   Border b = BorderFactory.createLineBorder(new Color(255,191,0), 2);
	   Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize();
	   int t1 = 0;
	   int t3 = t1;
	   Image backgroundImage;
	   
	   public TelaNiveis() {
		  super("Ilha iniciante");
		  JMenu opcao = new JMenu("Opcoes");
		  JMenuBar barrinha = new JMenuBar();
		   imaNivel[0] = new ImageIcon(getClass().getResource("nivel1.png"));
		   imaNivel[1] = new ImageIcon(getClass().getResource("nivel2.png"));
		   imaNivel[2] = new ImageIcon(getClass().getResource("nivel3.png"));
		   imaNivel[3] = new ImageIcon(getClass().getResource("nivel4.png"));
		   imaNivel[4] = new ImageIcon(getClass().getResource("nivel5.png"));
		   imaNivel[5] = new ImageIcon(getClass().getResource("nivel6.png"));
		   imaNivel[6] = new ImageIcon(getClass().getResource("nivel7.png"));
		   imaNivel[7] = new ImageIcon(getClass().getResource("nivel8trac.png"));
		   imaNivel[8] = new ImageIcon(getClass().getResource("Group 12.png"));
		   imaNivel[9] = new ImageIcon(getClass().getResource("Group 12.png"));
		   
	    	 
		    backgroundImage = Toolkit.getDefaultToolkit().getImage(getClass().getResource("FundoIniciante.png"));
			       
		    
		       this.setContentPane(new JPanel() {
		   	         @Override
		   	         public void paintComponent(Graphics g) {
		   	            super.paintComponent(g);
		   	            g.drawImage(backgroundImage, 0, 0, null);
		   	         }
		   	      });
		    
		   
		
		   
		  Container cont = getContentPane();
		  cont.setBackground(azul);
		  
		   JMenuItem ilhas = new JMenuItem("Ilhas");
		   opcao.add(ilhas); 
		   ilhas.addActionListener(
		  	    	 new ActionListener(){

				
						public void actionPerformed(ActionEvent arg0) {
							
							new Menu();
							setVisible(false);
							
							
						} 
		  	        });
		   JMenuItem config = new JMenuItem("Configuracoes");
		   opcao.add(config); 
		   
		   JMenuItem sair = new JMenuItem("Sair");
		   opcao.add(sair);
		   sair.addActionListener(
	  	    	 new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
						
					} 
	  	        });
	
			  for( int i = 0; i <= 9; i++){
				  
				  nivel[i] = new JButton(imaNivel[i]);
				  cont.add(nivel[i]);
				  
				  nivel[i].setBorderPainted(false); 
                  nivel[i].setOpaque(false);  
                  nivel[i].setFocusable(false);  
                  nivel[i].setContentAreaFilled(false);
				 
				  
				   if(i >= 0 && i <= 4){
					  
				       t1 += 200;
				       nivel[i].setBounds(t1, 150, 160, 160);
	
				   }else if(i >= 5 && i <= 9){
					    t3 += 200;
					    nivel[i].setBounds(t3, 360, 170, 170);
				   }

		
			  }
			  
	
			   barrinha.add(opcao);
			   setJMenuBar(barrinha);

	      

	          
			   barrinha.setBackground(ouro);
			   barrinha.setBorder(b);
			   
			   opcao.setForeground(Color.BLACK);
	           
	           
			   setLayout(null);
			   
			   setSize(1366,768);
			   setVisible(true);
			   
			   nivel[0].addActionListener(  
		        		 new ActionListener(){  
		        			 public void actionPerformed(ActionEvent e) { 
		        			
		                        new TelaPartida();
		                        dispose();
		        				
		        			 }       
		        		 }); 
			   
			   
			   nivel[1].addActionListener(  
		        		 new ActionListener(){  
		        			 public void actionPerformed(ActionEvent e) { 
		        			
		                        new TelaPartida2();
		                        dispose();
		        				
		        			 }       
		        		 });                
			   
			   nivel[2].addActionListener(  
		        		 new ActionListener(){  
		        			 public void actionPerformed(ActionEvent e) { 
		        			
		                        new TelaPartida3();
		                        dispose();
		        				
		        			 }       
		        		 });                
			   
			   
			   
			   nivel[3].addActionListener(  
		        		 new ActionListener(){  
		        			 public void actionPerformed(ActionEvent e) { 
		        			
		                        new TelaPartida4();
		                        dispose();
		        				
		        			 }       
		        		 }); 
			   
			   nivel[4].addActionListener(  
		        		 new ActionListener(){  
		        			 public void actionPerformed(ActionEvent e) { 
		        			
		                        new TelaPartida5();
		                        dispose();
		        				
		        			 }       
		        		 });
			   
			   nivel[5].addActionListener(  
		        		 new ActionListener(){  
		        			 public void actionPerformed(ActionEvent e) { 
		        			
		                        new TelaPartida6();
		                        dispose();
		        				
		        			 }       
		        		 }); 
			   nivel[6].addActionListener(  
		        		 new ActionListener(){  
		        			 public void actionPerformed(ActionEvent e) { 
		        			
		                        new TelaPartida7();
		                        dispose();
		        				
		        			 }       
		        		 });
			   
			   nivel[7].addActionListener(  
		        		 new ActionListener(){  
		        			 public void actionPerformed(ActionEvent e) { 
		        			
		                        new TelaPartida8();
		                        dispose();
		        				
		        			 }       
		        		 });
			   nivel[7].addActionListener(  
		        		 new ActionListener(){  
		        			 public void actionPerformed(ActionEvent e) { 
		        			
		                        new TelaPartida8();
		                        dispose();
		        				
		        			 }       
		        		 });
			   
			   nivel[8].addActionListener(  
		        		 new ActionListener(){  
		        			 public void actionPerformed(ActionEvent e) { 
		        			
		                        new TelaPartida9();
		                        dispose();
		        				
		        			 }       
		        		 });
			   
			   nivel[9].addActionListener(  
		        		 new ActionListener(){  
		        			 public void actionPerformed(ActionEvent e) { 
		        			
		                        new TelaPartida10();
		                        dispose();
		        				
		        			 }       
		        		 });
			   
			   


	   }
        
	   public static void main(String[] args) {
		   TelaNiveis teste = new TelaNiveis();
		   teste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   }
}

