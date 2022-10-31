import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class SomEfeito {
	
	 static Clip clipF;
	 static boolean ligado = true;
	 
	 
	 
	
	      public void play(){

		   try{
		  
		       AudioInputStream sound2 = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResource("Clique.wav"));
		       clipF = AudioSystem.getClip();
		       clipF.open(sound2);
		   } catch (Exception e){

		    	   JOptionPane.showMessageDialog(null, "Arquivo da mÃºsica nÃ£o encontrado.");
		   }
		   
		   if(ligado){

	       clipF.setFramePosition(0);
	       clipF.start();
	       
		   } else{
			   
			
		   }
	     }

	      public void stop(){

	       clipF.stop();
	       clipF.close();
	     }
	     
	     public static void muda(){
	    	 
	    	 ligado = !ligado;
	     }
}
