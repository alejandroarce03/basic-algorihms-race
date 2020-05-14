package thread;

import javafx.application.Platform;
import model.Circle;
import model.Race;
import ui.RaceGUI;

public class CircleThread extends Thread{

	private Race race;
	private RaceGUI raceGUI;
	
	public CircleThread(Race c,RaceGUI r) {
		race=c;
		raceGUI=r;
	}
	
	public void run() {
		
			
		
	}
}
