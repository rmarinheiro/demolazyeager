package demolazy.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demolazy.demo.dto.PlayerDTO;
import demolazy.demo.dto.TeamDTO;
import demolazy.demo.entities.Team;
import demolazy.demo.services.TeamService;

@RestController()
@RequestMapping(value = "/time")
public class TeamResource {
	
	@Autowired
	private TeamService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<TeamDTO> findById(@PathVariable Long id){
		TeamDTO team = service.findById(id);
		return ResponseEntity.ok(team);
	}
	
	@GetMapping(value = "/{id}/player")
	public ResponseEntity <List<PlayerDTO>> findPlayerByTime(@PathVariable Long id){
		List<PlayerDTO> team = service.findPlayerByTime(id);
		return ResponseEntity.ok(team);
	}

}
