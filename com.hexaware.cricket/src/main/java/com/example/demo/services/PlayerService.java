package com.example.demo.services;

import com.example.demo.exceptions.PlayerNotFoundException;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Player;
import com.example.demo.exceptions.PlayerNotFoundException;
import com.example.demo.repositories.PlayerRepository;

@Service
public class PlayerService implements IPlayerService{
	@Autowired
	private PlayerRepository playerRepository;

	@Override
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return playerRepository.findAll();
	}

	@Override
	public Optional<Player> getPlayerById(Integer id) {
		// TODO Auto-generated method stub
		return playerRepository.findById(id);
	}

	@Override
	public Player addPlayer(Player player) {
		// TODO Auto-generated method stub
		return playerRepository.save(player);
	}

	@Override
	public Player updatePlayer(Integer id, Player newPlayer) throws PlayerNotFoundException {
		// TODO Auto-generated method stub
		Optional<Player> op=playerRepository.findById(id);
		if(op.isPresent()) {
			Player pl=op.get();
			pl.setPlayer_name(newPlayer.getPlayer_name());
			pl.setJersey_no(newPlayer.getJersey_no());
			pl.setMatches(newPlayer.getMatches());
			pl.setRole(newPlayer.getRole());
			pl.setTeam(newPlayer.getTeam());
			pl.setCountry_state(newPlayer.getCountry_state());
			pl.setDesc(newPlayer.getDesc());
			return playerRepository.save(pl);
		}
		else {
			throw new PlayerNotFoundException("no play with that id");
		}
		
	}

	@Override
	public void deletePlayer(Integer id) {
		// TODO Auto-generated method stub
		playerRepository.deleteById(id);
	}
	
}