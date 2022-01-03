package com.sucky.ex.p04.dao;

import org.springframework.stereotype.Repository;

import com.sucky.ex.p04.model.NewStudent;

@Repository
public interface NewStudentDAO {
	
	public int insertStudent(NewStudent newStudent);
}