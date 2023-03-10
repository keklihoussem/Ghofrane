package ENCWEB.ENC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ENCWEB.ENC.entity.user;
import ENCWEB.ENC.exception.UserNotFoundException;
import ENCWEB.ENC.repo.UserRepo;

@Service
@Transactional
public class UserService {
	 private final UserRepo userRepo;

	    @Autowired
	    public UserService(UserRepo userRepo) {
	        this.userRepo = userRepo;
	    }
	    public user findUser(Long matricule,String pwd) {
	    	if (userRepo.findUserBymatricule(matricule)) {
		    	if (userRepo.findUserByPwd(pwd)) {

		    	}
		    	}
	    }
	    
	    	
	    

}
