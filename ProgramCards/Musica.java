import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Musica {

   static Clip clipM;
   
     public void play(){
    	 
    	   try{
    		      
    	       AudioInputStream sound = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResource("Mario.wav"));
    	       clipM = AudioSystem.getClip();
    	       clipM.open(sound);
    	       } catch (Exception e){

    	    	   JOptionPane.showMessageDialog(null, "Arquivo da mÃƒÂºsica nÃƒÂ£o encontrado.");
    	       }
    	   	   clipM.setFramePosition(0);
    	   	   clipM.start();      
     }

     public void stop(){

       clipM.stop();
       clipM.close();
     }
   }
