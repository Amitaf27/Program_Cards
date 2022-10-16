package ProgramCards;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class EfeitoSonoro {

   static Clip clipF;
   public void setFile(String fileName){

     try{

       File som = new File(fileName);
       AudioInputStream sound = AudioSystem.getAudioInputStream(som);
       clipF = AudioSystem.getClip();
       clipF.open(sound);
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
