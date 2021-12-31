package com.sucky.ex.p04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sucky.ex.p04.model.NewUser;

@Repository
public interface NewUserDAO {
	
	public int insertNewUser(
			@Param("name")String name
			, @Param("birth")String birth
			, @Param("introduce")String introduce
			, @Param("email")String email
			);
	
	public NewUser selectNewUser(@Param("id")int id);
}
