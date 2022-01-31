package com.monocept.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.monocept.model.Player;
import com.monocept.model.Players;

public class PlayerTest {
	
	@Test
	public void checkPlayerIsInitializedOrNot()
	{
		Player p1 = new Player();
		p1.setPlayer(Players.PLAYER1);
		Players expectedValuep1 = Players.PLAYER1;
		assertEquals(expectedValuep1, p1.getPlayer());
		
		Player p2 = new Player();
		p2.setPlayer(Players.PLAYER2);
		Players expectedValuep2 = Players.PLAYER2;
		assertEquals(expectedValuep2, p2.getPlayer());
	}

}
