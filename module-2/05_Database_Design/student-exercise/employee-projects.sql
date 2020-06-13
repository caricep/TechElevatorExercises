-- employee-projects
SELECT * FROM department;
SELECT * FROM job_title;
SELECT * FROM employee;
SELECT * FROM project;
SELECT * FROM employee_project;

SELECT * FROM employee
JOIN job_title ON employee.job_title_id = job_title.job_title_id
JOIN department ON employee.department_id = department.department_id;


CREATE TABLE department (

        department_id serial primary key,
        department_name varchar(30)
);

CREATE TABLE job_title (

        job_title_id serial primary key,
        job_title varchar(50),
        job_level varchar(20),
        
        CONSTRAINT chk_job_level CHECK (job_level IN ('Executive', 'Vice President', 'Director', 'Supervisor', 'Associate', 'Intern'))
);

CREATE TABLE employee (

        employee_id serial primary key,
        first_name varchar(20) not null,
        last_name varchar(20) not null,
        gender varchar(15),
        date_of_birth varchar(10) not null,
        date_of_hire varchar(10) not null,
        department_id int not null,
        job_title_id int not null,
        
        CONSTRAINT fk_employee_department_id FOREIGN KEY (department_id) REFERENCES department(department_id),
        CONSTRAINT fk_employee_job_title_id FOREIGN KEY (job_title_id) REFERENCES job_title(job_title_id)

);

CREATE TABLE project (

        project_id serial primary key,
        project_name varchar(50),
        project_start_date varchar(10)
);

CREATE TABLE employee_project (
        
        employee_id int not null,
        project_id int not null,
        
        PRIMARY KEY (employee_id, project_id),
        CONSTRAINT fk_employee_employee_id FOREIGN KEY (employee_id) REFERENCES employee(employee_id),
        CONSTRAINT fk_project_project_id FOREIGN KEY (project_id) REFERENCES project(project_id)
);



INSERT INTO department (department_id, department_name) 
        VALUES (DEFAULT, 'IT');
INSERT INTO department (department_id, department_name) 
        VALUES (DEFAULT, 'Marketing');        
INSERT INTO department (department_id, department_name) 
        VALUES (DEFAULT, 'Accounting');
INSERT INTO department (department_id, department_name) 
        VALUES (DEFAULT, 'Human Resources');   
        
        
INSERT INTO job_title (job_title_id, job_title, job_level) 
        VALUES (DEFAULT, 'Business Analyst', 'Associate');  
INSERT INTO job_title (job_title_id, job_title, job_level) 
        VALUES (DEFAULT, 'Chief Marketing Officer (CMO)', 'Executive');  
INSERT INTO job_title (job_title_id, job_title, job_level) 
        VALUES (DEFAULT, 'Accounting Intern', 'Intern');  
INSERT INTO job_title (job_title_id, job_title, job_level) 
        VALUES (DEFAULT, 'Software Developer', 'Associate');        
INSERT INTO job_title (job_title_id, job_title, job_level) 
        VALUES (DEFAULT, 'Quality Assurance Technical Director', 'Director');    
INSERT INTO job_title (job_title_id, job_title, job_level) 
        VALUES (DEFAULT, 'Benefits Manager', 'Supervisor'); 
INSERT INTO job_title (job_title_id, job_title, job_level) 
        VALUES (DEFAULT, 'VP of Accounting', 'Vice President');    
INSERT INTO job_title (job_title_id, job_title, job_level) 
        VALUES (DEFAULT, 'Project Manager', 'Supervisor');         


INSERT INTO employee (employee_id, first_name, last_name, gender, date_of_birth, date_of_hire, department_id, job_title_id) 
        VALUES (DEFAULT, 'Sarah', 'Jones', 'female', '09/30/1970', '05/12/2000', 2, 2);   
        
INSERT INTO employee (employee_id, first_name, last_name, gender, date_of_birth, date_of_hire, department_id, job_title_id) 
        VALUES (DEFAULT, 'Amy', 'Parker', 'female', '05/20/1990', '08/10/2018', 1, 1);           
            
INSERT INTO employee (employee_id, first_name, last_name, gender, date_of_birth, date_of_hire, department_id, job_title_id) 
        VALUES (DEFAULT, 'John', 'Rogers', 'male', '01/01/1983', '02/03/2010', 1, 4);
        
INSERT INTO employee (employee_id, first_name, last_name, gender, date_of_birth, date_of_hire, department_id, job_title_id) 
        VALUES (DEFAULT, 'Simba', 'Lion', 'male', '01/01/1994', '04/17/2020', 3, 3);    
        
INSERT INTO employee (employee_id, first_name, last_name, gender, date_of_birth, date_of_hire, department_id, job_title_id) 
        VALUES (DEFAULT, 'Kiko', 'Yamata', 'female', '02/14/1975', '11/02/2017', 4, 6);           
        
INSERT INTO employee (employee_id, first_name, last_name, gender, date_of_birth, date_of_hire, department_id, job_title_id) 
        VALUES (DEFAULT, 'TJ', 'Henderson', 'male', '12/25/1992', '06/12/2015', 4, 1);   
        
INSERT INTO employee (employee_id, first_name, last_name, gender, date_of_birth, date_of_hire, department_id, job_title_id) 
        VALUES (DEFAULT, 'Kayla', 'Lee', 'female', '08/08/1979', '11/15/2016', 3, 7);          
        
INSERT INTO employee (employee_id, first_name, last_name, gender, date_of_birth, date_of_hire, department_id, job_title_id) 
        VALUES (DEFAULT, 'Jordan', 'Fisher', 'male', '04/01/1980', '07/20/2015', 2, 8);     
        
INSERT INTO employee (employee_id, first_name, last_name, gender, date_of_birth, date_of_hire, department_id, job_title_id) 
        VALUES (DEFAULT, 'Lena', 'Lion', 'female', '10/18/1981', '04/02/2018', 1, 5);          
                                              

INSERT INTO project (project_id, project_name, project_start_date)
        VALUES (DEFAULT, 'Design New Logos for Store Promotions', '06/02/2020');                                              
                                              
INSERT INTO project (project_id, project_name, project_start_date)
        VALUES (DEFAULT, 'Restructure HR Benefits System', '07/01/2020');  
        
INSERT INTO project (project_id, project_name, project_start_date)
        VALUES (DEFAULT, 'Create Updated Handbook', '05/01/2020');    
        
INSERT INTO project (project_id, project_name, project_start_date)
        VALUES (DEFAULT, 'Develop and Implement Company PLM System', '12/01/2019');   
        
        
INSERT INTO employee_project (employee_id, project_id)
        VALUES (8, 1);   
INSERT INTO employee_project (employee_id, project_id)
        VALUES (5, 2);         
INSERT INTO employee_project (employee_id, project_id)
        VALUES (6, 2);         
INSERT INTO employee_project (employee_id, project_id)
        VALUES (4, 3);    
INSERT INTO employee_project (employee_id, project_id)
        VALUES (2, 4);  
INSERT INTO employee_project (employee_id, project_id)
        VALUES (3, 4);                                                                                 