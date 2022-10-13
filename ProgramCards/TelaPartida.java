
public class TelaPartida extends JFrame {
    JLabel card1, card2,perg;
    JPanel painel;
    ImageIcon cart1,cart2;
     public TelaPartida(){
       cart1 = new ImageIcon(getClass().getResource(("cart1.png"));
       cart2 = new ImageIcon(getClass().getResource(("cart2.png"));
       
       card1 = new JLabel(cart1);
       card2 = new JLabel(cart2);

       Container cont = getContentPane();

       cont.add(painel);
       cont.add(card1);
       cont.add(card2);
       
       painel.setBounds(460,200,900,200);
       card1.setBounds(560,1000,50,100);
       card2.setBounds(620,1000,50,100);
       
      setSize(dimensao);
      setLayout(null);
      setVisible(true);


}
    public static void main (String[]args){
       TelaPartida ex = new TelaPartida();
}
}
