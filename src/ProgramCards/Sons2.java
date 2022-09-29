package ProgramCards;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Sons2 {
	
	public static void main(String[] args) {
		
    // a musica ainda é provisoria  
		File Music = new File("F:/Maid-with-the-Flaxen-Hair.wav");
		playSound(Music);
	}
	static void playSound(File Sound) {
		
		try {
			
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength()/ 1000);
			
		} catch(Exception e){
			
			JOptionPane.showMessageDialog(null, "aa");
			
			
		}
		
	}
}