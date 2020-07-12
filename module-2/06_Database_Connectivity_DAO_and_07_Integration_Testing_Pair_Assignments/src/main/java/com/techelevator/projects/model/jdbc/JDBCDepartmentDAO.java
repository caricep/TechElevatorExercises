package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.DepartmentDAO;

public class JDBCDepartmentDAO implements DepartmentDAO {
	
	private JdbcTemplate jdbcTemplate;

	public JDBCDepartmentDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Department> getAllDepartments() {
		
		List<Department> departments = new ArrayList<Department>();
		
		String selectSql = "SELECT department_id, name FROM department";
		
		SqlRowSet rows = jdbcTemplate.queryForRowSet(selectSql);
		
		while (rows.next()) {
			Department department = makeDepartmentFromRow (rows);
			departments.add(department);
		}
		
		return departments;
	}

	@Override
	public List<Department> searchDepartmentsByName(String nameSearch) {
		
		List<Department> departments = new ArrayList<Department>();
		
		String selectDepartmentSql = "SELECT department_id, name FROM department WHERE name ILIKE ?";
		
		SqlRowSet rows = jdbcTemplate.queryForRowSet(selectDepartmentSql, "%" + nameSearch);
		
		while (rows.next()) {
			Department department = makeDepartmentFromRow (rows);
			departments.add(department);
		}
		
		return departments;
	}

	@Override
	public void saveDepartment(Department updatedDepartment) {
		
		String updateDepartmentSql = "UPDATE department SET department_id = ?, name = ? WHERE department_id = ?";
		
		jdbcTemplate.update(updateDepartmentSql, updatedDepartment.getId(), updatedDepartment.getName(), updatedDepartment.getId());
	}

	@Override
	public Department createDepartment(Department newDepartment) {
		
		String createDepartmentSql = "INSERT INTO department (department_id, name) VALUES (DEFAULT, ?) RETURNING department_id";
		
		 SqlRowSet rows = jdbcTemplate.queryForRowSet(createDepartmentSql, newDepartment.getName());
		rows.next();
		Long id = rows.getLong("department_id");
		newDepartment.setId(id);
		
		
		
		return newDepartment;
		
	}

	@Override
	public Department getDepartmentById(Long id) {
		Department department = null;
		
		String selectDepartmentSql = "SELECT department_id, name FROM department WHERE department_id = ?";
		
		SqlRowSet rows = jdbcTemplate.queryForRowSet(selectDepartmentSql, id);
		
		while (rows.next()) {
			department = makeDepartmentFromRow (rows);
		}
		
		return department;
	}

	private Department makeDepartmentFromRow(SqlRowSet rows) {
		Department department = new Department();
		
		department.setId(rows.getLong("department_id"));
		department.setName(rows.getString("name"));
		
		return department;
		
	}

	


	
}
