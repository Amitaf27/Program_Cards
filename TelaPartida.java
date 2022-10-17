import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaPartida extends JFrame {
   
	private static final long serialVersionUID = 1L;
	private JLabel imaIf, imaFor,imaInclude, imaScanf, imaPrintf,perg;
    private JPanel painel;
    private ImageIcon imFor,imif,include, scanf, imPrintf ;
    Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize();
    Color azul = new Color(18,10,143);
    Color azulc = new Color(65,105,225);
    Color ouro = new Color(238,201,0);
    Font fonte1 = new Font("Arial", Font.BOLD, 24);
    int cont = 1;
    boolean mouseP = false;
    
     public TelaPartida(){
      
    	 painel = new JPanel();
    	 painel.setLayout(null);
    	 painel.setBackground(azulc);
    	 
    	 perg = new JLabel("Desejo mostrar uma mensagem na tela, qual comando devo usar?");
    	 perg.setFont(fonte1);
    	 perg.setForeground(Color.WHITE);
    	 painel.add(perg);
    	 
    	 imFor = new ImageIcon(getClass().getResource("for.png"));
    	 imaFor = new JLabel(imFor);
    	 
    	 imif = new ImageIcon(getClass().getResource("if.png"));
    	 imaIf = new JLabel(imif);
    	 
    	 include = new ImageIcon(getClass().getResource("include.png"));
    	 imaInclude = new JLabel(include);
    	 scanf = new ImageIcon(getClass().getResource("scanf.png"));
    	 imaScanf = new JLabel(scanf);
    	 
    	 imPrintf = new ImageIcon(getClass().getResource("printf.png"));
    	 imaPrintf = new JLabel(imPrintf);
    	 imaPrintf.addMouseListener(new MouseListener(){

			public void mouseClicked(MouseEvent arg0) {
				cont++;
				imaPrintf.setBounds(1235,740-100,170,300);
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				mouseP = true;
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				mouseP = false;
				imaPrintf.setBounds(1235,740-100,170,300);
			}
    		 
    		 
    	 });
    	 
    	 Container cont = getContentPane();
    	 cont.setBackground(azul);
    	 
    	 
    	 cont.add(painel);
    	 cont.add(imaFor);
    	 cont.add(imaIf);
    	 cont.add(imaInclude);
    	 cont.add(imaScanf);
    	 cont.add(imaPrintf);
    	 
    	 painel.setBounds(450,50,1000,200);
    	 perg.setBounds(20,50,900,100);
    	 imaIf.setBounds(695,740,170,300);
    	 imaInclude.setBounds(515,740,170,300);
    	 imaFor.setBounds(875,740,170,300);
    	 imaScanf.setBounds(1055,740,170,300);
    	 imaPrintf.setBounds(1235,740,170,300);
    	 
    	 
    	 new Mover().start();
      setSize(dimensao);
      setLayout(null);
      setVisible(true);


}
     
     public class Mover extends Thread{
    	 public void run(){
    		 while(true){
    			 try{
    				 sleep(10);
    			 }catch(Exception erro){}
    			 if(mouseP){
    				 Point ponto = getMousePosition();
    					if(cont >= 2){
    						int x = 1235;
    						int y = 740;
    						imaPrintf.setBounds(ponto.x-85,ponto.y-150,170,300);
    					}

    			 }
    		 }
    	 }
     }
    public static void main (String[]args){
       TelaPartida ex = new TelaPartida();
       ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}