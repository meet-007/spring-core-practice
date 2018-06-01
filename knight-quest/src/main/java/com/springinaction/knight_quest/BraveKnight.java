package com.springinaction.knight_quest;

import org.springframework.beans.factory.annotation.Autowired;

public class BraveKnight implements Knights {

	private final Quest quest;

	@Autowired
	public BraveKnight(final Quest quest) {
		this.quest = quest;
	}

	public void embarkOnQuest() {
		// TODO Auto-generated method stub
		quest.embark();

	}

}
