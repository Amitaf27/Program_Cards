import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import BancoDados.Usuario;
import BancoDados.UsuarioBD;

public class RecuperaSenha extends JFrame{
        private JLabel recupera, txtIn,ImCade;
        private ImageIcon cadeado;
        private JButton btConfirma,btSair;
        private JTextField email;
        Color azul = new Color(25,25,112);
        Color verde = new Color(0,187,45);
        Color azulClaro = new Color(65,105,225);
    	Font fonte1 = new Font("Arial", Font.BOLD, 30);
    	Font fonte2 = new Font("Arial", 0 , 20);
    	Font fonte3 = new Font("Arial", Font.BOLD, 14);
    	Border b = BorderFactory.createLineBorder(Color.black, 3);
    	String emailFrom = "programcardsgame@gmail.com";
        String passwordFrom = "xgealvpiivsumeoa";
        String emailTo;
        String subject;
        String content;
        
        Random numA = new Random();
      	int a = numA.nextInt(999);
        String codigo = String.valueOf(a);
      	
        String ln = "\n";

        Properties mPrope;
        Session mSession;
        MimeMessage Correo;
               	 
        
       
        private JPanel painel = new JPanel();
        public RecuperaSenha(){
    	 
 //configurando o painel
	      ImCade = new JLabel(cadeado);
    	  painel.setBorder(b);
    	  painel.setLayout(null);
    	  painel.setBackground(azulClaro);
    	  
          recupera = new JLabel("Confirmar Email");
          recupera.setForeground(Color.WHITE);
          recupera.setFont(fonte1);
          txtIn = new JLabel("Insira o email que foi informado no cadastro.");
          txtIn.setFont(fonte3);
          txtIn.setForeground(Color.WHITE);
          email = new JTextField("Email");

          btConfirma = new JButton("Confirmar");
          btConfirma.addActionListener(
         		 new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						try {
							
							String emailinser;
						
							emailinser = email.getText();
							
							Usuario objusuemail = new Usuario();
							objusuemail.setEmail(emailinser);
								
							UsuarioBD objusubd = new UsuarioBD();
							objusubd.verificarEmail(objusuemail);
							ResultSet rsusubdemail = objusubd.verificarEmail(objusuemail);
							   
						    if(rsusubdemail.next()) {
						    	JOptionPane.showMessageDialog(null, "E-mail encontrado!");
						    	
						    	new Thread() {
									public void run(){
								
										createEmail();
										sendEmail();
									 }
								}.start();
							
							
						    	new VerificarEmail();
		     					setVisible(false);
						   } else {
							   JOptionPane.showMessageDialog(null, "E-mail nao encontrado!");
						   }
						    
					 } catch (SQLException erro) {
						 JOptionPane.showMessageDialog(null, "Verificar Nick" + erro);
				     }
					
					}  
				});
          
          btConfirma.setBackground(verde);
          btConfirma.setForeground(Color.WHITE);
          btConfirma.setFont(fonte2);
          btConfirma.setBorder(b);
          
          btSair = new JButton("Voltar");
          btSair.setOpaque(false);
          btSair.setFocusable(false);
          btSair.setContentAreaFilled(false);
          btSair.setBorderPainted(false);
          btSair.setForeground(Color.GREEN);
          btSair.addActionListener(
         		 new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						new TelaLogin();
     					setVisible(false);
     					
     					dispose();
					}
                 	  
                  });
//adiciopnando elementod no painel
          painel.add(recupera);
          painel.add(ImCade);
          painel.add(txtIn);
          painel.add(email);
          painel.add(btConfirma);

          
