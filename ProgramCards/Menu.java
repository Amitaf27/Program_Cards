
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.AbstractBorder;
import javax.swing.border.LineBorder;

public class Menu extends JFrame{
	 
   	private static final long serialVersionUID = 1L;   	
     	
     	private class BordaCantoArredondado extends AbstractBorder {
            
            private final BasicStroke CONTORNO = new BasicStroke( 30 );
                    
            @Override
            public void paintBorder( Component c, Graphics g, int x, int y, int width, int height ) {
                
                super.paintBorder( c, g, x, y, width, height );
                
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );
                g2d.setStroke( CONTORNO );
                
                g2d.setColor( Color.BLACK );
                g2d.drawRoundRect( x, y, width-1, height-1, 80, 40 );
                
                g2d.dispose();
                
            }
            
        }
     	
    
	    JButton ilha1,ilha2,ilha3,livre;
	    JButton btSom, btSom2, btNome, btVoltar, btConfirmar;
    	ImageIcon image = new ImageIcon(getClass().getResource("ilhas1.png"));
    	ImageIcon image2 = new ImageIcon(getClass().getResource("ilhas2.png"));
    	ImageIcon image3 = new ImageIcon(getClass().getResource("ilhas3.png"));
    	ImageIcon image4 = new ImageIcon("F:/livre.png");
	    JMenuBar barrinha;
	    JMenu opcao;
	    JMenuItem config, sair;
	    JPanel panel = new JPanel();
	    boolean ativo = false; 
	    Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize();
	    Color azulclaro = new Color(135,206,250);
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
		  
		  //configurando os bot�es do panel
		  btSom = new JButton();
		  btSom2 = new JButton();
		  btConfirmar = new JButton("Confirmar");
		  btNome = new JButton("Mudar NickName");
		  btVoltar = new JButton("Voltar");
		  
		  
		  
		  //configurando o panel de configuracoes
		  add(panel);
		  
		  panel.setLayout(null);
		  panel.setBounds(750, 250, 400, 500);
		  panel.setVisible(ativo);
		  panel.setBorder( new BordaCantoArredondado() );
		  panel.setBackground(azulclaro);
		  
		  panel.add(btSom);
		  panel.add(btSom2);
		  panel.add(btNome);
		  panel.add(btVoltar);
		  panel.add(btConfirmar);
		  
		  btSom.setBounds(90, 80, 90, 90);
		  btSom2.setBounds(215, 80, 90, 90);
		  btNome.setBounds(125, 270, 150, 50);
		  btVoltar.setBounds(125, 330, 150, 50);
		  btConfirmar.setBounds(125, 390, 150, 50);
		  
		  
		  config.setBackground(ouroclaro);
		  config.setForeground(Color.black);
		  config.addActionListener(
     	    	 new ActionListener(){

   				
   				public void actionPerformed(ActionEvent e) {
   					
   				    ativo = !ativo;
   					panel.setVisible(ativo);
   					
   				
   				} 
     	        });

		  
		  
		  sair.setBackground(ouroclaro);
		  sair.setForeground(Color.black);
		  
		     Sair s = new Sair();
		  sair.addActionListener(s);
	   
		ilha1 = new JButton(image);
		ilha1. setOpaque(false);
                ilha1.setFocusable(false);
                ilha1.setContentAreaFilled(false);
                ilha1.setBorderPainted(false);
		
                ilha2 = new JButton(image2);
		        ilha2. setOpaque(false);
                ilha2.setFocusable(false);
                ilha2.setContentAreaFilled(false);
                ilha2.setBorderPainted(false);
        
        
		ilha2.setBackground(Color.WHITE);
		ilha2.setForeground(Color.BLACK);

                ilha3 = new JButton(image3);
		ilha3.setBackground(Color.WHITE);
		ilha3.setForeground(Color.BLACK); 
		ilha3. setOpaque(false);
        ilha3.setFocusable(false);
        ilha3.setContentAreaFilled(false);
        ilha3.setBorderPainted(false);
     
                livre = new JButton(image4);
                livre. setOpaque(false);
                livre.setFocusable(false);
                livre.setContentAreaFilled(false);
                livre.setBorderPainted(false);
                   
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
		 ilha1.setBounds(200,200,400,400);
         ilha2.setBounds(610,200,400,400);
         ilha3.setBounds(1020,200,400,400);
         livre.setBounds(1430,200,400,400);

                setSize(dimensao);
		setVisible(true);
		
	} 
	  
	    
	 private class AcionaBotao implements ActionListener {

         public void actionPerformed(ActionEvent e){
        	 
   //      Sons.main(null);	 
   //   	 new TelaNiveis();
       	   dispose();
       	  
   }
   }
	 private class Sair implements ActionListener {

         public void actionPerformed(ActionEvent e){
        	 
             System.exit(0);
       	  
   }
   }
	public static void main(String[]args) {
		
		Menu menu = new Menu();
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}