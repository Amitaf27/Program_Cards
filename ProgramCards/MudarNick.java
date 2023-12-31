import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import BancoDados.Usuario;
import BancoDados.UsuarioBD;

public class MudarNick extends JFrame {

	//declarando componentes
	JLabel lbNomeAnt, lbNomeNovo, lbTitulo;
	JTextField txtNomeAnt, txtNomeNovo;
	JButton btSalvar;
	Font font = new Font("Consolas", 1, 15);
	JPanel c = (JPanel) getContentPane();

	public MudarNick() {
		super("Alterando Nome de Usuário");
		setLayout(null);
		setSize(400, 370);
		
		//centralizando no monitor
		setLocationRelativeTo(null);
		c.setBackground(Color.CYAN);

		//instanciando componentes utilizados
		lbNomeAnt = new JLabel("Digite o nome de usuário atual");
		lbNomeNovo = new JLabel("Digite o novo nome de usuário");
		lbTitulo = new JLabel("Alterando Nome de Usuário");
		txtNomeAnt = new JTextField();
		txtNomeNovo = new JTextField();
		btSalvar = new JButton("Salvar");
		btSalvar.addActionListener(
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent evt) {
					try {
						String nome_novo, nomeUsuario;
							
						nomeUsuario = txtNomeAnt.getText();
							
						Usuario objusu = new Usuario();
						objusu.setNomeUsuario(nomeUsuario);
							
						UsuarioBD objusubd = new UsuarioBD();
						objusubd.verificar(objusu);
						ResultSet rsusubd = objusubd.verificar(objusu);
							
					if (rsusubd.next()) {
						JOptionPane.showMessageDialog(null, "Usuário encontrado! Insira seu novo nome de Usuário");
						
						
					 try {
						 nome_novo = txtNomeNovo.getText();
						 System.out.println(nome_novo);
						    
						 Usuario objusu2 = new Usuario();
						  objusu2.setNomeNovo(nome_novo);
						    
						 UsuarioBD objusubd2 = new UsuarioBD();
						  objusubd2.alterarNome(objusu2);
						
						  if (objusubd2.countAlter <= 0) {
							  JOptionPane.showMessageDialog(null, "Nome de Usuário não foi alterado :(");
							  txtNomeNovo.setText(null);
							  txtNomeAnt.setText(null);
							  
						} else {
							  JOptionPane.showMessageDialog(null, "Nome de Usuário alterado com sucesso!");
							  
							  dispose();
						}

				    } catch (Exception err2) {
						JOptionPane.showMessageDialog(null, "Novo Nick" + err2);
				    }
   
				  } else {
					  JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
				  }
						   
				} catch (SQLException err) {
					JOptionPane.showMessageDialog(null, "Verificar Nick" + err);
				}
				  }
			  });

		//adicionando ao frame
		add(lbNomeAnt);
		add(lbNomeNovo);
		add(lbTitulo);
		add(txtNomeAnt);
		add(txtNomeNovo);
		add(btSalvar);

		//posicionando no frame
		lbTitulo.setBounds(50, 25, 350, 50);
		lbNomeAnt.setBounds(20, 80, 250, 30);
		txtNomeAnt.setBounds(18, 105, 350, 30);
		lbNomeNovo.setBounds(20, 160, 250, 30);
		txtNomeNovo.setBounds(18, 185, 350, 30);
		btSalvar.setBounds(120, 250, 150, 30);

		//configurando fonte das letras
		lbTitulo.setFont(new Font("Consolas", 1, 20));
		lbNomeAnt.setFont(font);
		txtNomeAnt.setFont(font);
		lbNomeNovo.setFont(font);
		txtNomeNovo.setFont(font);
		btSalvar.setFont(font);
		
		//configurando mensagem "fantasma" 
		txtNomeAnt.setText("Digite o seu antigo nome de usuário aqui");
		txtNomeNovo.setText("Digite o seu novo nome de usuário aqui");
		
		//alterando cor da mensagem
		txtNomeAnt.setForeground(Color.LIGHT_GRAY);
		txtNomeNovo.setForeground(Color.LIGHT_GRAY);
		
		//tratando eventos da caixa de texto com cliques do mouse
		
		//caixa de texto com o nick antigo
		txtNomeAnt.addMouseListener(new MouseAdapter() {
			
			//contador de quantas vezes foi limpo a tela neste componente
			int cont = 0;

			//limpando e alterando cor
			@Override
			public void mouseClicked(MouseEvent e) {
				if (cont == 0&&txtNomeAnt.getText().equals("Digite o seu nick antigo aqui")) {
					txtNomeAnt.setText("");
					txtNomeAnt.setForeground(Color.BLACK);
					cont++;
				}
			}
		});
		
		//caixa de texto com o nick novo
		txtNomeNovo.addMouseListener(new MouseAdapter() {
			int cont = 0;

			@Override
			public void mouseClicked(MouseEvent e) {
				if (cont == 0&&txtNomeNovo.getText().equals("Digite o seu novo nick aqui")) {
					txtNomeNovo.setText("");
					txtNomeNovo.setForeground(Color.BLACK);
					cont++;
				}
			}
		});
		

		setVisible(true);
	}

	public static void main(String[] args) {
		new MudarNick();
	}
}
