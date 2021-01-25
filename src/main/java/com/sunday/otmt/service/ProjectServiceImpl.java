package com.sunday.otmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sunday.otmt.dao.GenericDAO;
import com.sunday.otmt.entity.Project;

@Service
public class ProjectServiceImpl implements GenericService<Project> {
	
	@Autowired
	@Qualifier("projectDAOImpl")
	private GenericDAO<Project> projectDAO;
	
	@Override
	public Project save(Project entity) {
		return projectDAO.save(entity);
	}

	@Override
	public Project getEntityById(int id) {
		return projectDAO.getEntityById(id);
	}

	@Override
	public List<Project> getAllEntities() {
		return projectDAO.getAllEntities();
	}

	@Override
	public void delete(int id) {
		projectDAO.delete(id);
	}
	
}