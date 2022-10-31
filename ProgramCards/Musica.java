import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Musica {

   static Clip clipM;
   static boolean ligado = true;
   
     public void play(){
    	 
    	   try{
    		      
    	       AudioInputStream sound = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResource("Mario.wav"));
    	       clipM = AudioSystem.getClip();
    	       clipM.open(sound);
    	       } catch (Exception e){

    	    	   JOptionPane.showMessageDialog(null, "Arquivo da mÃƒÂºsica nÃƒÂ£o encontrado.");
    	       }
    	   
    	      if(ligado){
    	   
    	   
    	   	   clipM.setFramePosition(0);
    	   	   clipM.start();
    	      } else{
    	    	  
    	    	  
    	    	  
    	      }
     }

     public void stop(){

       clipM.stop();
       clipM.close();
     }
     
     public void muda(){
    	 
    	 ligado = !ligado;
    	 
     }
   }
