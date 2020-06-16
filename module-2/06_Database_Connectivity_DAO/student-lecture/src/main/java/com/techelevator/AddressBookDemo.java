package com.techelevator;

import java.time.LocalDate;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

import com.techelevator.addressbook.Person;
import com.techelevator.addressbook.PersonDao;
import com.techelevator.addressbook.PersonJdbcDao;

public class AddressBookDemo {

	public static void main(String[] args) {
		
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/addressbook");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		
		PersonDao personDao = new PersonJdbcDao(dataSource);
		
		List<Person> persons = personDao.list();
		
		for (Person person : persons) {
			System.out.println(person);
		}
		
		System.out.println(personDao.getPersonById(2));
		
		Person johnFulton = new Person();
		johnFulton.setFirstName("John");
		johnFulton.setLastName("Fulton");
		johnFulton.setDateAdded(LocalDate.now());
		
		personDao.create(johnFulton);
		
		System.out.println(personDao.getPersonById(johnFulton.getPersonId()));
	}

}
