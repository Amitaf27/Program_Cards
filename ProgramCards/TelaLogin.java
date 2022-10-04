

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class TelaLogin extends JFrame {

private static final long serialVersionUID = 1L;
//declaracao de atributos,objetos e variaveis
          JButton botao, botao2;
          Font fonte1 = new Font("Arial", Font.BOLD, 14);
      	  Font fonte2 = new Font("Arial", Font.BOLD, 30);
      	  Border b = BorderFactory.createLineBorder(Color.black, 2);
          JLabel loginT, rotulo2, rotulo3,cadas,ima;
          JTextField text1;
          JPasswordField senha;
          JButton cadastrar;          
	      ImageIcon imagem1;
	      JPanel painel = new JPanel();
          Color azul = new Color(18,10,143);
          Color azulc = new Color(65,105,225);
          Color ouro = new Color(238,201,0);
          Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize();
          
         
          public TelaLogin() {
           
           imagem1 = new ImageIcon(getClass().getResource("btsair.png"));
           painel.setBackground(azulc);
           loginT =  new JLabel("LOGIN");
           loginT.setForeground(Color.WHITE);//mudar cor do texto da label
           loginT.setFont(new Font("Arial",Font.BOLD,30));//alterar fonte do label
           rotulo2 = new JLabel();
           rotulo3 = new JLabel();
           cadas  = new JLabel("Novo aqui?");
           cadas.setForeground(Color.WHITE);//mudar cor do texto da label
           text1 = new JTextField("Email ou senha de Usu�rio");
           senha = new JPasswordField();
       
           AcionaBotao evento = new AcionaBotao();
          
           botao = new JButton("LOGIN");
           botao.addActionListener(evento);
           botao.setBackground(Color.GREEN);
          
           botao2 = new JButton(imagem1);
           
           botao2.addActionListener(evento);
           AcionaSair sair1 = new AcionaSair();
           botao2.addActionListener(sair1);
           
           botao2. setOpaque(false);
           botao2.setFocusable(false);
           botao2.setContentAreaFilled(false);
           botao2.setBorderPainted(false);
          
           AcionaCadastro cad = new AcionaCadastro();
           cadastrar = new JButton("Cadastre-se");
           cadastrar.setForeground(Color.GREEN);//MUDA A COR DO TEXT DO BOTAO
          
           cadastrar.addActionListener(cad);
          
           cadastrar. setOpaque(false);
           cadastrar.setFocusable(false);
           cadastrar.setContentAreaFilled(false);
           cadastrar.setBorderPainted(false);
          
           cadastrar.setMnemonic('c');
          
           Container cont = getContentPane();
           cont.setBackground(azul);
         
           setLayout(null);
          
           cont.add(botao2);
          
           cont.add(loginT);
      

           cont.add(rotulo2);
           cont.add(rotulo3);
         
           cont.add(text1);
           cont.add(senha);
  
         
           cont.add(botao);

           cont.add(cadas);
           cont.add(cadastrar);
           cont.add(painel);
         
           botao2.setBounds(10,10, 100, 50);
         
           loginT.setBounds(920, 250, 300, 25 );
           rotulo2.setBounds(820, 330, 280, 25);
           rotulo3.setBounds(820, 360, 280, 25);
           text1.setBounds(825, 330, 280, 25);
           senha.setBounds(825, 360, 280,25);
         
           botao.setBounds(825, 390, 280, 25);

           cadas.setBounds(890,930,200,25);
           cadastrar.setBounds(890,930,200,25);
           painel.setBounds(715, 150, 500, 500);
           painel.setBorder(b);

         
           setSize(dimensao);
           setVisible(true);
         
       }
          private class AcionaBotao implements ActionListener {
    
             public void actionPerformed(ActionEvent e) {
      
            	String senha1 = new String(senha.getPassword()).trim();
       
                  if (text1.getText().equalsIgnoreCase("mestreAndre") && senha1.equalsIgnoreCase("andre123")){
    	
                      new Menu();
                     setVisible(false);
                   }else {
	
                   JOptionPane.showMessageDialog(null,"Dados incorretos");
   }

}


           }
             private class AcionaCadastro implements ActionListener {

               public void actionPerformed(ActionEvent e){
             	  new TelaCadastro();
    	          setVisible(false);
    	  
}
}
          private class AcionaSair implements ActionListener {

              public void actionPerformed(ActionEvent e){
            	  
            	 // Sons.main(null);
            	  System.exit(0);
            	  
        }
        }


	     public static void main (String[]args){
	    	 
	    	
        	TelaLogin ex = new TelaLogin();
	        ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}