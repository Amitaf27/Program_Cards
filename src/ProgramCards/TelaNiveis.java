package ProgramCards;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
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
	   JButton nivel1, nivel2, nivel3, nivel4,  nivel5, nivel6, nivel7, nivel8, nivel9, nivel10,nivel11,
	   nivel12, nivel13, nivel14, nivel15,  nivel16, nivel17, nivel18, nivel19, nivel20, nivel21,nivel22;
	   Color a = new Color(0,191,255);
	   Font font = new Font("Arial",Font.BOLD,30);
	   Border b = BorderFactory.createLineBorder(new Color(255,191,0), 2);
	   
	   public TelaNiveis() {
		  super("Ilha iniciante");
		  JMenu opcao = new JMenu("Opcoes");
		  JMenuBar barrinha = new JMenuBar();
		
		  Container cont = getContentPane();
		  cont.setBackground(new Color(137, 54, 150));
		  
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
		   
		 //declarar valores para os objetos
			  JButton nivel1 = new JButton("1");	
			  JButton nivel2 = new JButton("2");
			  JButton nivel3 = new JButton("3");
			  JButton nivel4 = new JButton("4");
			  JButton nivel5 = new JButton("5");
			  JButton nivel6 = new JButton("6");
			  JButton nivel7 = new JButton("7");
			  JButton nivel8 = new JButton("8");
			  JButton nivel9 = new JButton("9");
			  JButton nivel10 = new JButton("10");
			  JButton nivel11 = new JButton("11");
			  JButton nivel12 = new JButton("12");		  
			  JButton nivel13 = new JButton("13");
			  JButton nivel14 = new JButton("14");
			  JButton nivel15 = new JButton("15");
			  JButton nivel16 = new JButton("16");
			  JButton nivel17 = new JButton("17");
			  JButton nivel18 = new JButton("18");
			  JButton nivel19 = new JButton("19");
			  JButton nivel20= new JButton("20");
			  JButton nivel21 = new JButton("21");
			  JButton nivel22 = new JButton("22");
			  
	          AcionaBotao evento = new AcionaBotao();
			  nivel1.addActionListener(evento);
	//adicionar coisas no container		  
			   
			   cont.add(nivel1);
			   cont.add(nivel2);
			   cont.add(nivel3);
			   cont.add(nivel4);
			   cont.add(nivel5);
			   cont.add(nivel6);
			   cont.add(nivel7);
			   cont.add(nivel8);
			   cont.add(nivel9);
			   cont.add(nivel10);
			   cont.add(nivel11);
			   cont.add(nivel12);
			   cont.add(nivel13);
			   cont.add(nivel14);
			   cont.add(nivel15);
			   cont.add(nivel16);
			   cont.add(nivel17);
			   cont.add(nivel18);
			   cont.add(nivel19);
			   cont.add(nivel20);
			   cont.add(nivel21);
			   cont.add(nivel22);

			  
			   barrinha.add(opcao);
			   setJMenuBar(barrinha);

	           //tamanho dos bot�es 
			   
			   
			 
			   nivel1.setBounds(340, 200, 130, 130);
			   nivel2.setBounds(490, 200, 130, 130);  //100 do botao e 40 da distanci
			   nivel3.setBounds(640, 200, 130, 130);
			   nivel4.setBounds(790, 200, 130, 130); 
			   nivel5.setBounds(940, 200, 130, 130);
			   
			   nivel6.setBounds(340, 350, 130, 130);
			   nivel7.setBounds(490, 350, 130, 130);
			   nivel8.setBounds(640, 350, 130, 130);
			   nivel9.setBounds(790, 350, 130, 130);
			   nivel10.setBounds(940, 350, 130, 130);
			   
			   nivel11.setBounds(340, 500, 130, 130);
			   nivel12.setBounds(490, 500, 130, 130);
			   nivel13.setBounds(640, 500, 130, 130);  //100 do botao e 40 da distanci
			   nivel14.setBounds(790, 500, 130, 130);
			   nivel15.setBounds(940, 500, 130, 130); 
			   
			   nivel16.setBounds(340, 650, 130, 130);
			   nivel17.setBounds(490, 650, 130, 130);
			   nivel18.setBounds(640, 650, 130, 130);
			   nivel19.setBounds(790, 650, 130, 130);
			   nivel20.setBounds(940, 650, 130, 130);
			   
			   
	           AcionaBotao evento2 = new AcionaBotao();
	  

	           //defini��o de fontes		   
			   nivel1.setFont(font);
			   nivel2.setFont(font);
			   nivel3.setFont(font);
			   nivel4.setFont(font);
			   nivel5.setFont(font);
			   nivel6.setFont(font);
			   nivel7.setFont(font);
			   nivel8.setFont(font);
			   nivel9.setFont(font);
			   nivel10.setFont(font);
			   nivel11.setFont(font);
			   nivel12.setFont(font);
			   nivel13.setFont(font);
			   nivel14.setFont(font);
			   nivel15.setFont(font);
			   nivel16.setFont(font);
			   nivel17.setFont(font);
			   nivel18.setFont(font);
			   nivel19.setFont(font);
			   nivel20.setFont(font);
			   nivel21.setFont(font);
			   nivel22.setFont(font);
			   
	           //cor dos bot�es 
			   barrinha.setBackground(new Color(255,191,0));
			   barrinha.setBorder(b);
			   
			   opcao.setForeground(Color.BLACK);
	           nivel1.setBackground(new Color(255,133,63));
	           nivel2.setBackground(a);
	           nivel3.setBackground(a);
	           nivel4.setBackground(a);
	           nivel5.setBackground(a);
	           nivel6.setBackground(a);
	           nivel7.setBackground(a);
	           nivel8.setBackground(a);
	           nivel9.setBackground(a);
	           nivel10.setBackground(a);
	           nivel11.setBackground(a);
	           nivel12.setBackground(a);
	           nivel13.setBackground(a);
	           nivel14.setBackground(a);
	           nivel15.setBackground(a);
	           nivel16.setBackground(a);
	           nivel17.setBackground(a);
	           nivel18.setBackground(a);
	           nivel19.setBackground(a);
	           nivel20.setBackground(a);
	           
			   setLayout(null);
			   
			   setSize(1920, 1080);
			   setVisible(true);


	   }
           private class AcionaBotao implements ActionListener {

              public void actionPerformed(ActionEvent e){
            	//  new TelaJogo();
            	  
        }
        }
	   
	   public static void main(String[] args) {
		   TelaNiveis teste = new TelaNiveis();
	   }
}