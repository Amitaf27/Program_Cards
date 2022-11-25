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
			   String sqlLogin = "select * from Usuario where nomeUsuario = ? and senha = ?";
			   
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
		
		//Verificar nome - MudarNick
		public ResultSet verificar(Usuario objusuario) {
			Connection connVerif = new ConexaoBD().conectaBD();
			
			try {
				String sqlVerif = "select * from usuario where nomeUsuario = ?";
				PreparedStatement pstmVerif = connVerif.prepareStatement(sqlVerif);
				pstmVerif.setString(1, objusuario.getNomeUsuario());
				
				ResultSet rs = pstmVerif.executeQuery();
				return rs;
				
			} catch (SQLException erroVerif) {
				JOptionPane.showMessageDialog(null, "UsuarioBD Verificar usuario" + erroVerif);
				return null;
			}
		}
		
		//Alterar nome - MudarNick
        public void alterarNome(Usuario objusu) {
        	String sqlAlter = "update Usuario set nomeUsuario = ? where nomeUsuario = ?";
        	
        	connAlter = new ConexaoBD().conectaBD();
    		
  		  try {
  			  pstm3 = connAlter.prepareStatement(sqlAlter);
  			  pstm3.setString(1, objusu.getNomeNovo());
  			  pstm3.setString(2, objusu.getNomeUsuario());
  			 
  		  } catch (SQLException e) {
  			  JOptionPane.showMessageDialog(null, "UsuarioBD - AlterarNome" + e);
  		  }
       }
        
        //Verificar E-mail - RecuperarSenha
        public ResultSet verificarEmail(Usuario usuemail) {
			Connection connVerifEmail = new ConexaoBD().conectaBD();
			
			try {
				String sqlVerifEmail = "select * from usuario where email = ?";
				PreparedStatement pstmVerifEmail = connVerifEmail.prepareStatement(sqlVerifEmail);
				pstmVerifEmail.setString(1, usuemail.getEmail());
				
				ResultSet rs = pstmVerifEmail.executeQuery();
				return rs;
				
			} catch (SQLException erroVerifEmail) {
				JOptionPane.showMessageDialog(null, "UsuarioBD Verificar email" + erroVerifEmail);
				return null;
			}
		}
        
        //AlterarSenha - RecuperarSenha
        public void alterarSenha(Usuario objususenha) {
        	String sqlAlterSenha = "update Usuario set senha = ? where email = ?";
        	
        	connAlter = new ConexaoBD().conectaBD();
    		
  		  try {
  			  pstm = connAlter.prepareStatement(sqlAlterSenha);
  			  pstm.setString(1, objususenha.getSenha());
  			  pstm.setString(2, objususenha.getEmail());
  			  
  			  pstm.executeUpdate();
  			  
  		 } catch (SQLException erro) {
  			JOptionPane.showMessageDialog(null, "UsuarioBD AlterarSenha" + erro);
		 }
      }
}
