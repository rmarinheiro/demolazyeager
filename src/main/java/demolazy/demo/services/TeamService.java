package demolazy.demo.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import demolazy.demo.dto.PlayerDTO;
import demolazy.demo.dto.TeamDTO;
import demolazy.demo.entities.Team;
import demolazy.demo.repositories.TimeRepository;

@Service
public class TeamService {
	
	@Autowired
	private TimeRepository repository;
	
	@Transactional(readOnly = true)
	public TeamDTO findById(Long id) {
		Optional<Team> result = repository.findById(id);
		return new TeamDTO(result.get());
	}
	
	@Transactional(readOnly = true)
	public List<PlayerDTO> findPlayerByTime(Long id){
		Optional<Team> result= repository.findById(id);
		return result.get().getPlayers().stream()
				.map(x->new PlayerDTO(x)).collect(Collectors.toList());
				
	}
	
	

}
