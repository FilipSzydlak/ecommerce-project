package pl.filipszydlak.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.filipszydlak.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
