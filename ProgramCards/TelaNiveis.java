import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
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
import javax.swing.border.Border;

public class TelaNiveis extends JFrame {
	   JLabel rotulo1;
	   JMenuBar barrinha;
	   JMenu opcao;
	   JMenuItem ilhas, config, sair;
	   JButton nivel[] = new JButton[11];
	   ImageIcon imaNivel[] = new ImageIcon[11];
	   Color azul = new Color(18,10,143);
       Color azulc = new Color(65,105,225);
       Color ouro = new Color(238,201,0);
	   Font font = new Font("Arial",Font.BOLD,30);
	   Border b = BorderFactory.createLineBorder(new Color(255,191,0), 2);
	   Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize();
	   int t1 = 0;
	   int t3 = t1;
	   
	   public TelaNiveis() {
		  super("Ilha iniciante");
		  JMenu opcao = new JMenu("Opcoes");
		  JMenuBar barrinha = new JMenuBar();
		   imaNivel[1] = new ImageIcon(getClass().getResource("nivel1.png"));
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
	
			  for( int i = 1; i < 11; i++){
				  
				  nivel[i] = new JButton(imaNivel[i]);
				  cont.add(nivel[i]);
				  
				  nivel[i].setBorderPainted(false); 
                  nivel[i].setOpaque(false);  
                  nivel[i].setFocusable(false);  
                  nivel[i].setContentAreaFilled(false);
				 
				  
				   if(i > 0 && i <= 5){
					  
				       t1 += 200;
				       nivel[i].setBounds(t1, 150, 160, 160);
	
				   }else if(i > 5 && i <= 10){
					    t3 += 200;
					    nivel[i].setBounds(t3, 360, 170, 170);
				   }

		
			  }
			  
	
			   barrinha.add(opcao);
			   setJMenuBar(barrinha);

	        
			   
	           AcionaBotao evento2 = new AcionaBotao();
	  

	          
			   barrinha.setBackground(ouro);
			   barrinha.setBorder(b);
			   
			   opcao.setForeground(Color.BLACK);
	           
	           
			   setLayout(null);
			   
			   setSize(1366,768);
			   setVisible(true);


	   }
           private class AcionaBotao implements ActionListener {

              public void actionPerformed(ActionEvent e){
            	new TelaPartida();
            	dispose();
            	  
        }
        }
	   
	   public static void main(String[] args) {
		   TelaNiveis teste = new TelaNiveis();
		   teste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   }
}
