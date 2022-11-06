package BancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class UsuarioBD {
	
	Connection connCads, connLogin, connAlter;
	PreparedStatement pstm, pstm2, pstm3;
	
	//Cadastro de Usuário
		public void cadastrar(Usuario usu) {
			String sqlCads = "insert into Usuario (nome, nomeUsuario, email, senha) values (?, ?, ?, ?)";
		
			connCads = new ConexaoBD().conectaBD();
		
		  try {
			  pstm = connCads.prepareStatement(sqlCads);
			  pstm.setString(1, usu.getNome());
			  pstm.setString(2, usu.getNomeUsuario());
			  pstm.setString(3, usu.getEmail());
			  pstm.setString(4, usu.getSenha());
			 
			  pstm.execute();
			  pstm.close();
			
		  } catch (SQLException e) {
			  JOptionPane.showMessageDialog(null, "UsuarioBD" + e);
		  }
	  }
	
	   //Autenticação de Login
		public ResultSet autenticUsu(Usuario obj) {
			Connection connLogin = new ConexaoBD().conectaBD();
			
			try {
			   String sqlLogin = "select * from usuario where nomeUsuario = ? and senha = ?";
			   
			   PreparedStatement pstm2 = connLogin.prepareStatement(sqlLogin);
			   pstm2.setString(1, obj.getNomeUsuario());
			   pstm2.setString(2, obj.getSenha());
			   
			   ResultSet rs = pstm2.executeQuery();
			   return rs;
				
		  } catch(SQLException erro) {
				JOptionPane.showMessageDialog(null, "UsuarioBD" + erro);
				return null;
	      }
	   }
		
		public ResultSet verificar(Usuario objusuario) {
			Connection connVerif = new ConexaoBD().conectaBD();
			
			try {
				String sqlVerif = "select * from usuario where nomeUsuario = ?";
				PreparedStatement pstmVerif = connVerif.prepareStatement(sqlVerif);
				pstmVerif.setString(1, objusuario.getNomeUsuario());
				
				ResultSet rs = pstmVerif.executeQuery();
				return rs;
				
			} catch (SQLException erroVerif) {
				JOptionPane.showMessageDialog(null, "UsuarioBD Verificar" + erroVerif);
				return null;
			}
		}
		
        public void alterarNome(Usuario objusu) {
        	String sqlAlter = "update usuario set nomeUsuario = ? where nomeUsuario = ?";
        	
        	connAlter = new ConexaoBD().conectaBD();
    		
  		  try {
  			  pstm3 = connAlter.prepareStatement(sqlAlter);
  			  pstm3.setString(1, objusu.getNomeNovo());
  			  pstm3.setString(2, objusu.getNomeUsuario());
  			 
  		  } catch (SQLException e) {
  			  JOptionPane.showMessageDialog(null, "UsuarioBD - AlterarNome" + e);
  		  }
       }
}
