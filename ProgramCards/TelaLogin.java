import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

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

import BancoDados.Usuario;
import BancoDados.UsuarioBD;

public class TelaLogin extends JFrame {

private static final long serialVersionUID = 1L;
//declaracao de atributos,objetos e variaveis
          JButton botaoLogin, botao2;
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
           text1 = new JTextField("Email ou senha de Usuário");
           senha = new JPasswordField();
       
           AcionaBotao evento = new AcionaBotao();
          
           botaoLogin = new JButton("LOGIN");
           botaoLogin.addActionListener(evento);
           botaoLogin.setBackground(Color.GREEN);

//adicionando elementos no painel 
           painel.add(loginT); 
      
           painel.add(rotulo2);
           painel.add(text1);
    
           painel.add(rotulo3);
           painel.add(senha);

           painel.add(botaoLogin);

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
//adicionando elementos no frame principal         
           setLayout(null);
          
           cont.add(botao2);
          
           cont.add(cadas);
           cont.add(cadastrar);
           cont.add(painel);
         
           botao2.setBounds(10,10, 100, 50);
         
           loginT.setBounds(75, 50, 300, 25 );
           rotulo2.setBounds(80, 110, 280, 25);
           rotulo3.setBounds(80, 140, 280, 25);
           text1.setBounds(80, 110, 280, 25);
           senha.setBounds(80, 140, 280,25);
         
           botaoLogin.setBounds(80, 170, 280, 25);

           cadas.setBounds(583,580,200,25);
           cadastrar.setBounds(583,580,200,25);
           painel.setBounds(458,100,450,450);
           painel.setBorder(b);

         
           setSize(1366,768);
           setVisible(true);
         
       }
          private class AcionaBotao implements ActionListener {
    
             public void actionPerformed(ActionEvent e) {
            	
              try {
            	String nomeUsuario = text1.getText();
              	String senha1 = new String(senha.getPassword()).trim();
              	
              	Usuario usu = new Usuario();
              	usu.setNomeUsuario(nomeUsuario);
              	usu.setSenha(senha1);
              	
              	UsuarioBD usuBD = new UsuarioBD();
              	ResultSet rsusuBD = usuBD.autenticUsu(usu);
              	
              	if (rsusuBD.next()) {
              		Menu menu = new Menu();
              		menu.setVisible(true);
              		dispose();
              	} else {
              		JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos" + e);
              	}
              	
              } catch(SQLException err) {
            	  JOptionPane.showMessageDialog(null, "TelaLogin" + e);
              }
            	
                 //setVisible(false);
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
