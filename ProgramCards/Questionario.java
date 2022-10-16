package poo;
import java.awt.Color; 
 import java.awt.Container; 
 import java.awt.Dimension; 
 import java.awt.Font; 
 import java.awt.Toolkit; 
 import java.awt.event.ItemEvent; 
 import java.awt.event.ItemListener; 
 import javax.swing.ButtonGroup; 
 import javax.swing.JButton; 
 import javax.swing.JFrame; 
 import javax.swing.JLabel; 
 import javax.swing.JOptionPane; 
 import javax.swing.JPanel; 
 import javax.swing.JRadioButton; 
 import javax.swing.JScrollBar; 
  
 public class Questionario extends JFrame { 
  
         private static final long serialVersionUID = 1L; 
         private JButton finalizar,cancelar; 
         private JRadioButton op1, op2, op3, op4, op5; 
         private JLabel perg, titulo; 
         private Color azul = new Color(18,10,143); 
         private Color azulc = new Color(65,105,225); 
         private Color ouro = new Color(238,201,0); 
         private Color branco = new Color(255,255,255); 
         private Font font = new Font("Arial",Font.BOLD,20); 
         private Font font1 = new Font("Arial",Font.BOLD,30); 
     private Font font2 = new Font("Arial",Font.BOLD,14); 
     private Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize(); 
     private RadioButtonHandler handler; 
     private JPanel painel ; 
     private ButtonGroup grupodebotao; 
   //  private JScrollBar brrolagem; 
     private JScrollPane scroll = new JScrollPane();
      
         public Questionario() { 
                 handler = new RadioButtonHandler(); 
                 finalizar = new JButton("Finalizar"); 
                 finalizar.setFont(font); 
                 cancelar = new JButton("Cancelar"); 
                 cancelar.setFont(font); 
          //       brrolagem = new JScrollBar(JScrollBar.VERTICAL , 0, 60,0 , 200); 
                  
                 painel = new JPanel(); 
                 painel.setBackground(azulc); 
                 painel.setSize(1000,600); 
                 painel.setLayout(null);
                 painel.setPreferredSize(new Dimension(1000,1000);
                // brrolagem.add(painel); 
 
 
                // scroll.setPreferredSize(New Dimension(464, 439));
                /// scroll.setViewportView(painel);
                 ///painel.add(scroll);
                  
                 titulo = new JLabel("QUESTIONARIO"); 
                 titulo.setFont(font1); 
                 titulo.setForeground(ouro); 
                 perg = new JLabel("1 - Selecione a bebida de sua preferencia:"); 
                 perg.setFont(font); 
                 perg.setForeground(branco); 
                  
                  
                 op1 = new JRadioButton("Coca-Cola",false); 
                 op2 = new JRadioButton("Guarana Antartica",false); 
                 op3 = new JRadioButton("Fanta",false); 
                 op4 = new JRadioButton("Regente",false); 
                 op5 = new JRadioButton("Pepsi",false); 
                  
                 grupodebotao = new ButtonGroup(); 
                 grupodebotao.add(op1); 
                 grupodebotao.add(op2); 
                 grupodebotao.add(op3); 
                 grupodebotao.add(op4); 
                 grupodebotao.add(op5); 
                  
                 op1.setBackground(azulc); 
                 op1.setForeground(branco); 
                 op1.setFont(font2); 
                  
                 op2.setBackground(azulc); 
                 op2.setForeground(branco); 
                  
                 op3.setBackground(azulc); 
                 op3.setForeground(branco); 
                  
                 op4.setBackground(azulc); 
                 op4.setForeground(branco); 
                  
                 op5.setBackground(azulc); 
                 op5.setForeground(branco); 
                  
                  
                 Container cont = getContentPane(); 
                 cont.setBackground(azul); 
                  
                 cont.add(titulo); 
                  
                 //adicionando elementos ao painel 
                 painel.add(perg); 
                 painel.add(op1); 
                 painel.add(op2); 
                 painel.add(op3); 
                 painel.add(op4); 
                 painel.add(op5); 
                  
                  
                 cont.add(painel); 
                 cont.add(finalizar); 
                 cont.add(cancelar); 
                  
                 titulo.setBounds(810,80,300,100); 
                 perg.setBounds(550,200,400,100); 
                 op1.setBounds(600,300,300,50); 
                 op2.setBounds(600,350,300,50); 
                 op3.setBounds(600,400,300,50); 
                 op4.setBounds(600,450,300,50); 
                 op5.setBounds(300,600,300,50); 
                  
                 painel.setBounds(460,200,1000,600); 
           //      brrolagem.setBounds(990,200,50,1000); 
             finalizar.setBounds(670,840,250,50); 
             cancelar.setBounds(950,840,250,50); 
                  
                 op1.addItemListener(handler); 
                  
                 setLayout(null); 
                 setSize(dimensao); 
                 setVisible(true); 
                  
         } 
          
               private class RadioButtonHandler implements ItemListener{ 
  
                         public void itemStateChanged(ItemEvent arg0) { 
                            if(op1.isSelected()) { 
                                    JOptionPane.showMessageDialog(null, "Parabéns pelo bom gosto!"); 
                            } 
                                  
                         } 
                        
               } 
          
              public static void main(String[]args) { 
                      Questionario ex = new Questionario(); 
                      ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
              } 
 }
