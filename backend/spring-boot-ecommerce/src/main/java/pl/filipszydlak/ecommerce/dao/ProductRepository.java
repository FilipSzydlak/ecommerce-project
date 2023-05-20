package pl.filipszydlak.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import pl.filipszydlak.ecommerce.entity.Product;
@CrossOrigin
public interface ProductRepository extends JpaRepository<Product, Long> {
}
