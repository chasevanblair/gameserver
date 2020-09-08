package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import model.GameServer;

public class TestGameServer {
	ArrayList<String> players = new ArrayList<String>(Arrays.asList("Chase", "Jeff", "ewwerwerwerwer"));
	GameServer server = new GameServer(players, 5.0);
	
	@Test
	public void testIsNotInServer() {
		assertFalse(server.isInServer("Jack"));
	}
	
	@Test
	public void testIsInServer() {
		assertTrue(server.isInServer("Chase"));
	}
	
	@Test
	public void testTimeRemaining() {
		double elapsedTime = 2.30;
		assertEquals(server.timeRemaining(elapsedTime), 2.70, 0.01);
	}
	
	public void testJoin() {
		assertEquals("Successfully joined", server.join("legend"));
	}
	

}
