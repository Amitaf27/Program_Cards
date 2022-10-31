import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
          JButton botaoLogin, botao2, btEsq;
          Font fonte1 = new Font("Arial", Font.BOLD, 14);
      	  Font fonte2 = new Font("Arial", Font.BOLD, 30);
      	  Border b = BorderFactory.createLineBorder(Color.black, 2);
          JLabel loginT, rotulo2, rotulo3,cadas,ima;
          JTextField text1;
          JPasswordField senha;
          JButton cadastrar;          
	      ImageIcon imagem1,email, cadeado;
	      JPanel painel = new JPanel();
          Color azul = new Color(18,10,143);
          Color azulc = new Color(65,105,225);
          Color ouro = new Color(238,201,0);
          Color verde = new Color(0, 187, 45);
          Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize();
          int cont = 0;
          
          SomEfeito ef = new SomEfeito();
          Musica musica = new Musica();
          
         
          public TelaLogin() {

        
           
           imagem1 = new ImageIcon(getClass().getResource("btsair.png"));
           email =  new ImageIcon(getClass().getResource("Email.png"));
           cadeado =  new ImageIcon(getClass().getResource("cadeado.png"));
           painel.setBackground(azulc);
           painel.setLayout(null);
           
           btEsq = new JButton("Esqueceu sua senha?");
           btEsq. setOpaque(false);
           btEsq.setFocusable(false);
           btEsq.setContentAreaFilled(false);
           btEsq.setBorderPainted(false);
           btEsq.setForeground(new Color(50,205,50));
           btEsq.addActionListener( new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				//new RecuperaSenha();
				setVisible(false);
			}
        	   
        	   
           });
           
           Limpar a = new Limpar();
           Limpar c = new Limpar();
           loginT =  new JLabel("LOGIN");
           loginT.setForeground(Color.WHITE);//mudar cor do texto da label
           loginT.setFont(fonte2);//alterar fonte do label
           rotulo2 = new JLabel(email);
           rotulo2.setBackground(Color.WHITE);
           rotulo3 = new JLabel(cadeado);
           cadas  = new JLabel("Novo aqui?");
           cadas.setForeground(Color.WHITE);//mudar cor do texto da label
           
           text1 = new JTextField("Email ou senha de Usuario");
           text1.setBackground(Color.WHITE);
           text1.setBorder(null);
           text1.addMouseListener(a);
           
           senha = new JPasswordField("senha");
           senha.setBorder(null);
           senha.addMouseListener(a);
          
           AcionaBotao evento = new AcionaBotao();
          
           botaoLogin = new JButton("LOGIN");
           botaoLogin.addActionListener(evento);
           botaoLogin.setBackground(verde);
           botaoLogin.setForeground(Color.WHITE);
           botaoLogin.setFont(fonte1);
           botaoLogin.setBorder(b);
//adicionando elementos no painel 
           painel.add(loginT); 
      
           painel.add(rotulo2);
           painel.add(text1);
    
           painel.add(rotulo3);
           painel.add(senha);
           
           painel.add(btEsq);
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
         
           loginT.setBounds(170, 80, 200, 30 );
           rotulo2.setBounds(70, 150, 30, 30);
           rotulo3.setBounds(70, 190, 30, 30);
           text1.setBounds(100, 150, 270, 30);
           senha.setBounds(100, 190, 270,30);
            
           btEsq.setBounds(200,260,200,30);
           botaoLogin.setBounds(70, 230, 300, 30);

           cadas.setBounds(595,580,200,25);
           cadastrar.setBounds(595,580,200,25);
           painel.setBounds(460,100,450,450);
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
              		JOptionPane.showMessageDialog(null, "Usuario ou senha invalidos" + e);
              	}
              	
              } catch(SQLException err) {
            	  JOptionPane.showMessageDialog(null, "TelaLogin" + e);
              }
            	
                 //setVisible(false);
             }


           }
             private class AcionaCadastro implements ActionListener {

               public void actionPerformed(ActionEvent e){
            	   
            	  
            	  ef.play();
             	  new TelaCadastro();
    	          dispose();
    	  
              }
            }
          
            private class AcionaSair implements ActionListener {

              public void actionPerformed(ActionEvent e){
            	  
             	  ef.play();
            	  System.exit(0);
            	  
              }
         }

             private class Limpar implements MouseListener{

				@Override
				public void mouseClicked(MouseEvent e) {
					cont++;
				if(e.getSource() == text1){
					if(cont == 1){
						 text1.setText(" ");
					} 
				}
					if(e.getSource() == senha){
						if(cont == 2){
							 senha.setText("");
					}
					}
				}

				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
            	 
             }
	     public static void main (String[]args){
	    	 
	    	
        	TelaLogin ex = new TelaLogin();
	        ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}

