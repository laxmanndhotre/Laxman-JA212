package com.example.demo.entities;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

@Entity
public class Player {

	

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int playerId;
	@NotBlank(message = "player name is required") 
	@Size(max = 100, message = "Player name must be less than 100 characters")
	private String playerName;
	@Min(value=1, message = "jersey no can only start from 1")
	private int jerseyNo;
	@NotBlank(message = "role is required")
	private String role;
	@NotNull(message = "total matches is required") 
	@Min(value = 0, message = "matches played cannot be negative")
	private int matches;
	@NotBlank(message = "team name is mandatory")
	private String team;
	@NotBlank(message = "country/state name is mandatory")
	private String countryState;
	@NotBlank(message = "description is required")
	private String description;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getCountryState() {
		return countryState;
	}
	public void setCountryState(String countryState) {
		this.countryState = countryState;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Player() {
		super();
	}

	
}
