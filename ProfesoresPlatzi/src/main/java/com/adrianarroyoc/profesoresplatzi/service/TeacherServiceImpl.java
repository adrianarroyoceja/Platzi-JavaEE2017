package com.adrianarroyoc.profesoresplatzi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adrianarroyoc.profesoresplatzi.dao.TeacherDao;
import com.adrianarroyoc.profesoresplatzi.model.Teacher;

@Service("teacherService")
@Transactional
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherDao _teacherDao;
	
	@Override
	public void saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		_teacherDao.saveTeacher(teacher);
	}

	@Override
	public void deleteTeacherById(Long idTeacher) {
		// TODO Auto-generated method stub
		_teacherDao.deleteTeacherById(idTeacher);
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		_teacherDao.updateTeacher(teacher);
	}

	@Override
	public List<Teacher> findAllTeachers() {
		// TODO Auto-generated method stub
		return _teacherDao.findAllTeachers();
	}

	@Override
	public Teacher findTeacherById(Long idTeacher) {
		// TODO Auto-generated method stub
		return _teacherDao.findTeacherById(idTeacher);
	}

	@Override
	public Teacher findTeacherByName(String name) {
		// TODO Auto-generated method stub
		return _teacherDao.findTeacherByName(name);
	}

}
