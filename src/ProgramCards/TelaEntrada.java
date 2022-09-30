package ProgramCards;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class TelaEntrada extends JFrame {
    private static final long serialVersionUID = 1L;
        JProgressBar barra = new JProgressBar();
        JLabel logo,nome;
        ImageIcon ima;
        Color azul = new Color(25,25,112);
        Color azulc = new Color(65,105,225);
        Color ouro = new Color(238,201,0);
        Font font = new Font("Arial",Font.BOLD,70);
        ImageIcon image = new ImageIcon(getClass().getResource ("Logo.png"));
        Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize();
        
        public TelaEntrada(){
            
            logo = new JLabel(image);
            nome = new JLabel("ProgramCards");
            nome.setForeground(ouro);
            nome.setFont(font);

            barra.setStringPainted(true);
            barra.setValue(50);
            barra.setMaximum(1000);
            barra.setForeground(ouro);

            Container cont = getContentPane();
            cont.setBackground(azul);
            
            cont.add(nome);
            cont.add(logo);
         
            cont.add(barra);

            nome.setBounds(710,100,800,250);
            logo.setBounds(770,250,350,350);
            barra.setBounds(710,670,500,50);

            new Temporizador().start();
            
            setLayout(null);
            setVisible(true);
            setSize(dimensao);
}
             public class Temporizador extends Thread {
                  public void run(){
                      while(barra.getValue()<1000){
                 try{
                     sleep(40);
                     barra.setValue(barra.getValue()+10);
                 }catch(InterruptedException e){
                   e.printStackTrace();
        }
     }
                  
                  new TelaLogin();
                 setVisible(false);
                 Sons2.main(null);
    }
             }
                  public static void main(String[] args) {
                   TelaEntrada ex = new TelaEntrada();
                   ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
}
