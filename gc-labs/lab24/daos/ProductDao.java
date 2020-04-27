package co.grandcircus.lab24.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.lab24.Product;

@Repository
public class ProductDao {

	@Autowired
	JdbcTemplate jdbc;

	public List<Product> getProducts() {
		String sql = "SELECT * FROM products";
			return jdbc.query(sql, new BeanPropertyRowMapper<>(Product.class));
	}
}
