import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import BancoDados.Usuario;
import BancoDados.UsuarioBD;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	JButton botao, botao1;
	JLabel rotulo1, rotulo2, rotulo3;
	JTextField text1, text2, text3, text4;
	Font fonte1 = new Font("Arial", Font.BOLD, 14);
	Font fonte2 = new Font("Arial", Font.BOLD, 30);
	Border b = BorderFactory.createLineBorder(Color.black, 3);
	JPanel painel = new JPanel();
	  ImageIcon fundo = new ImageIcon (getClass().getResource("funda de abertura.png"));
	    
	Musica musica = new Musica();
	SomEfeito ef = new SomEfeito();
    int cont = 0;
    
	public TelaCadastro() {
		
		rotulo1 =  new JLabel("Cadastro");
        rotulo1.setFont(fonte2);
        rotulo1.setForeground(Color.WHITE);
        rotulo2 = new JLabel();
        rotulo3 = new JLabel();
        
        Limpar a = new Limpar();
        
        Panel fundo = new Panel();
        text1 = new JTextField("Nome");
        text1.setFont(fonte1);
        text1.setBorder(b);
        text1.setBackground(new Color(0, 191, 225));
        text1.setForeground(Color.white);
        
        text2 = new JTextField("Nome de UsuÃƒÂ¡rio");
        text2.setFont(fonte1);
        text2.setBorder(b);
        text2.setBackground(new Color(0, 191, 225));
        text2.setForeground(Color.WHITE);
        
        text3 = new JTextField("E-mail");
        text3.setFont(fonte1);
        text3.setBorder(b);
        text3.setBackground(new Color(0, 191, 225));
        text3.setForeground(Color.WHITE);
        
        text4 = new JTextField("Senha");
        text4.setFont(fonte1);
        text4.setBorder(b);
        text4.setBackground(new Color(0, 191, 225));
        text4.setForeground(Color.WHITE);
        
        text1.addMouseListener(a);
        text2.addMouseListener(a);
        text3.addMouseListener(a);
        text4.addMouseListener(a);
        
        painel.setBackground(new Color(65, 105, 225));
        painel.setBorder(b);
        painel.setLayout(null);
//adicionando elementos no painel
        painel.add(rotulo1);
        painel.add(rotulo2);
        painel.add(rotulo3);
        painel.add(text1);
        painel.add(text2);
        painel.add(text3);
        painel.add(text4);

        
          botao = new JButton("Confirmar");
          botao.setBackground(new Color(0, 187, 45));
          botao.setFont(fonte1);
          botao.setForeground(Color.WHITE);
          botao.setBorder(b);
          botao.addActionListener(
     	    	 new ActionListener(){

   				public void actionPerformed(ActionEvent evt) {
   					
   					String nickName, nome, senha, email;
   					 nome = text1.getText();
   					 nickName = text2.getText();
   					 email = text3.getText();
   					 senha = text4.getText();
   					 
   					Usuario usuario = new Usuario();
   					 usuario.setNome(nome);
   					 usuario.setNomeUsuario(nickName);
   					 usuario.setEmail(email);
   					 usuario.setSenha(senha);
   					 
   					UsuarioBD usuario1 = new UsuarioBD();
   					 usuario1.cadastrar(usuario);
   					
   				} 
     	        });
          
          painel.add(botao);          
          botao.addActionListener(
        		 new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
					new Questionario();
					ef.play();
					dispose();
			}
        	  
         });

          botao1 = new JButton("JÃƒÂ¡ possui cadastro? Clique aqui");
          botao1.setOpaque(false);
          botao1.setFocusable(false);
          botao1.setContentAreaFilled(false);
          botao1.setBorderPainted(false);
          botao1.setForeground(Color.WHITE);
          botao1.addActionListener(
        	    	 new ActionListener(){

      				
      				public void actionPerformed(ActionEvent e) {
      					
      				   ef.play();
      					new TelaLogin();
      					dispose();
      				} 
        	        });

          
          Container cont = getContentPane();
          cont.setBackground(new Color(25, 25, 112));
          
          cont.add(botao1);    
          cont.add(painel);
          cont.add(fundo);
          fundo.setBounds(0, 0,1366,768);
          
     
         
          setLayout(null);
    
          painel.setBounds(483, 80, 400, 400);
          rotulo1.setBounds(125, 30, 200, 30);
          rotulo2.setBounds(635, 360, 300, 30);
          rotulo3.setBounds(635, 380, 300, 30);
          text1.setBounds(50, 80, 300, 30);
          text2.setBounds(50, 120, 300,30);
          text3.setBounds(50, 160, 300,30);
          text4.setBounds(50, 200, 300,30);
         
          botao.setBounds(50, 240, 300, 30);
          botao1.setBounds(543, 540, 300, 30);
          
         
          setSize(1366, 768);
          setVisible(true);
         
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
			if(e.getSource() == text2){
				if(cont == 2){
					 text2.setText("");
			}
			}
			
			if(e.getSource() == text3){
				if(cont == 3){
					 text3.setText("");
			}
			}
			
			if(e.getSource() == text4){
				if(cont == 4){
					 text4.setText("");
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
	  public class Panel extends JPanel{

          public void paintComponent(Graphics g){
          
          super.paintComponent(g);
          Image img = fundo.getImage();
          g.drawImage(img, 0,0, this);   

          }
	  }
	public static void main(String[] args) {
		
		TelaCadastro cad = new TelaCadastro();
		
	}
	  
}
