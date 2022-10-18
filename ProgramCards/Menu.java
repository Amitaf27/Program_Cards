  import java.awt.BorderLayout;  
  import java.awt.Color;  
  import java.awt.Container;  
  import java.awt.Dimension;  
  import java.awt.EventQueue;  
  import java.awt.Font;  
  import java.awt.Graphics;  
  import java.awt.Image;  
  import java.awt.Toolkit;  
  import java.awt.event.ActionEvent;  
  import java.awt.event.ActionListener;  
  import java.io.File;  
  import java.io.IOException;  
  import javax.swing.BorderFactory;  
  import javax.swing.ImageIcon;  
  import javax.swing.JButton;  
  import javax.swing.JFrame;  
  import javax.swing.JLabel;  
  import javax.swing.JMenu;  
  import javax.swing.JMenuBar;  
  import javax.swing.JMenuItem;  
  import javax.swing.JPanel;  
  import javax.swing.border.Border;  
    
  public class Menu extends JFrame{  
             
             private static final long serialVersionUID = 1L;  
                    
      
               boolean on1 = true, on2 = true;  
              JButton ilha1,ilha2,ilha3,livre;  
               
    
    
                
              JButton btSom, btSom2, btNome, btConfirmar;  
             // ImageIcon fundo = new ImageIcon(getClass().getResource("FundoIlhas.png"));  
              ImageIcon image = new ImageIcon(getClass().getResource("ilhas1.png"));  
              ImageIcon image2 = new ImageIcon(getClass().getResource("ilhas2.png"));  
              ImageIcon image3 = new ImageIcon(getClass().getResource("ilhas3.png"));  
              ImageIcon image4 = new ImageIcon(getClass().getResource("ilha livre.png"));  
              ImageIcon image5 = new ImageIcon(getClass().getResource("Música_ligada.png"));  
              ImageIcon image6 = new ImageIcon(getClass().getResource("Música_desligada.png"));  
              ImageIcon image7 = new ImageIcon(getClass().getResource("Efeito_ligado.png"));  
              ImageIcon image8 = new ImageIcon(getClass().getResource("Efeito_desligado.png"));  
                
        
              JLabel label, label2, label3;  
              Font tituto = new Font("Arial", Font.BOLD, 30);  
              Font texto= new Font("Arial", Font.BOLD, 14);  
              //ImageIcon image9 = new ImageIcon(getClass().getResource("designPanel.png"));  
              //JLabel label = new JLabel(image9);  
                
                
              JMenuBar barrinha;  
              JMenu opcao;  
              JMenuItem config, sair;  
              JPanel panel = new JPanel();  
              boolean ativo = false;   
              Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize();  
              Color azulclaro = new Color(135,206,250);  
          Color ouro = new Color(238,201,0);  
          Color ouroclaro = new Color(238,232,170);  
          Color azul = new Color(25,25,112);  
          Border borda = BorderFactory.createLineBorder(Color.black, 4); 
  String efeitoSom; 
  String musicaSom; 
  String musicaSomLigada; 
   
   EfeitoSom ef = new EfeitoSom(); 
   Musica musica = new Musica(); 
   
            
            public Menu() {  
                      
            
                    
                  setTitle("ILHAS");  
                    barrinha = new JMenuBar();  
                      
                    setJMenuBar(barrinha);  
                      
                    opcao = new JMenu("Opções");  
                    
                    config = new JMenuItem("Configurações");  
                    sair = new JMenuItem("sair");  
                      
                    barrinha.add(opcao);  
                    barrinha.setBackground(ouro);  
                      
                    
                    opcao.add(config);  
                    opcao.add(sair);          
                    opcao.setBackground(ouro);  
                      
                    //configurando os botÃµes do panel  
    
            
                            
                    btSom = new JButton(image5);  
                    btSom.setBorder(borda);  
                    btSom.setOpaque(false);  
                    btSom.setFocusable(false);  
                    btSom.setContentAreaFilled(false);  
                  //.setBorderPainted(false);  
                      
            btSom2 = new JButton(image7);  
            btSom2.setBorder(borda);  
                btSom2. setOpaque(false);  
                btSom2.setFocusable(false);  
                btSom2.setContentAreaFilled(false);  
              //  btSom2.setBorderPainted(false);                    
                    btNome = new JButton("Mudar NickName");  
                    btNome.setFont(new Font("Arial", Font.BOLD, 14));  
                      
                      
                    btConfirmar = new JButton("Confirmar");  
                    btConfirmar.setFont(new Font("Arial", Font.BOLD, 14));  
                      
                      
                    //configurando o panel de configuracoes  
                    label = new JLabel("Configurações");  
                    label.setFont(tituto);  
                    label.setForeground(Color.BLACK);  
                      
                    label2 = new JLabel("Música");  
                    label2.setForeground(Color.BLACK);  
                    label2.setFont(texto);  
                      
                    label3 = new JLabel("Efeito Sonoro");  
                    label3.setFont(texto);  
                    label3.setForeground(new Color(27, 27, 74));  
                    
                    add(panel);  
                    panel.add(label);  
                    label.setBounds(95, 0, 400, 100);  
                      
                      
                      
                    panel.setLayout(null);  
                    panel.setBounds(750, 250, 400, 500);  
                  //  panel.add(label);  
                  //  label.setBounds(0, 0, 80, 60);  
                    panel.setVisible(ativo);  
                    
                    panel.setBackground(new Color(161, 220, 255));  
                    panel.setBorder(borda);  
                      
                    panel.add(btSom);  
                    panel.add(label2);  
                    label2.setBounds(110, 135, 100, 100);  
                      
                      
                    panel.add(btSom2);  
                    panel.add(label3);  
                    label3.setBounds(215, 135, 100, 100);  
                      
                      
                      
                    panel.add(btNome);  
                    panel.add(btConfirmar);  
                      
                    btSom.setBounds(90, 80, 90, 90);  
   
   
                    //configurando botao de som 
                    // efeitoSom= "F:/Clique"; 
                    // musicaSom = "F:/music";
                    ef.setFile(efeitoSom);
                     musicaSomLigada = "on"; 
                      
                      
                     //configurando botoes 
                     
                     btSom.addActionListener(  
                            new ActionListener(){  
    
                                       
                                     public void actionPerformed(ActionEvent e) {  
                                               
                                       ef.play();            
                                               
                                        if(musicaSomLigada.equals("off")){ 
     
                                         musica.setFile(musicaSom); 
                                         musica.play(); 
                                         musicaSomLigada = "on"; 
                                         btSom.setIcon(image5); 
                     
    
                                        } else if (musicaSomLigada.equals("on")){ 
   
   
                                         musica.stop(); 
                                         musicaSomLigada = "off"; 
                                         btSom.setIcon(image6); 
     
  }  
                                               
                                     //        Sons2.main(null);  
                                       
                                     }   
                       });  
                      
                    btSom2.setBounds(215, 80, 90, 90);  
                    btSom2.addActionListener(  
                                    new ActionListener(){  
    
                                               
                                             public void actionPerformed(ActionEvent e) { 
 
                                           ef.play();
                                                       
                                                              if (on2) {                                                               btSom2.setIcon(image8);  
                                                             on2 = false;  
                                                     } else {  
                                                               
                                                             btSom2.setIcon(image7);  
                                                             on2 = true;  
                                                     }                    
               
     
  }       
                                               
                                             }   
                               });  
                              
                      
                      
                    btNome.setBounds(125, 270, 150, 50);  
                    btNome.setBackground(new Color(182, 196, 250));  
                    btNome.setBorder(borda);  
                    btNome.setForeground(Color.black);  
                      
                    btConfirmar.setBounds(125, 330, 150, 50);  
                    btConfirmar.setBackground(new Color(182, 196, 250));  
                    btConfirmar.setBorder(borda);  
                    btConfirmar.setForeground(Color.black);  
            
                      
                    config.setBackground(ouroclaro);  
                    config.setForeground(Color.black);  
                    config.addActionListener(  
                            new ActionListener(){  
    
                                       
                                     public void actionPerformed(ActionEvent e) {  
                                               
                                   ef.play();           
                                         ativo = !ativo;  
                                             panel.setVisible(ativo);  
                                               
                                       
                                     }   
                       });  
                      
                    btConfirmar.addActionListener(  
                            new ActionListener(){  
    
                                       
                                     public void actionPerformed(ActionEvent e) {  
                                               
                                        ef.play();
                                         ativo = !ativo;  
                                             panel.setVisible(ativo);  
                                               
                                       
                                     }   
                       });  
    
                      
                       Sair s = new Sair();  
                    sair.addActionListener(s);  
               
                  ilha1 = new JButton(image);  
                  ilha1. setOpaque(false);  
                  ilha1.setFocusable(false);  
                  ilha1.setContentAreaFilled(false);  
                  ilha1.setBorderPainted(false);  
                    
                  ilha2 = new JButton(image2);  
                          ilha2. setOpaque(false);  
                  ilha2.setFocusable(false);  
                  ilha2.setContentAreaFilled(false);  
                  ilha2.setBorderPainted(false);  
            
            
                  ilha2.setBackground(Color.WHITE);  
                  ilha2.setForeground(Color.BLACK);  
    
                  ilha3 = new JButton(image3);  
                  ilha3.setBackground(Color.WHITE);  
                  ilha3.setForeground(Color.BLACK);   
                  ilha3. setOpaque(false);  
          ilha3.setFocusable(false);  
          ilha3.setContentAreaFilled(false);  
          ilha3.setBorderPainted(false);  
         
                  livre = new JButton(image4);  
                  livre. setOpaque(false);  
                  livre.setFocusable(false);  
                  livre.setContentAreaFilled(false);  
                  livre.setBorderPainted(false);  
                       
                  AcionaBotao c = new AcionaBotao();  
                   ilha1.addActionListener(c);  
                   ilha2.addActionListener(c);  
           ilha3.addActionListener(c);  
           livre.addActionListener(c);  
                  
                 
     
                                                  
                                                  
    
              Container cont = getContentPane();  
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
              
              
              
                
           private class AcionaBotao implements ActionListener {  
    
           public void actionPerformed(ActionEvent e){  
                     
              ef.play();
              new TelaNiveis();  
              ?dispose();  
                     
          }  
       }  
           private class Sair implements ActionListener {  
    
           public void actionPerformed(ActionEvent e){  
                     
               ef.play();
               System.exit(0);  
                     
          }  
     }  
          public static void main(String[]args) {  
                    
            
                  Menu menu = new Menu();  
                  menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
                    
                    
    
        
  }  
            
            
  }
