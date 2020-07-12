package com.techelevator.projects.model.jdbc;

import java.sql.SQLException;
import java.util.List;

import org.junit.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.DepartmentDAO;

public class JDBCDepartmentDAOIntegrationTest {

	private static SingleConnectionDataSource datasource;
	private DepartmentDAO dao;
	private JdbcTemplate jdbcTemplate;
	
	@BeforeClass
	public static void setupDataSource() {
		datasource = new SingleConnectionDataSource();
		datasource.setUrl("jdbc:postgresql://localhost:5432/projects");
		datasource.setUsername("postgres");
		datasource.setPassword("postgres1");
		
		datasource.setAutoCommit(false);
	}
	
	@AfterClass
	public static void destroyDataSource() {
		datasource.destroy();
	}
	
	@After
	public void rollbackTransaction() throws SQLException {
		datasource.getConnection().rollback();
	}
	
	@Before
	public void setupTest() {
		dao = new JDBCDepartmentDAO(datasource);
		jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	
	@Test
	public void get_list_of_all_departments() {
		truncateDepartmentTable();
		dao.createDepartment(createTestDepartment());
		
		List<Department> departments = dao.getAllDepartments();
		Assert.assertEquals(1, departments.size());
	}
	
	@Test
	public void search_departments_by_name() {
		truncateDepartmentTable();
		Department test = createTestDepartment();
		dao.createDepartment(test);
		List<Department> result = dao.searchDepartmentsByName("testDeptName");
		
		Assert.assertEquals(1, result.size());
	}
	
	@Test
	public void update_department_with_save() {
		Department test = createTestDepartment();
		dao.createDepartment(test);
		test.setName("updatedName");
		dao.saveDepartment(test);
		Department updated = dao.getDepartmentById(test.getId());
		Assert.assertEquals(test, updated);
	}
	
	@Test 
	public void create_department_test() {
		Department test = createTestDepartment();
		List<Department> initial = dao.getAllDepartments();
		int size = initial.size();
		
		dao.createDepartment(test);
		
		List<Department> addedOne = dao.getAllDepartments();
		int actualSize = addedOne.size();
		
		Assert.assertEquals(size + 1, actualSize);
	}
	
	@Test 
	public void get_department_by_id () {
		Department test = createTestDepartment();
		dao.createDepartment(test);
		Department actual = dao.getDepartmentById(test.getId());
		Assert.assertEquals(test, actual);
	}
	
	private Department createTestDepartment() {
		Department department = new Department();
		department.setName("testDeptName");
		
		return department;
	}
	
	private void truncateDepartmentTable() {
		String truncateSql = "TRUNCATE department CASCADE";
		jdbcTemplate.update(truncateSql);
	}
	
	
	
	
	
	
}
