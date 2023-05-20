package pl.filipszydlak.ecommerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import pl.filipszydlak.ecommerce.entity.Product;
import pl.filipszydlak.ecommerce.entity.ProductCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {

        HttpMethod[] theUnsupportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};

        //disable HTTP methods for Product: PUT, POST, and DELETE
        config.getExposureConfiguration()
                .forDomainType(Product.class)
                .withItemExposure((metdata,httpmethods) -> httpmethods.disable(theUnsupportedActions))
                .withCollectionExposure((metdata,httpmethods) -> httpmethods.disable(theUnsupportedActions));

        //disable HTTP methods for ProductCategory: PUT, POST, and DELETE
        config.getExposureConfiguration()
                .forDomainType(ProductCategory.class)
                .withItemExposure((metdata,httpmethods) -> httpmethods.disable(theUnsupportedActions))
                .withCollectionExposure((metdata,httpmethods) -> httpmethods.disable(theUnsupportedActions));
    }
}
