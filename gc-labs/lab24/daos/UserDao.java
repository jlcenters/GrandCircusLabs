package co.grandcircus.lab24.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.lab24.Users;

@Repository
public class UserDao {

	
	@Autowired
	JdbcTemplate jdbc;
	
	public void addUser(Users user) {
		
		String sql = "INSERT INTO `coffee_shop`.`USERS` (`first_name`, `last_name`, `email`, `phone_number`, `password`) VALUES (?, ?, ?, ?, ?);";
		jdbc.update(sql, user.getfirstName(), user.getLastName(), user.getEmail(), user.getPhoneNumber(), user.getPassword());
	}
	
}