// adicionando os elementos na tela

         Container cont = getContentPane();
         cont.setBackground(azul);
     
        cont.add(painel);
        cont.add(btSair);
        
        recupera.setBounds(110,60,400,50);
        txtIn.setBounds(60,140,350,50);
        email.setBounds(60,200,350,50);
        btConfirma.setBounds(60,260,350,50);
        painel.setBounds(430,100,450,450);
        btSair.setBounds(550,560,200,50);

        setLayout(null);
        setVisible(true);
        setSize(1366,768);
        mPrope = new Properties();

 } 
 //segunda tela: a de confirmar email
       private class VerificarEmail extends JFrame{
               JLabel verificar,infV;
               JTextField cod;
               JButton btVerificar;
               JPanel painel1 = new JPanel();
             public VerificarEmail(){
//configurando painel
            	 painel1.setLayout(null);
           // 	 painel1.setSize(450,450);
            	 painel1.setBackground(azulClaro);
            	 painel1.setBorder(b);
            	 
                verificar = new JLabel("Verificar Email");
                verificar.setFont(fonte1);
                verificar.setForeground(Color.WHITE);

                infV = new JLabel("Insira o codigo que foi enviado para o seu email");
                infV.setForeground(Color.WHITE);
                infV.setFont(fonte3);
                cod = new JTextField("Insira o cod de confirmação");
                btVerificar = new JButton("Verificar");
                btVerificar.setBackground(verde);
                btVerificar.setBorder(b);
                btVerificar.setForeground(Color.WHITE);
                btVerificar.setFont(fonte2);
                btVerificar.addActionListener(
               		 new ActionListener() {
                             
      					@Override
      					public void actionPerformed(ActionEvent arg0) {
      						 String cd = cod.getText();
      						 
      						if(cd.equals(codigo)){
      						
      						
      							new NovaSenha();
           						setVisible(false);
      						} else{
      							
     							JOptionPane.showMessageDialog(null, "ERRO!!!!!! Este nao e o codigo que lhe enviamos, seu pamonha!");

       						   
      						}
      					}
                       	  
                        });
//adicionando elementos no painel
                painel1.add(verificar);
                painel1.add(infV);
                painel1.add(cod);
                painel1.add(btVerificar);
                
               Container cont = getContentPane();
              cont.setBackground(azul);
     
              cont.add(painel1);
             painel1.setBounds(450,100,450,450);
             verificar.setBounds(120,30,350,100);
             infV.setBounds(50,150,350,50);
             cod.setBounds(50,205,360,50);
             btVerificar.setBounds(50,270,360,50);

             setLayout(null);
             setVisible(true);
             setSize(1366,768);


         }

  }
       
