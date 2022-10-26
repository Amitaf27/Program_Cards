import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;



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
         private Color branco = new Color(255,255,255); 
         private Font font = new Font("Arial",Font.BOLD,20); 
         private Font font1 = new Font("Arial",Font.BOLD,30); 
         private Font font2 = new Font("Arial",Font.BOLD,14); 
         private Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize(); 
         private RadioButtonHandler handler; 
         private JPanel painel ; 
         private ButtonGroup quest1, quest2,quest3,quest4, quest5,quest6,quest7,quest8,quest9,quest10; 
         private JScrollPane scroll; 
   //  private JScrollPane scroll = new JScrollPane();

         public Questionario() { 
                 handler = new RadioButtonHandler(); 
                 finalizar = new JButton("Finalizar"); 
                 finalizar.setFont(font); 
                 cancelar = new JButton("Cancelar"); 
                 cancelar.setFont(font); 
                 cancelar.addActionListener((ActionEvent e) -> {
                     //                 new TelaLogin();
                     setVisible(false);
                 });

                 	painel = new JPanel(); 
                 	painel.setBackground(azulc); 
                 	painel.setSize(1000,600); 
                 	painel.setLayout(null);
                 	painel.setPreferredSize(new Dimension(950,1950));

                        scroll = new JScrollPane(painel);
                        scroll.setForeground(ouro);
 //aqui vc adiciona os componentes ao JPanel

                 titulo = new JLabel("QUESTIONARIO"); 
                 titulo.setFont(font1); 
                 titulo.setForeground(ouro); 
//configurando a primeira questÃ£o 
                 perg1 = new JLabel("1 - VocÃª sabe o bÃ¡sico de C?:"); 
                 perg1.setFont(font); 
                 perg1.setForeground(branco); 

                 P1op1 = new JRadioButton("Sim",false); 
                 P1op2 = new JRadioButton("NÃO",false); 
                 P1op3 = new JRadioButton("NÃO",false); 
                 P1op4 = new JRadioButton("NÃO",false); 
                 P1op5 = new JRadioButton("NÃO",false); 

     
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
                 perg2 = new JLabel("2 - VocÃª sabe o que sÃ£o variÃ¡veis na linguagem C?"); 
                 perg2.setFont(font); 
                 perg2.setForeground(branco); 

                 P2op1 = new JRadioButton("Sim",false); 
                 P2op2 = new JRadioButton("NÃ£o",false); 

                 quest2 = new ButtonGroup(); 
                 quest2.add(P2op1); 
                 quest2.add(P2op2);  

                 P2op1.setBackground(azulc); 
                 P2op1.setForeground(branco); 
                 P2op1.setFont(font2); 

                 P2op2.setBackground(azulc); 
                 P2op2.setForeground(branco);                 

//configurando a terceira questÃ£o 
                 perg3 = new JLabel("3 - Qual Ã© a biblioteca padrÃ£o para funÃ§Ãµes de leitura de dados?"); 
                 perg3.setFont(font); 
                 perg3.setForeground(branco); 


                 P3op1 = new JRadioButton("#include <stdio.h>",false); 
                 P3op2 = new JRadioButton("#include <math.h>",false); 
                 P3op3 = new JRadioButton("#include <stdio.lib>",false); 

                 quest3 = new ButtonGroup(); 
                 quest3.add(P3op1); 
                 quest3.add(P3op2); 
                 quest3.add(P3op3); 

                 P3op1.setBackground(azulc); 
                 P3op1.setForeground(branco); 
                 P3op1.setFont(font2); 

                 P3op2.setBackground(azulc); 
                 P3op2.setForeground(branco); 

                 P3op3.setBackground(azulc); 
                 P3op3.setForeground(branco); 


//configurando a quarta questÃ£o 
                 perg4 = new JLabel("4 - Qual comando expressa uma leitura de dados?"); 
                 perg4.setFont(font); 
                 perg4.setForeground(branco); 


                 P4op1 = new JRadioButton("Scanf();",false); 
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

                 P4op3.setBackground(azulc); 
                 P4op3.setForeground(branco); 


//configurando a quinta questÃ£o 
                 perg5 = new JLabel("5 - Qual Ã© a funÃ§Ã£o da seguinte declaraÃ§Ã£o? Scanf (str, â€œ% dâ€�, & i);"); 
                 perg5.setFont(font); 
                 perg5.setForeground(branco); 


                 P5op1 = new JRadioButton("Coca-Cola",false); 
                 P5op2 = new JRadioButton("Guarana Antartica",false); 
                 P5op3 = new JRadioButton("Fanta",false); 
                 P5op4 = new JRadioButton("Regente",false); 
                 P5op5 = new JRadioButton("Pepsi",false); 

                 quest5 = new ButtonGroup(); 
                 quest5.add(P5op1); 
                 quest5.add(P5op2); 
                 quest5.add(P5op3); 
                 quest5.add(P5op4); 
                 quest5.add(P5op5); 

                 P5op1.setBackground(azulc); 
                 P5op1.setForeground(branco); 
                 P5op1.setFont(font2); 

                 P5op2.setBackground(azulc); 
                 P5op2.setForeground(branco); 

                 P5op3.setBackground(azulc); 
                 P5op3.setForeground(branco); 

                 P5op4.setBackground(azulc); 
                 P5op4.setForeground(branco); 

                 P5op5.setBackground(azulc); 
                 P5op5.setForeground(branco); 

//configurando a sexta questÃ£o 
                 perg6 = new JLabel("6 - Selecione a bebida de sua preferencia:"); 
                 perg6.setFont(font); 
                 perg6.setForeground(branco); 


                 P6op1 = new JRadioButton("Coca-Cola",false); 
                 P6op2 = new JRadioButton("Guarana Antartica",false); 
                 P6op3 = new JRadioButton("Fanta",false); 
                 P6op4 = new JRadioButton("Regente",false); 
                 P6op5 = new JRadioButton("Pepsi",false); 

                 quest6 = new ButtonGroup(); 
                 quest6.add(P6op1); 
                 quest6.add(P6op2); 
                 quest6.add(P6op3); 
                 quest6.add(P6op4); 
                 quest6.add(P6op5); 

                 P6op1.setBackground(azulc); 
                 P6op1.setForeground(branco); 
                 P6op1.setFont(font2); 

                 P6op2.setBackground(azulc); 
                 P6op2.setForeground(branco); 

                 P6op3.setBackground(azulc); 
                 P6op3.setForeground(branco); 

                 P6op4.setBackground(azulc); 
                 P6op4.setForeground(branco); 

                 P6op5.setBackground(azulc); 
                 P6op5.setForeground(branco); 

//configurando a sÃ©tima questÃ£o 
                 perg7 = new JLabel("7 - Selecione a bebida de sua preferencia:"); 
                 perg7.setFont(font); 
                 perg7.setForeground(branco); 


                 P7op1 = new JRadioButton("Coca-Cola",false); 
                 P7op2 = new JRadioButton("Guarana Antartica",false); 
                 P7op3 = new JRadioButton("Fanta",false); 
                 P7op4 = new JRadioButton("Regente",false); 
                 P7op5 = new JRadioButton("Pepsi",false); 

                 quest7 = new ButtonGroup(); 
                 quest7.add(P7op1); 
                 quest7.add(P7op2); 
                 quest7.add(P7op3); 
                 quest7.add(P7op4); 
                 quest7.add(P7op5); 

                 P7op1.setBackground(azulc); 
                 P7op1.setForeground(branco); 
                 P7op1.setFont(font2); 

                 P7op2.setBackground(azulc); 
                 P7op2.setForeground(branco); 

                 P7op3.setBackground(azulc); 
                 P7op3.setForeground(branco); 

                 P7op4.setBackground(azulc); 
                 P7op4.setForeground(branco); 

                 P7op5.setBackground(azulc); 
                 P7op5.setForeground(branco); 

//configurando a oitava questÃ£o 
                 perg8 = new JLabel("8 - Selecione a bebida de sua preferencia:"); 
                 perg8.setFont(font); 
                 perg8.setForeground(branco); 


                 P8op1 = new JRadioButton("Coca-Cola",false); 
                 P8op2 = new JRadioButton("Guarana Antartica",false); 
                 P8op3 = new JRadioButton("Fanta",false); 
                 P8op4 = new JRadioButton("Regente",false); 
                 P8op5 = new JRadioButton("Pepsi",false); 

                 quest8 = new ButtonGroup(); 
                 quest8.add(P8op1); 
                 quest8.add(P8op2); 
                 quest8.add(P8op3); 
                 quest8.add(P8op4); 
                 quest8.add(P8op5); 

                 P8op1.setBackground(azulc); 
                 P8op1.setForeground(branco); 
                 P8op1.setFont(font2); 

                 P8op2.setBackground(azulc); 
                 P8op2.setForeground(branco); 

                 P8op3.setBackground(azulc); 
                 P8op3.setForeground(branco); 

                 P8op4.setBackground(azulc); 
                 P8op4.setForeground(branco); 

                 P8op5.setBackground(azulc); 
                 P8op5.setForeground(branco); 

//configurando a nona questÃ£o 
                 perg9 = new JLabel("9 - Selecione a bebida de sua preferencia:"); 
                 perg9.setFont(font); 
                 perg9.setForeground(branco); 


                 P9op1 = new JRadioButton("Coca-Cola",false); 
                 P9op2 = new JRadioButton("Guarana Antartica",false); 
                 P9op3 = new JRadioButton("Fanta",false); 
                 P9op4 = new JRadioButton("Regente",false); 
                 P9op5 = new JRadioButton("Pepsi",false); 

                 quest9 = new ButtonGroup(); 
                 quest9.add(P9op1); 
                 quest9.add(P9op2); 
                 quest9.add(P9op3); 
                 quest9.add(P9op4); 
                 quest9.add(P9op5); 

                 P9op1.setBackground(azulc); 
                 P9op1.setForeground(branco); 
                 P9op1.setFont(font2); 

                 P9op2.setBackground(azulc); 
                 P9op2.setForeground(branco); 

                 P9op3.setBackground(azulc); 
                 P9op3.setForeground(branco); 

                 P9op4.setBackground(azulc); 
                 P9op4.setForeground(branco); 

                 P9op5.setBackground(azulc); 
                 P9op5.setForeground(branco); 

//configurando a dÃ©cima  questÃ£o 
                 perg10 = new JLabel("10 - Selecione a bebida de sua preferencia:"); 
                 perg10.setFont(font); 
                 perg10.setForeground(branco); 


                 P10op1 = new JRadioButton("Coca-Cola",false); 
                 P10op2 = new JRadioButton("Guarana Antartica",false); 
                 P10op3 = new JRadioButton("Fanta",false); 
                 P10op4 = new JRadioButton("Regente",false); 
                 P10op5 = new JRadioButton("Pepsi",false); 

                 quest10 = new ButtonGroup(); 
                 quest10.add(P10op1); 
                 quest10.add(P10op2); 
                 quest10.add(P10op3); 
                 quest10.add(P10op4); 
                 quest10.add(P10op5); 

                 P10op1.setBackground(azulc); 
                 P10op1.setForeground(branco); 
                 P10op1.setFont(font2); 

                 P10op2.setBackground(azulc); 
                 P10op2.setForeground(branco); 

                 P10op3.setBackground(azulc); 
                 P10op3.setForeground(branco); 

                 P10op4.setBackground(azulc); 
                 P10op4.setForeground(branco); 

                 P10op5.setBackground(azulc); 
                 P10op5.setForeground(branco); 


//adicionando elementos 1 ao painel
                 painel.add(perg1); 
                 painel.add(P1op1); 
                 painel.add(P1op2); 

//2
                 painel.add(perg2); 
                 painel.add(P2op1); 
                 painel.add(P2op2); 

//3
                 painel.add(perg3); 
                 painel.add(P3op1); 
                 painel.add(P3op2); 
                 painel.add(P3op3); 

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
                 painel.add(P5op5); 
//6
                 painel.add(perg6); 
                 painel.add(P6op1); 
                 painel.add(P6op2); 
                 painel.add(P6op3); 
                 painel.add(P6op4); 
                 painel.add(P6op5); 
//7
                 painel.add(perg7); 
                 painel.add(P7op1); 
                 painel.add(P7op2); 
                 painel.add(P7op3); 
                 painel.add(P7op4); 
                 painel.add(P7op5); 
//8
                 painel.add(perg8); 
                 painel.add(P8op1); 
                 painel.add(P8op2); 
                 painel.add(P8op3); 
                 painel.add(P8op4); 
                 painel.add(P8op5); 
//9
                 painel.add(perg9); 
                 painel.add(P9op1); 
                 painel.add(P9op2); 
                 painel.add(P9op3); 
                 painel.add(P9op4); 
                 painel.add(P9op5); 
//10
                 painel.add(perg10); 
                 painel.add(P10op1); 
                 painel.add(P10op2); 
                 painel.add(P10op3); 
                 painel.add(P10op4); 
                 painel.add(P10op5); 

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
                 perg1.setBounds(35,5,400,100); 
                 P1op1.setBounds(45,70,300,50); 
                 P1op2.setBounds(45,100,300,50); 

//2
                 perg2.setBounds(35,125,500,100); 
                 P2op1.setBounds(45,190,300,50); 
                 P2op2.setBounds(45,220,300,50); 
//3
                perg3.setBounds(35,245,700,100); 
                 P3op1.setBounds(45,310,300,50); 
                 P3op2.setBounds(45,340,300,50); 
                 P3op3.setBounds(45,370,300,50); 
//4
                perg4.setBounds(35,395,600,100); 
                 P4op1.setBounds(45,460,300,50); 
                 P4op2.setBounds(45,495,300,50); 
                 P4op3.setBounds(45,525,300,50); 

//5
                perg5.setBounds(35,550,700,100); 
                 P5op1.setBounds(45,615,300,50); 
                 P5op2.setBounds(45,650,300,50); 
                 P5op3.setBounds(45,685,300,50); 
                 P5op4.setBounds(45,720,300,50); 
                 P5op5.setBounds(45,755,300,50);
//6
                perg6.setBounds(35,780,400,100); 
                 P6op1.setBounds(45,845,300,50); 
                 P6op2.setBounds(45,880,300,50); 
                 P6op3.setBounds(45,915,300,50); 
                 P6op4.setBounds(45,950,300,50); 
                 P6op5.setBounds(45,985,300,50);
//7
                perg7.setBounds(35,1010,400,100); 
                 P7op1.setBounds(45,1075,300,50); 
                 P7op2.setBounds(45,1110,300,50); 
                 P7op3.setBounds(45,1145,300,50); 
                 P7op4.setBounds(45,1180,300,50); 
                 P7op5.setBounds(45,1210,300,50);
//8
                perg8.setBounds(35,1235,400,100); 
                 P8op1.setBounds(45,1300,300,50); 
                 P8op2.setBounds(45,1335,300,50); 
                 P8op3.setBounds(45,1370,300,50); 
                 P8op4.setBounds(45,1405,300,50); 
                 P8op5.setBounds(45,1440,300,50);
//9
                perg9.setBounds(35,1465,400,100); 
                 P9op1.setBounds(45,1530,300,50); 
                 P9op2.setBounds(45,1565,300,50); 
                 P9op3.setBounds(45,1600,300,50); 
                 P9op4.setBounds(45,1635,300,50); 
                 P9op5.setBounds(45,1670,300,50);
//10
                perg10.setBounds(35,1695,400,100); 
                 P10op1.setBounds(45,1760,300,50); 
                 P10op2.setBounds(45,1795,300,50); 
                 P10op3.setBounds(45,1830,300,50); 
                 P10op4.setBounds(45,1865,300,50); 
                 P10op5.setBounds(45,1900,300,50);

//definindo a posiÃ§Ã£o dos elementos na tela principal 
          //     painel.setBounds(183,160,1000,500); 
                 scroll.setBounds(183,160,1000,450);
                 finalizar.setBounds(413,660,250,50); 
                 cancelar.setBounds(683,660,250,50); 

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
