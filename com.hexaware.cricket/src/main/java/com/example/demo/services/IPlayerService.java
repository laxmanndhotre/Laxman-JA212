package com.example.demo.services;

import com.example.demo.exceptions.PlayerNotFoundException;
import com.example.demo.dto.*;
import java.util.List;
import java.util.Optional;

public interface IPlayerService {
    List<PlayerDTO> getAllPlayers();
    Optional<PlayerDTO> getPlayerById(Integer id) throws PlayerNotFoundException;
    PlayerDTO addPlayer(PlayerDTO playerDTO);
    PlayerDTO updatePlayer(Integer id, PlayerDTO newPlayerDTO) throws PlayerNotFoundException;
    void deletePlayer(Integer id);
}
