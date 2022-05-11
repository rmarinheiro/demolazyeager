package demolazy.demo.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import demolazy.demo.dto.PlayerDTO;
import demolazy.demo.dto.TeamDTO;
import demolazy.demo.entities.Player;
import demolazy.demo.entities.Team;
import demolazy.demo.repositories.PlayerRepository;
import demolazy.demo.repositories.TimeRepository;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerRepository repository;
	
	@Transactional(readOnly = true)
	public PlayerDTO findById(Long id) {
		Optional<Player>  result = repository.findById(id);
		return new PlayerDTO(result.get());
	}
	
	

}
