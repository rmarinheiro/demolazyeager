package demolazy.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demolazy.demo.entities.Team;

@Repository
public interface TimeRepository extends JpaRepository<Team, Long> {

}
