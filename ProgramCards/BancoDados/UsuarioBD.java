package BancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class UsuarioBD {
	Connection connLogin;
	
	Connection conn;
	PreparedStatement pstm;
	
	//Cadastro de Usuário
	
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
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "UsuarioBD" + e);
		}
	}
	
	//Autenticação de Login
	
	public ResultSet autenticUsu(Usuario obj) {
		connLogin = new ConexaoBD().conectaBD();
		
		try {
			String sqlLogin = "select * from Usuario where nomeUsuario = ? and senha = ?";
			PreparedStatement pstm2 = conn.prepareStatement(sqlLogin);
			 pstm2.setString(1, obj.getNomeUsuario());
			 pstm2.setString(2, obj.getSenha());
			 
			 ResultSet rs = pstm2.executeQuery();
			 return rs;
			 
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Usuario" + e);
			return null;
		}
	}
	
}
