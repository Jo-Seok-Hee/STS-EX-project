package com.sucky.ex.p04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sucky.ex.p04.dao.NewStudentDAO;
import com.sucky.ex.p04.model.NewStudent;

@Service
public class NewStudentBO {
	
	@Autowired
	private NewStudentDAO newStudentDAO;
	
	public int addStudent(NewStudent newStudent) {
		return newStudentDAO.insertStudent(newStudent);
	}
}
