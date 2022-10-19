import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class SomEfeito {
	
	 Clip clipF;
	   public void setFile(String fileName){

	     try{

	       File som = new File(fileName);
	       AudioInputStream sound2 = AudioSystem.getAudioInputStream(som);
	       clipF = AudioSystem.getClip();
	       clipF.open(sound2);
	       } catch (Exception e){

	    	   JOptionPane.showMessageDialog(null, "Arquivo da música não encontrado.");
	       }
	   }
	     public void play(){

	       clipF.setFramePosition(0);
	       clipF.start();      
	     }

	     public void stop(){

	       clipF.stop();
	       clipF.close();
	     }
		
}