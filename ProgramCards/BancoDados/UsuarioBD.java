package BancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class UsuarioBD {
	
	Connection conn;
	PreparedStatement pstm;
	
	public void cadastrar(Usuario usu) {
		String sql = "insert into Usuario (nome, nomeUsuario, idade, senha) values (?, ?, ?, ?)";
		
		conn = new ConexaoBD().conectaBD();
		
		try {
			pstm = conn.prepareStatement(sql);
			 pstm.setString(1, usu.getNome());
			 pstm.setString(2, usu.getNomeUsuario());
			 pstm.setString(3, usu.getIdade());
			 pstm.setString(4, usu.getSenha());
			 
			 pstm.execute();
			 pstm.close();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "UsuarioBD" + e);
		}
	}
	
}
