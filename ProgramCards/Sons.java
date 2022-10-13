package ProgramCards;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class SoundEffect {


   Clip clip;
   
   public void setFile(String fileName){
     
     try{
       
       File som = new File(fileName);
       AudioInputStream sound = AudioSystem.getAudioInputStream(som);
       clip = AudioSystem.getClip();
       clip.open(sound);
         
       } catch (Exception e){
       
       
    	   JOptionPane.showMessageDialog(null, "aa");
     }
     
     
   }
     
     
     public void play(){
       
       clip.setFramePosition(0);
       clip.start();      
     }
  
     public void stop(){
       
       
       clip.stop();
       clip.close();
     }
        
   }
