package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.test.context.jdbc.Sql;

import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.ProjectDAO;

public class JDBCProjectDAO implements ProjectDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCProjectDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Project> getAllActiveProjects() {
		List<Project> projects = new ArrayList<Project>();
		String allActiveProjectsSql = "SELECT project_id, name, from_date, to_date FROM project Where from_date <= CURRENT_DATE AND to_date > current_date";
		SqlRowSet rows = jdbcTemplate.queryForRowSet(allActiveProjectsSql);
		while( rows.next()) {
			Project project = makeProjectFromRow(rows);
			projects.add(project);
		}
		return projects;
	}

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {
		String deleteFromProjectSql = "DELETE FROM project_employee WHERE project_id = ? and employee_id = ?";
		jdbcTemplate.update(deleteFromProjectSql, projectId , employeeId);
		
	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {
		String addEmployeeToProjectSql = "INSERT INTO project_employee (project_id, employee_id) VALUES (?, ?)";
		SqlRowSet rows = jdbcTemplate.queryForRowSet(addEmployeeToProjectSql);
		rows.next();
		
	}
	
	private Project makeProjectFromRow(SqlRowSet rows) {
		Project project = new Project();
		project.setId(rows.getLong("project_id"));
		project.setName(rows.getString("name"));
		if(rows.getDate("from_date") != null) {
		project.setStartDate(rows.getDate("from_date").toLocalDate());
		}
		if(rows.getDate("to_date") != null) {
			project.setEndDate(rows.getDate("to_date").toLocalDate());
			}
		return project;
	}

}
