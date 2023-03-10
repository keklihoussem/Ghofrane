package ENCWEB.ENC.repo;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import ENCWEB.ENC.entity.user;

public interface UserRepo extends JpaRepository<user, Long>{
	Optional<user> findUserBymatricule(Long matricule);
	Optional<user> findUserByPwd(String pwd);
	 

}
