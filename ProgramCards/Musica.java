import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Musica {

   static Clip clipM;
   static String musicaSom = "C:/Users/Aluno/git/ProgramCardsh/ProgramCards/Mario.wav";
   
   public void setFile(String fileName){

     try{

       File musica = new File(fileName);
       AudioInputStream sound = AudioSystem.getAudioInputStream(musica);
       clipM = AudioSystem.getClip();
       clipM.open(sound);
       } catch (Exception e){

    	   JOptionPane.showMessageDialog(null, "Arquivo da mÃºsica nÃ£o encontrado.");
       }
   }
     public void play(){

       clipM.setFramePosition(0);
       clipM.start();      
     }

     public void stop(){

       clipM.stop();
       clipM.close();
     }
   }
