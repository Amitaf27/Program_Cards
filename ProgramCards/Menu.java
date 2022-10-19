import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

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
	     ImageIcon fundo = new ImageIcon(getClass().getResource("FundoIlhas.png"));
	     
	     private JLabel label, label1, label2, label3;
	     private Font titulo = new Font("Arial",Font.BOLD,30);
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
	     Border borda = new BordeFactory.createLineBorder(Color.BLACK,4);
             String efeitoSom, musicaSom, musicaSomLigada;
             EfeitoSom ef = new EfeitoSom();
             Musica musica = new Musica();

	     public Menu() {
	    	 setTitle("ILHAS");
	    	 
	    	 barrinha = new JMenuBar();
	    	 setJMenuBar(barrinha);

	    	 opcao = new JMenu("Opção");
	    	 
	    	 config = new JMenuItem("Configurações");
	    	 sair = new JMenuItem("Sair");
	    	 
	    	 opcao.add(config);
                 opcao.add(sair);
	    	 opcao.setBackground(ouro);

	    	 barrinha.add(opcao);
                 barrinha.setBackground(ouro);
//Configurando os componentes do painel
                 btSom = new JButton(imagem5);
                 btSom.setBorder(borda);
                 btSom.setOpaque(false);
                 btSom.setFocusable(false);
	    	 btSom.setContentAreaFilled(false);
                 
                 btSom2 = new JButton(imagem7);
                 btSom2.setBorder(borda);
                 btSom2.setOpaque(false);
                 btSom2.setFocusable(false);
	    	 btSom2.setContentAreaFilled(false);

                 btNome = new JButton("Mudar NickName");
                 btNome.setFont(texto);

                 btConfirmar = new JButton("Confirmar");
                 btConfirmar.setFont(texto);
//Configurando o painel de configurações 
                 label = new JLabel("Configurações");
                 

	    	 Container cont = getContentPane();
	    	 
	    	 cont.add(ilha1);
	    	 cont.add(ilha2);
	    	 cont.add(ilha3);
	    	 
	     }
	     
	     

}
