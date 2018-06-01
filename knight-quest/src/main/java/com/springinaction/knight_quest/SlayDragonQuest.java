package com.springinaction.knight_quest;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {
	private final PrintStream stream;

	public SlayDragonQuest(final PrintStream stream) {
		this.stream = stream;
	}

	public void embark() {
		// TODO Auto-generated method stub
		stream.println("Embarking on quest to slay the dragon!");
	}

}
