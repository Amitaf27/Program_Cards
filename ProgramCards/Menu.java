import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	     boolean ativo= false, on1 = true, on2 = true;
	     private JButton ilha1, ilha2, ilha3, livre;
	     private JButton btSom, btSom2, btNome, btConfirmar;
	     
	
	     ImageIcon imagem1 = new ImageIcon(getClass().getResource("ilhas1.png"));
	     ImageIcon imagem2 = new ImageIcon(getClass().getResource("ilhas2.png"));
	     ImageIcon imagem3 = new ImageIcon(getClass().getResource("ilhas3.png"));
	     ImageIcon imagem4 = new ImageIcon(getClass().getResource("ilha livre.png"));
	     ImageIcon imagem5 = new ImageIcon(getClass().getResource("Música_ligada.png"));
	     ImageIcon imagem6 = new ImageIcon(getClass().getResource("Música_desligada.png"));
	     ImageIcon imagem7 = new ImageIcon(getClass().getResource("Efeito_ligado.png"));
	     ImageIcon imagem8 = new ImageIcon(getClass().getResource("Efeito_desligado.png"));

	     
	     private JLabel label, label1, label2, label3;
	     private Font titulo = new Font("Arial",Font.BOLD,30);
	     private Font texto2 = new Font("Arial",Font.BOLD,20);
	     private Font texto = new Font("Arial",Font.BOLD,14);
	     private JMenuBar  barrinha;
	     private JMenu opcao;
	     private JMenuItem config, sair;
	     private JPanel painel = new JPanel();
	     Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize();	  
	     
	
	     Color azulclaro = new Color(135,206,250);
	     Color ouroclaro = new Color(238,232,1);
	     Color ouro = new Color(238,201,0);
	     Color azul = new Color(25,25,112);
	     Border borda = BorderFactory.createLineBorder(Color.BLACK);
             String musicaSomLigada;
             SomEfeito ef = new SomEfeito();
             Musica musica = new Musica();

	     public Menu() {
	    	   
                     
           
                   
                 setTitle("ILHAS");  
                   barrinha = new JMenuBar();  
                     
                   setJMenuBar(barrinha);  
                     
                   opcao = new JMenu("OpÃ§Ãµes");  
                   
                   config = new JMenuItem("ConfiguraÃ§Ãµes");  
                   sair = new JMenuItem("sair");  
                     
                   barrinha.add(opcao);  
                   barrinha.setBackground(ouro);  
                     
                   
                   opcao.add(config);  
                   opcao.add(sair);          
                   opcao.setBackground(ouro);  
                   
                   //decorando JMenuItem 
                   barrinha.setFont(titulo);
                   opcao.setFont(texto2);
                   config.setFont(texto);
                   sair.setFont(texto);
                   
                   
                   
                     
                   //configurando os botÃƒÂµes do panel  
   
           
                           
                   btSom = new JButton(imagem5);  
                   btSom.setBorder(borda);  
                   btSom.setOpaque(false);  
                   btSom.setFocusable(false);  
                   btSom.setContentAreaFilled(false);  
                 //.setBorderPainted(false);  
                     
           btSom2 = new JButton(imagem7);  
           btSom2.setBorder(borda);  
               btSom2. setOpaque(false);  
               btSom2.setFocusable(false);  
               btSom2.setContentAreaFilled(false);  
             //  btSom2.setBorderPainted(false);                    
                   btNome = new JButton("Mudar NickName");  
                   btNome.setFont(new Font("Arial", Font.BOLD, 14));  
                     
                     
                   btConfirmar = new JButton("Confirmar");  
                   btConfirmar.setFont(new Font("Arial", Font.BOLD, 14));  
                     
                     
                   //configurando o panel de configuracoes  
                   label = new JLabel("ConfiguraÃ§Ãµes");  
                   label.setFont(titulo);  
                   label.setForeground(Color.BLACK);  
                     
                   label2 = new JLabel("MÃºsica");  
                   label2.setForeground(Color.BLACK);  
                   label2.setFont(texto);  
                     
                   label3 = new JLabel("Efeito Sonoro");  
                   label3.setFont(texto);  
                   label3.setForeground(new Color(27, 27, 74));  
                   
                   add(painel);  
                   painel.add(label);  
                   label.setBounds(95, 0, 400, 100);


                   painel.setLayout(null);
                   painel.setBounds(750,250,400,500);
				 //  panel.add(label);  
                 //  label.setBounds(0, 0, 80, 60);  
                   painel.setVisible(ativo);  
                   
                   painel.setBackground(new Color(161, 220, 255));  
                   painel.setBorder(borda);  
                     
                   painel.add(btSom);  
                   painel.add(label2);  
                   label2.setBounds(110, 135, 100, 100);  
                     
                     
                   painel.add(btSom2);  
                   painel.add(label3);  
                   label3.setBounds(215, 135, 100, 100);  
                     
                     
                     
                   painel.add(btNome);  
                   painel.add(btConfirmar);  
                     
                   btSom.setBounds(90, 80, 90, 90);  
  
  
                   //configurando botao de som 
                 //   efeitoSom= "F:/Clique"; 
                 //   musicaSom = "F:/music";
                   ef.setFile(TelaEntrada.efeitoSom);
                   musica.setFile(TelaEntrada.musicaSom);
                    musicaSomLigada = "on"; 
                     
                     
                    //configurando botoes 
                    
                    btSom.addActionListener(  
                           new ActionListener(){  
   
                                      
                                    public void actionPerformed(ActionEvent e) {  
                                              
                                      ef.play();            
                                              
                                       if(musicaSomLigada.equals("off")){ 
    
                                        musica.setFile(TelaEntrada.musicaSom); 
                                        musica.play(); 
                                        musicaSomLigada = "on"; 
                                        btSom.setIcon(imagem5); 
                    
   
                                       } else if (musicaSomLigada.equals("on")){ 
  
  
                                        musica.stop(); 
                                        musicaSomLigada = "off"; 
                                        btSom.setIcon(imagem6); 
    
 }                      
                                      
                                    }   
                      });  
                     
                   btSom2.setBounds(215, 80, 90, 90);  
                   btSom2.addActionListener(  
                                   new ActionListener(){  
   
                                              
                                            public void actionPerformed(ActionEvent e) { 

                                          ef.play();
                                                      
                                                             if (on2) {                                                               
                                                            	 btSom2.setIcon(imagem8);  
                                                            on2 = false;  
                                                    } else {  
                                                              
                                                            btSom2.setIcon(imagem7);  
                                                            on2 = true;  
                                                    }                                 
 }       
                                              
                                            });                                                    
                     
                   btNome.setBounds(125, 270, 150, 50);  
                   btNome.setBackground(new Color(182, 196, 250));  
                   btNome.setBorder(borda);  
                   btNome.setForeground(Color.black);  
                     
                   btConfirmar.setBounds(125, 330, 150, 50);  
                   btConfirmar.setBackground(new Color(182, 196, 250));  
                   btConfirmar.setBorder(borda);  
                   btConfirmar.setForeground(Color.black);  
           
                     
                   config.setBackground(ouroclaro);  
                   config.setForeground(Color.black);  
                   config.addActionListener(  
                           new ActionListener(){  
   
                                      
                                    public void actionPerformed(ActionEvent e) {  
                                              
                                    	 ef.play();  
                                        ativo = !ativo;  
                                            painel.setVisible(ativo);  
                                            
                                              
                                      
                                    }   
                      });  
                     
                   btConfirmar.addActionListener(  
                           new ActionListener(){  
   
                                      
                                    public void actionPerformed(ActionEvent e) {  
                                              
                                       ef.play();
                                        ativo = !ativo;  
                                        painel.setVisible(ativo);  
                                              
                                      
                                    }   
                      });  
   
                     
                      Sair s = new Sair();  
                   sair.addActionListener(s);  
              
                 ilha1 = new JButton(imagem1);  
                 ilha1. setOpaque(false);  
                 ilha1.setFocusable(false);  
                 ilha1.setContentAreaFilled(false);  
                 ilha1.setBorderPainted(false);  
                   
                 ilha2 = new JButton(imagem2);  
                         ilha2. setOpaque(false);  
                 ilha2.setFocusable(false);  
                 ilha2.setContentAreaFilled(false);  
                 ilha2.setBorderPainted(false);  
           
           
                 ilha2.setBackground(Color.WHITE);  
                 ilha2.setForeground(Color.BLACK);  
   
                 ilha3 = new JButton(imagem3);  
                 ilha3.setBackground(Color.WHITE);  
                 ilha3.setForeground(Color.BLACK);   
                 ilha3. setOpaque(false);  
                 ilha3.setFocusable(false);  
                 ilha3.setContentAreaFilled(false);  
                 ilha3.setBorderPainted(false);  
                 livre = new JButton(imagem4);  
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
                 cont.add(ilha1);
                 cont.setBackground(azul);
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
                    
             ef.play();
             new TelaNiveis();  
             dispose();  
                    
         }  
      }  
          private class Sair implements ActionListener {  
   
          public void actionPerformed(ActionEvent e){  
                    
              ef.play();
              System.exit(0);  
                    
         }  
    }  
         public static void main(String[]args) {  
                   
           
                 Menu menu = new Menu();  
                 menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        }            
         
}