//terceira classe : a de redefinir senha
       private class NovaSenha extends JFrame{
           JLabel alterS,nvS,confirS;
           JTextField nvSenha,repS;
           JButton btFinalizar;
           JPanel painel2 = new JPanel();
           
         public NovaSenha(){
//configurando painel 
            painel2.setBackground(azulClaro);
            painel2.setLayout(null);
            painel2.setBorder(b);


            alterS = new JLabel("Alterar senha");
            alterS.setFont(fonte1);
            alterS.setForeground(Color.WHITE);

            nvS = new JLabel("Nova senha");
            nvS.setForeground(Color.WHITE);

            nvS.setFont(fonte2);

            nvSenha = new JTextField("Nova senha");

            confirS = new JLabel("Confirmar nova senha");
            confirS.setForeground(Color.WHITE);
            confirS.setFont(fonte2);

            repS = new JTextField("Repetir senha");
     
            btFinalizar = new JButton("Finalizar");
            btFinalizar.setBackground(verde);
            btFinalizar.setBorder(b);
            btFinalizar.setFont(fonte2);
            btFinalizar.setForeground(Color.WHITE);
            btFinalizar.addActionListener(
           		 new ActionListener() {

  					@Override
  					public void actionPerformed(ActionEvent arg0) {
  						try {
  							String novaSenha, repetir;
  							novaSenha = nvSenha.getText();
  							repetir = repS.getText();
  							
  							Usuario objusuarions = new Usuario();
  							objusuarions.setSenha(novaSenha);
  							
  							UsuarioBD objusuariobdns = new UsuarioBD();
  							objusuariobdns.alterarSenha(objusuarions);
  							
  							if (objusuariobdns.countAlter >= 1 && novaSenha == repetir) {
  								JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
  								
  								new TelaLogin();
  	  	       					setVisible(false);
  	  	       					
  	  	       					dispose();
							} else {
								JOptionPane.showMessageDialog(null, "Não foi possível alterar a senha :(");
							}
  					
						} catch (Exception erronew) {
							JOptionPane.showMessageDialog(null, "RecuperaSenha NovaSenha" + erronew);
						}
           		 
         
  					}
                   	  
                    });
                    
//adicionando elementos ao painel
              painel2.add(alterS);
              painel2.add(nvS);
              painel2.add(nvSenha);
              painel2.add(confirS);
              painel2.add(repS);
              painel2.add(btFinalizar);

           Container cont = getContentPane();
          cont.setBackground(azul);
          
          cont.add(painel2);
          
//configurando a posicao dos elementos no painel

          	painel2.setBounds(438,100,450,450);
          	alterS.setBounds(130,30,300,100);
          	nvS.setBounds(50,120,200,50);
          	nvSenha.setBounds(50,170,350,50);
          	confirS.setBounds(50,220,250,50);
        	repS.setBounds(50,270,350,50);
        	btFinalizar.setBounds(50,330,350,50);

         
         setLayout(null);
         setVisible(true);
         setSize(1366,768);


}

}
     //metodos de email 	 
       private void createEmail(){
       	 emailTo = email.getText();
       	 subject = "Codigo de Confirmacao";
       	 
       	 
       	 content ="Ola! Voce esta recebendo este email, pois esta tentando recuperar a sua senha conosco."+"<br><html>Codigo de Confirmacao:<b> </br>" + codigo ;
       	 
       	 
       	 mPrope.put("mail.smtp.host","smtp.gmail.com");
       	 mPrope.put("mail.ssl.trust","smtp.gmail.com");
       	 mPrope.setProperty("mail.smtp.starttls.enable","true");
       	 mPrope.setProperty("mail.smtp.port","587");
       	 mPrope.setProperty("mail.smtp.user",emailFrom);
       	 mPrope.setProperty("mail.smtp.ssl.protocols","TLSv1.2");
       	 mPrope.setProperty("mail.smtp.auth","true");
       	 
       	 mSession = Session.getDefaultInstance(mPrope);
       	 
       	 try {
           	 Correo = new MimeMessage(mSession);
   			Correo.setFrom(new InternetAddress(emailFrom));
   			Correo.setRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
   			Correo.setSubject(subject);
   			Correo.setText(content,"ISO-8859-1","html");
   			//System.out.println("boi");

       	 }catch(AddressException e){
       		 Logger.getLogger(RecuperaSenha.class.getName()).log(Level.SEVERE,null,e);
   		} catch (MessagingException e) {
   			// TODO Auto-generated catch block
      		 Logger.getLogger(RecuperaSenha.class.getName()).log(Level.SEVERE,null,e);
   		}
        }
       
       private void sendEmail(){
       	try {
   			Transport mTransport = mSession.getTransport("smtp");
   			mTransport.connect(emailFrom, passwordFrom);
   			
   			mTransport.sendMessage(Correo,Correo.getRecipients(Message.RecipientType.TO));
   			mTransport.close();
   			
   		//	System.out.println("boi");
   		} catch (NoSuchProviderException e) {
   			// TODO Auto-generated catch block
      		 Logger.getLogger(RecuperaSenha.class.getName()).log(Level.SEVERE,null,e);
   		} catch (MessagingException e) {
   			// TODO Auto-generated catch block
      		 Logger.getLogger(RecuperaSenha.class.getName()).log(Level.SEVERE,null,e);
   		}
       }
       
       
        public static void main(String[]args){
             RecuperaSenha ex = new RecuperaSenha();
}


} 
