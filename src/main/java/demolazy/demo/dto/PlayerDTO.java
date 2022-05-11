package demolazy.demo.dto;

import java.io.Serializable;

import demolazy.demo.entities.Player;

public class PlayerDTO implements Serializable {
	

	private static final long serialVersionUID = 1L;

	private String name;
	
	private Integer age;
	
	public PlayerDTO() {
		// TODO Auto-generated constructor stub
	}

	public PlayerDTO(String name, Integer idade) {
		super();
		this.name = name;
		this.age = idade;
	}
	
	public PlayerDTO(Player entitty) {
		this.name = entitty.getName();
		this.age = entitty.getAge();
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIdade() {
		return age;
	}

	public void setIdade(Integer age) {
		this.age = age;
	}
	
	

}
