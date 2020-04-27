package co.grandcircus.lab24.daos;

import java.util.List;
import javax.persistence.*;
import javax.transaction.*;
import org.springframework.stereotype.Repository;
import co.grandcircus.lab24.Product;

	@Repository
	@Transactional
	public class AdminDao {

		@PersistenceContext
		private EntityManager em;
		
		
		public List<Product> getProducts() {
			return em.createQuery("from products",Product.class).getResultList();
		}
		public Product findById(Long id) {
			return em.find(Product.class, id);
		}
		public void updateProduct(Product product) {
			em.merge(product);
		}
		public void addProduct(Product product) {
			em.persist(product);
		}
		public void removeProduct(Long id) {
			Product product = em.getReference(Product.class, id);
			em.remove(product);
		}
	}

