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
import demolazy.demo.entities.Player;
import demolazy.demo.entities.Team;
import demolazy.demo.services.PlayerService;
import demolazy.demo.services.TeamService;

@RestController()
@RequestMapping(value = "/player")
public class PlayerResource {
	
	@Autowired
	private PlayerService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<PlayerDTO> findById(@PathVariable Long id){
		PlayerDTO player= service.findById(id);
		return ResponseEntity.ok(player);
	}


}
