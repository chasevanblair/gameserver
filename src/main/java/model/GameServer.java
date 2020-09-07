package model;

import java.util.ArrayList;

public class GameServer {
	private ArrayList<String> players;
	private double matchTime;
	private int playerCount;
	
	public GameServer(ArrayList<String> players, double matchTime) {
		this.players = players;
		this.matchTime = matchTime;
		this.playerCount = players.size();
	}
	

	public ArrayList<String> getPlayers() {
		return players;
	}


	public void setPlayers(ArrayList<String> players) {
		this.players = players;
	}


	public double getMatchTime() {
		return matchTime;
	}


	public void setMatchTime(double matchTime) {
		this.matchTime = matchTime;
	}
	
	public int getPlayerCount() {
		return playerCount;
	}


	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}



	public Boolean isInServer(String player) {
		if(players.contains(player)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double timeRemaining(double elapsedTime) {
		return matchTime - elapsedTime;
	}
	
	public boolean isFull() {
		return playerCount <= 10;
	}


	public String join(String player) {
		if(!isFull()) {
			this.players.add(player);
			this.playerCount++;
			return "Successfully joined";
		}
		else {
			return "Error: Server full";
		}
	}



}
