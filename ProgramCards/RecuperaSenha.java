import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;


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
          email = new JTextField(" Email");

          btConfirma = new JButton("Confirmar");
          btConfirma.addActionListener(
         		 new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						new VerificarEmail();
     					setVisible(false);
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
                cod = new JTextField("Codigo de confirmacao");
                btVerificar = new JButton("Verificar");
                btVerificar.setBackground(verde);
                btVerificar.setBorder(b);
                btVerificar.setForeground(Color.WHITE);
                btVerificar.setFont(fonte2);
                btVerificar.addActionListener(
               		 new ActionListener() {

      					@Override
      					public void actionPerformed(ActionEvent arg0) {
      						new NovaSenha();
           					setVisible(false);
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
  						new TelaLogin();
       					setVisible(false);
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
        public static void main(String[]args){
             RecuperaSenha ex = new RecuperaSenha();
}


} 
