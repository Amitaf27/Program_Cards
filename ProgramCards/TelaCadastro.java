package ProgramCards;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	JButton botao, botao1;
	JLabel rotulo1, rotulo2, rotulo3;
	JTextField text1, text2, text3, text4;
	Font fonte1 = new Font("Arial", Font.BOLD, 14);
	Font fonte2 = new Font("Arial", Font.BOLD, 30);
	Border b = BorderFactory.createLineBorder(Color.black, 3);
	JPanel painel = new JPanel();
        Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize();
	Musica mu = new Musica():
        SomEfeito ef = new SomEfeito();

	public TelaCadastro() {
        rotulo1 =  new JLabel("Cadastro");
        rotulo1.setFont(fonte2);
        rotulo1.setForeground(Color.WHITE);
        rotulo2 = new JLabel();
        rotulo3 = new JLabel();
        
        text1 = new JTextField("Nome");
        text1.setFont(fonte1);
        text1.setBorder(b);
        text1.setBackground(new Color(0, 191, 225));
        text1.setForeground(Color.white);
        
        text2 = new JTextField("NickName");
        text2.setFont(fonte1);
        text2.setBorder(b);
        text2.setBackground(new Color(0, 191, 225));
        text2.setForeground(Color.WHITE);
        
        text3 = new JTextField("Idade");
        text3.setFont(fonte1);
        text3.setBorder(b);
        text3.setBackground(new Color(0, 191, 225));
        text3.setForeground(Color.WHITE);
        
        text4 = new JTextField("Senha");
        text4.setFont(fonte1);
        text4.setBorder(b);
        text4.setBackground(new Color(0, 191, 225));
        text4.setForeground(Color.WHITE);
        
        painel.setBackground(new Color(65, 105, 225));
        painel.setBorder(b);
        
        
         
          botao = new JButton("Confirmar");
          botao.setBackground(new Color(0, 187, 45));
          botao.setFont(fonte1);
          botao.setForeground(Color.WHITE);
          botao.setBorder(b);
          botao.addActionListener(
     	    	 new ActionListener(){

   				
   				public void actionPerformed(ActionEvent e) {
					
					mu.setFile([[constante]]);
					mu.play();
   				        //new Questionario();
   					dispose();
   					
   				} 
     	        });

          
          Container cont = getContentPane();
          cont.setBackground(new Color(25, 25, 112));
         
          
          botao1 = new JButton("Já possui cadastro? Clique aqui");
          botao1.setOpaque(false);
          botao1.setFocusable(false);
          botao1.setContentAreaFilled(false);
          botao1.setBorderPainted(false);
          botao1.setForeground(Color.WHITE);
          botao1.addActionListener(
        	    	 new ActionListener(){

      				
      				public void actionPerformed(ActionEvent e) {
      					
					mu.play();
      					TelaLogin s = new TelaLogin();
      					setVisible(false);
      				} 
        	        });

         
          setLayout(null);
         
       
          cont.add(rotulo1);
          cont.add(rotulo2);
          cont.add(rotulo3);
         
          cont.add(text1);
          cont.add(text2);
          cont.add(text3);
          cont.add(text4);
         
          cont.add(botao);
          cont.add(botao1);
      
          cont.add(painel);
                    
          painel.setBounds(730, 330, 400, 400);
          rotulo1.setBounds(865, 360, 300, 30);
          rotulo2.setBounds(635, 360, 300, 30);
          rotulo3.setBounds(635, 380, 300, 30);
          text1.setBounds(780, 420, 300, 30);
          text2.setBounds(780, 460, 300,30);
          text3.setBounds(780, 500, 300,30);
          text4.setBounds(780, 540, 300,30);
         
          botao.setBounds(780, 580, 300, 30);
          botao1.setBounds(820, 640, 300, 30);
          
         
          setSize(dimensao);
          setVisible(true);
         
       }
	
	public static void main(String[] args) {
		
		TelaCadastro cad = new TelaCadastro();
		
	}


}
