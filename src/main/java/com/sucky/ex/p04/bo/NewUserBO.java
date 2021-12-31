package com.sucky.ex.p04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sucky.ex.p04.dao.NewUserDAO;
import com.sucky.ex.p04.model.NewUser;

@Service
public class NewUserBO {

	@Autowired
	private NewUserDAO newUserDAO;
	
	public int addNewUser(String name, String birth, String introduce, String email) {
		
		return newUserDAO.insertNewUser(name, birth, introduce, email);
	}
	
	
	public NewUser getNewUser(int id) {
		return newUserDAO.selectNewUser(id);
	}
	
	
	
	
	
	
	
	
}
