DROP TABLE IF EXISTS person_address;
DROP TABLE IF EXISTS person;
DROP TABLE IF EXISTS address;

CREATE TABLE person (
        person_id serial primary key,
        first_name varchar(20) not null,
        last_name varchar(20) not null
);

CREATE TABLE address (
        address_id serial primary key,
        street varchar(30),
        line_two varchar(30),
        city varchar(20),
        postal_code varchar(20),
        district varchar(100),
        address_type varchar(30),
        type_other_description varchar(32),
        
        CONSTRAINT chk_address_type CHECK ( address_type IN ('Work', 'Shipping', 'Home', 'Billing', 'Other') ),
        
        CONSTRAINT chk_address_type_other CHECK ( (address_type = 'Other' AND type_other_description IS NOT NULL) OR 
                ( address_type <> 'Other' AND type_other_description IS NULL)  ) 

);

CREATE TABLE person_address ( 
        person_id int,
        address_id int,
        
        PRIMARY KEY(person_id, address_id),
        CONSTRAINT fk_person_person_id FOREIGN KEY (person_id) REFERENCES person(person_id),
        CONSTRAINT fk_address_address_id FOREIGN KEY (address_id) REFERENCES address(address_id)
);