package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import model.GameServer;

public class TestGameServer2 {
	ArrayList<String> players = new ArrayList<String>(Arrays.asList("Chase", "Jeff", "ewwerwerwerwer", "1", "2", "3", "4", "5", "6", "7"));
	GameServer server = new GameServer(players, 5.0);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testJoinWhileFull() {
		assertEquals("Error: Server full", server.join("yo"));
	}

}
