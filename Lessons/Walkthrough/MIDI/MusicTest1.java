package MIDI;
//import javax.sound.midi.*; //PAGE 318
//
//public class MusicTest1 {
//	public void play() {
//		Sequencer Sequencer = MidiSystem.getSequencer();
//		
//		System.out.println("We got a sequencer");
//	} //close play
//	public static void main(String[] args) {
//		MusicTest1 mt = new MusicTest1();
//		mt.play();
//	} //close main
//} //close class

import javax.sound.midi.*; //PAGE 321

public class MusicTest1 {
	public void play() {
		
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("Succesfully got a sequencer");
		} catch(MidiUnavailableException ex) {
			System.out.println("Bummer");
		}
	} //close play
	public static void main(String[] args) {
		MusicTest1 mt = new MusicTest1();
	} //close main
} // close class
