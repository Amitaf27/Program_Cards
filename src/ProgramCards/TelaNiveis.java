import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
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
	   JButton nivel[] = new JButton[20];
	   Color azul = new Color(25,25,112);
       Color azulc = new Color(65,105,225);
       Color ouro = new Color(238,201,0);
	   Font font = new Font("Arial",Font.BOLD,30);
	   Border b = BorderFactory.createLineBorder(new Color(255,191,0), 2);
	   Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize();
	   int t1 = 400;
	   int t3 = t1, t4 = 400, t5 = 400;
	   
	   public TelaNiveis() {
		  super("Ilha iniciante");
		  JMenu opcao = new JMenu("Opcoes");
		  JMenuBar barrinha = new JMenuBar();
		
		  Container cont = getContentPane();
		  cont.setBackground(azul);
		  
		   JMenuItem ilhas = new JMenuItem("Ilhas");
		   opcao.add(ilhas); 
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
	
			  for( int i = 1; i < 20; i++){
				  
			
				 String pe = String.valueOf(i);
			
				  nivel[i] = new JButton(pe);
				  cont.add(nivel[i]);
				  
				  
				  nivel[i].setFont(font);
				  nivel[i].setBackground(azulc);
				  
				 
				  
				   if(i > 0 && i <= 5){
					  
				       t1 += 190;
				       nivel[i].setBounds(t1, 100, 150, 150);
	
				   }else if(i > 5 && i <= 10){
					    t3 += 190;
					    nivel[i].setBounds(t3, 300, 150, 150);
				   }else if(i > 10 && i <= 15){
					   t4 += 190;
					    nivel[i].setBounds(t4, 500, 150, 150);
					  
				   }else if(i > 15 && i <=20){
					   t5 += 190;
					    nivel[i].setBounds(t5, 700, 150, 150);
				   }										  


		
			  }
			  
	
			   barrinha.add(opcao);
			   setJMenuBar(barrinha);

	        
			   
	           AcionaBotao evento2 = new AcionaBotao();
	  

	          
			   barrinha.setBackground(ouro);
			   barrinha.setBorder(b);
			   
			   opcao.setForeground(Color.BLACK);
	           
	           
			   setLayout(null);
			   
			   setSize(dimensao);
			   setVisible(true);


	   }
           private class AcionaBotao implements ActionListener {

              public void actionPerformed(ActionEvent e){
            	//  new TelaJogo();
            	  
        }
        }
	   
	   public static void main(String[] args) {
		   TelaNiveis teste = new TelaNiveis();
		   teste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   }
}