package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.EmployeeDAO;

public class JDBCEmployeeDAO implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCEmployeeDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees  = new ArrayList<Employee>();
		String selectSql = "SELECT employee_id, department_id, first_name, last_name, birth_date, gender, hire_date FROM employee";
		SqlRowSet rows = jdbcTemplate.queryForRowSet(selectSql);
		while(rows.next()) {
			Employee employee = makeEmployeeFromRow(rows);
			employees.add(employee);
		}
		return employees;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		String selectEmployeeSql = "SELECT employee_id, department_id, first_name, last_name, birth_date, gender, hire_date FROM employee WHERE first_name ILIKE ? AND last_name ILIKE ?"; 
		
		SqlRowSet rows = jdbcTemplate.queryForRowSet(selectEmployeeSql, "%" + firstNameSearch, "%" + lastNameSearch);
		
		while (rows.next()) {
			Employee employee = makeEmployeeFromRow(rows);
			employees.add(employee);
		}
		
		return employees;
	}

	@Override
	public List<Employee> getEmployeesByDepartmentId(long id) {
		Employee employee = null;
		
		List<Employee> employees = new ArrayList<Employee>();
		
		String selectEmployeeByDepartmentSql = "SELECT employee_id, department_id, first_name, last_name, birth_date, gender, hire_date FROM employee WHERE department_id = ?";
		
		SqlRowSet rows = jdbcTemplate.queryForRowSet(selectEmployeeByDepartmentSql, id);
		
		while (rows.next()) {
			employee = makeEmployeeFromRow(rows);
			employees.add(employee);
		}
		
		return employees;
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		String selectEmployeesWithoutProjectsSql = "SELECT employee_id, department_id, first_name, last_name, birth_date, gender, hire_date "
				+ "FROM employee where employee.employee_id NOT IN (select employee_id from project_employee)";
		
		SqlRowSet rows = jdbcTemplate.queryForRowSet(selectEmployeesWithoutProjectsSql);
		
		while (rows.next()) {
			Employee employee = makeEmployeeFromRow(rows);
			employees.add(employee);
		}		
		
		return employees;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		String selectEmployeesByProjectSql = "SELECT employee_id, department_id, first_name, last_name, birth_date, gender, hire_date "
				+ "FROM employee where employee.employee_id IN (select employee_id from project_employee WHERE project_id = ?)";
		
		SqlRowSet rows = jdbcTemplate.queryForRowSet(selectEmployeesByProjectSql, projectId);
		
		while (rows.next()) {
			Employee employee = makeEmployeeFromRow(rows);
			employees.add(employee);
		}
		
		return employees;
	}

	@Override
	public void changeEmployeeDepartment(Long employeeId, Long departmentId) {
		
		String updateEmployeeDepartmentSql = "UPDATE employee SET department_id = ? WHERE employee_id = ?";
		jdbcTemplate.update(updateEmployeeDepartmentSql, departmentId, employeeId);
		
	}
	
	
	private Employee makeEmployeeFromRow(SqlRowSet rows) {
		Employee employee = new Employee();
		employee.setId(rows.getLong("employee_id"));
		employee.setDepartmentId(rows.getLong("department_id"));
		employee.setFirstName(rows.getString("first_name"));
		employee.setLastName(rows.getString("last_name"));
		if(rows.getDate("birth_date") != null) {
		employee.setBirthDay(rows.getDate("birth_date").toLocalDate());
		}
		employee.setGender(rows.getString("gender").charAt(0));
		if(rows.getDate("hire_date") != null) {
		employee.setHireDate(rows.getDate("hire_date").toLocalDate());
		}
		return employee;
	}

}
