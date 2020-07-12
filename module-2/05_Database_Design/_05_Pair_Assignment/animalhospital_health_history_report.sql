DROP TABLE IF EXISTS pet_owner;
DROP TABLE IF EXISTS owner;
DROP TABLE IF EXISTS pet;
DROP TABLE IF EXISTS procedure;
DROP TABLE IF EXISTS visit;

SELECT * FROM owner;
SELECT * FROM pet;
SELECT * FROM pet_owner;
SELECT * FROM visit;
SELECT * FROM procedure;

CREATE TABLE owner (

        owner_id serial primary key,
        first_name varchar(20) not null,
        last_name varchar(20) not null
 );
 
CREATE TABLE pet (
 
        pet_id serial primary key,
        pet_name varchar(20),
        pet_age int,
        pet_type varchar(20)
       
);

CREATE TABLE pet_owner (

        owner_id int,
        pet_id int,
        
        PRIMARY KEY (owner_id, pet_id),
        CONSTRAINT fk_owner_owner_id FOREIGN KEY (owner_id) REFERENCES owner(owner_id),
        CONSTRAINT fk_pet_pet_id FOREIGN KEY (pet_id) REFERENCES pet(pet_id)
);
        
CREATE TABLE procedure (

        procedure_id serial primary key,
        procedure_name varchar(20),
        pet_id int not null,
        
        CONSTRAINT fk_procedure_pet_id FOREIGN KEY (pet_id) REFERENCES pet(pet_id)
        
);               
    
CREATE TABLE visit (

        visit_id serial primary key,
        date_of_visit DATE,
        owner_id int not null,
        pet_id int not null,
        procedure_id int not null,
        
        CONSTRAINT fk_visit_owner_id FOREIGN KEY (owner_id) REFERENCES owner(owner_id),
        CONSTRAINT fk_visit_pet_id FOREIGN KEY (pet_id) REFERENCES pet(pet_id),
        CONSTRAINT fk_visit_procedure_id FOREIGN KEY (procedure_id) REFERENCES procedure(procedure_id)

);


    
         