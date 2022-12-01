import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class TelaPartida2 extends JFrame { 
  
         private static final long serialVersionUID = 1L; 
         private JLabel imaIf, imaFor,imaInclude, imaScanf, imaPrintf,perg; 
     private JPanel painel, painel2, painel3;
 
     Boolean ativo = false;
     private ImageIcon imFor,imif,include, scanf, imPrintf ; 
     Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize(); 
     JPanel pp = new JPanel();
     Color azul = new Color(18,10,143); 
     Color azulc = new Color(65,105,225); 
     Color ouro = new Color(238,201,0); 
     Font fonte1 = new Font("Arial", Font.BOLD, 24); 
     private JMenuBar  barra;
     private JMenu opcao;
     private JMenuItem config, voltar;
     ImageIcon fundo = new ImageIcon(getClass().getResource("funda de abertura.png"));
     ImageIcon painelGanha = new ImageIcon(getClass().getResource("painelGanha.png"));
     ImageIcon painelPerde = new ImageIcon(getClass().getResource("painelPerde.png"));
     ImageIcon a = new ImageIcon(getClass().getResource("vai.png"));
     ImageIcon b = new ImageIcon(getClass().getResource("menuu.png"));
     ImageIcon aa = new ImageIcon(getClass().getResource("volt.png"));
     ImageIcon bb = new ImageIcon(getClass().getResource("menu.png"));

     
     JButton bt, bt2, bt3, bt4;


     
     boolean mouseP = false; 
  
      public TelaPartida2(){ 
    	  

    	  Panel p = new Panel();
    	  Panel2 pp = new Panel2();
    	  Panel3 p1 = new Panel3();
    	  
    	  bt = new JButton(a);
    	  bt2 = new JButton(b);
    	  
    	  
      //config o panel 
    	 	 painel2 = new JPanel();
    	  add(painel2);
    	  
    	  painel2.setLayout(null);
          painel2.setBounds(500, 100,400,450);
		  painel2.setVisible(ativo);  
         painel2.setBackground(new Color(34, 13, 47)); 
         painel2.add(bt);
         bt. setOpaque(false);  
         bt.setFocusable(false);  
         bt.setContentAreaFilled(false); 
         bt.setBorderPainted(false);
         painel2.add(pp);
         
         painel2.add(bt2);
         bt2. setOpaque(false);  
         bt2.setFocusable(false);  
         bt2.setContentAreaFilled(false); 
         bt2.setBorderPainted(false);
         painel2.add(pp);
       
         pp.setSize(400,450);
       
         bt.setBounds(280, 340, 100, 100);
         bt2.setBounds(30, 340, 100, 100);
     	 
         //config o panel 
         
         
         bt3 = new JButton(aa);
         bt4 = new JButton(bb);
         
         
     
	 	 painel3 = new JPanel();
	  add(painel3);
	  
	     p1.setSize(400,450);
	  painel3.setLayout(null);
      painel3.setBounds(500, 100,400,450);
	  painel3.setVisible(ativo);  
     painel3.setBackground(new Color(34, 13, 47));  
     
     
     painel3.add(bt3);
     bt3.setOpaque(false);  
     bt3.setFocusable(false);  
     bt3.setContentAreaFilled(false); 
     bt3.setBorderPainted(false);
     
    
     painel3.add(bt4);
     bt4.setOpaque(false);  
     bt4.setFocusable(false);  
     bt4.setContentAreaFilled(false); 
     bt4.setBorderPainted(false);
     
     bt3.setBounds(280, 340, 100, 100);
     bt4.setBounds(30, 340, 100, 100);
     painel3.add(p1);
     

    	
     bt3.addActionListener(  
     		 new ActionListener(){  
     			 public void actionPerformed(ActionEvent e) { 
     			
     				 
     				  new TelaPartida2();
                      dispose();
     				
     			 }       
     		 });                 
      
     bt4.addActionListener(  
     		 new ActionListener(){  
     			 public void actionPerformed(ActionEvent e) { 
     			
                   
                     new Menu();
                     dispose();
    
     				
     			 }       
     		 });                 
         
         
    	 
    	  barra = new JMenuBar();  
          setJMenuBar(barra);  
          opcao = new JMenu("Opcoes");  
                    
          config = new JMenuItem("Configuracoes");  
          voltar = new JMenuItem("Voltar");  
          
          voltar.addActionListener(  
         		 new ActionListener(){  
         			 public void actionPerformed(ActionEvent e) { 
         			
                         new Menu();
                         dispose();
        
         				
         			 }       
         		 });                 
          
          barra.add(opcao);  
          barra.setBackground(ouro);  
          opcao.add(config);  
          opcao.add(voltar);          
  
              painel = new JPanel(); 
              painel.setLayout(null); 
              painel.setBackground(azulc); 
              perg = new JLabel("Desejo ler uma variavel, qual comando devo usar?"); 
              perg.setFont(fonte1); 
              perg.setForeground(Color.WHITE); 
              painel.add(perg); 
              int x = 0, y = 0;
              imFor = new ImageIcon(getClass().getResource("forr.png")); 
              imaFor = new JLabel(imFor); 
          imaFor.addMouseListener(new MouseListener(){ 
        	 
        	  
        	  int cont= 0;
        	      	  
              int x  = 875;
              int y = 740;          
              
                         public void mouseClicked(MouseEvent arg0) { 
                        	   
                                 cont++; 
                                 imaFor.setBounds(590,400-100,170,300); 
  
                                     if (cont >=2){ 
                                   imaFor.setBounds(590,400,170,300);
                                   painel3.setVisible(!ativo);
                                   painel3.requestFocus();
                                   cont = 0;
                              } 
                         } 
  
                         @Override 
                         public void mouseEntered(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                        	 
                        	 imaFor.setBounds(590,400-50,170,300); 
                         } 
  
                         @Override 
                         public void mouseExited(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                        	 imaFor.setBounds(590,400,170,300); 
  
                         } 
  
                         @Override 
                         public void mousePressed(MouseEvent arg0) { 
                                 mouseP = true; 
                         } 
  
                         @Override 
                         public void mouseReleased(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                                 mouseP = false; 
                                 imaFor.setBounds(590,400,170,300); 
  
  
                         } 
  
  
              }); 
  
              imif = new ImageIcon(getClass().getResource("iff.png")); 
              imaIf = new JLabel(imif); 
          imaIf.addMouseListener(new MouseListener(){ 
        	  
        	  
        	     int cont=0; 
  
                         public void mouseClicked(MouseEvent arg0) { 
                                 cont++; 
                                 imaIf.setBounds(240,400-100,170,300); 
  
                                     if (cont >=2){ 
                                   imaIf.setBounds(240,400,170,300);
                                   painel3.setVisible(!ativo);
                                   painel3.requestFocus();
                                   cont = 0;
                              } 
  
                         } 
  
                         @Override 
                         public void mouseEntered(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub
                        	 imaIf.setBounds(240,400-50,170,300);
  
                         } 
  
                         @Override 
                         public void mouseExited(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub
                        	 imaIf.setBounds(240,400,170,300);
  
                         } 
  
                         @Override 
                         public void mousePressed(MouseEvent arg0) { 
                                 mouseP = true; 
                         } 
  
                         @Override 
                         public void mouseReleased(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                                 mouseP = false; 
                                 imaIf.setBounds(240, 400,170,300); 
                                 } 
 }); 
  
              
              include = new ImageIcon(getClass().getResource("includee.png")); 
              imaInclude = new JLabel(include); 
          imaInclude.addMouseListener(new MouseListener(){ 
        	  
        	     int cont=0; 
        	  
              int x  = 515;
              int y = 740;
  
                         public void mouseClicked(MouseEvent arg0) { 
                                 cont++; 
                                 imaInclude.setBounds(410,400 -100,170,300); 
  
                                     if (cont >=2){ 
                                   imaInclude.setBounds(410,400,170,300);
                                   
                                   painel3.setVisible(!ativo);
                                   painel3.requestFocus();
                                   cont = 0;
                              } 
  
                         } 
  
                         @Override 
                         public void mouseEntered(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                        	 
                        	 imaInclude.setBounds(410,400 - 50,170,300); 
  
                         } 
  
                         @Override 
                         public void mouseExited(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                        	 
                        	 imaInclude.setBounds(410,400,170,300); 
  
                         } 
  
                         @Override 
                         public void mousePressed(MouseEvent arg0) { 
                                 mouseP = true; 
                         } 
  
                         @Override 
                         public void mouseReleased(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                                 mouseP = false; 
                                 imaInclude.setBounds(410,400,170,300); 
  
  
                         } 
  
  
              }); 
  
              scanf = new ImageIcon(getClass().getResource("scanff.png")); 
              imaScanf = new JLabel(scanf); 
          imaScanf.addMouseListener(new MouseListener(){
        	  
        	  
        	     int cont=0; 
                         int x  = 1055;
                         int y = 740;
                         
                         public void mouseClicked(MouseEvent arg0) { 
                                 cont++; 
                                 imaScanf.setBounds(760,400-100,170,300); 
  
                                     if (cont >=2){ 
                                   imaScanf.setBounds(760,400,170,300); 
                                   painel2.setVisible(!ativo);
                                   painel2.requestFocus();
                                   cont = 0;
                              } 
  
                         } 
  
                         @Override 
                         public void mouseEntered(MouseEvent arg0) { 
                                 
                        	 imaScanf.setBounds(760,400-50,170,300);

                        	 
                         } 
                          
              
                          
                         public void mousePressed(MouseEvent args0){ 
                          
                         mouseP = true; 
  
                         } 
                          
                         @Override 
                         public void mouseReleased(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                                 mouseP = false; 
                                 imaScanf.setBounds(760,400,170,300); 
  
  
                         }

						@Override
						public void mouseExited(MouseEvent e) {
							// TODO Auto-generated method stub
							 imaScanf.setBounds(760,400,170,300); 
						}
  
              }); 
  
              imPrintf = new ImageIcon(getClass().getResource("printee.png")); 
              imaPrintf = new JLabel(imPrintf); 
              imaPrintf.addMouseListener(new MouseListener(){ 
            	  
            	     int cont=0; 
            	  
            	  int x = 1235; 
                  int  y = 740; 
  
                         public void mouseClicked(MouseEvent arg0) { 
                                 cont++; 
                                 imaPrintf.setBounds(930,400-100,170,300); 
  
                                     if (cont >=2){ 
                                   imaPrintf.setBounds(930,400,170,300); 
                               
                                   painel3.setVisible(!ativo);
                                   painel3.requestFocus();
                                   cont = 0;
                                   
                              } 
                         } 
                          
                 @Override 
                         public void mouseEntered(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                	             imaPrintf.setBounds(930,400-50,170,300); 
                         } 
  
                         @Override 
                         public void mouseExited(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                        	 imaPrintf.setBounds(930,400,170,300); 
                         } 
  
                         @Override 
                         public void mousePressed(MouseEvent arg0) { 
                                 mouseP = true; 
                         } 
  
                         @Override 
                         public void mouseReleased(MouseEvent arg0) { 
                                 // TODO Auto-generated method stub 
                                 mouseP = false; 
                                 imaPrintf.setBounds(930,400,170,300); 
  
  
                                 
    
                         }
                         
                         
  
  
              }); 
              
              bt.addActionListener(  
             		 new ActionListener(){  
             			 public void actionPerformed(ActionEvent e) {  
             				
             				 new TelaPartida3();
             			     dispose();   
                                           
             			 }   
             		 });  
              
              
              bt2.addActionListener(  
              		 new ActionListener(){  
              			 public void actionPerformed(ActionEvent e) {  
              				
              				 new Menu();
              			     dispose();   
                                            
              			 }   
              		 });  
  
              Container cont = getContentPane(); 
              cont.setBackground(azul); 
  
  
              cont.add(painel); 
              cont.add(imaFor); 
              cont.add(imaIf); 
              cont.add(imaInclude); 
              cont.add(imaScanf); 
              cont.add(imaPrintf); 
              cont.add(p);
              
              
              p.setBounds(0, 0, 1366, 768);
  
              painel.setBounds(200,50,1000,150); 
              perg.setBounds(20,50,900,100); 
              imaIf.setBounds(240,400,170,300); 
              imaInclude.setBounds(410,400,170,300); 
              imaFor.setBounds(590,400,170,300); 
              imaScanf.setBounds(760,400,170,300); 
              imaPrintf.setBounds(930,400,170,300); 
 
      setSize(1366, 768);
      setLayout(null); 
      setVisible(true); 
  
  
 } 
  
				
					  
				

      public class Panel extends JPanel{

          public void paintComponent(Graphics g){
          
          super.paintComponent(g);
          Image img = fundo.getImage();
          g.drawImage(img, 0,0, this);   

          }
      }

      public class Panel2 extends JPanel{

          public void paintComponent(Graphics g){
          
          super.paintComponent(g);
          Image img = painelGanha.getImage();
          g.drawImage(img, 0,0, this);   

          }
      }

      public class Panel3 extends JPanel{

          public void paintComponent(Graphics g){
          
          super.paintComponent(g);
          Image img = painelPerde.getImage();
          g.drawImage(img, 0,0, this);   

          }
      }
      
     public static void main (String[]args){ 
        TelaPartida2 ex = new TelaPartida2(); 
        ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        } 
         
 }
