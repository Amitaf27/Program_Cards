import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.border.Border;



 public class Questionario extends JFrame { 

         private static final long serialVersionUID = 1L; 
         private JButton finalizar,cancelar; 
         private JRadioButton P1op1, P1op2,P1op3,P1op4,P1op5; 
         private JRadioButton P2op1, P2op2,P2op3,P2op4,P2op5; 
         private JRadioButton P3op1, P3op2, P3op3,P3op4,P3op5; 
         private JRadioButton P4op1, P4op2, P4op3;
         private JRadioButton P5op1, P5op2, P5op3, P5op4; 
         private JRadioButton P6op1, P6op2, P6op3, P6op4; 
         private JRadioButton P7op1, P7op2, P7op3, P7op4; 
         private JRadioButton P8op1, P8op2, P8op3; 
         private JRadioButton P9op1, P9op2, P9op3, P9op4; 
         private JRadioButton P10op1, P10op2, P10op3, P10op4; 
         private JLabel titulo; 
         private JLabel perg1, perg2,perg3, perg4, perg5, perg6, perg7, perg8,perg9,perg10;
         private Color azul = new Color(18,10,143); 
         private Color azulc = new Color(65,105,225); 
         private Color ouro = new Color(238,201,0); 
         private Color verde = new Color(0, 187, 45);
         private Color vermelho = new Color(207, 14, 14);
         private Color branco = new Color(255,255,255); 
         private Font font = new Font("Arial",Font.BOLD,20); 
         private Font font1 = new Font("Arial",Font.BOLD,30); 
         private Font font2 = new Font("Arial",Font.BOLD,14); 
         private RadioButtonHandler handler; 
         private JPanel painel ; 
         private ButtonGroup quest1, quest2,quest3,quest4, quest5,quest6,quest7,quest8,quest9,quest10; 
         private JScrollPane scroll; 
         private Border b = BorderFactory.createLineBorder(Color.black, 2);
         
         public Questionario() { 
                 handler = new RadioButtonHandler(); 
                 finalizar = new JButton("Finalizar"); 
                 finalizar.setFont(font); 
                 finalizar.setBorder(b);
                 finalizar.setForeground(Color.WHITE);
                 finalizar.setBackground(verde);
                 
                 cancelar = new JButton("Cancelar"); 
                 cancelar.setForeground(Color.WHITE);
                 cancelar.setBackground(vermelho);
                 cancelar.setFont(font); 
                 cancelar.setBorder(b);
                 cancelar.addActionListener((ActionEvent e) -> {
                     //                 new TelaLogin();
                     setVisible(false);
                 });

                 	painel = new JPanel(); 
                 	painel.setBackground(azulc); 
                 	painel.setSize(1000,600); 
                 	painel.setLayout(null);
                 	painel.setPreferredSize(new Dimension(950,1880));

                        scroll = new JScrollPane(painel);
                        scroll.setForeground(ouro);
 //aqui vc adiciona os componentes ao JPanel

                 titulo = new JLabel("QUESTIONARIO"); 
                 titulo.setFont(font1); 
                 titulo.setForeground(ouro); 
//configurando a primeira questÃ£o 
                 perg1 = new JLabel("1 - Qual o metodo para abrir um arquivo em C?"); 
                 perg1.setFont(font); 
                 perg1.setForeground(branco); 

                 P1op1 = new JRadioButton("fopen();",false); 
                 P1op2 = new JRadioButton("getc();",false); 
                 P1op3 = new JRadioButton("fseek();",false); 
                 P1op4 = new JRadioButton("putw();",false); 
                 P1op5 = new JRadioButton("rewind();",false); 

     
                 quest1 = new ButtonGroup(); 
                 quest1.add(P1op1); 
                 quest1.add(P1op2);
                 quest1.add(P1op3);
                 quest1.add(P1op4);
                 quest1.add(P1op5);

                 P1op1.setBackground(azulc); 
                 P1op1.setForeground(branco); 
                 P1op1.setFont(font2); 

                 P1op2.setBackground(azulc); 
                 P1op2.setForeground(branco); 
                 P1op2.setFont(font2);

                 P1op3.setBackground(azulc); 
                 P1op3.setForeground(branco); 
                 P1op3.setFont(font2);

                 P1op4.setBackground(azulc); 
                 P1op4.setForeground(branco); 
                 P1op4.setFont(font2);

                 P1op5.setBackground(azulc); 
                 P1op5.setForeground(branco); 
                 P1op5.setFont(font2);

//configurando a segunda questÃ£o 
                 perg2 = new JLabel("2 - Como se declara um Struct em C ?"); 
                 perg2.setFont(font); 
                 perg2.setForeground(branco); 

                 P2op1 = new JRadioButton("int Struct;,",false); 
                 P2op2 = new JRadioButton("typedef struct{} nome da struct; ",false); 
                 P2op3 = new JRadioButton("mao struct{};",false); 
                 P2op4 = new JRadioButton("char Rio = struct(9); ",false); 
                 P2op5 = new JRadioButton("String{} struct;",false); 

                 quest2 = new ButtonGroup(); 
                 quest2.add(P2op1); 
                 quest2.add(P2op2);  
                 quest2.add(P2op3);  
                 quest2.add(P2op4);  
                 quest2.add(P2op5);  

                 P2op1.setBackground(azulc); 
                 P2op1.setForeground(branco); 
                 P2op1.setFont(font2); 

                 P2op2.setBackground(azulc); 
                 P2op2.setForeground(branco); 
                 P2op2.setFont(font2);

                 P2op3.setBackground(azulc); 
                 P2op3.setForeground(branco); 
                 P2op3.setFont(font2);

                 P2op4.setBackground(azulc); 
                 P2op4.setForeground(branco); 
                 P2op4.setFont(font2);

                 P2op5.setBackground(azulc); 
                 P2op5.setForeground(branco); 
                 P2op5.setFont(font2);
                               

//configurando a terceira questÃ£o 
                 perg3 = new JLabel("3 - Que tipo de variavel e lida com o comando %s ?"); 
                 perg3.setFont(font); 
                 perg3.setForeground(branco); 


                 P3op1 = new JRadioButton("char",false); 
                 P3op2 = new JRadioButton("int",false); 
                 P3op3 = new JRadioButton("float",false); 
                 P3op4 = new JRadioButton("boolean",false); 
                 P3op5 = new JRadioButton("String",false); 


                 quest3 = new ButtonGroup(); 
                 quest3.add(P3op1); 
                 quest3.add(P3op2); 
                 quest3.add(P3op3); 
                 quest3.add(P3op4); 
                 quest3.add(P3op5); 

                 P3op1.setBackground(azulc); 
                 P3op1.setForeground(branco); 
                 P3op1.setFont(font2); 

                 P3op2.setBackground(azulc); 
                 P3op2.setForeground(branco); 
                 P3op2.setFont(font2); 

                 P3op3.setBackground(azulc); 
                 P3op3.setForeground(branco); 
                 P3op3.setFont(font2);
  
                 P3op4.setBackground(azulc); 
                 P3op4.setForeground(branco); 
                 P3op4.setFont(font2);

                 P3op5.setBackground(azulc); 
                 P3op5.setForeground(branco); 
                 P3op5.setFont(font2);


//configurando a quarta questÃ£o 
                 perg4 = new JLabel("4 - Qual dos comandos abaixo e uma estrutura de repeticao?"); 
                 perg4.setFont(font); 
                 perg4.setForeground(branco); 


                 P4op1 = new JRadioButton("if(x < 60){ \n printf('Pamonha');}",false); 
                 P4op2 = new JRadioButton("printf();",false); 
                 P4op3 = new JRadioButton("int a;",false); 

                 quest4 = new ButtonGroup(); 
                 quest4.add(P4op1); 
                 quest4.add(P4op2); 
                 quest4.add(P4op3); 

                 P4op1.setBackground(azulc); 
                 P4op1.setForeground(branco); 
                 P4op1.setFont(font2); 

                 P4op2.setBackground(azulc); 
                 P4op2.setForeground(branco); 
                 P4op2.setFont(font2); 

                 P4op3.setBackground(azulc); 
                 P4op3.setForeground(branco); 
                 P4op3.setFont(font2); 

//configurando a quinta questÃ£o 
                 perg5 = new JLabel("5 - Qual Ã© a funÃ§Ã£o da seguinte declaraÃ§Ã£o? Scanf (str, â€œ% dâ€�, & i);"); 
                 perg5.setFont(font); 
                 perg5.setForeground(branco); 


                 P5op1 = new JRadioButton("Coca-Cola",false); 
                 P5op2 = new JRadioButton("Guarana Antartica",false); 
                 P5op3 = new JRadioButton("Fanta",false); 
                 P5op4 = new JRadioButton("Regente",false); 

                 quest5 = new ButtonGroup(); 
                 quest5.add(P5op1); 
                 quest5.add(P5op2); 
                 quest5.add(P5op3); 
                 quest5.add(P5op4);

                 P5op1.setBackground(azulc); 
                 P5op1.setForeground(branco); 
                 P5op1.setFont(font2); 

                 P5op2.setBackground(azulc); 
                 P5op2.setForeground(branco); 
                 P5op2.setFont(font2);  

                 P5op3.setBackground(azulc); 
                 P5op3.setForeground(branco); 
                 P5op3.setFont(font2); 

                 P5op4.setBackground(azulc); 
                 P5op4.setForeground(branco); 
                 P5op4.setFont(font2); 

//configurando a sexta questÃ£o 
                 perg6 = new JLabel("6 - Selecione a bebida de sua preferencia:"); 
                 perg6.setFont(font); 
                 perg6.setForeground(branco); 


                 P6op1 = new JRadioButton("Coca-Cola",false); 
                 P6op2 = new JRadioButton("Guarana Antartica",false); 
                 P6op3 = new JRadioButton("Fanta",false); 
                 P6op4 = new JRadioButton("Regente",false); 

                 quest6 = new ButtonGroup(); 
                 quest6.add(P6op1); 
                 quest6.add(P6op2); 
                 quest6.add(P6op3); 
                 quest6.add(P6op4); 

                 P6op1.setBackground(azulc); 
                 P6op1.setForeground(branco); 
                 P6op1.setFont(font2); 

                 P6op2.setBackground(azulc); 
                 P6op2.setForeground(branco); 
                 P6op2.setFont(font2); 

                 P6op3.setBackground(azulc); 
                 P6op3.setForeground(branco); 
                 P6op3.setFont(font2);  

                 P6op4.setBackground(azulc); 
                 P6op4.setForeground(branco); 
                 P6op4.setFont(font2); 

//configurando a setima questao 
                 perg7 = new JLabel("7 - Selecione a bebida de sua preferencia:"); 
                 perg7.setFont(font); 
                 perg7.setForeground(branco); 


                 P7op1 = new JRadioButton("Coca-Cola",false); 
                 P7op2 = new JRadioButton("Guarana Antartica",false); 
                 P7op3 = new JRadioButton("Fanta",false); 
                 P7op4 = new JRadioButton("Regente",false); 
            
                 quest7 = new ButtonGroup(); 
                 quest7.add(P7op1); 
                 quest7.add(P7op2); 
                 quest7.add(P7op3); 
                 quest7.add(P7op4);

                 P7op1.setBackground(azulc); 
                 P7op1.setForeground(branco); 
                 P7op1.setFont(font2); 

                 P7op2.setBackground(azulc); 
                 P7op2.setForeground(branco); 
                 P7op2.setFont(font2);

                 P7op3.setBackground(azulc); 
                 P7op3.setForeground(branco); 
                 P7op3.setFont(font2); 

                 P7op4.setBackground(azulc); 
                 P7op4.setForeground(branco); 
                 P7op4.setFont(font2);

//configurando a oitava questÃ£o 
                 perg8 = new JLabel("8 - Selecione a bebida de sua preferencia:"); 
                 perg8.setFont(font); 
                 perg8.setForeground(branco); 

                 P8op1 = new JRadioButton("Coca-Cola",false); 
                 P8op2 = new JRadioButton("Guarana Antartica",false); 
                 P8op3 = new JRadioButton("Fanta",false);  

                 quest8 = new ButtonGroup(); 
                 quest8.add(P8op1); 
                 quest8.add(P8op2); 
                 quest8.add(P8op3); 

                 P8op1.setBackground(azulc); 
                 P8op1.setForeground(branco); 
                 P8op1.setFont(font2); 

                 P8op2.setBackground(azulc); 
                 P8op2.setForeground(branco); 
                 P8op2.setFont(font2);  

                 P8op3.setBackground(azulc); 
                 P8op3.setForeground(branco); 
                 P8op3.setFont(font2);  

//configurando a nona questÃ£o 
                 perg9 = new JLabel("9 - Selecione a bebida de sua preferencia:"); 
                 perg9.setFont(font); 
                 perg9.setForeground(branco); 


                 P9op1 = new JRadioButton("Coca-Cola",false); 
                 P9op2 = new JRadioButton("Guarana Antartica",false); 
                 P9op3 = new JRadioButton("Fanta",false); 
                 P9op4 = new JRadioButton("Fanta",false); 

                 quest9 = new ButtonGroup(); 
                 quest9.add(P9op1); 
                 quest9.add(P9op2); 
                 quest9.add(P9op3); 
                 quest9.add(P9op4); 

                 P9op1.setBackground(azulc); 
                 P9op1.setForeground(branco); 
                 P9op1.setFont(font2); 

                 P9op2.setBackground(azulc); 
                 P9op2.setForeground(branco); 
                 P9op2.setFont(font2);  

                 P9op3.setBackground(azulc); 
                 P9op3.setForeground(branco); 
                 P9op3.setFont(font2);  

                 P9op4.setBackground(azulc); 
                 P9op4.setForeground(branco); 
                 P9op4.setFont(font2); 

//configurando a decima  questao 
                 perg10 = new JLabel("10 - Selecione a bebida de sua preferencia:"); 
                 perg10.setFont(font); 
                 perg10.setForeground(branco); 


                 P10op1 = new JRadioButton("Coca-Cola",false); 
                 P10op2 = new JRadioButton("Guarana Antartica",false); 
                 P10op3 = new JRadioButton("Fanta",false); 
                 P10op4 = new JRadioButton("Regente",false); 
             
                 quest10 = new ButtonGroup(); 
                 quest10.add(P10op1); 
                 quest10.add(P10op2); 
                 quest10.add(P10op3); 
                 quest10.add(P10op4);

                 P10op1.setBackground(azulc); 
                 P10op1.setForeground(branco); 
                 P10op1.setFont(font2); 

                 P10op2.setBackground(azulc); 
                 P10op2.setForeground(branco); 
                 P10op2.setFont(font2);  

                 P10op3.setBackground(azulc); 
                 P10op3.setForeground(branco); 
                 P10op3.setFont(font2); 

                 P10op4.setBackground(azulc); 
                 P10op4.setForeground(branco); 
                 P10op4.setFont(font2); 

//adicionando elementos 1 ao painel
                 painel.add(perg1); 
                 painel.add(P1op1); 
                 painel.add(P1op2);
                 painel.add(P1op3);
                 painel.add(P1op4);
                 painel.add(P1op5);

//2
                 painel.add(perg2); 
                 painel.add(P2op1); 
                 painel.add(P2op2);
                 painel.add(P2op3);
                 painel.add(P2op4);
                 painel.add(P2op5);

//3
                 painel.add(perg3); 
                 painel.add(P3op1); 
                 painel.add(P3op2); 
                 painel.add(P3op3);
                 painel.add(P3op4); 
                 painel.add(P3op5); 


//4
                 painel.add(perg4); 
                 painel.add(P4op1); 
                 painel.add(P4op2); 
                 painel.add(P4op3); 
//5
                 painel.add(perg5); 
                 painel.add(P5op1); 
                 painel.add(P5op2); 
                 painel.add(P5op3); 
                 painel.add(P5op4); 
//6
                 painel.add(perg6); 
                 painel.add(P6op1); 
                 painel.add(P6op2); 
                 painel.add(P6op3); 
                 painel.add(P6op4); 
//7
                 painel.add(perg7); 
                 painel.add(P7op1); 
                 painel.add(P7op2); 
                 painel.add(P7op3); 
                 painel.add(P7op4); 
//8
                 painel.add(perg8); 
                 painel.add(P8op1); 
                 painel.add(P8op2); 
                 painel.add(P8op3); 
//9
                 painel.add(perg9); 
                 painel.add(P9op1); 
                 painel.add(P9op2); 
                 painel.add(P9op3); 
                 painel.add(P9op4); 
//10
                 painel.add(perg10); 
                 painel.add(P10op1); 
                 painel.add(P10op2); 
                 painel.add(P10op3); 
                 painel.add(P10op4);

//adicionando elementos na tela principal        
                 Container cont = getContentPane(); 
                 cont.setBackground(azul); 
                 cont.add(scroll);
                 cont.add(titulo); 
                 cont.add(finalizar); 
                 cont.add(cancelar); 

//definindo a posiÃ§Ã£o dos elementos no painel
                 titulo.setBounds(533,40,300,100); 
//1
                 perg1.setBounds(35,5,500,100); 
                 P1op1.setBounds(45,70,500,50); 
                 P1op2.setBounds(45,100,300,50);
                 P1op3.setBounds(45,130,300,50);
                 P1op4.setBounds(45,160,300,50);
                 P1op5.setBounds(45,190,300,50);

//2
                 perg2.setBounds(35,215,500,100); 
                 P2op1.setBounds(45,280,300,50); 
                 P2op2.setBounds(45,310,300,50); 
                 P2op3.setBounds(45,340,300,50); 
                 P2op4.setBounds(45,370,300,50); 
                 P2op5.setBounds(45,400,300,50); 
//3
                perg3.setBounds(35,425,700,100); 
                 P3op1.setBounds(45,490,300,50); 
                 P3op2.setBounds(45,520,300,50); 
                 P3op3.setBounds(45,550,300,50);
                 P3op4.setBounds(45,580,300,50);
                 P3op5.setBounds(45,610,300,50);

//4
                perg4.setBounds(35,635,600,100); 
                 P4op1.setBounds(45,700,300,50); 
                 P4op2.setBounds(45,730,300,50); 
                 P4op3.setBounds(45,760,300,50); 

//5
                perg5.setBounds(35,785,700,100); 
                 P5op1.setBounds(45,850,300,50); 
                 P5op2.setBounds(45,880,300,50); 
                 P5op3.setBounds(45,910,300,50); 
                 P5op4.setBounds(45,940,300,50); 
//6
                perg6.setBounds(35,965,400,100); 
                 P6op1.setBounds(45,1030,300,50); 
                 P6op2.setBounds(45,1060,300,50); 
                 P6op3.setBounds(45,1090,300,50); 
                 P6op4.setBounds(45,1120,300,50); 
//7
                perg7.setBounds(35,1145,400,100); 
                 P7op1.setBounds(45,1210,300,50); 
                 P7op2.setBounds(45,1240,300,50); 
                 P7op3.setBounds(45,1270,300,50); 
                 P7op4.setBounds(45,1300,300,50); 
//8
                perg8.setBounds(35,1325,400,100); 
                 P8op1.setBounds(45,1390,300,50); 
                 P8op2.setBounds(45,1420,300,50); 
                 P8op3.setBounds(45,1450,300,50); 
//9
                perg9.setBounds(35,1475,400,100); 
                 P9op1.setBounds(45,1540,300,50); 
                 P9op2.setBounds(45,1570,300,50); 
                 P9op3.setBounds(45,1600,300,50); 
                 P9op4.setBounds(45,1630,300,50); 
//10
                 perg10.setBounds(35,1660,400,100); 
                 P10op1.setBounds(45,1725,300,50); 
                 P10op2.setBounds(45,1755,300,50); 
                 P10op3.setBounds(45,1785,300,50); 
                 P10op4.setBounds(45,1815,300,50); 

//definindo a posiÃ§Ã£o dos elementos na tela principal 
                 scroll.setBounds(183,160,1000,450);
                 finalizar.setBounds(413,640,250,50); 
                 cancelar.setBounds(683,640,250,50); 

                 P1op1.addItemListener(handler); 

                 setLayout(null); 
                 setSize(1366,768); 
                 setVisible(true); 

         } 

               private class RadioButtonHandler implements ItemListener{ 

                         public void itemStateChanged(ItemEvent arg0) { 
                            if(P1op1.isSelected()) { 
                                    JOptionPane.showMessageDialog(null, "Parabens pelo bom gosto!"); 
                            } 

                         } 

               } 

              public static void main(String[]args) { 
                      Questionario ex = new Questionario(); 
                      ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
              } 
 }
