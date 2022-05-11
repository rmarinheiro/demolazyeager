package demolazy.demo.dto;

import javax.persistence.Entity;

import demolazy.demo.entities.Team;

public class TeamDTO {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public TeamDTO() {
		// TODO Auto-generated constructor stub
	}

	public TeamDTO(String name) {
		super();
		this.name = name;
	}
	
	public TeamDTO(Team entitiy) {
		this.name = entitiy.getName();
	}
	
	
	

}
