package pl.filipszydlak.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import pl.filipszydlak.ecommerce.entity.Country;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "countries", path ="countries")
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
